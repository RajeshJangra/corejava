package com.xebia.training;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.Address.addressType;

public class InputAddressTest {

	ThreadPoolExecutor executor5= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
	
	@Test
	public void calltest2() throws InterruptedException, ExecutionException {

		 List<Address> list = new ArrayList<Address>();
		Address address = new Address(101,"C","Delhi","Delhi",5,262701,"Chandani",addressType.Correspondence);
		  list.add(address);

		
		  InputAddress obj4=new InputAddress(101);
			FutureTask<List<Address>> task4= (FutureTask<List<Address>>) executor5.submit(obj4);
			List<Address> address1=task4.get();
			
			
			
			assertEquals(address1,list);
			
			
			
			
			
			
		  
	}

}
