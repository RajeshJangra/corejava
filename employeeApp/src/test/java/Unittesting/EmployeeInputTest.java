package Unittesting;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import Employeefile.Employee;
import Employeefile.EmployeeInput;

public class EmployeeInputTest {

	@Test
	public void setInputtest() throws DOMException, IOException, ParserConfigurationException, SAXException, ParseException, InterruptedException, ExecutionException {
		
		Map<Integer,Employee> employeeMap = new HashMap<Integer, Employee>();
	
		EmployeeInput employee = new EmployeeInput();
		employeeMap=employee.setinput();

		System.out.println(employeeMap.get(110));
		
		 
		
	}

}
