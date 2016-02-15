package com.xebia.training;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.EmployeeEntities.Salary;
import com.xebia.training.EmployeeXMLReader.SalaryData;


public class SalaryDataTest {
	
	@Test
	public void callTest() throws InterruptedException, ExecutionException {
	//	Salary salary = Mockito.mock(Salary.class);

		List<Salary> list = new ArrayList<Salary>();
		Salary salary = new Salary(1, 1, 20000);
		list.add(salary);

		ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
		SalaryData salaryData = new SalaryData(1);
		Future<List<Salary>> futureTask1 = executor1.submit(salaryData);
		List<Salary> salary1 = futureTask1.get();
		assertEquals(list, salary1);
		
		

	}

}
