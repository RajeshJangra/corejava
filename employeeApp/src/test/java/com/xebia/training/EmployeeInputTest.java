package com.xebia.training;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import Employeefile.Address;
import Employeefile.Department;
import Employeefile.Employee;
import Employeefile.EmployeeInput;
import Employeefile.PersonalDetails;
import Employeefile.Project;
import Employeefile.Salary;
import Employeefile.Address.AddressType;
import Employeefile.Employee.Designation;
import Employeefile.PersonalDetails.MaritalStatus;

public class EmployeeInputTest {
 public EmployeeInputTest() {
	
}
	@Test
	public void setInputtest() throws DOMException, IOException, ParserConfigurationException, SAXException, ParseException, InterruptedException, ExecutionException {
		
		Map<Integer,Employee> employeeMap = new HashMap<Integer, Employee>();
		
		Map<Integer,Employee> empl = new HashMap<Integer, Employee>();
		
		Date startingDate = new SimpleDateFormat("dd-MM-yyyy").parse("20-01-2016");
		Date dOB = new SimpleDateFormat("dd-MM-yyyy").parse("17-10-1994");
		
		EmployeeInput employee = new EmployeeInput();
		employeeMap=employee.setinput();
		//System.out.println(employeeMap.get(110));
		
		List<Address> list2 = new ArrayList<Address>();
		Address address = new Address(110,1,709,"13","Rajendra Nagar:","patna",126055, "Bihar", "Hanuman mandir",8859399390d,
				"pprakash@xebia.com","prince199428",AddressType.CORRESPONDENT);
		list2.add(address);
		
		List<Department> list3 = new ArrayList<Department>();
		Department department= new Department(110,1,"pioneer", new SimpleDateFormat("dd-MM-yyyy").parse("03-08-2015"),null); 
		list3.add(department);
		
		List<PersonalDetails> list4 = new ArrayList<PersonalDetails>();
		PersonalDetails personal = new PersonalDetails(110,1, "BAH34533KL", "57ARYTRS23", "AB+ve",MaritalStatus.SINGLE, "SKLAOM7S");
		list4.add(personal);
		
		List<Project> list = new ArrayList<Project>();
		Project project1 = new Project(110,1,"JetAirways", new SimpleDateFormat("dd-MM-yyyy").parse("11-01-2016"), null);
		Project project2 = new Project(110,2,"Mckenzi", new SimpleDateFormat("dd-MM-yyyy").parse("21-05-2016"), null);
		list.add(project1);
		list.add(project2);
		
		List<Salary> list1 = new ArrayList<Salary>();
		Salary sal = new Salary(110,1.0,200000.0);
		list1.add(sal);
		
		Employee emp = new Employee("Prince", startingDate,"upendra kumar", null,"pprakash@xebia.com",Designation.TRAINEE,"13/B gurgaon,haryana,India"
				,"409/5 gandhi nagar hind,gaya","1","male", dOB,110, list1, list,list4,list3,list2);
		empl.put(110,emp);
		
		 assertEquals(employeeMap.get(110),emp);
		
	}

}
