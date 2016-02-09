package com.xebia.training;

public class Address {
	
	private String street,sector,city,state;
	int houseno,pin,id;
	addressType addtype;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	enum addressType
	{
		Temporary,
		Permanent,
		Correspondence;
	}

	public Address(int id, String sector, String city, String state, int houseno, int pin, String street,
			addressType addtype) {
		super();
		this.id = id;
		
		this.sector = sector;
		this.city = city;
		this.state = state;
		this.houseno = houseno;
		this.pin = pin;
		this.street = street;
		this.addtype = addtype;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", sector=" + sector + ", city=" + city + ", state=" + state + ", houseno="
				+ houseno + ", pin=" + pin + ", id=" + id + ", addtype=" + addtype + "]";
	}
}
