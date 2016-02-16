package EntityModels;

import java.io.Serializable;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class PersonalDetails implements Serializable {

    private int id;
    private String fatherName;
    private String gender;
    private String dob;
    private String bloodGroup;
    private String maritalStatus;
    private String passportInformation;
    private String adhaarNo;
    private String drivingLicenceNo;

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
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
        return "PersonalDetails{" +
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


}
