package com.xebia.training;

public class EmployeeApllication {


	public static  void main(String[] args) throws Exception {
		int id=101;
		EmployeeInput employeeInput=new EmployeeInput(id);
		System.out.println(employeeInput.inputEmployee());
		
		}
}
