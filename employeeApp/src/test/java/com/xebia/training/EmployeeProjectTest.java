package com.xebia.training;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.*;
public class EmployeeProjectTest {
	
	public EmployeeProjectTest(){
		
	}
	ThreadPoolExecutor executor1=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
	@Test
	public void CallTest() throws Exception{
		List<EmployeeProject> list1=new ArrayList<EmployeeProject>();
		EmployeeProject employeeProject=new EmployeeProject(101,1,"JAVA",  new SimpleDateFormat("dd-MM-yyyy").parse("12-01-2015"),  new SimpleDateFormat("dd-MM-yyyy").parse("11-01-2016"));
		list1.add(employeeProject);
		
		List<EmployeeProject> list2=new ArrayList<EmployeeProject>();
		EmployeeProject employeeProject1=new EmployeeProject(102, 1,"JAVA", new SimpleDateFormat("dd-MM-yyyy").parse("12-01-2015"),  new SimpleDateFormat("dd-MM-yyyy").parse("11-01-2016"));
		list1.add(employeeProject1);
		
		
		EmployeeProjectInput  employeeProjectInput=new EmployeeProjectInput(101);
		Future<List<EmployeeProject>> future=executor1.submit(employeeProjectInput);
		List<EmployeeProject> ProjectList=future.get();
		assertEquals(ProjectList,list1);
		assertNotEquals(ProjectList,list2);
		
	}

}
