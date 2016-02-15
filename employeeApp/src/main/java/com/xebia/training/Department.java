package com.xebia.training;
import java.util.Date;
public class Department {
	
	int id;
	private String Name;
	private Date startDate,endDate;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public Department(int id, String name, Date startDate, Date endDate) {
		super();
		this.id = id;
		Name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void setName(String name) {
		Name = name;
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
	
	public String toString() {
		return "(Eid=" + id + ", Name=" + Name + ", StartDate=" + startDate + ", EndDate=" + endDate + ")";
	}
	

}
