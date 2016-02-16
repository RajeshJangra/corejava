package com.xebia.training;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement(name = "Departments")
public class Departments {
	

	    private List<Department> departments;

	    public Departments() {
	    }

	    public Departments(final List<Department> departments) {
	        this.departments = departments;
	    }

	    @XmlElement(name = "Department")
	    public List<Department> getDepartment() {
	        return departments;
	    }

	    public void setDepartment(final List<Department> departments) {
	        this.departments = departments;
	    }

		@Override
		public String toString() {
			return "Departments [departments=" + departments + "]";
		}

	   
	}