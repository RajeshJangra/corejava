package com.xebia.training.MapInterface;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import com.xebia.training.Classes.Employee;

public class EmployeeMap {
	static Map<Integer,Employee> empMap;
	static Employee employee;

	public EmployeeMap(Map<Integer, Employee> employeeMap) throws InterruptedException, ExecutionException, DOMException, ParserConfigurationException, SAXException, IOException, ParseException, TransformerException {
		
		this.empMap = employeeMap;
		System.out.println("***********************JASLEEN'S EMPLOYEE APPLICATION**********************");
		System.out.println("\nPlease enter the employee id whose information you require :");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		employee = empMap.get(id);

		System.out.println(employee);

		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\n Is this an end of Employee's current working project(Y/N)? ******");
		String value= sc.next();
		
		
		if(value.equalsIgnoreCase("y")){
		System.out.println("\nProject id: ");
		int projectId = sc.nextInt();
		
		

		
		EndDateSetup deleteProject = new EndDateSetup(id,projectId);
		deleteProject.setDate(employee);
		
		//System.out.println(employee);
		}
		
		
		else{
			System.out.println("---------------------------------------------------------------------------------------------------------");
			
		}
		
	}
	
	
	
	
	
	


}
