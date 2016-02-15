package com.xebia.training;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

public class EmployeeDeptTest {
	
	public EmployeeDeptTest(){
		
	}
	ThreadPoolExecutor executor1=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
	@Test
	public void CallTest() throws Exception{
		List<EmployeeDept> list1= new ArrayList<EmployeeDept>();
		EmployeeDept dept=new EmployeeDept(101,"pioneer", new SimpleDateFormat("dd-MM-yyyy").parse("01-02-2016"),new SimpleDateFormat("dd-MM-yyyy").parse("03-02-2018"));
		list1.add(dept);
		
		List<EmployeeDept> list2= new ArrayList<EmployeeDept>();
		EmployeeDept dept2=new EmployeeDept(101, "pioneer", new SimpleDateFormat("dd-MM-yyyy").parse("11-01-2016"),new SimpleDateFormat("dd-MM-yyyy").parse("11-01-2016"));
		list2.add(dept2);
		
		EmployeeDeptInput deptInput=new EmployeeDeptInput(101);
		Future<List<EmployeeDept>> future1=executor1.submit(deptInput);
		List<EmployeeDept> list=future1.get();
		System.out.println(list1);
		System.out.println(list2);
		assertEquals(list,list1);
		assertNotEquals(list,list2);
		
	}

}
