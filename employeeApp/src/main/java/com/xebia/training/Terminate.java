package com.xebia.training;

import java.text.ParseException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Terminate {

	static Logger log=Logger.getLogger(EmployeeApplication.class.getName());
	public static void terminateEmployee(List<Employee> employees, int i) throws ParseException {
		BasicConfigurator.configure();
		
		int flag=0;
		Date endDate=new SimpleDateFormat("dd-MM-yyyy").parse(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
		for(Employee employee:employees)
		{
			if(employee.getId()==i)
			{
				flag=1;
				for(Department department:employee.getDepartment())
				{
					department.setEndDate(endDate);
				}
				for(Project project:employee.getProject())
				{
					project.setEnd_date(endDate);
					
				}
				log.info(employee.getId()+" Successfully resigned!!\nDetails Updated\n"+employee);
			}
			else
				continue;
			
		}
		if(flag==0)
			log.info("Employee doesn't Exist");
		
		
	}
}
