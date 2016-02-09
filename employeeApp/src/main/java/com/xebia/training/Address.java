package com.xebia.training;
//enum AddressType {
//	Consultance,Temporary,Permanent;
//}
//
//public class Address {
//	private int id;
//	private String name;
//	private int houseno;
//	private String area;
//	private String landmark;
//	private long phoneNumber;
//	private int pincode;
//	private String emailId;
//	private String state;
//	private AddressType addresstype;
//	public Address(int id, String name, int houseno, String area,
//			String landmark, long phoneNumber, int pincode, String emailId,
//			String state, AddressType addresstype) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.houseno = houseno;
//		this.area = area;
//		this.landmark = landmark;
//		this.phoneNumber = phoneNumber;
//		this.pincode = pincode;
//		this.emailId = emailId;
//		this.state = state;
//		this.addresstype = addresstype;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getHouseno() {
//		return houseno;
//	}
//	public void setHouseno(int houseno) {
//		this.houseno = houseno;
//	}
//	public String getArea() {
//		return area;
//	}
//	public void setArea(String area) {
//		this.area = area;
//	}
//	public String getLandmark() {
//		return landmark;
//	}
//	public void setLandmark(String landmark) {
//		this.landmark = landmark;
//	}
//	public long getPhoneNumber() {
//		return phoneNumber;
//	}
//	public void setPhoneNumber(long phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//	public int getPincode() {
//		return pincode;
//	}
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public AddressType getAddresstype() {
//		return addresstype;
//	}
//	public void setAddresstype(AddressType addresstype) {
//		this.addresstype = addresstype;
//	}
//	@Override
//	public String toString() {
//		return "Address [id=" + id + ", name=" + name + ", houseno=" + houseno
//				+ ", area=" + area + ", landmark=" + landmark
//				+ ", phoneNumber=" + phoneNumber + ", pincode=" + pincode
//				+ ", emailId=" + emailId + ", state=" + state + "]";
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((area == null) ? 0 : area.hashCode());
//		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
//		result = prime * result + houseno;
//		result = prime * result + id;
//		result = prime * result
//				+ ((landmark == null) ? 0 : landmark.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
//		result = prime * result + pincode;
//		result = prime * result + ((state == null) ? 0 : state.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Address other = (Address) obj;
//		if (area == null) {
//			if (other.area != null)
//				return false;
//		} else if (!area.equals(other.area))
//			return false;
//		if (emailId == null) {
//			if (other.emailId != null)
//				return false;
//		} else if (!emailId.equals(other.emailId))
//			return false;
//		if (houseno != other.houseno)
//			return false;
//		if (id != other.id)
//			return false;
//		if (landmark == null) {
//			if (other.landmark != null)
//				return false;
//		} else if (!landmark.equals(other.landmark))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (phoneNumber != other.phoneNumber)
//			return false;
//		if (pincode != other.pincode)
//			return false;
//		if (state == null) {
//			if (other.state != null)
//				return false;
//		} else if (!state.equals(other.state))
//			return false;
//		return true;
//	}
//	
//
//}

public class Address {
    private String id, street, city, state;
    private int houseNo, sector, pin;
    private AddressType addressType;

    enum AddressType {
        TEMPORARY,
        PERMANENT,
        CORRESPONDENCE
    }

    /**
     * @param id
     * @param street
     * @param city
     * @param state
     * @param houseNo
     * @param sector
     * @param pin
     * @param addressType
     */
    public Address(String id, int houseNo, int sector, String street, String city, String state, int pin,
                   AddressType addressType) {
        super();
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.houseNo = houseNo;
        this.sector = sector;
        this.pin = pin;
        this.addressType = addressType;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the houseNo
     */
    public int getHouseNo() {
        return houseNo;
    }

    /**
     * @param houseNo the houseNo to set
     */
    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    /**
     * @return the sector
     */
    public int getSector() {
        return sector;
    }

    /**
     * @param sector the sector to set
     */
    public void setSector(int sector) {
        this.sector = sector;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return the addressType
     */
    public AddressType getAddressType() {
        return addressType;
    }

    /**
     * @param addressType the addressType to set
     */
    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "\nAddressType=" + addressType +
                ", HouseNo=" + houseNo +
                ", Sector=" + sector +
                ", Street='" + street + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", PIN=" + pin;
    }
}