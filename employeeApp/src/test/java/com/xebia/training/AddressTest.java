package com.xebia.training;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import static org.junit.Assert.*;

import com.xebia.training.Address.AddressType;

public class AddressTest {
	@SuppressWarnings("unchecked")
	@Test
	public void callTest() throws InterruptedException, ExecutionException {
		
	AddressUtils addressUtils=new AddressUtils(512);
	 ExecutorService executorService = Executors.newFixedThreadPool(1);
	 Future<Address> futureAddress=executorService.submit(addressUtils);
	 Address address=futureAddress.get();

	 Address address2=new Address(AddressType.PERMANENT,512, "6-A", "Ishakchak Road", "Kushwaha Vatika", "Bhagalpur",812001l, "Bihar",8653153544l, "manav@xebia.com");
	 assertEquals(address,address2);
}
}
