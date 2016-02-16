package com.xebia.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import static org.junit.Assert.*;
public class DepartmentTest {
 @SuppressWarnings("unchecked")
 @Test
public void callTest() throws InterruptedException, ExecutionException, ParseException {
	 DepartmentUtils departmentUtils=new DepartmentUtils(512);
	 
	 ExecutorService executorService = Executors.newFixedThreadPool(6);
	 Future<Department> futureDepartment=executorService.submit(departmentUtils);
	 Department department=futureDepartment.get();
	 Department department2=new Department("Technical", 512, new SimpleDateFormat("dd-MM-yyyy").parse("20-01-2016"), null);
	 assertEquals(department,department2);
}
}
