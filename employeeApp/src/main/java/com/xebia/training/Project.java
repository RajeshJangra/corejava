package com.xebia.training;
import java.util.Date;
public class Project {


	private int id;
	
	private Date start_date, end_date;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project(int id, String name, Date end_date, Date start_date) {
		super();
		this.id = id;
		this.name = name;
		this.start_date = start_date;
		this.end_date = end_date;
		
	}
	
	
	@Override
	public String toString() {
		return "(Eid=" + id + ", Start date=" + start_date + ", End date=" + end_date + ", Name=" + name + ")";
	}
	
	
	
}
