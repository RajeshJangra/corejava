

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
import employeeApplication.PersonalDetails;
import employeeApplication.PersonalDetails.MaritalStatus;
import employeeApplication.AddressInput;
import employeeApplication.PersonalInput;

public class PersonalTest {

 ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
 
 @SuppressWarnings("unchecked")
 @Test
 public void calltest() throws InterruptedException, ExecutionException {
  
  PersonalInput personalinput = new PersonalInput(1);
  Future<List<PersonalDetails>> futureTask2 = executor1.submit(personalinput);
  List<PersonalDetails> personalDetails = futureTask2.get();
  
  List<PersonalDetails> list = new ArrayList<PersonalDetails>();
  PersonalDetails personalDetails1 = new PersonalDetails(1,1, "ASDFGHJKL", "QWERTYUIOP",
		    "B+ve", MaritalStatus.SINGLE,
		   "ZXCVBNM");
  list.add(personalDetails1);
  System.out.println(list);
  System.out.println(personalDetails);
  assertEquals(personalDetails,list);
 }
}