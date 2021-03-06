package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.Department;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
@DiscriminatorValue("employee")

public class Employee extends Model {

    @Constraints.Required
    @Id
    private String email;

    private Long id;
    @Column(insertable=false, updatable=false)
    private String role;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String jobTitle;
    @Constraints.Required
    private String workPhone;
    @Constraints.Required
    private double salary;
    @Constraints.Required
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="AID")
    private Address address;

    @ManyToOne
    private Department department;

    
    public Employee()
    {

    }

    public Employee(String email, String role,String name, String jobTitle, String workPhone, double salary, String password) {
        this.email = email;
        this.role = role;
        this.name = name;
        this.jobTitle = jobTitle;
        this.workPhone = workPhone;
        this.salary = salary;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id  = id;
    }
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getWorkPhone() {
        return this.workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress()
    {
        return this.address;
    }

    public void setAddress(Address a)
    {
        this.address = a;
    }
    public static Finder<Long,Employee> find = new Finder<>(Employee.class);

    //finder for all the departments
    public static List<Employee> findAll()
    {
        return Employee.find.all();
        //return Employee.find.query().where().orderBy("name asc").findList();
    }
    public static Employee authenticate(String email, String password) {
        return find.query().where().eq("email",email).eq("password",password).findUnique();
    }

    public static Employee getEmployeeById(String id)
    {
        if (id == null)
        {
            return null;
        }
        else
        {
            return find.query().where().eq("email", id).findUnique();
        }
    }


    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}