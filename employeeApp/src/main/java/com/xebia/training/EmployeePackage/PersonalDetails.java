package com.xebia.training.EmployeePackage;

public class PersonalDetails {
private int id;
	private String adharNo;
	private String panNo;
	private String bloodGroup;
	private String electionId;
	private String licenceNo;
	public int id() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public PersonalDetails(int id,String adharNo, String panNo, String bloodGroup,
						   String electionId, String licenceNo) {
		super();
		this.id=id;
		this.adharNo = adharNo;
		this.panNo = panNo;
		this.bloodGroup = bloodGroup;
		this.electionId = electionId;
		this.licenceNo = licenceNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getElectionId() {
		return electionId;
	}
	public void setElectionId(String electionId) {
		this.electionId = electionId;
	}
	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	public String toString() {
		return "EmployeePackage.PersonalDetails [id=" + id +",adharNo=" + adharNo + ", panNo=" + panNo
				+ ", bloodGroup=" + bloodGroup + ", electionId="
				+ electionId + ", licenceNo=" + licenceNo + "]";
	}
}
