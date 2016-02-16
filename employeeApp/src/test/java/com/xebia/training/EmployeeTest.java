package com.xebia.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import com.xebia.training.Address.AddressType;
import com.xebia.training.Employee.Designation;

import static org.junit.Assert.*;
public class EmployeeTest {
	@SuppressWarnings("restriction")
	@Test
 public void callTest() throws JAXBException, InterruptedException, ExecutionException, ParseException {
	EmployeeUtils employeeUtils=new EmployeeUtils();
	Employee employee=employeeUtils.getEmployee(512);
	 Address address=new Address(AddressType.PERMANENT,512, "6-A", "Ishakchak Road", "Kushwaha Vatika", "Bhagalpur",812001l, "Bihar",8653153544l, "manav@xebia.com");
	 Department department=new Department("Technical", 512, new SimpleDateFormat("dd-MM-yyyy").parse("20-01-2016"), null);
	 PersonalDetail personalDetail=new PersonalDetail(512, "A+", "237JHD", "DSU779", "DS87DS");
	 List<Project> projects=new ArrayList<Project>();
	 Project project=new Project(512, 3425, "SPICEJET", new SimpleDateFormat("dd-MM-yyyy").parse("20-01-2016"), null);
	 projects.add(project);
	 Salary salary=new Salary(512, 0);
	 Employee employee2=new Employee("Manav", "Diwakar", 512, address, salary, new SimpleDateFormat("dd-MM-yyyy").parse("06-07-1995"),  new SimpleDateFormat("dd-MM-yyyy").parse("20-01-2016"), null, personalDetail, department, 2, projects, "Male", Designation.TRAINEE);
	System.out.println(employee2);
	System.out.println(employee);
	 assertEquals(employee2,employee);
}
}
