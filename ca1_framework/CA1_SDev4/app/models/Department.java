package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;

@Entity
public class Department extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String deptName;

    //a Department can have many Employees
    @OneToMany(mappedBy = "department",cascade = CascadeType.PERSIST)
    private List<Employee> empList;


    public Department() {
    }


    public Department(Long id, String deptName, List<Employee> empList) {
        this.id = id;
        this.deptName = deptName;
        this.empList = empList;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmpList() {
        return this.empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public int getEmpListSize()
    {
        return empList.size();
    }

    public static Finder<Long,Department> find = new Finder<Long,Department>(Department.class);

    //finder for all the departments
    public static List<Department> findAll()
    {
        return Department.find.query().where().orderBy("dept_name asc").findList();
    }


    //Throw a -Werror which is thrown if there's a warning which this causes
    // public static Map<String,String> options() {
    //     LinkedHashMap<String,String> options = new LinkedHashMap();
     
    //     // Get all the categories from the database and add them to the options hash map
    //     for (Department d: Department.findAll()) {
    //        options.put(d.getId().toString(), d.getDeptName());
    //     }
    //     return options;
    //  }

     public static boolean inDepartment(Long department, Long employee) 
     {
        return find.query().where().eq("employees.id",employee)
                            .eq("id", department)
                            .findList().size() > 0;
     }


}


