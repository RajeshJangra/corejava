package com.xebia.training;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import Employeefile.Employee;
import Employeefile.EmployeeInput;
import Employeefile.Project;
import Employeefile.Termination;

public class TerminationTest {

	@Test
	public void terminatetest() throws DOMException, IOException, ParserConfigurationException, SAXException, ParseException, InterruptedException, ExecutionException {
		
		EmployeeInput employee = new EmployeeInput();

		Map<Integer, Employee> Emp=employee.setinput();
		Termination term=new Termination();
		Employee employe=term.terminate(Emp,4,114).get(114);
		List<Project> projects=new ArrayList<Project>();
		projects=employe.getProjectData();
		System.out.println(projects);
	
		List<Project> list = new ArrayList<Project>();
		Project project1 = new Project(114,4,"Facebook", new SimpleDateFormat("dd-MM-yyyy").parse("01-1-2016"),new Date());
		list.add(project1);
		
		System.out.println(list);
		
		assertEquals(projects.toString(),list.toString());
		
		//assertEquals(list,projects);
	}

}
