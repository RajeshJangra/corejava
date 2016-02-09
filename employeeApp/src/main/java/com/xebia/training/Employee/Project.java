package com.xebia.training.Employee;

import java.util.Date;

/**
 * Created by jasleen on 27/1/16.
 */
public class Project {
    private String projectId;
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public Project(String projectId,int id, String name, Date startDate, Date endDate) {
        this.projectId = projectId;
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
