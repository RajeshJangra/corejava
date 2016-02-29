package com.xebia.training.EmployeeXMLReader;
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

import com.xebia.training.MainApplication.AgeCalculator;
import com.xebia.training.MainApplication.ThreadExecution;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.xebia.training.EmployeeEntities.ContactDetails;
import com.xebia.training.EmployeeEntities.Department;
import com.xebia.training.EmployeeEntities.Employee;
import com.xebia.training.EmployeeEntities.PersonalDetails;
import com.xebia.training.EmployeeEntities.Project;
import com.xebia.training.EmployeeEntities.Salary;
import com.xebia.training.EmployeeEntities.Employee.Designation;
import com.xebia.training.EndDateInfo.EmployeeMap;

public class EmployeeData {
	private static final String input = "src/main/java/com/XmlFiles/Employee.xml";

	Map<Integer,Employee> employeeMap = new HashMap();



	public static void main(String args[]) throws IOException, ParseException, NumberFormatException, InterruptedException, ExecutionException, ParserConfigurationException, SAXException, DOMException, TransformerException {
		EmployeeData employee = new EmployeeData();
		employee.setValues();
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
				Employee employee1 = new Employee();

				String name = eElement.getElementsByTagName("name").item(0).getTextContent();

				employee1.setName(name);
				employee1.setStartingDate(new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startingDate").item(0).getTextContent()));

				employee1.setFathersName(eElement.getElementsByTagName("fathersName").item(0).getTextContent());
				employee1.setCorrespondant(eElement.getElementsByTagName("correspondant").item(0).getTextContent());

				employee1.setDesignation(
						Designation.valueOf(eElement.getElementsByTagName("designation").item(0).getTextContent())
				);
				employee1.setCurrent(eElement.getElementsByTagName("current").item(0).getTextContent());
				employee1.setPersonal(eElement.getElementsByTagName("personal").item(0).getTextContent());
				employee1.setWorkEx(eElement.getElementsByTagName("workEx").item(0).getTextContent());
				employee1.setGender(eElement.getElementsByTagName("gender").item(0).getTextContent());
				employee1.setDOB(new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("dOB").item(0).getTextContent()));
				employee1.setId(Integer.parseInt(eElement.getElementsByTagName("id").item(0).getTextContent()));
				employee1.setEndingDate(null);
				AgeCalculator age = new AgeCalculator(employee1);
				employee1.setAge(age.ageCal());
				ThreadExecution execution = new ThreadExecution(employeeMap);
				employeeMap = execution.executeThreads(employee1);

			}

		}

		EmployeeMap eMap = new EmployeeMap(employeeMap);


	}

}
