package com.xebia.training;

public class PersonalDetails {
private int id;
private String bloodGroup;
 private String aadhaarNumber;
 private String drivingLicenseNumber;
 private String passportNumber;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public PersonalDetails(int id, String bloodGroup, String aadhaarNumber,
		String drivingLicenseNumber, String passportNumber) {
	super();
	this.id = id;
	this.bloodGroup = bloodGroup;
	this.aadhaarNumber = aadhaarNumber;
	this.drivingLicenseNumber = drivingLicenseNumber;
	this.passportNumber = passportNumber;
}
public String getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}
public String getAadhaarNumber() {
	return aadhaarNumber;
}
public void setAadhaarNumber(String aadhaarNumber) {
	this.aadhaarNumber = aadhaarNumber;
}
public String getDrivingLicenseNumber() {
	return drivingLicenseNumber;
}
public void setDrivingLicenseNumber(String drivingLicenseNumber) {
	this.drivingLicenseNumber = drivingLicenseNumber;
}
public String getPassportNumber() {
	return passportNumber;
}
public void setPassportNumber(String passportNumber) {
	this.passportNumber = passportNumber;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result
			+ ((aadhaarNumber == null) ? 0 : aadhaarNumber.hashCode());
	result = prime * result
			+ ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
	result = prime
			* result
			+ ((drivingLicenseNumber == null) ? 0 : drivingLicenseNumber
					.hashCode());
	result = prime * result + id;
	result = prime * result
			+ ((passportNumber == null) ? 0 : passportNumber.hashCode());
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
	PersonalDetails other = (PersonalDetails) obj;
	if (aadhaarNumber == null) {
		if (other.aadhaarNumber != null)
			return false;
	} else if (!aadhaarNumber.equals(other.aadhaarNumber))
		return false;
	if (bloodGroup == null) {
		if (other.bloodGroup != null)
			return false;
	} else if (!bloodGroup.equals(other.bloodGroup))
		return false;
	if (drivingLicenseNumber == null) {
		if (other.drivingLicenseNumber != null)
			return false;
	} else if (!drivingLicenseNumber.equals(other.drivingLicenseNumber))
		return false;
	if (id != other.id)
		return false;
	if (passportNumber == null) {
		if (other.passportNumber != null)
			return false;
	} else if (!passportNumber.equals(other.passportNumber))
		return false;
	return true;
}
@Override
public String toString() {
	return "PersonalDetails [id=" + id + ", bloodGroup=" + bloodGroup
			+ ", aadhaarNumber=" + aadhaarNumber + ", drivingLicenseNumber="
			+ drivingLicenseNumber + ", passportNumber=" + passportNumber + "]";
}
 
 
 
 
 
}
