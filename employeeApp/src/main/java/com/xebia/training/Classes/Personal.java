package com.xebia.training.Classes;/*
package com.xebia.training.Classes;

import java.util.Calendar;
import java.util.Date;
*/
/*
 * Created by jasleen on 14/2/16.
 * *//*


public class Personal {
    public int employeeId;
    public int personalId;
    public String drivingLicenseNumber;
    public String adhaarNumber;
    public String passportNumber;
    public String bloodGroup;
    public String empName;
    public int age;
    public Date dateOfBirth;
    public String maritalStatus;
    public Date startDate;
    public Date endDate;
    public String nameOfFather;
    public float workEx;
    Designation designation;


    public enum Designation {
        TRAINEE,
        CONSULTANT,
        SENIOR_CONSULTANT,
        PRINCIPLE_CONSULTANT,
        CEO,
        CTO,
        TECHNICAL_DIRECTOR;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(String adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return = dateCalculator() - getBirthYear(); ;
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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNameOfFather() {
        return nameOfFather;
    }

    public void setNameOfFather(String nameOfFather) {
        this.nameOfFather = nameOfFather;
    }

    public float getWorkEx() {
        return workEx;
    }

    public void setWorkEx(float workEx) {
        this.workEx = workEx;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public int getBirthYear() {
        System.out.println("enter");
        System.out.println(dateOfBirth);
        Calendar year1 = Calendar.getInstance();
        year1.setTime(dateOfBirth);
        int year = year1.get(Calendar.YEAR);
        System.out.println(year);
        return year;

    }

    public int dateCalculator() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public int calculateAge() {
        int age = dateCalculator() - getBirthYear();
        return age;
    }


    @Override
    public String toString() {
        return "Personal{" +
                "employeeId=" + employeeId +
                ", personalId=" + personalId +
                ", drivingLicenseNumber='" + drivingLicenseNumber + '\'' +
                ", adhaarNumber='" + adhaarNumber + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", nameOfFather='" + nameOfFather + '\'' +
                ", workEx=" + workEx +
                ", designation=" + designation +
                '}';
    }
}
*/
