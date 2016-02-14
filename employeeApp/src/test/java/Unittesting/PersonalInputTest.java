package Unittesting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import Employeefile.PersonalDetails;
import Employeefile.PersonalDetails.MaritalStatus;
import Employeefile.PersonalInput;

public class PersonalInputTest {

	ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);

	@SuppressWarnings("unchecked")
	@Test
	public void calltest() throws InterruptedException, ExecutionException {
		
		PersonalInput personalinput = new PersonalInput(110);
		Future<List<PersonalDetails>> futureTask3 = executor1.submit(personalinput);
		List<PersonalDetails> personalDetails = futureTask3.get();
		
		List<PersonalDetails> list = new ArrayList<PersonalDetails>();
		PersonalDetails personal = new PersonalDetails(110,1, "BAH34533KL", "57ARYTRS23", "AB+ve",MaritalStatus.SINGLE, "SKLAOM7S");
		list.add(personal);
		
		assertEquals(personalDetails,list);
	}

}
