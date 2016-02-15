package com.xebia.training;

import static org.junit.Assert.*;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;



import Employeefile.Department;
import Employeefile.DepartmentInput;

public class DepartmentInputTest {

	
	public DepartmentInputTest() {
		super();
	}

	ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
	
	@SuppressWarnings("unchecked")
	@Test
	public void test() throws InterruptedException, ExecutionException, ParseException {
	
		DepartmentInput departmentinput = new DepartmentInput(110);
		Future<List<Department>> futureTask1 = executor1.submit(departmentinput);
		List<Department> department = futureTask1.get();
		
		List<Department> list = new ArrayList<Department>();
		Department department1 = new Department(110,1,"pioneer", new SimpleDateFormat("dd-MM-yyyy").parse("03-08-2015"),
				new SimpleDateFormat("dd-MM-yyyy").parse("03-12-2016"));
		list.add(department1);
		
		assertEquals(department,list);
	}

}