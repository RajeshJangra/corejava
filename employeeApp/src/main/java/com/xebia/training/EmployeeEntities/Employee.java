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
	
	
	public List<Salary> salary;
	public List<Project> project;
	public List<PersonalDetails> personalDetails;
	public List<Department> department;
	public List<ContactDetails> contactDetails;
	
	
	
	
	

	public Employee(String name, Date startingDate, String fathersName,
			 Date endingDate, String correspondant,
			Designation designation, String current, String personal,
			String workEx, String gender, Date dOB, int id,List<Salary>  salary,List<Project> project,
			List<PersonalDetails> personalDetails,List<Department> department,List<ContactDetails> contactDetails) {
		super();
		
		this.name = name;
		this.startingDate = startingDate;
		this.fathersName = fathersName;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		this.DOB = dOB;
		this.age = dateCalculator() -getBirthYear();
				
		
		this.endingDate = endingDate;
		this.correspondant = correspondant;
		this.designation = designation;
		this.current = current;
		this.personal = personal;
		this.workEx = workEx;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
		this.project= project;
		this.personalDetails = personalDetails;
		this.department = department;
		this.contactDetails = contactDetails;
		
	    
	}


	public int dateCalculator(){
		int currentyear = Calendar.getInstance().get(Calendar.YEAR);
		return currentyear;
	}
	
	
	public int getBirthYear(){
		Calendar year1 = Calendar.getInstance();
		year1.setTime(DOB);
		int year = year1.get(Calendar.YEAR);
		
		
		return year;
	}
	
	
	


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
