package com.xebia.training.EmployeePackage;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeApplication {
	List<Employee> employeeList;


	@SuppressWarnings({"unchecked", "rawtypes"})

	public static void main(String args[]) throws ParseException, NumberFormatException, IOException, InterruptedException {
		EmployeeApplication employeeApplication=new EmployeeApplication();


			employeeApplication.employeeList=new ArrayList<Employee>();
		employeeApplication.employeeList.add(new Employee(101));

	}
}
