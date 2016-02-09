package com.xebia.training;
import java.util.Date;


enum Designation{
	JAVA_CONSULTANT,
	SENIOR_JAVA_CONSULTANT,
	TRAINEE;
	
}

public class Employee {
	
	private String name;
	private String fatherName;
	private String id;
	private int age;
	private Address address;
	private Salary salary;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private Date dateOfEnding;
	private PersonalDetails personalDetails;
	
	private int workExperience;
	
	private Project project;
	private String gender;
	private Designation designation;
	
	
	
	public Employee(String name, String fatherName, String id, int age,
			Address address, Salary salary, Date dateOfBirth,
			Date dateOfJoining, Date dateOfEnding,
			PersonalDetails personalDetails, int workExperience,
			Project project, String gender,Designation designation) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.id = id;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.dateOfEnding = dateOfEnding;
		this.personalDetails = personalDetails;
		this.workExperience = workExperience;
		this.project = project;
		this.gender = gender;
		this.designation=designation;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Date getDateOfEnding() {
		return dateOfEnding;
	}
	public void setDateOfEnding(Date dateOfEnding) {
		this.dateOfEnding = dateOfEnding;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}
	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public int getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
	
	public Address getAddress() {
		return address;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result
				+ ((dateOfEnding == null) ? 0 : dateOfEnding.hashCode());
		result = prime * result
				+ ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result
				+ ((designation == null) ? 0 : designation.hashCode());
		result = prime * result
				+ ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((personalDetails == null) ? 0 : personalDetails.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + workExperience;
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dateOfEnding == null) {
			if (other.dateOfEnding != null)
				return false;
		} else if (!dateOfEnding.equals(other.dateOfEnding))
			return false;
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (designation != other.designation)
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (personalDetails == null) {
			if (other.personalDetails != null)
				return false;
		} else if (!personalDetails.equals(other.personalDetails))
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
		if (workExperience != other.workExperience)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", fatherName=" + fatherName
				+ ", id=" + id + ", age=" + age + ", address=" + address
				+ ", salary=" + salary + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + ", dateOfEnding="
				+ dateOfEnding + ", personalDetails=" + personalDetails
				+ ", workExperience=" + workExperience + ", project=" + project
				+ ", gender=" + gender + ", designation=" + designation + "]";
	}
	

}

