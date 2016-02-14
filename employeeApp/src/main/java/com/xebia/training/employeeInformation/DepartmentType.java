package com.xebia.training.employeeInformation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nitishkumar on 11-Feb-16.
 */
public enum DepartmentType {
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
