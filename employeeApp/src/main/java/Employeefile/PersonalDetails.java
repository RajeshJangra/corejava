package Employeefile;

public class PersonalDetails {
	private int PersonalId;
	private String Aadharno;
	private String Panno;
	private String Bloodgroup;
	public MaritalStatus maritalStatus;
	private String Drivinglic;
	@SuppressWarnings("unused")
	private int id;
	
	
	public PersonalDetails(int id,int PersonalId, String Aadharno, String Panno,
			String Bloodgroup, MaritalStatus maritalStatus,
			String Drivinglic) {
		super();
		this.id = id;
		this.PersonalId = PersonalId;
		this.Aadharno = Aadharno;
		this.Panno = Panno;
		this.Bloodgroup = Bloodgroup; 
		this.maritalStatus = maritalStatus;
		this.Drivinglic = Drivinglic;
	}
	
	
	
	
	@Override
	public String toString() {
		return " [PersonalDetailsID=" + PersonalId
				+ ", adharNO=" + Aadharno + ", panNO=" + Panno + ", bloodGroup="
				+ Bloodgroup + ", drivingLicenceNo=" + Drivinglic + " MarritalStatus :" + maritalStatus +"]";
	}
	

	public enum MaritalStatus{
		MARRIED,
		SINGLE;
		
}
}
