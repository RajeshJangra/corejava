package com.xebia.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

public class EmployeeSalarytest {
	
	public EmployeeSalarytest(){
	}
	
	ThreadPoolExecutor executor1=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
	@Test
	public void callTest() throws Exception{
	
		List<EmployeeSalary> Salarylist=new ArrayList<EmployeeSalary>();
		EmployeeSalary sal=new EmployeeSalary(101,1000.00);
		Salarylist.add(sal);
		
		List<EmployeeSalary> list1 = new ArrayList<EmployeeSalary>();
		  EmployeeSalary sal1 = new EmployeeSalary(101,16000.00);
		  list1.add(sal1);
		
		
		
	 EmployeeSalaryInput salaryinput = new EmployeeSalaryInput(101);
     Future<List<EmployeeSalary>> futureTask4 = executor1.submit(salaryinput);
     List<EmployeeSalary> salary = futureTask4.get();
     assertNotEquals(salary,Salarylist);
     assertEquals(salary,list1);
		
	}
}
