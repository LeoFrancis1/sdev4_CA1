package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;

@Entity

public class Project extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String projectName;
    @Constraints.Required
    private Date startDate;
    @Constraints.Required
    private Date finishDate;
    @Constraints.Required
    private double allocatedBudget;

    @OneToMany(mappedBy = "department", cascade = CascadeType.PERSIST)
    private List<Employee> projectEmployees;

    public Project(Long id, String projectName, Date startDate, Date finishDate, double allocatedBudget) {
        this.id = id;
        this.projectName = projectName;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.allocatedBudget = allocatedBudget;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return this.id;
    }
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public String getProjectName()
    {
        return this.projectName;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getStartDate()
    {
        return this.startDate;
    }

    public void setFinishDate(Date finishDate)
    {
        this.finishDate = finishDate;
    }

    public Date getFinishDate()
    {
        return this.finishDate;
    }

    public void setAllocatedBudget(double allocatedBudget)
    {
        this.allocatedBudget = allocatedBudget;
    }

    public double getAllocatedBudget()
    {
        return this.allocatedBudget;
    }

    public void setProjectEmployees(List<Employee> projectEmployees)
    {
        this.projectEmployees = projectEmployees;
    }
    public List<Employee> getProjectEmployees()
    {
        return this.projectEmployees;
    }

//Make Methods to calculate these
// private double costperDay;
// private double projectedCost;



}