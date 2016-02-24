package com.xebia.training;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.Employee1.ContactDetails;
import com.xebia.training.Employee1.ContactDetails.AddressType;
import com.xebia.training.Employee2.ContactDetailsData;

public class ContactDetailsDataTest {

	@Test
	public void test() throws InterruptedException, ExecutionException {
		List<ContactDetails> list = new ArrayList<>();
		ContactDetails contactDetails = new ContactDetails(1, 1, 409, "5",
				"Gandhi Nagar:", "Jind", 126102, "Haryana", "Bhagat Park",
				999144400, "raggarwal@xebia.com", "aggarwal.rohan17",
				AddressType.valueOf("CORRESPONDENT"));
		list.add(contactDetails);
		
		ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
		ContactDetailsData contactDetailsData = new ContactDetailsData(1);
		Future<List<ContactDetails>> futureTask4 = executor1.submit(contactDetailsData);
		List<ContactDetails> contactDetails1 = futureTask4.get();
		
		assertEquals(list,contactDetails1);
	}

}
