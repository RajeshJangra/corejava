package com.xebia.training.employeeInformation;

public class Contact {
    private String email;
    private long phone;

    public Contact() {
    }

    public Contact(long phone, String email) {

        super();
        this.email = email;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (phone != contact.phone) return false;
        return email.equals(contact.email);

    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        return result;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
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
