package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.users.*;
import models.Project;

import views.html.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;




public class ProjectController extends Controller {
    private FormFactory formFactory;
    private Environment e;

    @Inject
    public ProjectController(FormFactory f, Environment env) {
        this.formFactory = f;
        this.e = env;
    }
    
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addProject()
    {
        Form<Project> pForm = formFactory.form(Project.class);

        return ok(addProject.render(pForm,Employee.getEmployeeById(session().get("email"))));
    }

    public Result projects()
    {
        List<Project> pList = null;
        pList = Project.findAll();

        return ok(projects.render(pList,Employee.getEmployeeById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addProjectSubmit()
    {
        Form<Project> newPform = formFactory.form(Project.class).bindFromRequest();
        if(newPform.hasErrors())
        {
            return badRequest(addProject.render(newPform, Employee.getEmployeeById(session().get("email"))));
        }
        else
        {
            Project newProject = newPform.get();

            if(newProject.getId() == null)
            {
                newProject.save();
            }
            else
            {
                newProject.update();
            }

            MultipartFormData<File> data = request().body().asMultipartFormData();

            FilePart<File> image = data.getFile("upload");

            String saveImageMessage = saveFile(newProject.getId(), image);
            flash("success", "Project" +newProject.getProjectName() +"was added/updated" + saveImageMessage);
            return redirect(controllers.routes.ProjectController.projects());
        }
    }

    @Security.Authenticated(Secured.class)
    public Result updateProject(Long id) 
    {
        Project p;
        Form<Project> pForm;
        
        try 
        {
            p = Project.find.byId(id);
            pForm = formFactory.form(Project.class).fill(p);
        } 
        catch (Exception e) 
        {
            return badRequest("error");
        }

        return ok(addProject.render(pForm,Employee.getEmployeeById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteProject(Long id)
    {
        Project.find.ref(id).delete();

        flash("sucess","Project has been deleted.");

        return redirect(controllers.routes.ProjectController.projects());
    }

    public String saveFile(Long id, FilePart<File> uploaded)
    {
        if (uploaded != null)
        {
            String mimeType = uploaded.getContentType();
            if (mimeType.startsWith("image/"))
            {
                String fileName = uploaded.getFilename();

                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0)
                {
                    extension = fileName.substring(i+1);
                }

                File file = uploaded.getFile();

                File dir = new File("public/images/projectCoverPhotos");
                if (!dir.exists())
                {
                    dir.mkdirs();
                }

                File newFile = new File("public/images/projectCoverPhotos/", id + "."+extension);
                if (file.renameTo(newFile))
                {
                    try 
                    {
                        BufferedImage img = ImageIO.read(newFile);
                        BufferedImage scaledImg = Scalr.resize(img,90);  
                        
                        if (ImageIO.write(scaledImg, extension, new File("public/images/projectCoverPhotos/",id + "thumb.jpg")))
                        {
                            return "/ file uploaded and thumbnail created";
                        }
                        else
                        {
                            return "/ file uploaded but thumbnail creation failed";
                        }
                    } 
                    catch 
                    (Exception e) 
                    {
                        return "file uploaded but thumbnail creation failed";    
                    }
                }
                else
                {
                    return "/ file upload failed";
                }
            }         
        }
        return "/ no image file.";
    }

    public Result usersEmployee() {
        // List<Employee> empList = null;
        // List<Department> deptList = null;

        // empList = id.findAll();
        // deptList = projectName.findAll();
        // deptList = startDate.findAll();
        // deptList = finishDate.findAll();
        // deptList = allocatedBudget.findAll();

        return ok(projects.render(id,projectName,startDate,finishDate,allocatedBudget);
    }

}
