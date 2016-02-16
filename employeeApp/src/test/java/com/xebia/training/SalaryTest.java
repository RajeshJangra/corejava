package com.xebia.training;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import static org.junit.Assert.*;
public class SalaryTest {
	@SuppressWarnings("unchecked")
	@Test
	public void callTest() throws InterruptedException, ExecutionException {
		SalaryUtils salaryUtils=new SalaryUtils(511);
		 ExecutorService executorService = Executors.newFixedThreadPool(6);
		Future<Salary> futureSalary=executorService.submit(salaryUtils);
		 Salary salary=futureSalary.get();
		 System.out.println(salary);
		 Salary salary2=new Salary(512, 0);
		 assertEquals(salary2,salary);
	}
}
