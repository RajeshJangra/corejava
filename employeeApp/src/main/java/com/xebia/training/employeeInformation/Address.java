package com.xebia.training.employeeInformation;

import org.apache.log4j.Logger;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"addressType", "houseNo", "street", "sector", "city", "state", "pin"})
public class Address {
    static Logger log = Logger.getLogger(Address.class.getName());
    private String street, city, state;
    private int houseNo, sector, pin;
    private AddressType addressType;

    public Address() {
    }

    public Address(int houseNo, int sector, String street, String city, String state, int pin,
                   AddressType addressType) {
        //  log.info("Address Constructor Called");
        this.street = street;
        this.city = city;
        this.state = state;
        this.houseNo = houseNo;
        this.sector = sector;
        this.pin = pin;
        this.addressType = addressType;
        //  log.info("Address Class Variable Instantiated "+this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return houseNo == address.houseNo && sector == address.sector && pin == address.pin && street.equals(address.street) && city.equals(address.city) && state.equals(address.state) && addressType == address.addressType;

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

    @XmlElement(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @XmlElement(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlElement(name = "houseNo")
    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    @XmlElement(name = "sector")
    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    @XmlElement(name = "pin")
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @XmlAttribute(name = "addressType")
    public AddressType getAddressType() {
        return addressType;
    }

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
