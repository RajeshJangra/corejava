package com.xebia.training.employeeInformation;

import java.util.Calendar;
import java.util.Date;

public class PersonalDetails {
    private String name, fatherName, motherName, drivingLicenceNo, panNo;
    private long adharNo;
    private int age;
    private Date dateOfBirth;
    private Gender gender;
    private BloodGroup bloodGroup;
    private MaritalStatus maritalStatus;

    public PersonalDetails() {
    }

    public PersonalDetails(String name, String fatherName, String motherName, String drivingLicenceNo,
                           long adharNo, String panNo, Date dateOfBirth, Gender gender, BloodGroup bloodGroup,
                           MaritalStatus maritalStatus) {
        super();
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.drivingLicenceNo = drivingLicenceNo;
        this.adharNo = adharNo;
        this.panNo = panNo;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.maritalStatus = maritalStatus;
        this.age = this.calculateAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalDetails that = (PersonalDetails) o;

        if (adharNo != that.adharNo) return false;
        if (age != that.age) return false;
        if (!name.equals(that.name)) return false;
        if (!fatherName.equals(that.fatherName)) return false;
        if (!motherName.equals(that.motherName)) return false;
        if (!drivingLicenceNo.equals(that.drivingLicenceNo)) return false;
        if (!panNo.equals(that.panNo)) return false;
        if (!dateOfBirth.equals(that.dateOfBirth)) return false;
        if (gender != that.gender) return false;
        if (bloodGroup != that.bloodGroup) return false;
        return maritalStatus == that.maritalStatus;

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + fatherName.hashCode();
        result = 31 * result + motherName.hashCode();
        result = 31 * result + drivingLicenceNo.hashCode();
        result = 31 * result + panNo.hashCode();
        result = 31 * result + (int) (adharNo ^ (adharNo >>> 32));
        result = 31 * result + age;
        result = 31 * result + dateOfBirth.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + bloodGroup.hashCode();
        result = 31 * result + maritalStatus.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getDrivingLicenceNo() {
        return drivingLicenceNo;
    }

    public void setDrivingLicenceNo(String drivingLicenceNo) {
        this.drivingLicenceNo = drivingLicenceNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public long getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(long adharNo) {
        this.adharNo = adharNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PersonalDetails.Gender getGender() {
        return gender;
    }

    public void setGender(PersonalDetails.Gender gender) {
        this.gender = gender;
    }

    public PersonalDetails.BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(PersonalDetails.BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(PersonalDetails.MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
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
    public String toString() {
        return "\nName='" + name + '\'' +
                ", Father Name='" + fatherName + '\'' +
                ", Mother Name='" + motherName + '\'' +
                ", Driving Licence No='" + drivingLicenceNo + '\'' +
                ", PAN No='" + panNo + '\'' +
                ", AdharNo=" + adharNo +
                ", Age=" + age +
                ", Date Of Birth=" + dateOfBirth +
                ", Gender=" + gender +
                ", Blood Group=" + bloodGroup +
                ", Marital Status=" + maritalStatus;
    }

    public enum Gender {
        MALE,
        FEMALE,
        TRANSGENDER
    }

    public enum BloodGroup {
        A_POSITIVE,
        A_NEGATIVE,
        B_POSITIVE,
        B_NEGATIVE,
        AB_POSITIVE,
        AB_NEGATIVE,
        O_POSITIVE,
        O_NEGATIVE
    }


    public enum MaritalStatus {
        MARRIED,
        UNMARRIED,
        DIVORCED
    }
}
