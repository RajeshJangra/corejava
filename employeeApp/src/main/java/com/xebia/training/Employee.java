package com.xebia.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	String line;
	private int id;
	private int work_exp;
	designation designation_obj;
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (designation_obj != other.designation_obj)
			return false;
		if (id != other.id)
			return false;
		if (line == null) {
			if (other.line != null)
				return false;
		} else if (!line.equals(other.line))
			return false;
		if (personaldetails == null) {
			if (other.personaldetails != null)
				return false;
		} else if (!personaldetails.equals(other.personaldetails))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (work_exp != other.work_exp)
			return false;
		return true;
	}

	private ArrayList<Address> address;
	private ArrayList<Salary> salary;
	private ArrayList<Project> project;
	private ArrayList<PersonalDetails> personaldetails;
	private ArrayList<Contact> contact;
	private ArrayList<Department> department;

	public Employee(int id, int work_exp, designation designation_obj, List<Salary> salary, List<Department> department,
			List<Project> project, List<Contact> contact, List<Address> address, List<PersonalDetails> personaldetails)
					throws NumberFormatException, IOException {
		super();
		this.id = id;
		this.work_exp = work_exp;
		this.designation_obj = designation_obj;
		this.address = (ArrayList<Address>) address;
		this.salary = (ArrayList<Salary>) salary;
		this.project = (ArrayList<Project>) project;
		this.personaldetails = (ArrayList<PersonalDetails>) personaldetails;
		this.contact = (ArrayList<Contact>) contact;
		this.department = (ArrayList<Department>) department;
	}

	

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWork_exp() {
		return work_exp;
	}

	public void setWork_exp(int work_exp) {
		this.work_exp = work_exp;
	}

	public designation getDesignation_obj() {
		return designation_obj;
	}

	public void setDesignation_obj(designation designation_obj) {
		this.designation_obj = designation_obj;
	}

	public ArrayList<Address> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}

	public ArrayList<Salary> getSalary() {
		return salary;
	}

	public void setSalary(ArrayList<Salary> salary) {
		this.salary = salary;
	}

	public ArrayList<Project> getProject() {
		return project;
	}

	public void setProject(ArrayList<Project> project) {
		this.project = project;
	}

	public ArrayList<PersonalDetails> getPersonaldetails() {
		return personaldetails;
	}

	public void setPersonaldetails(ArrayList<PersonalDetails> personaldetails) {
		this.personaldetails = personaldetails;
	}

	public ArrayList<Contact> getContact() {
		return contact;
	}

	public void setContact(ArrayList<Contact> contact) {
		this.contact = contact;
	}

	public ArrayList<Department> getDepartment() {
		return department;
	}

	public void setDepartment(ArrayList<Department> department) {
		this.department = department;
	}



	public enum designation {
		TRAINEE, PROJECTENGINEER, JAVADEVELOPER, ACCOUNTANT, QAANALYST, SCRUMMASTER, CEO;
	}

	public String toString() {
		return " Employee: (Eid=" + id + ", work_exp=" + work_exp + ", designation_obj=" + designation_obj + "\n Salary:"
				+ salary + "\n Department:" + department + "\n Project:" + project + "\n Contact:" + contact
				+ "\n Address:" + address + "\n Personaldetails:" + personaldetails + ")";
	}

}
