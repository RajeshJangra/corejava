package com.xebia.training;

import static org.junit.Assert.*;

import com.xebia.training.Contact;
import com.xebia.training.Contact.AddressType;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import com.xebia.training.*;

import org.junit.Test;

public class EmployeeContactTest {

	public EmployeeContactTest(){
		}
	ThreadPoolExecutor executor1=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
	@Test
	public void CallTest() throws Exception{
		List<Contact> list= new ArrayList<Contact>();
		Contact contact1=new Contact(101,"Dayanand Sagar Nagar","Sadar Road","Sector 15","Gurgaon",122001,"Haryana", "Park Centra",973489870,"adarshaman@xebia.com",AddressType.CORRESPONDENCE);
		list.add(contact1);
		
		
		
		List<Contact> list1= new ArrayList<Contact>();
		Contact contact2=new Contact(102,"Dayanand Sagar Nagar","Sadar Road","Sector 15","Gurgaon",122001,"Haryana", "Park Centra",973489870,"adarshaman@xebia.com",null);
		list1.add(contact2);
		
		ContactInput contactInput=new ContactInput(101);
		Future<List<Contact>> future=executor1.submit(contactInput);
		List<Contact> contactList=future.get();
		//System.out.println(contactList);
		//System.out.println(list);
		assertEquals(contactList.toString(),list.toString());
		assertNotEquals(contactInput, list1);
		
	}
	
}
