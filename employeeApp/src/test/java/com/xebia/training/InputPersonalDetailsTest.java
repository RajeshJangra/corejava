package com.xebia.training;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

public class InputPersonalDetailsTest {

	ThreadPoolExecutor executor6= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
	
	@Test
	public void test() throws ParseException, InterruptedException, ExecutionException  {
		
		 List<PersonalDetails> list = new ArrayList<PersonalDetails>();
		PersonalDetails per = new PersonalDetails(101,21,"Shubham","R.R.Purwar","Male","O+","Marriage", new SimpleDateFormat("dd-MM-yyyy").parse("10-02-1994"),12344567l);
		  list.add(per);
		  
		  InputPersonaldetails obj5=new InputPersonaldetails(101);
			
			FutureTask<List<PersonalDetails>> task5= (FutureTask<List<PersonalDetails>>) executor6.submit(obj5);
			List<PersonalDetails> personaldetails1=task5.get();
		 
		  assertEquals(personaldetails1,list);
		
	}

}
