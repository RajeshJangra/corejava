package Unittesting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import Employeefile.Address;
import Employeefile.Address.AddressType;
import Employeefile.AddressInput;

public class AddressInputTest {

	ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
	
	@SuppressWarnings("unchecked")
	@Test
	public void calltest() throws InterruptedException, ExecutionException {
		
		AddressInput addressinput = new AddressInput(110);
		Future<List<Address>> futureTask2 = executor1.submit(addressinput);
		List<Address> address = futureTask2.get();
		
		List<Address> list = new ArrayList<Address>();
		Address address1 = new Address(110,1,709,"13","Rajendra Nagar:","patna",126055, "Bihar", "Hanuman mandir",8859399390d,
				"pprakash@xebia.com","prince199428",AddressType.CORRESPONDENT);
		list.add(address1);
		
		assertEquals(address,list);
	}

}
