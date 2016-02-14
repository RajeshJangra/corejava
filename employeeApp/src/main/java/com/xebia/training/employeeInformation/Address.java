package com.xebia.training.employeeInformation;

import javax.xml.bind.annotation.XmlAttribute;

public class Address {
    private String street, city, state;
    private int houseNo, sector, pin;
    private AddressType addressType;

    public Address() {
    }

    public Address(int houseNo, int sector, String street, String city, String state, int pin,
                   AddressType addressType) {
        super();
        this.street = street;
        this.city = city;
        this.state = state;
        this.houseNo = houseNo;
        this.sector = sector;
        this.pin = pin;
        this.addressType = addressType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (houseNo != address.houseNo) return false;
        if (sector != address.sector) return false;
        if (pin != address.pin) return false;
        if (!street.equals(address.street)) return false;
        if (!city.equals(address.city)) return false;
        if (!state.equals(address.state)) return false;
        return addressType == address.addressType;

    }

    @Override
    public int hashCode() {
        int result = street.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + houseNo;
        result = 31 * result + sector;
        result = 31 * result + pin;
        result = 31 * result + addressType.hashCode();
        return result;
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

    @XmlAttribute(name = "addressType")
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

    public enum AddressType {
        TEMPORARY,
        PERMANENT,
        CORRESPONDENCE
    }
}
