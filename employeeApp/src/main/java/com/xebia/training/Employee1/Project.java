package com.Employee1;

import java.util.Date;

public class Project {
	int id;
	private double projectId;
	private String name;
	private Date endDate;
	private Date startDate;
	
	
	@Override
	public String toString() {
		return " [ProjectId=" + projectId + ", Name=" + name
				+ ", StartDate=" + startDate + ", EndDate=" + endDate + "]";
	}
	
	
	
	

	public Project(int id,double projectId, String name, Date startDate,
			Date endDate) {
		super();
		this.id = id;
		this.projectId = projectId;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

}
