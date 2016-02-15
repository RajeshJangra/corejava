package com.xebia.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Terminate {


	public static void terminateEmployee(List<Employee> employees, int i) throws ParseException {
		
		Date endDate=new SimpleDateFormat("dd-MM-yyyy").parse(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
		for(Employee employee:employees)
		{
			if(employee.getId()==i)
			{
				for(Department department:employee.getDepartment())
				{
					department.setEndDate(endDate);
				}
				for(Project project:employee.getProject())
				{
					project.setEnd_date(endDate);
					
				}
			}
			System.out.println(employee.getId()+" Successfully resigned!!\nDetails Updated\n"+employee);
		}
		
		
	}
}
