package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.users.*;

import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
//import org.imgscalr.*;

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
    public Result addEmployee()
    {
        Form<Employee> empForm = formFactory.form(Employee.class);
        Form<Address> aForm = formFactory.form(Address.class);
        return ok(addEmployee.render(empForm,aForm,Employee.getEmployeeById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addEmployeeSubmit()
    {
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
        Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();
        if (newEmployeeForm.hasErrors())
        {
            return badRequest(addNewEmployee,render(newEmployeeForm, newAddressForm, Employee.getEmployeeById(session().get("email"))));
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
            flash("success", "Employee " + newEmployee.getName() + " was added/updated.");
            return redirect(controllers.route.EmployeeCRUDController.usersEmployee());
        }
    }
    public Result usersEmployee() {
        List<Employee> empList = null;

        empList = Employee,findAll();

        return ok(employees.render(empList,Employee.getEmployeeById(session().get("email"))));
    }
}
