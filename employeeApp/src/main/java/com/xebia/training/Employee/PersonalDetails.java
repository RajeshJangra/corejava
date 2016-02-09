package com.xebia.training.Employee;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jasleen on 27/1/16.
 */
public class PersonalDetails {
    private String personalId;
    private String drivingLicenseNumber;
    private String adhaarNumber;
    private String passportNumber;
    private String bloodGroup;
    private int id;
    private String empName;
    private int age;
    private String designation;
    private Date dateOfBirth;
    private String maritalStatus;
    private Date startDate;
    private Date endDate;
    private String nameOfFather;
    private int workEx;

    public int dateCalculator(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }


    public int getBirthYear(){
        Calendar year1 = Calendar.getInstance();
        year1.setTime(dateOfBirth);
        int year = year1.get(Calendar.YEAR);
        System.out.println(year);

        return year;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getWorkEx() {
        return workEx;
    }

    public void setWorkEx(int workEx) {
        this.workEx = workEx;
    }

    public String getNameOfFather() {
        return nameOfFather;
    }

    public void setNameOfFather(String nameOfFather) {
        this.nameOfFather = nameOfFather;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(String adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

    @Override
    public String toString() {
        return "personalDetails{" +
                "drivingLicenseNumber='" + drivingLicenseNumber + '\'' +
                ", adhaarNumber='" + adhaarNumber + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", id=" + id +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", nameOfFather='" + nameOfFather + '\'' +
                ", workEx=" + workEx +
                '}';
    }

    public PersonalDetails(String personalId, String drivingLicenseNumber, String adhaarNumber,
                           String passportNumber, String bloodGroup, int id,
                           String empName, int age, String designation,
                           Date dateOfBirth, String maritalStatus,
                           Date startDate, Date endDate, String nameOfFather, int workEx) {
        this.personalId = personalId;
        this.drivingLicenseNumber = drivingLicenseNumber;
        this.adhaarNumber = adhaarNumber;
        this.passportNumber = passportNumber;
        this.bloodGroup = bloodGroup;
        this.id = id;
        this.empName = empName;
        this.age = dateCalculator()- getBirthYear();
        this.designation = designation;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nameOfFather = nameOfFather;
        this.workEx = workEx;

    }
}
