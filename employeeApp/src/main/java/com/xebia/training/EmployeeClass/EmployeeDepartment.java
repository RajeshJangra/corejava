package com.xebia.training.EmployeeClass;

import org.joda.time.LocalDate;

import java.io.Serializable;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class EmployeeDepartment implements Serializable {

    private int id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public EmployeeDepartment(int id, String name, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
