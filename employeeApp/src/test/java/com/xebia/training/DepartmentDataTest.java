package com.xebia.training;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.EmployeeEntities.Department;
import com.xebia.training.EmployeeXMLReader.DepartmentData;

public class DepartmentDataTest {

	@Test
	public void DepartmentTest() throws ParseException, InterruptedException, ExecutionException{
	List<Department> list = new ArrayList<>();	
	Department department = new Department(1,1, "pioneer",new SimpleDateFormat(
			"dd-MM-yyyy").parse("03-08-2015"), new SimpleDateFormat(
					"dd-MM-yyyy").parse("03-12-2016"));
	
	list.add(department);
	
	ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
	DepartmentData departmentData = new DepartmentData(1);
	Future<List<Department>> futureTask3 = executor1.submit(departmentData);
	List<Department> department1 = futureTask3.get();
	
	assertEquals(list,department1);
	}
}
