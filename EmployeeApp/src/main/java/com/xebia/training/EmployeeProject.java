package com.xebia.training;

import java.util.Date;

public class EmployeeProject {
	private int id;
	private int pid;
	private String name;
	private Date startDate;
	private Date endDate;



	public EmployeeProject(int id, int pid, String name, Date startDate,
			Date endDate) {
		super();
		this.id = id;
		this.pid = pid;
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


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
		return "EmployeeProject [id=" + id + ", pid=" + pid + ", name=" + name
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}


}
