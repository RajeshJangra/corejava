package com.xebia.training;

import java.util.Date;

public class Department {
	int id;
	String name;
	Date startdate;
	Date enddate;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the startdate
	 */
	public Date getStartdate() {
		return startdate;
	}
	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	/**
	 * @return the enddate
	 */
	public Date getEnddate() {
		return enddate;
	}
	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", startdate="
				+ startdate + ", enddate=" + enddate + "]";
	}
	public Department(int id, String name, Date startdate, Date enddate) {
		super();
		this.id = id;
		this.name = name;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	

}
