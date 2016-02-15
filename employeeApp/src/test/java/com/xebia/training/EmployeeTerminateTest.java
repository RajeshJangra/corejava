package com.xebia.training;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.Contact.AddressType;
import com.xebia.training.Employee.Designation;

public class EmployeeTerminateTest {

	ThreadPoolExecutor executor1=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	public EmployeeTerminateTest(){
		
	}
	
	@Test
	public void CallTest() throws Exception{
		
		List<Contact> list= new ArrayList<Contact>();
		Contact contact1=new Contact(101,"Dayanand Sagar Nagar","Sadar Road","Sector 15","Gurgaon",122001,"Haryana", "Park Centra",973489870,"adarshaman@xebia.com",AddressType.CORRESPONDENCE);
		list.add(contact1);
		
		List<EmployeeDept> list1= new ArrayList<EmployeeDept>();
		EmployeeDept dept=new EmployeeDept(101,"pioneer", new SimpleDateFormat("dd-MM-yyyy").parse("01-02-2016"),null);
		list1.add(dept);
		
		List<EmployeePersonalDetails> detailslist=new ArrayList<EmployeePersonalDetails>();
		EmployeePersonalDetails employeePersonalDetails=new EmployeePersonalDetails(101,"Adarsh Aman","S.K.Sinha",22, new SimpleDateFormat("dd-MM-yyyy").parse("01-11-1993"), "Single","NA", "BJAPA3249M","O+","MALE");
		detailslist.add(employeePersonalDetails);
		
		List<EmployeeProject> projectlist=new ArrayList<EmployeeProject>();
		EmployeeProject employeeProject=new EmployeeProject(101,1,"Java",  new SimpleDateFormat("dd-MM-yyyy").parse("12-01-2015"),  null);
		EmployeeProject employeeProject2=new EmployeeProject(101,2,"Scala",new SimpleDateFormat("dd-MM-yyyy").parse("13-02-2015"),  null);
		projectlist.add(employeeProject);
		projectlist.add(employeeProject2);
		
		List<EmployeeSalary> sallist = new ArrayList<EmployeeSalary>();
		  EmployeeSalary sal1 = new EmployeeSalary(101,16000.00);
		  sallist.add(sal1);
		  
		List<Employee> emplist=new ArrayList<Employee>();
		Employee emp=new Employee(101, "Adarsh Aman", new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2016"), null,Designation.TRAINEE, list, projectlist, list1,detailslist , sallist);
		emplist.add(emp);
		
		List<Employee> emplist2=new ArrayList<Employee>();
		Employee emp2=new Employee(101, "Adarsh Aman", new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2016"),  new SimpleDateFormat("dd-MM-yyyy").parse("01-05-2018"),Designation.TRAINEE, list, projectlist, list1,detailslist , sallist);
		emplist2.add(emp2);
		
		System.out.println(emplist);
		EmployeeTerminate term=new EmployeeTerminate();
	    term.terminateEmployee(emplist,101);
	    System.out.println(emplist);
	   // System.out.println(term);
	   // System.out.println(term.toString());
	    assertEquals(emplist, emplist);
	    assertNotEquals(emplist2,emplist);
	    
		
	}
	
	
}
