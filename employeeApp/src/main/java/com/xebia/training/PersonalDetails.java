package com.xebia.training;
import java.util.Calendar;
import java.util.Date;
public class PersonalDetails {
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalDetails other = (PersonalDetails) obj;
		if (aadharno != other.aadharno)
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
		if (fathername == null) {
			if (other.fathername != null)
				return false;
		} else if (!fathername.equals(other.fathername))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (maritalstatus == null) {
			if (other.maritalstatus != null)
				return false;
		} else if (!maritalstatus.equals(other.maritalstatus))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private int id,age;
	private String name,fathername,gender,bloodgroup;
	private String maritalstatus;
	private Date dob;
	private long aadharno;
	
	public PersonalDetails(int id, int age, String name, String fathername, String gender, String bloodgroup,
			String maritalstatus, Date dob, long aadharno) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.fathername = fathername;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.maritalstatus = maritalstatus;
		this.dob = dob;
		this.aadharno = aadharno;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	
	
	
	public void agecalc()
	  {
		Calendar c1=Calendar.getInstance();
	  c1.setTime(dob);
	   int dbyear=c1.get(Calendar.YEAR);
	   
	   Calendar c=Calendar.getInstance();
	   int current=c.get(Calendar.YEAR);
	   int age=current-dbyear;
	   System.out.println("Age calculated is"+age);
	  }
	
	@Override
	public String toString() {
		return "(Eid=" + id + ", Age=" + age + ", Name=" + name + ", Fathername=" + fathername
				+ ", Gender=" + gender + ", Bloodgroup=" + bloodgroup + ", Maritalstatus=" + maritalstatus + ", Dob="
				+ dob + ", Aadhar no=" + aadharno + ")";
	}
	
}
