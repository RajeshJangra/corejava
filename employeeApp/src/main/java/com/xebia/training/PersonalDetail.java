package com.xebia.training;
//
//public class PersonalDetail {
//	private int id;
//	private String dlNumber;
//	private String adharNumber;
//	private String bloodGroup;
//	private String height;
//	private String complexion;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getDlNumber() {
//		return dlNumber;
//	}
//	public void setDlNumber(String dlNumber) {
//		this.dlNumber = dlNumber;
//	}
//	public String getAdharNumber() {
//		return adharNumber;
//	}
//	public void setAdharNumber(String adharNumber) {
//		this.adharNumber = adharNumber;
//	}
//	public String getBloodGroup() {
//		return bloodGroup;
//	}
//	public void setBloodGroup(String bloodGroup) {
//		this.bloodGroup = bloodGroup;
//	}
//	public String getHeight() {
//		return height;
//	}
//	public void setHeight(String height) {
//		this.height = height;
//	}
//	public String getComplexion() {
//		return complexion;
//	}
//	public void setComplexion(String complexion) {
//		this.complexion = complexion;
//	}
//	public PersonalDetail(int id, String dlNumber, String adharNumber,
//			String bloodGroup, String height, String complexion) {
//		super();
//		this.id = id;
//		this.dlNumber = dlNumber;
//		this.adharNumber = adharNumber;
//		this.bloodGroup = bloodGroup;
//		this.height = height;
//		this.complexion = complexion;
//	}
//	@Override
//	public String toString() {
//		return "PersonalDetail [id=" + id + ", dlNumber=" + dlNumber
//				+ ", adharNumber=" + adharNumber + ", bloodGroup=" + bloodGroup
//				+ ", height=" + height + ", complexion=" + complexion + "]";
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result
//				+ ((adharNumber == null) ? 0 : adharNumber.hashCode());
//		result = prime * result
//				+ ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
//		result = prime * result
//				+ ((complexion == null) ? 0 : complexion.hashCode());
//		result = prime * result
//				+ ((dlNumber == null) ? 0 : dlNumber.hashCode());
//		result = prime * result + ((height == null) ? 0 : height.hashCode());
//		result = prime * result + id;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		PersonalDetail other = (PersonalDetail) obj;
//		if (adharNumber == null) {
//			if (other.adharNumber != null)
//				return false;
//		} else if (!adharNumber.equals(other.adharNumber))
//			return false;
//		if (bloodGroup == null) {
//			if (other.bloodGroup != null)
//				return false;
//		} else if (!bloodGroup.equals(other.bloodGroup))
//			return false;
//		if (complexion == null) {
//			if (other.complexion != null)
//				return false;
//		} else if (!complexion.equals(other.complexion))
//			return false;
//		if (dlNumber == null) {
//			if (other.dlNumber != null)
//				return false;
//		} else if (!dlNumber.equals(other.dlNumber))
//			return false;
//		if (height == null) {
//			if (other.height != null)
//				return false;
//		} else if (!height.equals(other.height))
//			return false;
//		if (id != other.id)
//			return false;
//		return true;
//	}
//
//}

import java.util.Calendar;
import java.util.Date;

public class PersonalDetail {
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
    public PersonalDetail(String id, String name, String fatherName, String motherName, String drivingLicenceNo,
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

    public PersonalDetail.Gender getGender() {
        return gender;
    }

    public void setGender(PersonalDetail.Gender gender) {
        this.gender = gender;
    }

    public PersonalDetail.BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(PersonalDetail.BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(PersonalDetail.MaritalStatus maritalStatus) {
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