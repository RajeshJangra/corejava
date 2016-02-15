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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadhar == null) ? 0 : aadhar.hashCode());
		result = prime * result + age;
		result = prime * result
				+ ((bloodgroup == null) ? 0 : bloodgroup.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result
				+ ((father_name == null) ? 0 : father_name.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((marital_details == null) ? 0 : marital_details.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((passportno == null) ? 0 : passportno.hashCode());
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
		EmployeePersonalDetails other = (EmployeePersonalDetails) obj;
		if (aadhar == null) {
			if (other.aadhar != null)
				return false;
		} else if (!aadhar.equals(other.aadhar))
			return false;
		if (age != other.age)
			return false;
		if (bloodgroup == null) {
			if (other.bloodgroup != null)
				return false;
		} else if (!bloodgroup.equals(other.bloodgroup))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (father_name == null) {
			if (other.father_name != null)
				return false;
		} else if (!father_name.equals(other.father_name))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (marital_details == null) {
			if (other.marital_details != null)
				return false;
		} else if (!marital_details.equals(other.marital_details))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passportno == null) {
			if (other.passportno != null)
				return false;
		} else if (!passportno.equals(other.passportno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name
				+ ", father_name=" + father_name + ", age=" + age + ", dob="
				+ dob + ", marital_details=" + marital_details
				+ ", passportno=" + passportno + ", aadhar=" + aadhar
				+ ", bloodgroup=" + bloodgroup + ", gender=" + gender + " ";
	}




}
