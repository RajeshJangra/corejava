package com.xebia.training;
import java.util.Date;

import javax.xml.bind.annotation.*;
@SuppressWarnings("restriction")
@XmlRootElement
public class Project {
       private int id;
       private int projectId;
       private String name;
       private Date startDate;
       private Date endDate;
	
	public Project(int id, int projectId, String name, Date startDate,
			Date endDate) {
		super();
		this.id = id;
		this.projectId = projectId;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Project() {
		
	}

	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@XmlElement
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@XmlElement
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + projectId;
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (projectId != other.projectId)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectId=" + projectId + ", name="
				+ name + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}
       
       
       
       
}
