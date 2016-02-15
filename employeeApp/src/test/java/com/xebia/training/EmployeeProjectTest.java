package com.xebia.training;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;
public class EmployeeProjectTest {
	
	public EmployeeProjectTest(){
		
	}
	ThreadPoolExecutor executor1=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
	@Test
	public void CallTest() throws Exception{
		List<EmployeeProject> list1=new ArrayList<EmployeeProject>();
		EmployeeProject employeeProject=new EmployeeProject(101,1,"Java",  new SimpleDateFormat("dd-MM-yyyy").parse("12-01-2015"),  null);
		EmployeeProject employeeProject2=new EmployeeProject(101,2,"Scala",new SimpleDateFormat("dd-MM-yyyy").parse("13-02-2015"),  null);
		list1.add(employeeProject);
		list1.add(employeeProject2);
		
		List<EmployeeProject> list2=new ArrayList<EmployeeProject>();
		EmployeeProject employeeProject1=new EmployeeProject(102, 1,"JAVA", new SimpleDateFormat("dd-MM-yyyy").parse("12-01-2015"),  new SimpleDateFormat("dd-MM-yyyy").parse("11-01-2016"));
		list2.add(employeeProject1);
		
		
		EmployeeProjectInput  employeeProjectInput=new EmployeeProjectInput(101);
		Future<List<EmployeeProject>> future=executor1.submit(employeeProjectInput);
		List<EmployeeProject> ProjectList=future.get();
		System.out.println(list1);
		//System.out.println(list2);
		System.out.println(ProjectList);
		assertEquals(ProjectList,list1);
		assertNotEquals(ProjectList,list2);
		
	}

}
