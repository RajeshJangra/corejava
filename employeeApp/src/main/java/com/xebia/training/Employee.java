package com.xebia.training;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.*;

@SuppressWarnings("restriction")
@XmlRootElement
public class Employee {
	public enum Designation{
		JAVA_CONSULTANT,
		SENIOR_JAVA_CONSULTANT,
		TRAINEE,
		CEO,
		CTO;
		
	}
	
	
	public Employee() {
		
	}
	private String name;
	private String fatherName;
	private int id;
	private int age;
	private Address address;
	private Salary salary;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private Date dateOfEnding;
	private PersonalDetail personalDetail;
	private Department department;
	private int workExperience;
	
	private List<Project> project;
	private String gender;
	private Designation designation;

	
	
	public Employee(String name, String fatherName, int id, Address address,
			Salary salary, Date dateOfBirth, Date dateOfJoining,
			Date dateOfEnding, PersonalDetail personalDetail,
			Department department, int workExperience, List<Project> project,
			String gender, Designation designation) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.id = id;
		
		this.address = address;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.dateOfEnding = dateOfEnding;
		this.personalDetail = personalDetail;
		this.department = department;
		this.workExperience = workExperience;
		this.project = project;
		this.gender = gender;
		this.designation = designation;
		this.age=this.calculateAge();
	}

	@XmlElement
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	@XmlElement
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@XmlElement
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@XmlElement
	public Date getDateOfEnding() {
		return dateOfEnding;
	}
	public void setDateOfEnding(Date dateOfEnding) {
		this.dateOfEnding = dateOfEnding;
	}
	
	public void setAge()
	{
		this.age=this.calculateAge();
	}

	public int getAge() {
		return age;
	}
	

	public PersonalDetail getPersonalDetail() {
		return personalDetail;
	}
	public void setPersonalDetail(PersonalDetail personalDetail) {
		this.personalDetail = personalDetail;
	}
	@XmlElement
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
	@XmlElement
	public int getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	@XmlElement
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	 public int calculateAge() {
	        Calendar calender = Calendar.getInstance();
	        calender.setTime(this.dateOfBirth);
	        int year = calender.get(Calendar.YEAR);
	        calender = Calendar.getInstance();
	        int now = calender.get(Calendar.YEAR);
	        return now - year;
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
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((personalDetail == null) ? 0 : personalDetail.hashCode());
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (personalDetail == null) {
			if (other.personalDetail != null)
				return false;
		} else if (!personalDetail.equals(other.personalDetail))
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
				+ dateOfEnding + ", personalDetail=" + personalDetail
				+ ", workExperience=" + workExperience + ", project=" + project
				+ ", gender=" + gender + ", designation=" + designation + "]";
	}
	

}

