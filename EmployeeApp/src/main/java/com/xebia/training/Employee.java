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
	public String toString() {
		return "Employee [id=" + id + ", name=" + name
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", designation=" + designation + ",\n\nContact=" 
				+contact+",\nProject=" +employeeProject+",\nDepartment=" +employeeDept+",\nPersonalDetails=" +employeePersonalDetails+",\nsalary=" +employeeSalary+"]";
	}








	/*@Override
	public String toString() {
		return "Employee [Employee=" + employeeInput + ",\nContact=" 
				+contact+",\nProject=" +employeeProject+",\nDepartment=" +employeeDept+",\nPersonalDetails=" +employeePersonalDetails+",\nsalary=" +employeeSalary+"]";
	}
*/

}