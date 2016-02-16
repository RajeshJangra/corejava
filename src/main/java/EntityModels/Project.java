package EntityModels;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class Project implements Serializable {

    public enum Designation {
        TRAINEE,
        CONSULTANT,
        SENIOR_CONSULTANT,
        MANAGER,
        HR,
        CEO;
    }

    private int id;
    private String name;
    private Designation designation;
    private Date startDate;
    private Date endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Designation getDesignation() {
        return designation;
    }
    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
