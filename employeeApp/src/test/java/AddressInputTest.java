
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import employeeApplication.Address;
import employeeApplication.Address.AddressType;
import employeeApplication.AddressInput;

public class AddressInputTest {

 ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
 
 @SuppressWarnings("unchecked")
 @Test
 public void calltest() throws InterruptedException, ExecutionException {
  
  AddressInput addressinput = new AddressInput(1);
  Future<List<Address>> futureTask2 = executor1.submit(addressinput);
  List<Address> address = futureTask2.get();
  
  List<Address> list = new ArrayList<Address>();
  Address address1 = new Address(1,1.0,420,"14","PAPRATAND","GIRIDIH",815301, "JHARKHAND", "NOTHING",977516,
    "VISHALSINGH@xebia.com","VISHALSINGH0007",AddressType.PERMANENT);
  list.add(address1);
  System.out.println(list);
 // System.out.println("ee");
  System.out.println(address);
  assertEquals(address,list
		  );
  
 }

}