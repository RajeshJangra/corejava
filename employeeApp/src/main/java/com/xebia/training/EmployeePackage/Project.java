package com.xebia.training.EmployeePackage;

import java.util.Date;

public class Project {
	private Date startDate;
	private Date endDate;
	private int id;
	private String name;
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
	public Project(int id,Date startDate, Date endDate,  String name) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "EmployeePackage.Project [, id=" + id + ",startDate=" + startDate + ", endDate=" + endDate
				+ ", name=" + name + "]";
	}
}

/*
public void resignation(){
	  Calendar c = Calendar.getInstance();
	int now = c.get(Calendar.DATE);
	setEndDate(now);
	}

*/
