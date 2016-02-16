package com.xebia.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class EmployeeApplication {

	static Logger log=Logger.getLogger(EmployeeApplication.class.getName());

	public static  void main(String[] args) throws InterruptedException, ExecutionException, ParserConfigurationException, SAXException, IOException, ParseException 
	{
		BasicConfigurator.configure();

		List<Employee> employees=InputEmployee.InputEmp();

		Scanner sc=new Scanner(System.in);
		log.info("Enter your id");
		int id=sc.nextInt();
		log.info("Do you want to employees to resign Y/N");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("Y")){
			log.info("Enter Employee ID to resign");
			Terminate.terminateEmployee(employees,id);
		}
		else
		{
			log.info(employees);
			sc.close();
		}

	}

}




