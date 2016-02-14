package com.xebia.training.employeeInformation;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

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

        if (projectId != project.projectId) return false;
        if (!projectName.equals(project.projectName)) return false;
        if (!startDate.equals(project.startDate)) return false;
        return endDate.equals(project.endDate);

    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + projectName.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        return result;
    }

    /**
     * @return the projectId
     */
    @XmlAttribute(name = "projectId")
    public int getProjectId() {
        return projectId;
    }

    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
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
