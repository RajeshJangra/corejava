package com.xebia.training.EmployeePackage;
public class Contacts {
	private  int id;
	private int phoneNo;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contacts(int id,int phoneNo, String email) {
		super();
		this.id=id;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Contacts contacts = (Contacts) o;

		if (id != contacts.id) return false;
		if (phoneNo != contacts.phoneNo) return false;
		return !(email != null ? !email.equals(contacts.email) : contacts.email != null);

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + phoneNo;
		result = 31 * result + (email != null ? email.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "EmployeePackage.Contacts [ id=" + id + ",phoneNo=" + phoneNo + ",email=" + email + "]";
	}
}
