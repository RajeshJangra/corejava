package com.xebia.training.EmployeeClass;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.io.Serializable;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class EmployeePersonalDetails implements Serializable {

    private int id;
    private String fatherName;
    private String gender;
    private LocalDate dob;
    private String bloodGroup;
    private String maritalStatus;
    private String passportInformation;
    private String adhaarNo;
    private String drivingLicenceNo;
    private EmployeePersonalDetails employeePersonalDetails;

    public EmployeePersonalDetails(int id, String fatherName, String gender, LocalDate dob,
                                   String bloodGroup, String maritalStatus,
                                   String passportInformation, String adhaarNo, String drivingLicenceNo) {
        this.id = id;
        this.fatherName = fatherName;
        this.gender = gender;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
        this.maritalStatus = maritalStatus;
        this.passportInformation = passportInformation;
        this.adhaarNo = adhaarNo;
        this.drivingLicenceNo = drivingLicenceNo;

        ageCalculator();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPassportInformation() {
        return passportInformation;
    }

    public void setPassportInformation(String passportInformation) {
        this.passportInformation = passportInformation;
    }

    public String getAdhaarNo() {
        return adhaarNo;
    }

    public void setAdhaarNo(String adhaarNo) {
        this.adhaarNo = adhaarNo;
    }

    public String getDrivingLicenceNo() {
        return drivingLicenceNo;
    }

    public void setDrivingLicenceNo(String drivingLicenceNo) {
        this.drivingLicenceNo = drivingLicenceNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "EmployeePersonalDetails{" +
                "id=" + id +
                ", fatherName='" + fatherName + '\'' +
                ", gender='" + gender + '\'' +
                ", Date of birth='" + dob + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", passportInformation='" + passportInformation + '\'' +
                ", adhaarNo='" + adhaarNo + '\'' +
                ", drivingLicenceNo='" + drivingLicenceNo + '\'' +
                '}';
    }

    void ageCalculator(){
        LocalDate now = new LocalDate();
        Period period = new Period(dob, now, PeriodType.yearMonthDay());
        System.out.println("Age is : "+period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days ");
    }



}
