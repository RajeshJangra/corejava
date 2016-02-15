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


	public enum AddressType{
		CORRESPONDENCE,
		CURRENT,
		PERMANENT;

	}




	public Contact(int id, String hno, String street, String area, String city,
			int pincode, String state, String landmark, int phone,
			String email, AddressType addressType) {
		super();
		this.id = id;
		this.Hno = hno;
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

	public String getHno() {
		return Hno;
	}

	public void setHno(String hno) {
		this.Hno = hno;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Hno == null) ? 0 : Hno.hashCode());
		result = prime * result
				+ ((addressType == null) ? 0 : addressType.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((landmark == null) ? 0 : landmark.hashCode());
		result = prime * result + phone;
		result = prime * result + pincode;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (Hno == null) {
			if (other.Hno != null)
				return false;
		} else if (!Hno.equals(other.Hno))
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
		if (id != other.id)
			return false;
		if (landmark == null) {
			if (other.landmark != null)
				return false;
		} else if (!landmark.equals(other.landmark))
			return false;
		if (phone != other.phone)
			return false;
		if (pincode != other.pincode)
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
		return "id=" + id + ", Hno=" + Hno + ", street=" + street
				+ ", area=" + area + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + ", landmark=" + landmark + ", phone="
				+ phone + ", email=" + email + ", addressType=" + addressType
				+ "";
	}




	//public static void main(String[] args) {
	// TODO Auto-generated method stub

	//}

}
