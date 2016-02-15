package com.xebia.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class EmployeeTerminate {
	void terminateEmployee(List<Employee> Empllist,int id) throws ParseException{
		Date endDate=new SimpleDateFormat("dd-MM-yyyy").parse(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
		for(Employee employee:Empllist){
			if(employee.getId()==id) {
				employee.setEndDate(endDate);	
				for(EmployeeProject project:employee.getEmployeeProject()) {
					if(project.getEndDate()==null){
						project.setEndDate(endDate);
					}
				}
				for(EmployeeDept dept:employee.getEmployeeDept()) {
					if(dept.getEndDate()==null){
						dept.setEndDate(endDate);
					}
				}
			}
		}
	}
	
}
