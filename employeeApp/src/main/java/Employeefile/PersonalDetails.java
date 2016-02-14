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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalDetails other = (PersonalDetails) obj;
		if (Aadharno == null) {
			if (other.Aadharno != null)
				return false;
		} else if (!Aadharno.equals(other.Aadharno))
			return false;
		if (Bloodgroup == null) {
			if (other.Bloodgroup != null)
				return false;
		} else if (!Bloodgroup.equals(other.Bloodgroup))
			return false;
		if (Drivinglic == null) {
			if (other.Drivinglic != null)
				return false;
		} else if (!Drivinglic.equals(other.Drivinglic))
			return false;
		if (Panno == null) {
			if (other.Panno != null)
				return false;
		} else if (!Panno.equals(other.Panno))
			return false;
		if (PersonalId != other.PersonalId)
			return false;
		if (id != other.id)
			return false;
		if (maritalStatus != other.maritalStatus)
			return false;
		return true;
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
