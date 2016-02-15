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

	@Override
	public String toString() {
		return "PersonalDetails{" +
				"id=" + id +
				", adharNo='" + adharNo + '\'' +
				", panNo='" + panNo + '\'' +
				", bloodGroup='" + bloodGroup + '\'' +
				", electionId='" + electionId + '\'' +
				", licenceNo='" + licenceNo + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PersonalDetails that = (PersonalDetails) o;

		if (id != that.id) return false;
		if (adharNo != null ? !adharNo.equals(that.adharNo) : that.adharNo != null) return false;
		if (panNo != null ? !panNo.equals(that.panNo) : that.panNo != null) return false;
		if (bloodGroup != null ? !bloodGroup.equals(that.bloodGroup) : that.bloodGroup != null) return false;
		if (electionId != null ? !electionId.equals(that.electionId) : that.electionId != null) return false;
		return !(licenceNo != null ? !licenceNo.equals(that.licenceNo) : that.licenceNo != null);

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (adharNo != null ? adharNo.hashCode() : 0);
		result = 31 * result + (panNo != null ? panNo.hashCode() : 0);
		result = 31 * result + (bloodGroup != null ? bloodGroup.hashCode() : 0);
		result = 31 * result + (electionId != null ? electionId.hashCode() : 0);
		result = 31 * result + (licenceNo != null ? licenceNo.hashCode() : 0);
		return result;
	}


}
