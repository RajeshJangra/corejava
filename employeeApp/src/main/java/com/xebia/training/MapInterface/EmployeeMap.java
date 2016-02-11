package com.xebia.training.MapInterface;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import com.xebia.training.Employee1.Employee;

public class EmployeeMap {
	static Map<Integer,Employee> empMap;
	static Employee employee;

	public EmployeeMap(Map<Integer, Employee> employeeMap) throws InterruptedException, ExecutionException {
		
		this.empMap = employeeMap;
		
		System.out.println("Enter employee id :");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		
		
		
		
		employee = empMap.get(id);
		
		
		System.out.println(employee);
		
		System.out.println("\n\nDo u want to end employee's projects(Y/N)");
		String value= sc.next();
		
		
		if(value.equalsIgnoreCase("y")){
		System.out.println("\nEnter project id: ");
		int projectId = sc.nextInt();
		EndDateSetup deleteEmployee = new EndDateSetup(id,projectId);
		deleteEmployee.setDate(employee);
		
		//System.out.println(employee);
		}
		
		
		else{
			System.out.println("-------------------------------");
			
		}
		
	}
	
	
	
	
	
	


}
