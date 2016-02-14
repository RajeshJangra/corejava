package com.xebia.training.employeeInformation;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(propOrder = {"deptId", "deptName", "startDate", "endDate"})
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

        return deptId.equals(that.deptId) && deptName.equals(that.deptName) && startDate.equals(that.startDate) && (endDate != null ? endDate.equals(that.endDate) : that.endDate == null);

    }

    @Override
    public int hashCode() {
        int result = deptId.hashCode();
        result = 31 * result + deptName.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }

    @XmlAttribute(name = "deptId")
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @XmlElement(name = "deptName")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @XmlElement(name = "startDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @XmlElement(name = "endDate")
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

