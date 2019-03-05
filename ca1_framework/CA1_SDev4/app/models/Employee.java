package models.*;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
@DiscriminatorValue("employee")

public class Employee extends Model {

    @Constraints.Required
    @Id
    private String email;
    @Column(insertable=false, updatable=false)
    private String role;
    @Constraints.Required
    private String jobTitle;
    @Constraints.Required
    private String workPhone;
    @Constraints.Required
    double salary;
    @Constraints.Required
    String password;

    public Employee()
    {
        
    }

    public Employee(String email, String role, String jobTitle, String workPhone, double salary, String password) {
        this.email = email;
        this.role = role;
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

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
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
    

    


    
}