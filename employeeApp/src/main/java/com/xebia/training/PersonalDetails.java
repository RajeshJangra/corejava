package com.xebia.training;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement(name = "PersonalDetails")
public class PersonalDetails {
	

	    private List<PersonalDetail> personalDetails;

	    public PersonalDetails() {
	    }

	    public PersonalDetails(final List<PersonalDetail> personalDetails) {
	        this.personalDetails = personalDetails;
	    }

	    @XmlElement(name = "PersonalDetail")
	    public List<PersonalDetail> getPersonalDetails() {
	        return personalDetails;
	    }

	    public void setPersonalDetails(final List<PersonalDetail> personalDetails) {
	        this.personalDetails = personalDetails;
	    }

		@Override
		public String toString() {
			return "PersonalDetails [personalDetails=" + personalDetails + "]";
		}

	   
	}