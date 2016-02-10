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
	public String toString() {
		return " [ContactId=" + ContactId + ", addressType="
				+ addressType + ", houseNo=" + houseNo + ", street=" + street
				+ ", area=" + area + ", city=" + city + ", pinCode=" + pinCode
				+ ", state=" + state + ", landmark=" + landmark + ", phoneNo="
				+ phoneNo + ", email=" + email + ", skypeid=" + skypeid + "]";
	}

	

	

}
