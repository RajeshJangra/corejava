package com.xebia.training;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.InputSalary;
import com.xebia.training.Salary;

public class InputSalaryTest {
	ThreadPoolExecutor executor1= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
	@Test
	public void calltest() throws InterruptedException, ExecutionException {
		
		  List<Salary> list = new ArrayList<Salary>();
		  Salary sal = new Salary(101,10000.0);
		  list.add(sal);
		  
		  List<Salary> list1 = new ArrayList<Salary>();
		 Salary sal1 = new Salary(101,2000);
		 list1.add(sal1);
		  
		  
		 InputSalary obj=new InputSalary(101);
			FutureTask<List<Salary>> task= (FutureTask<List<Salary>>) executor1.submit(obj);
			List<Salary> salary1=task.get();
			
			
		     assertEquals(salary1,list);
		//assertNotEquals(salary1,list1);
		
	}


}