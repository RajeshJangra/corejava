package com.xebia.training.employeeInformation;

import org.apache.log4j.Logger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"phone", "email"})
public class Contact {
    static Logger log = Logger.getLogger(Contact.class.getName());
    private String email;
    private long phone;

    public Contact() {
    }

    public Contact(long phone, String email) {
        //   log.info("Contact Constructor Called");
        this.email = email;
        this.phone = phone;
        //  log.info("Contact Class Variable Instantiated "+this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return phone == contact.phone && email.equals(contact.email);

    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        return result;
    }

    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "phone")
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "\nEmail=" + email + ", phone=" + phone;
    }


}
