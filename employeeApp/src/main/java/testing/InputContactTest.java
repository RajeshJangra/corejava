package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.Contact;
import com.xebia.training.InputContact;
import com.xebia.training.InputSalary;
import com.xebia.training.Salary;

public class InputContactTest {
	ThreadPoolExecutor executor4= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
	@Test
	public void calltest1() throws InterruptedException, ExecutionException {
		
		 List<Contact> list = new ArrayList<Contact>();
		 Contact con = new Contact(101,8563873806l,"purawrshubham94@gmail.com");
		  list.add(con);
		  
		 
		  
		  
		  InputContact obj3=new InputContact(101);
			FutureTask<List<Contact>> task3= (FutureTask<List<Contact>>) executor4.submit(obj3);
			List<Contact> contact1=task3.get();
		
			assertEquals(contact1,list);
		
	}

}
