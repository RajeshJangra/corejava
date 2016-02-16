package com.xebia.training;

import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@SuppressWarnings({ "restriction", "rawtypes" })
public class PersonalDetailsUtils implements Callable {
	private int id;
	
	public PersonalDetailsUtils(int id) {
		this.id = id;
	}

	public PersonalDetail call() throws JAXBException {
		 File file = new File("personalDetail.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(PersonalDetails.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			PersonalDetails personalDetails = (PersonalDetails) jaxbUnmarshaller.unmarshal(file);
			List<PersonalDetail> pList= personalDetails.getPersonalDetails();
			for(PersonalDetail personalDetail:pList)
			{
				if(personalDetail.getId()==id)
					return personalDetail;
			}
			return null;
	}
	
}
