package com.xebia.training.Employee; /**
 * Created by jasleen on 27/1/16.
 */
import java.util.Date;

public class Department {
    private int id;
    private String DepartmentId;
    private String deptName;
    private Date startDate;
    private Date endDate;

    public Department(int id, String departmentId, String deptName, Date startDate, Date endDate) {
        this.id = id;
        DepartmentId = departmentId;
        this.deptName = deptName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", DepartmentId='" + DepartmentId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
