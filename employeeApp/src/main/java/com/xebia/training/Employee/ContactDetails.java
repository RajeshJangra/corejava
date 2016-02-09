package com.xebia.training.Employee;

/**
 * Created by jasleen on 27/1/16.
 */
public class ContactDetails {
    private int id;
    private String contactId;
    private String street;
    private String houseNumber;
    private String area;
    private String city;
    private String state;
    private int pincode;
    private String Landmark;
    private int phone;
    private String emailId;
    private AddressType address;

    public enum AddressType{
        CORRESPONDANCE,
        CURRENT,
        PERMANENT;
    }

    public ContactDetails(int id, String contactId, String street, String houseNumber, String area,
                          String city, String state, int pincode, String landmark, int phone,
                          String emailId, AddressType address) {
        this.id = id;
        this.contactId = contactId;
        this.street = street;
        this.houseNumber = houseNumber;
        this.area = area;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        Landmark = landmark;
        this.phone = phone;
        this.emailId = emailId;
        this.address = address;
    }

        @Override
    public String toString() {
        return "ContactDetails{" +
                "id='" + id + '\'' +
                ", contactId='" + contactId + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", Landmark='" + Landmark + '\'' +
                ", phone=" + phone +
                ", emailId='" + emailId + '\'' +
                ", address=" + address +
                '}';
    }
}

