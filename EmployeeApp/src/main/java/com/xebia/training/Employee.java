package com.xebia.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.xebia.training.Contact.AddressType;
import com.xebia.training.Employee.Designation;

//import java.util.Date;

public class Employee {
	FileReader in;
	private int id;
	private int pid;
	private String name;
	private Date startDate;
	private Date endDate;
	private Designation designation;
	//private String project;
	List<Employee> employeeInput;
	List<Contact> contact;
	List<EmployeeProject> employeeProject;
	List<EmployeeDept>  employeeDept;
	List<EmployeePersonalDetails> employeePersonalDetails;
	List<EmployeeSalary> employeeSalary;

	/*private int experience;
	private long phone;
	private String email;
	private String gender;
	private String current;
	private String permanent;
	private String maritalStatus;*/

	public enum Designation{
		TRAINEE,
		CONSULTANT,
		DEVELOPER,
		CEO,
		HR;
	}
	



	public Employee(int id, String name,
			Date startDate, Date endDate, Designation designation,List<Contact> list2,List<EmployeeProject> list5,List<EmployeeDept> list1,List<EmployeePersonalDetails>list3,List<EmployeeSalary> list4) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.designation = designation;
		this.contact=list2;
		this.employeeProject=list5;
		this.employeeDept= list1;
		this.employeePersonalDetails= list3;
		this.employeeSalary=list4;
	}



	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result
				+ ((designation == null) ? 0 : designation.hashCode());
		result = prime * result
				+ ((employeeDept == null) ? 0 : employeeDept.hashCode());
		result = prime * result
				+ ((employeeInput == null) ? 0 : employeeInput.hashCode());
		result = prime
				* result
				+ ((employeePersonalDetails == null) ? 0
						: employeePersonalDetails.hashCode());
		result = prime * result
				+ ((employeeProject == null) ? 0 : employeeProject.hashCode());
		result = prime * result
				+ ((employeeSalary == null) ? 0 : employeeSalary.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pid;
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
		Employee other = (Employee) obj;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (designation != other.designation)
			return false;
		if (employeeDept == null) {
			if (other.employeeDept != null)
				return false;
		} else if (!employeeDept.equals(other.employeeDept))
			return false;
		if (employeeInput == null) {
			if (other.employeeInput != null)
				return false;
		} else if (!employeeInput.equals(other.employeeInput))
			return false;
		if (employeePersonalDetails == null) {
			if (other.employeePersonalDetails != null)
				return false;
		} else if (!employeePersonalDetails
				.equals(other.employeePersonalDetails))
			return false;
		if (employeeProject == null) {
			if (other.employeeProject != null)
				return false;
		} else if (!employeeProject.equals(other.employeeProject))
			return false;
		if (employeeSalary == null) {
			if (other.employeeSalary != null)
				return false;
		} else if (!employeeSalary.equals(other.employeeSalary))
			return false;
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
		if (pid != other.pid)
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
		return "Employee [id=" + id + ", name=" + name
				+ ", Date of joinning:" + startDate + ", Date of Termination:" + endDate
				+ ", Designation in company:" + designation + ",\n\nContact Details: " 
				+contact+",\nProject Details: " +employeeProject+",\nDetails of the Department: " +employeeDept+","
						+ "\nEmployee Personal Details:" +employeePersonalDetails+",\nSalary Details of the Employee: " +employeeSalary+"]";
	}








	/*@Override
	public String toString() {
		return "Employee [Employee=" + employeeInput + ",\nContact=" 
				+contact+",\nProject=" +employeeProject+",\nDepartment=" +employeeDept+",\nPersonalDetails=" +employeePersonalDetails+",\nsalary=" +employeeSalary+"]";
	}
*/

}