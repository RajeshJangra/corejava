package Employeefile;

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
		public List<Project> projectData;
		public List<PersonalDetails> personalDetails;
		public List<Department> department;
		public List<Address> address;
		
		public enum Designation{
			 TRAINEE,
			 CONSULTANT,
			 SENIOR_CONSULTANT,
			 PRINCIPLE_CONSULTANT,
			 CEO,
			 CTO,
			 TECHNICAL_DIRECTOR;
			}
		@SuppressWarnings("static-access")
		public Employee(String name, Date startingDate, String fathersName,Date endingDate, String correspondant,
				Designation designation, String current, String personal,String workEx, String gender, Date dOB, 
				int id,List<Salary> salary,List<Project> projectData,List<PersonalDetails> personalDetails,
				List<Department> department,List<Address> address) 
		{
			super();
			this.name = name;
			this.startingDate = startingDate;
			this.fathersName = fathersName;
			@SuppressWarnings("unused")
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
			this.projectData= projectData;
			this.personalDetails = personalDetails;
			this.department = department;
			this.address = address;
			
		    
		}


		public List<Salary> getSalary() {
			return salary;
		}


		public void setSalary(List<Salary> salary) {
			this.salary = salary;
		}


		public List<Project> getProjectData() {
			return projectData;
		}


		public void setProjectData(List<Project> projectData) {
			this.projectData = projectData;
		}


		public List<PersonalDetails> getPersonalDetails() {
			return personalDetails;
		}


		public void setPersonalDetails(List<PersonalDetails> personalDetails) {
			this.personalDetails = personalDetails;
		}


		public int dateCalculator()
		{
			int currentyear = Calendar.getInstance().get(Calendar.YEAR);
			return currentyear;
		}
		
		
		public int getBirthYear()
		{
			Calendar year1 = Calendar.getInstance();
			year1.setTime(DOB);
			int year = year1.get(Calendar.YEAR);
			return year;
		}

		public String toString() {
			return "Employee  \nEmployeeId=" + id + ", startingDate=" + startingDate
					+ ", fathersName=" + fathersName + ", age=" + age
					+ ", endingDate=" + endingDate + ", correspondant="
					+ correspondant + ", current=" + current + ", personal="
					+ personal + ", workEx=" + workEx + ",name=" + name + ", gender="
					+ gender + ", DOB=" + DOB + ",\n salary=" + salary
					+ ",\n projectData=" + projectData + ",\n personalDetails="
					+ personalDetails + ",\n department=" + department
					+ ",\n Address=" + address + "\n";
		}
}
