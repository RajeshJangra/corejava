package com.xebia.training;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact {
	private int id;
	private String emailid;

	public Contact() {
	}

	private long phone;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}
	/**
	 * @param emailid the emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
		return "Contact [id=" + id + ", emailid=" + emailid + ", phone="
				+ phone + "]";
	}
	public Contact(int id, String emailid, long phone) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.phone = phone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Contact contact = (Contact) o;

		if (id != contact.id) return false;
		if (phone != contact.phone) return false;
		return emailid != null ? emailid.equals(contact.emailid) : contact.emailid == null;

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (emailid != null ? emailid.hashCode() : 0);
		result = 31 * result + (int) (phone ^ (phone >>> 32));
		return result;
	}
}
