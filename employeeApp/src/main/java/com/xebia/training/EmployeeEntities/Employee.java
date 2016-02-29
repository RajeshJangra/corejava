package com.xebia.training.EmployeeEntities;



import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Employee {

	private String name;
	private Date startingDate;
	private String fathersName;
	private int age;
	private Date endingDate;
	private String correspondant;
	static Designation designation;
	private String current;

	private String personal;
	private String workEx;

	






	private int id;
	private String gender;
	private Date DOB;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}

	public String getCorrespondant() {
		return correspondant;
	}

	public void setCorrespondant(String correspondant) {
		this.correspondant = correspondant;
	}

	public static Designation getDesignation() {
		return designation;
	}

	public static void setDesignation(Designation designation) {
		Employee.designation = designation;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getWorkEx() {
		return workEx;
	}

	public void setWorkEx(String workEx) {
		this.workEx = workEx;
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

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}

	public List<Salary> getSalary() {
		return salary;
	}

	public void setSalary(List<Salary> salary) {
		this.salary = salary;
	}

	public List<PersonalDetails> getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(List<PersonalDetails> personalDetails) {
		this.personalDetails = personalDetails;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public List<ContactDetails> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<ContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public List<Salary> salary;
	public List<Project> project;
	public List<PersonalDetails> personalDetails;
	public List<Department> department;
	public List<ContactDetails> contactDetails;


	@Override
	public String toString() {
		return "Employee [ \nEmployeeId=" + id + ", startingDate=" + startingDate
				+ ", fathersName=" + fathersName + ", age=" + age
				+ ", endingDate=" + endingDate + ", correspondant="
				+ correspondant + ", current=" + current + ", personal="
				+ personal + ", workEx=" + workEx + ",name=" + name + ", gender="
				+ gender + ", DOB=" + DOB + ",\n salary=" + salary
				+ ",\n projectData=" + project + ",\n personalDetails="
				+ personalDetails + ",\n department=" + department
				+ ",\n contactDetails=" + contactDetails + "\n]";
	}


	
	 


	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}






	public enum Designation{
	 TRAINEE,
	 CONSULTANT,
	 SENIOR_CONSULTANT,
	 PRINCIPLE_CONSULTANT,
	 CEO,
	 CTO,
	 TECHNICAL_DIRECTOR;
	}
	
	

	
	
}
