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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Address address = (Address) o;

		if (id != address.id) return false;
		if (houseNo != address.houseNo) return false;
		if (addressType != address.addressType) return false;
		if (streetApartment != null ? !streetApartment.equals(address.streetApartment) : address.streetApartment != null)
			return false;
		if (city != null ? !city.equals(address.city) : address.city != null) return false;
		if (pinCode != null ? !pinCode.equals(address.pinCode) : address.pinCode != null) return false;
		if (state != null ? !state.equals(address.state) : address.state != null) return false;
		return !(area != null ? !area.equals(address.area) : address.area != null);

	}

	@Override
	public int hashCode() {
		int result = addressType != null ? addressType.hashCode() : 0;
		result = 31 * result + id;
		result = 31 * result + houseNo;
		result = 31 * result + (streetApartment != null ? streetApartment.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (pinCode != null ? pinCode.hashCode() : 0);
		result = 31 * result + (state != null ? state.hashCode() : 0);
		result = 31 * result + (area != null ? area.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "{ id=" + id+",addressType=" + addressType + ", houseNo=" + houseNo + ", streetApartment="
				+ streetApartment + ", city=" + city + ", pinCode="
				+ pinCode + ", state=" + state + ", area=" + area + "}";
	}

}
