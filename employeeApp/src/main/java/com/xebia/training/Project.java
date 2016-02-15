package com.xebia.training;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Project {
	private int id;
	private int pid;
	private String name;
	private Date startdate;
	private Date enddate;

	public Project() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Project project = (Project) o;

		if (id != project.id) return false;
		if (pid != project.pid) return false;
		if (name != null ? !name.equals(project.name) : project.name != null) return false;
		if (startdate != null ? !startdate.equals(project.startdate) : project.startdate != null) return false;
		return enddate != null ? enddate.equals(project.enddate) : project.enddate == null;

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + pid;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
		result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
		return result;
	}

	/**

	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public Project(int id,int pid ,String name, Date startdate, Date enddate) {
		super();
		this.id = id;
		this.pid=pid;
		this.name = name;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [id=" + id + ", pid=" + pid + ", name=" + name + ", startdate="
				+ startdate + ", enddate=" + enddate + "]";
	}
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


}
