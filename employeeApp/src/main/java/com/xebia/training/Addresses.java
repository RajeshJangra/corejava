package com.xebia.training;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement(name = "Addresses")
 public class Addresses {
	

	    private List<Address> addresses;

	    public Addresses() {
	    }

	    public Addresses(final List<Address> addresses) {
	        this.addresses = addresses;
	    }

	    @XmlElement(name = "Address")
	    public List<Address> getAddress() {
	        return addresses;
	    }

	    public void setAddress(final List<Address> addresses) {
	        this.addresses = addresses;
	    }

	    @Override
		public String toString() {
			return "Addresses [addresses=" + addresses + "]";
		}
	}

