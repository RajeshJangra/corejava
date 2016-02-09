package com.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Employee1.Employee;

public class EmployeeMap {
	static Map<Integer,Employee> empMap;
	static Employee employee;

	public EmployeeMap(Map<Integer, Employee> employeeMap) {
		
		this.empMap = employeeMap;
		
		System.out.println("Enter employee id :");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		
		
		employee = empMap.get(id);
		
		System.out.println(employee);
	}
	
	
	
	
	
	


}
