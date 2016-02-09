package com.xebia.training.EmployeePackage;

import java.util.Date;

public class Department  {
	int id;
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

	public Department(int id, String name, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String toString() {
		return "EmployeePackage.Department [id=" + id + ", name=" + name + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}


}
/*
public void resignation(){
	  Calendar c = Calendar.getInstance();
	int now = c.get(Calendar.DATE);
	setEndDate(now);
	}

*/
