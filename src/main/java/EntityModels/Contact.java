package EntityModels;

import java.io.Serializable;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class Contact implements Serializable {

    public enum AddressType {
        CORRESPONDENCE,
        CURRENT,
        PERMANENT;
    }

    private int contactId;
    private String name;
    private AddressType addressType;
    private String houseNo;
    private String streetOrApartment;
    private String area;
    private String city;
    private String state;
    private String pincode;
    private String landmark;
    private String phoneNo;
    private String email;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetOrApartment() {
        return streetOrApartment;
    }

    public void setStreetOrApartment(String streetOrApartment) {
        this.streetOrApartment = streetOrApartment;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
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
                ", name='" + name + '\'' +
                ", addressType='" + addressType + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", streetOrApartment='" + streetOrApartment + '\'' +
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
