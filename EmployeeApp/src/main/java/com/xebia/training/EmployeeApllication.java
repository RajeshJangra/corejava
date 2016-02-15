package com.xebia.training;

import java.util.List;

public class EmployeeApllication {


	public static  void main(String[] args) throws Exception {
		int id=101;
		EmployeeInput employeeInput=new EmployeeInput(id);
		List<Employee> employeelist= employeeInput.inputEmployee();
		 
		System.out.println(employeelist);
		System.out.println("\n\nEmployeeTerminated..!!\n");
		EmployeeTerminate term=new EmployeeTerminate();
		    term.terminateEmployee(employeelist,id);
		    System.out.println(employeelist);
		}
}
