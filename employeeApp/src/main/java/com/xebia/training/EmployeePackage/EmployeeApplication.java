package com.xebia.training.EmployeePackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class EmployeeApplication {
	static Logger log=Logger.getLogger(EmployeeApplication.class.getName());
	List<Employee> employeeList;

	@SuppressWarnings({"unchecked", "rawtypes"})

	public static void main(String args[]) throws ExecutionException, InterruptedException, ParseException {

		BasicConfigurator.configure();
		log.info("enter the employee id:");
		Scanner sc=new Scanner(System.in);
		EmployeeIn employeeIn=new EmployeeIn(sc.nextInt());
		ExecutorService executorService= Executors.newFixedThreadPool(1);
		Future<Employee> employeeFuture= executorService.submit(employeeIn);
		Employee employee=employeeFuture.get();
		if(employee==null)
		{
			log.error("Sorry no such id exists");
		}
		else {
			log.info("employee = " + employee+ "\n");

			EmployeeIn.resignEmployee(employee);
		}
	}
}
