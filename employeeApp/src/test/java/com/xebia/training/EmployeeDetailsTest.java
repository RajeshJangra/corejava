package com.xebia.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.*;
public class EmployeeDetailsTest {
	public EmployeeDetailsTest(){	
	}
	ThreadPoolExecutor executor1=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
	@Test
	public void CallTest()throws Exception{
		
		List<EmployeePersonalDetails> detailslist=new ArrayList<EmployeePersonalDetails>();
		EmployeePersonalDetails employeePersonalDetails=new EmployeePersonalDetails(101,"Adarsh Aman","S.K.Sinha",22, new SimpleDateFormat("dd-MM-yyyy").parse("01-11-1993"), "Single","NA", "BJAPA3249M","O+","MALE");
		detailslist.add(employeePersonalDetails);
		
		List<EmployeePersonalDetails> detailslist1=new ArrayList<EmployeePersonalDetails>();
		EmployeePersonalDetails employeePersonalDetails1=new EmployeePersonalDetails(101,"Adarsh Aman","S.K.Sinha",12,  new SimpleDateFormat("dd-MM-yyyy").parse("01-11-1993"), "Single","NA", "BJAPA3249M","O+","MALE");
		detailslist1.add(employeePersonalDetails1);
		
		
		
	 EmployeePersonalDetailsInput employeePersonalDetailsInput2 = new EmployeePersonalDetailsInput(101);
     Future<List<EmployeePersonalDetails>> futureTask = executor1.submit(employeePersonalDetailsInput2);
     System.out.println(detailslist);
     System.out.println(detailslist1);
     
     List<EmployeePersonalDetails> list = futureTask.get();
    // assertNotEquals(list,detailslist1);
    assertEquals(list,detailslist);
		
	}

}
