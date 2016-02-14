package com.xebia.training.employeeInformation;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

public class Department {
    private final static String directory = "C:/Users/nitishkumar/Desktop/Employee/";
    String deptId, deptName;
    Date startDate, endDate = null;

    public Department() {
    }

    public Department(DepartmentType departmentType) {
        this.deptId = departmentType.getDepartmentId();
        this.deptName = departmentType.name();
        this.startDate = departmentType.getStartDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (!deptId.equals(that.deptId)) return false;
        if (!deptName.equals(that.deptName)) return false;
        if (!startDate.equals(that.startDate)) return false;
        return endDate.equals(that.endDate);

    }

    @Override
    public int hashCode() {
        int result = deptId.hashCode();
        result = 31 * result + deptName.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        return result;
    }

    @XmlAttribute(name = "deptId")
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

    @Override
    public String toString() {
        return "\nDept Id='" + deptId + '\'' +
                ", Dept Name='" + deptName + '\'' +
                ", Start Date=" + startDate +
                ", End Date=" + endDate;
    }
}

