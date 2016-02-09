package com.Employee1;

import java.util.Date;

public class Department {
	private double departmentId;
	
	private int id;
	private String name;
	private Date startingDate;
	private Date endingDate;
	
	
	
	public Department(int id,double departmentId, String name, Date startingDate,
			Date endingDate) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.name = name;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
	}
	@Override
	public String toString() {
		return " [DepartmentId=" + departmentId + ", name=" + name
				+ ", startingDate=" + startingDate + ", endingDate="
				+ endingDate + "]";
	}


	
	
	
	
	

}
