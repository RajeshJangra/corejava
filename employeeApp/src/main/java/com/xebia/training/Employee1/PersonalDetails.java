package com.xebia.training.Employee1;

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
