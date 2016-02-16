package com.xebia.training;

import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@SuppressWarnings({ "restriction", "rawtypes" })
public class AddressUtils implements Callable{
	private int id;
	
public AddressUtils(int id) {
		this.id = id;
	}

public Address call() throws JAXBException {
	 File file = new File("address.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Addresses.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Addresses addresses = (Addresses) jaxbUnmarshaller.unmarshal(file);
		List<Address> addressList= addresses.getAddress();
		for(Address address:addressList)
		{
		if(address.getId()==id){
			return address;
		}
		}
		return null;
		
}
}

