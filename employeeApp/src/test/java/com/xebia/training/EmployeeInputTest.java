package com.xebia.training;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.xebia.training.Contact.AddressType;
import com.xebia.training.Employee.Designation;
public class EmployeeInputTest {
	
	public EmployeeInputTest(){
		
	}

	ThreadPoolExecutor executor1=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
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
		EmployeeProject employeeProject=new EmployeeProject(101,1,"JAVA",  new SimpleDateFormat("dd-MM-yyyy").parse("12-01-2015"),null);
		projectlist.add(employeeProject);
		
		List<EmployeeSalary> sallist = new ArrayList<EmployeeSalary>();
		  EmployeeSalary sal1 = new EmployeeSalary(101,16000.00);
		  sallist.add(sal1);
		  
		List<Employee> emplist=new ArrayList<Employee>();
		Employee emp=new Employee(101, "Adarsh Aman", new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2016"), null,Designation.TRAINEE, list, projectlist, list1,detailslist , sallist);
		emplist.add(emp);
		
		List<Employee> emplist1=new ArrayList<Employee>();
		Employee emp1=new Employee(102, "Adarsh Aman", new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2016"), null,Designation.TRAINEE, list, projectlist, list1,detailslist , sallist);
		emplist.add(emp1);
		
		EmployeeInput employeeInput=new EmployeeInput(101);
		Future<List<Employee>> future=executor1.submit(employeeInput);
		List<Employee> listfinal=future.get();
		
		System.out.println(emplist+"\n\n");
		System.out.println(listfinal+"\n\n");
		assertNotEquals(emplist,listfinal);
		
		
	}
}
