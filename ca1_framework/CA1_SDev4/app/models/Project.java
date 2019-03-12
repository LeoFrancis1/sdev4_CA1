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




//Make Methods to calculate these
// private double costperDay;
// private double projectedCost;



}