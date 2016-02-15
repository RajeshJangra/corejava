package com.xebia.training.MapInterface;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.Employee1.Salary;
import com.xebia.training.Employee2.SalaryData;

public class SalaryDataTest {

	@Test
	public void callTest() throws InterruptedException, ExecutionException {
		List<Salary> list = new ArrayList<Salary>();
		Salary salary = new Salary(0, 0, 0);
		list.add(salary);

		ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
		SalaryData salaryData = new SalaryData(1);
		Future<List<Salary>> futureTask1 = executor1.submit(salaryData);
		List<Salary> salary1 = futureTask1.get();
		assertEquals(list, salary1);
		
		

	}

}
