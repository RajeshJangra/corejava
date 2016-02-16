package com.xebia.training.Employee2;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.xebia.training.Employee1.ContactDetails;
import com.xebia.training.Employee1.Department;
import com.xebia.training.Employee1.Employee;
import com.xebia.training.Employee1.Employee.Designation;
import com.xebia.training.Employee1.PersonalDetails;
import com.xebia.training.Employee1.Project;
import com.xebia.training.Employee1.Salary;
import com.xebia.training.MapInterface.EmployeeMap;

public class EmployeeData {
	private static final String input = "/home/jasleen/corejava/employeeApp/src/main/java/com/XmlFiles/Employee.xml";
	String name;
	Date startingDate;
	String fathersName;
	Date endingDate;
	String correspondant;

	Designation designation = null;
	String current;
	String personal;
	String workEx;
	String gender;
	Date dOB;
	int id;
	Map<Integer,Employee> employeeMap = new HashMap();

	public static void main(String args[]) throws IOException, ParseException, NumberFormatException, InterruptedException, ExecutionException, ParserConfigurationException, SAXException, DOMException, TransformerException {
		EmployeeData employee1 = new EmployeeData();
		employee1.setValues();
	}

	public void setValues() throws NumberFormatException, IOException,
			ParseException, InterruptedException, ExecutionException, ParserConfigurationException, SAXException, DOMException, TransformerException {
		File file = new File(input);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("employee");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				
				
				
				name = eElement.getElementsByTagName("name").item(0).getTextContent();
				startingDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startingDate").item(0).getTextContent());
				fathersName = eElement.getElementsByTagName("fathersName").item(0).getTextContent();
				
				correspondant = eElement.getElementsByTagName("correspondant").item(0).getTextContent();
				designation = Designation.valueOf(eElement.getElementsByTagName("designation").item(0).getTextContent());
				current = eElement.getElementsByTagName("current").item(0).getTextContent();
				personal = eElement.getElementsByTagName("personal").item(0).getTextContent();
				workEx = eElement.getElementsByTagName("workEx").item(0).getTextContent();
				gender =eElement.getElementsByTagName("gender").item(0).getTextContent();
				dOB = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("dOB").item(0).getTextContent());
				id = Integer.parseInt(eElement.getElementsByTagName("id").item(0).getTextContent());
				endingDate =null;

				
				
				ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
				
				
				
				
				SalaryData salaryData = new SalaryData(id);
				Future<List<Salary>> futureTask1 = executor1.submit(salaryData);
				List<Salary> salary = futureTask1.get();
				
				
				
				ProjectData projectData = new ProjectData(id);
				Future<List<Project>> futureTask = executor1.submit(projectData);
				List<Project> project = futureTask.get();
				

				
				PersonalDetailsData personalDetailsData = new PersonalDetailsData(id);
				Future<List<PersonalDetails>> futureTask2 = executor1.submit(personalDetailsData);
				List<PersonalDetails> personalDetails = futureTask2.get();

				
				DepartmentData departmentData = new DepartmentData(id);
				Future<List<Department>> futureTask3 = executor1.submit(departmentData);
				List<Department> department = futureTask3.get();

				
				ContactDetailsData contactDetailsData = new ContactDetailsData(id);
				Future<List<ContactDetails>> futureTask4 = executor1.submit(contactDetailsData);
				List<ContactDetails> contactDetails = futureTask4.get();
				
				Employee emp = new Employee(name, startingDate, fathersName, endingDate, correspondant, designation, current, personal, workEx, gender, dOB, id, salary, project, personalDetails, department, contactDetails);

				
			
			
			employeeMap.put(id,emp);
			
			
			
			//	System.out.println(emp + "\n");

			}

		}

		EmployeeMap eMap = new EmployeeMap(employeeMap);
	//	fileReader.close();

	}

}
