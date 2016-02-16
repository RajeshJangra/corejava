package com.xebia.training;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.xebia.training.Address.addressType;
import com.xebia.training.Employee.designation;

public class InputEmployeeTest {

	@Test
	public void testEmployee() throws ParseException, NumberFormatException, IOException, InterruptedException, ExecutionException, ParserConfigurationException, SAXException {
		 List<Contact> conlist = new ArrayList<Contact>();
		 Contact con = new Contact(101,8563873806l,"purawrshubham94@gmail.com");
		  conlist.add(con);
		  
		  List<Address> addlist = new ArrayList<Address>();
			Address address = new Address(101,"C","Delhi","Delhi",5,262701,"Chandani",addressType.Correspondence);
			  addlist.add(address);
			  
			  List<Department> deplist = new ArrayList<Department>();
			  Department dep = new Department(101,"Management", new SimpleDateFormat("dd-MM-yyyy").parse("10-01-2016"),null);
				  deplist.add(dep);
				  
				  List<PersonalDetails> perlist = new ArrayList<PersonalDetails>();
					PersonalDetails per = new PersonalDetails(101,21,"Shubham","R.R.Purwar","Male","O+","Marriage", new SimpleDateFormat("dd-MM-yyyy").parse("10-02-1994"),12344567l);
					  perlist.add(per);
					  
					  List<Project> prolist = new ArrayList<Project>();
						Project  proj = new Project(101,"Project", new SimpleDateFormat("dd-MM-yyyy").parse("10-01-2016"),null);
						  prolist.add(proj);
		
						  
						  List<Salary> salist = new ArrayList<Salary>();
						  Salary sal = new Salary(101,10000.0);
						  salist.add(sal);
						  
	
						  List<Employee> emplist = new ArrayList<Employee>();
						  Employee emp= new Employee(101,3, designation.JAVADEVELOPER, salist, deplist, prolist, conlist, addlist, perlist);
						  emplist.add(emp);
						  
						  InputEmployee obj=new InputEmployee(101);
						   assertEquals(obj.InputEmp(),emplist);
						  
						  
		
	}

}
