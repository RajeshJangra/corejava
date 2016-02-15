package com.xebia.training;


import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class EmployeeApplication {

	public static  void main(String[] args) throws InterruptedException, ExecutionException, ParserConfigurationException, SAXException, IOException, ParseException 
	{

		List<Employee> employees=InputEmployee.InputEmp();
		System.out.println(employees);
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to employees to resign Y/N");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("Y")){
			System.out.println("Enter Employee ID to resign");
			int id=sc.nextInt();
			Terminate.terminateEmployee(employees,id);
		}
		System.out.println("--------------------------Complete Details of Employee-----------------------------------------------");
		System.out.println(employees);
		sc.close();

	}

}




