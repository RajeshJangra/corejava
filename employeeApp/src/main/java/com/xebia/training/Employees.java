package com.xebia.training;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@SuppressWarnings("restriction")
@XmlRootElement(name = "Employees")
public class Employees {
	

	    private List<Employee> employees;

	    public Employees() {
	    }

	    public Employees(final List<Employee> employees) {
	        this.employees = employees;
	    }

	    @XmlElement(name = "employee")
	    public List<Employee> getEmployees() {
	        return employees;
	    }

	    public void setEmployees(final List<Employee> employees) {
	        this.employees = employees;
	    }

	    @Override
	    public String toString() {
	        return "Employees{" +
	                "employees=" + employees +
	                '}';
	    }
	}

