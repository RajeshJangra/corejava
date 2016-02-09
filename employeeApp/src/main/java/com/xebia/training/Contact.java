package com.xebia.training;

public class Contact {
	
	
	private int id;
	private long phone;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contact(int id, long phone, String email) {
		super();
		this.id = id;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", phone=" + phone + ", email=" + email + "]";
	}
	

}
