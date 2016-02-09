package com.xebia.training;

public class Address {
	private int id;
	private String houseNumber;
	private String street;
	private String area;
	private String city;
	private int pinCode;
	private String state;
	private long phone;
	private String emailID;
	public Address(int id, String houseNumber, String street, String area,
			String city, int pinCode, String state, long phone, String emailID) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.street = street;
		this.area = area;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.phone = phone;
		this.emailID = emailID;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
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
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		long result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result
				+ ((houseNumber == null) ? 0 : houseNumber.hashCode());
		result = prime * result + id;
		result = prime * result + phone;
		result = prime * result + pinCode;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return (int) result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
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
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (houseNumber == null) {
			if (other.houseNumber != null)
				return false;
		} else if (!houseNumber.equals(other.houseNumber))
			return false;
		if (id != other.id)
			return false;
		if (phone != other.phone)
			return false;
		if (pinCode != other.pinCode)
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
		return "Address [id=" + id + ", houseNumber=" + houseNumber
				+ ", street=" + street + ", area=" + area + ", city=" + city
				+ ", pinCode=" + pinCode + ", state=" + state + ", phone="
				+ phone + ", emailID=" + emailID + "]";
	}
	
}
