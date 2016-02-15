package com.xebia.training.EmployeePackage;

import java.util.Date;

public class Project {
	private Date startDate;
	private Date endDate;
	private int id;
	private String name;
	public Project(int id,Date startDate,Date endDate,String name) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.id = id;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Project project = (Project) o;

		if (id != project.id) return false;
		if (startDate != null ? !startDate.equals(project.startDate) : project.startDate != null) return false;
		if (endDate != null ? !endDate.equals(project.endDate) : project.endDate != null) return false;
		return !(name != null ? !name.equals(project.name) : project.name != null);

	}

	@Override
	public int hashCode() {
		int result = startDate != null ? startDate.hashCode() : 0;
		result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
		result = 31 * result + id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	public String toString() {

		return "EmployeePackage.Project [, id=" + id + ",startDate=" + startDate + ", endDate=" + endDate
				+ ", name=" + name + "]";
	}
}


