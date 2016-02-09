package com.xebia.training;

import java.util.Date;

public class EmployeePersonalDetails {
	private int id;
	private String name;
	private String father_name;
	private int age;
	private Date dob;
	private String  marital_details;
	private String passportno;
	private String aadhar;
	private String bloodgroup;
	private String gender;




	public EmployeePersonalDetails(int id,String name, String father_name, int age,
			Date dob, String marital_details, String passportno, String aadhar,
			String bloodgroup, String gender) {
		super();
		this.id =id;
		this.name = name;
		this.father_name = father_name;
		this.age = age;
		this.dob = dob;
		this.marital_details = marital_details;
		this.passportno = passportno;
		this.aadhar = aadhar;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMarital_details() {
		return marital_details;
	}
	public void setMarital_details(String marital_details) {
		this.marital_details = marital_details;
	}
	public String getPassportno() {
		return passportno;
	}
	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	@Override
	public String toString() {
		return "EmployeePersonalDetails [id=" + id + ", name=" + name
				+ ", father_name=" + father_name + ", age=" + age + ", dob="
				+ dob + ", marital_details=" + marital_details
				+ ", passportno=" + passportno + ", aadhar=" + aadhar
				+ ", bloodgroup=" + bloodgroup + ", gender=" + gender + "]";
	}




}
