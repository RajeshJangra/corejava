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

import com.xebia.training.Contact;
import com.xebia.training.Department;
import com.xebia.training.InputDepartment;

public class InputDepartmentTest {
	
	ThreadPoolExecutor executor2= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

	@Test
	public void test() throws ParseException, InterruptedException, ExecutionException {
		 Department dep = new Department(101,"Management", new SimpleDateFormat("dd-MM-yyyy").parse("10-01-2016"),null);

		 List<Department> list = new ArrayList<Department>();
		  list.add(dep);
		 
		  
		  InputDepartment obj1=new InputDepartment(101);
			FutureTask<List<Department>> task1= (FutureTask<List<Department>>) executor2.submit(obj1);
			List<Department> department1=task1.get();
			
			System.out.println(department1);
			System.out.println(list);
			
			assertEquals(department1,list);

		  
		  
		  
	}

}
