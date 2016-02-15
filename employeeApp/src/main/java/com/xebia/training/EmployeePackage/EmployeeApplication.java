package com.xebia.training.EmployeePackage;

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

public class EmployeeApplication {
	List<Employee> employeeList;


	@SuppressWarnings({"unchecked", "rawtypes"})

	public static void main(String args[]) throws ParseException, NumberFormatException, IOException, InterruptedException, ExecutionException {
		System.out.println("enter the employee id:");
		Scanner sc=new Scanner(System.in);
		EmployeeIn employeeIn=new EmployeeIn(sc.nextInt());
		ExecutorService executorService= Executors.newFixedThreadPool(1);
		Future<Employee> employeeFuture= executorService.submit(employeeIn);
		Employee employee=employeeFuture.get();
			System.out.println("employee = " + employee);
		EmployeeIn.resignEmployee(employee);
		}



	}
