package com.xebia.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

enum DepartmentType {
    ACCOUNT("D01", "01-01-2000"),
    MANAGEMENT("D02", "01-01-2001"),
    IT("D03", "01-01-2002"),
    LOGISTICS("D04", "01-01-2003"),
    ADMIN("D05", "01-01-2004"),
    HR("D06", "01-01-2005"),
    OTHERS("D07", "01-01-2006");
    private String departmentId;
    private Date startDate;

    private DepartmentType(String departmentId, String startDate) {
        this.departmentId = departmentId;
        try {
            this.startDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
            //      this.endDate =
        } catch (ParseException p) {
            p.printStackTrace();
        }
    }

    /**
     * @return the departmentId
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}

public class Department {
    String id, deptId, deptName;
    Date startDate, endDate = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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


    Department(String id, DepartmentType departmentType) {
        this.id = id;
        this.deptId = departmentType.getDepartmentId();
        this.deptName = departmentType.name();
        this.startDate = departmentType.getStartDate();
    }

    @Override
    public String toString() {
        return "\nDept Id='" + deptId + '\'' +
                ", Dept Name='" + deptName + '\'' +
                ", Start Date=" + startDate +
                ", End Date=" + endDate;
    }
}

