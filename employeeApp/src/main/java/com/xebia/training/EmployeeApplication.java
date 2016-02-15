package com.xebia.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class EmployeeApplication
{
	List<Employee> employeeList;
	
	public static void main(String s[]) throws NumberFormatException, IOException, InterruptedException

	{	EmployeeApplication employeelistobject=new EmployeeApplication();
		employeelistobject.employeeList=new ArrayList<Employee>();
	employeelistobject.employeeList.add(new Employee(101, 3,Employee.designation.QA_ANALYST));
	//employeelistobject.employeeList.add(new Employee(102, 5, Employee.designation.ACCOUNTANT));
	
	}
}
