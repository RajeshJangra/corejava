package com.xebia.training.Classes;

public class PersonalDetails {
	private int personalDetailsID;
	private String adharNO;
	private String panNO;
	private String bloodGroup;
	public MarritalStatus marritalStatus;
	private String drivingLicenceNo;
	private int id;
	

	public enum MarritalStatus{
		MARRIED,
		SINGLE;
		
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
		if (adharNO == null) {
			if (other.adharNO != null)
				return false;
		} else if (!adharNO.equals(other.adharNO))
			return false;
		if (bloodGroup == null) {
			if (other.bloodGroup != null)
				return false;
		} else if (!bloodGroup.equals(other.bloodGroup))
			return false;
		if (drivingLicenceNo == null) {
			if (other.drivingLicenceNo != null)
				return false;
		} else if (!drivingLicenceNo.equals(other.drivingLicenceNo))
			return false;
		if (id != other.id)
			return false;
		if (marritalStatus != other.marritalStatus)
			return false;
		if (panNO == null) {
			if (other.panNO != null)
				return false;
		} else if (!panNO.equals(other.panNO))
			return false;
		if (personalDetailsID != other.personalDetailsID)
			return false;
		return true;
	}




	public PersonalDetails(int id,int personalDetailsID, String adharNO, String panNO,
			String bloodGroup, MarritalStatus marritalStatus,
			String drivingLicenceNo) {
		super();
		this.id = id;
		this.personalDetailsID = personalDetailsID;
		this.adharNO = adharNO;
		this.panNO = panNO;
		this.bloodGroup = bloodGroup;
		this.marritalStatus = marritalStatus;
		this.drivingLicenceNo = drivingLicenceNo;
	}
	
	
	
	
	@Override
	public String toString() {
		return " [PersonalDetailsID=" + personalDetailsID
				+ ", adharNO=" + adharNO + ", panNO=" + panNO + ", bloodGroup="
				+ bloodGroup + ", drivingLicenceNo=" + drivingLicenceNo + " MarritalStatus :" + marritalStatus +"]";
	}
	

}
