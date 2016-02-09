package com.xebia.training;

import java.util.Date;

public class Project {
    private int projectId;
    private String projectName;
    private Date startDate, endDate=null;

    /**
     * @param projectId
     * @param projectName
     * @param startDate
     */
    public Project(int projectId, String projectName, Date startDate) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.startDate = startDate;
    }

    /**
     * @return the projectId
     */
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
        return "\nProject Id=" + projectId +
                ", Project Name='" + projectName + '\'' +
                ", Start Date=" + startDate +
                ", End Date=" + endDate;
    }
}
