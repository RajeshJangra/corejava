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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Department that = (Department) o;

		if (id != that.id) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
		return !(endDate != null ? !endDate.equals(that.endDate) : that.endDate != null);

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
		result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
		return result;
	}
}

