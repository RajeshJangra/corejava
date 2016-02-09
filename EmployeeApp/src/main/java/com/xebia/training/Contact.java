package com.xebia.training;

public class Contact {
	private int id;	
	private String Hno;
	private String street;
	private String area;
	private String city;
	private int pincode;
	private String state;
	private String landmark;
	private int phone;
	private String email;
	private AddressType addressType;


	enum AddressType{
		CORRESPONDENCE,
		CURRENT,
		PERMANENT;

	}




	public Contact(int id, String hno, String street, String area, String city,
			int pincode, String state, String landmark, int phone,
			String email, AddressType addressType) {
		super();
		this.id = id;
		Hno = hno;
		this.street = street;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.landmark = landmark;
		this.phone = phone;
		this.email = email;
		this.addressType = addressType;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public Contact(int id) {
		super();
		this.id = id;
	}

	public String getHno() {
		return Hno;
	}

	public void setHno(String hno) {
		Hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", Hno=" + Hno + ", street=" + street
				+ ", area=" + area + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + ", landmark=" + landmark + ", phone="
				+ phone + ", email=" + email + ", addressType=" + addressType
				+ "]";
	}




	//public static void main(String[] args) {
	// TODO Auto-generated method stub

	//}

}
