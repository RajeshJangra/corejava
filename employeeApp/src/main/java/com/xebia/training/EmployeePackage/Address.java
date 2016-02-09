package com.xebia.training.EmployeePackage;

public class Address {
	public enum Address_type{
		correspondentAddress,
		currentAddress,
		permanentAddress;
	}
	private Address_type addressType;
	private int id;
	private int houseNo;
	private String streetApartment;
	private String city;
	private String pinCode;
	private String state;
	private String area;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetApartment() {
		return streetApartment;
	}
	public void setStreetApartment(String streetApartment) {
		this.streetApartment = streetApartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}



	public Address( int id,Address_type addressType, int houseNo,
				   String streetApartment, String city, String pinCode,
				   String state, String area) {
		super();
		this.addressType = addressType;
		this.id = id;
		this.houseNo = houseNo;
		this.streetApartment = streetApartment;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.area = area;

	}
	@Override
	public String toString() {
		return "EmployeePackage.Address [ id=" + id+",addressType=" + addressType + ", houseNo=" + houseNo + ", streetApartment="
				+ streetApartment + ", city=" + city + ", pinCode="
				+ pinCode + ", state=" + state + ", area=" + area + "]";
	}

}
