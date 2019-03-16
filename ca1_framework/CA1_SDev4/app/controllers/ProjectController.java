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


public class ProjectController extends Controller {
    private FormFactory formFactory;

    //add project
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }
    
    public result addItem() {
        Form<Project> itemForm = formfactory.form(Project.class);
        return ok(additem.render(itemForm));
    }

}
