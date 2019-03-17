package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.users.*;
import models.Department;

import views.html.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;


public class EmployeeCRUDController extends Controller {
    private FormFactory formFactory;

    private Environment e;
    @Inject
    public EmployeeCRUDController(FormFactory f,Environment env)
    {
        this.formFactory = f;
        this.e = env;
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployee()
    {
        Form<Employee> empForm = formFactory.form(Employee.class);
        Form<Address> aForm = formFactory.form(Address.class);
        return ok(addNewEmployee.render(empForm,aForm,Employee.getEmployeeById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployeeSubmit()
    {
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
        Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();
        if (newEmployeeForm.hasErrors())
        {
            return badRequest(addNewEmployee.render(newEmployeeForm, newAddressForm, Employee.getEmployeeById(session().get("email"))));
        }
        else
        {
            Employee newEmployee = newEmployeeForm.get();
            Address address = newAddressForm.get();
            newEmployee.setAddress(address);

            if(Employee.getEmployeeById(newEmployee.getEmail()) == null)
            {
                newEmployee.save();
            }
            else
            {
                newEmployee.update();
            }

            MultipartFormData<File> data = request().body().asMultipartFormData();

            FilePart<File> image = data.getFile("upload");

            String saveImageMessage = saveFile(newEmployee.getId(), image);
            flash("success", "Employee " + newEmployee.getName() + " was added/updated.");
            return redirect(controllers.routes.EmployeeCRUDController.usersEmployee());
        }
    }
    public Result usersEmployee() {
        List<Employee> empList = null;
        List<Department> deptList = null;

        empList = Employee.findAll();
        deptList = Department.findAll();

        return ok(employees.render(empList,deptList,Employee.getEmployeeById(session().get("email"))));
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
                    extension = fileName.substring(i +1);
                }

                File file = uploaded.getFile();

                File dir = new File("public/images/employeeProfiles");
                if(!dir.exists())
                {
                    dir.mkdirs();
                }

                File newFile = new File("public/images/employeeProfiles/", id + "." +extension);
                if (file.renameTo(newFile)) 
                {
                   try 
                   {
                       BufferedImage img = ImageIO.read(newFile);
                       BufferedImage scaledImg = Scalr.resize(img,90);

                       if (ImageIO.write(scaledImg, extension, new File("public/images/employeeProfiles/", id + "thumb.jpg")))
                       {
                            return "/ file uploaded and thumbnail created.";
                       }
                       else
                       {
                            return "/ file uploaded but thumbnail creation failed";
                       }
                   } 
                   catch (IOException e) 
                   {
                       return "/ file uploaded but thumbnail creation failed";
                   }
                }
                else
                {
                    return "/ file upload failed.";
                }
            }
        }
        return "/ no image file.";
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result removeEmployee(Long id) 
    {
        Employee.find.ref(id).delete();

        flash("success", "Employee record has been removed");

        return redirect(controllers.routes.EmployeeCRUDController.usersEmployee());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateEmployee(long id)
    {
        Employee e;
        //not sure if an Address object is needed
        Address a;
        Form<Employee> empForm;
        Form<Address> aForm;

        try 
        {
           e = Employee.find.byId(id); 
           a = Address.find.byId(e.getAddress().getId());

           empForm = formFactory.form(Employee.class).fill(e);
           aForm = formFactory.form(Address.class).fill(a);
        } 
        catch (Exception ex) 
        {
            return badRequest("error");
        }
        return ok(addNewEmployee.render(empForm,aForm,Employee.getEmployeeById(session().get("email"))));
    }
    

}
