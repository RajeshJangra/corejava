package com.xebia.training.Classes;

/**
 * Created by jasleen on 14/2/16.
 */
public class Contact {
    public int employeeId;
    public int contactId;
    public String street;
    public String houseNumber;
    public String area;
    public String city;
    public String state;
    public double pincode;
    public String landmark;
    public long phone;
    public String emailId;
    public AddressType address;

    public enum AddressType{
        CORRESPONDANCE,
        CURRENT,
        PERMANENT;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPincode() {
        return pincode;
    }

    public void setPincode(double pincode) {
        this.pincode = pincode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public AddressType getAddress() {
        return address;
    }

    public void setAddress(AddressType address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "employeeId=" + employeeId +
                ", contactId=" + contactId +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", landmark='" + landmark + '\'' +
                ", phone=" + phone +
                ", emailId='" + emailId + '\'' +
                ", address=" + address +
                '}';
    }
}
