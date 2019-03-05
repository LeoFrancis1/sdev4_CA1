package models.*;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String deptName;

    //a Department can have many Employees
    @OneToMany
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

    //finder for all the departments
    public static Finder<Long,Department> findAll()
    {
        return Department.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String,String> options()
    {
        LinkedHashMap<String,String> options = new LinkedHashMap();

        for (Department d: Department.findAll()) 
        {
            options.put(d.getId().toString(), d.getDeptName());
        }
        return options;
    }


}


