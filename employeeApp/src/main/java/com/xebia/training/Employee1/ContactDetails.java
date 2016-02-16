package com.xebia.training.Employee1;

public class ContactDetails {
	private int id;
	private double ContactId;
	private AddressType addressType;
	private int houseNo;
	private String street;
	private String area;
	private String city;
	private double pinCode;
	private String state;
	private String landmark;
	private double phoneNo;
	private String email;
	private String skypeid;

	public ContactDetails(int id ,double contactId, int houseNo, String street,
			String area, String city, double pinCode, String state,
			String landmark, double phoneNo, String email, String skypeid,
			AddressType addressType) {
		super();
		this.id = id;
		ContactId = contactId;
		this.houseNo = houseNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.landmark = landmark;
		this.phoneNo = phoneNo;
		this.email = email;
		this.skypeid = skypeid;
		this.addressType = addressType;
	}

	public enum AddressType {
		CORRESPONDENT, 
		CURRENT, 
		PERMANENT;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactDetails other = (ContactDetails) obj;
		if (Double.doubleToLongBits(ContactId) != Double
				.doubleToLongBits(other.ContactId))
			return false;
		if (addressType != other.addressType)
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (houseNo != other.houseNo)
			return false;
		if (id != other.id)
			return false;
		if (landmark == null) {
			if (other.landmark != null)
				return false;
		} else if (!landmark.equals(other.landmark))
			return false;
		if (Double.doubleToLongBits(phoneNo) != Double
				.doubleToLongBits(other.phoneNo))
			return false;
		if (Double.doubleToLongBits(pinCode) != Double
				.doubleToLongBits(other.pinCode))
			return false;
		if (skypeid == null) {
			if (other.skypeid != null)
				return false;
		} else if (!skypeid.equals(other.skypeid))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}








	@Override
	public String toString() {
		return " [ContactId=" + ContactId + ", addressType="
				+ addressType + ", houseNo=" + houseNo + ", street=" + street
				+ ", area=" + area + ", city=" + city + ", pinCode=" + pinCode
				+ ", state=" + state + ", landmark=" + landmark + ", phoneNo="
				+ phoneNo + ", email=" + email + ", skypeid=" + skypeid + "]";
	}

	

	

}
