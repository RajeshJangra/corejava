package com.xebia.training;

import java.util.Calendar;
import java.util.Date;

public class PersonalDetails {
    private String id, name, fatherName, motherName, drivingLicenceNo, panNo;
    private long adharNo;
    private int age;
    private Date dateOfBirth;
    private Gender gender;
    private BloodGroup bloodGroup;
    private MaritalStatus maritalStatus;

    /**
     * @param id
     * @param name
     * @param fatherName
     * @param motherName
     * @param drivingLicenceNo
     * @param adharNo
     * @param panNo
     * @param dateOfBirth
     * @param gender
     * @param bloodGroup
     * @param maritalStatus
     */
    public PersonalDetails(String id, String name, String fatherName, String motherName, String drivingLicenceNo,
                           long adharNo, String panNo, Date dateOfBirth, Gender gender, BloodGroup bloodGroup,
                           MaritalStatus maritalStatus) {
        super();
        this.id = id;
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

    enum Gender {
        MALE,
        FEMALE,
        TRANSGENDER
    }

    enum BloodGroup {
        A_POSITIVE,
        A_NEGATIVE,
        B_POSITIVE,
        B_NEGATIVE,
        AB_POSITIVE,
        AB_NEGATIVE,
        O_POSITIVE,
        O_NEGATIVE
    }

    enum MaritalStatus {
        MARRIED,
        UNMARRIED,
        DIVORCED
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    private int calculateAge() {
        Calendar calender = Calendar.getInstance();
        calender.setTime(this.dateOfBirth);
        int year = calender.get(Calendar.YEAR);
        calender = Calendar.getInstance();
        int now = calender.get(Calendar.YEAR);
        int age = now - year;
        return age;
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
}
