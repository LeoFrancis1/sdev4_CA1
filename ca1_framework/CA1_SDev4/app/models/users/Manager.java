package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@DiscriminatorValue("manager")

public class Manager extends Employee {

    public Manager()
    {
        
    }

    public Manager(String email, String role, String jobTitle, String workPhone, double salary, String password) {
        super(email,role,jobTitle,workPhone,salary,password);
    }

}