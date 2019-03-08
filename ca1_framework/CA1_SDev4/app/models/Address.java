package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Address extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String Address1;
    @Constraints.Required
    private String Address2;
    @Constraints.Required
    private String townCity;
    @Constraints.Required
    private String eircode;
    
    @OneToOne
    private Employee employee;


    public Address() {
    }


    public Address(Long id, String Address1, String Address2, String townCity, String eircode, Employee employee) {
        this.id = id;
        this.Address1 = Address1;
        this.Address2 = Address2;
        this.townCity = townCity;
        this.eircode = eircode;
        this.employee = employee;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress1() {
        return this.Address1;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public String getAddress2() {
        return this.Address2;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public String getTownCity() {
        return this.townCity;
    }

    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }

    public String getEircode() {
        return this.eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    

}
