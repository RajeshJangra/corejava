package com.xebia.training.employeeInformation;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(propOrder = {"projectId", "projectName", "startDate", "endDate"})
public class Project {
    private int projectId;
    private String projectName;
    private Date startDate, endDate = null;

    public Project() {
    }

    public Project(int projectId, String projectName, Date startDate) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        return projectId == project.projectId && projectName.equals(project.projectName) && startDate.equals(project.startDate) && (endDate != null ? endDate.equals(project.endDate) : project.endDate == null);

    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + projectName.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }

    @XmlAttribute(name = "projectId")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @XmlElement(name = "projectName")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
        return "\nproject Id=" + projectId +
                ", project Name='" + projectName + '\'' +
                ", Start Date=" + startDate +
                ", End Date=" + endDate;
    }
}
