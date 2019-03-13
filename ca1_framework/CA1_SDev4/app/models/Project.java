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


    public Project(Long id, String projectName, Date startDate, Date finishDate, double allocatedBudget) {
        this.id = id;
        this.projectName = projectName;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.allocatedBudget = allocatedBudget;
    }



//Make Methods to calculate these
// private double costperDay;
// private double projectedCost;



}