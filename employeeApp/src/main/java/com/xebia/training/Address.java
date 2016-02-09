package com.xebia.training;

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
