package com.xebia.training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import com.xebia.training.Address;
import com.xebia.training.Address.addressType;

public class Employee {
	String line;
	private int id;
	private int work_exp;
	designation designation_obj;
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

	enum designation {
		TRAINEE, PROJECTENGINEER, JAVADEVELOPER, ACCOUNTANT, QAANALYST, SCRUMMASTER, CEO;
	}

	public String toString() {
		return " Employee: (Eid=" + id + ", work_exp=" + work_exp + ", designation_obj=" + designation_obj + "\n Salary:"
				+ salary + "\n Department:" + department + "\n Project:" + project + "\n Contact:" + contact
				+ "\n Address:" + address + "\n Personaldetails:" + personaldetails + ")";
	}

}
