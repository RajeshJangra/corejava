package com.xebia.training;

public class Contact {
	
	    private String id, email;
	    private long phone;

	    /**
	     * @param id
	     * @param email
	     * @param phone
	     */
	    public Contact(String id, long phone, String email) {
	        super();
	        this.id = id;
	        this.email = email;
	        this.phone = phone;
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

