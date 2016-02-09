package com.xebia.training.EmployeeClass;

import java.io.Serializable;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class Contact implements Serializable {

    public enum AddressType{
        CORRESPONDENCE,
        CURRENT,
        PERMANENT;
    }

    private int contactId;
    private String houseNo;
    private String streetOrAppartment;
    private String area;
    private String city;
    private String state;
    private String pincode;
    private String landmark;
    private String phoneNo;
    private String email;

    public Contact(int contactId, String houseNo, String streetOrAppartment,
                   String area, String city, String state,
                   String pincode, String landmark, String phoneNo, String email) {
        this.contactId = contactId;
        this.houseNo = houseNo;
        this.streetOrAppartment = streetOrAppartment;
        this.area = area;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.landmark = landmark;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetOrAppartment() {
        return streetOrAppartment;
    }

    public void setStreetOrAppartment(String streetOrAppartment) {
        this.streetOrAppartment = streetOrAppartment;
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

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", houseNo='" + houseNo + '\'' +
                ", streetOrAppartment='" + streetOrAppartment + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", landmark='" + landmark + '\'' +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                '}';
    }
}
