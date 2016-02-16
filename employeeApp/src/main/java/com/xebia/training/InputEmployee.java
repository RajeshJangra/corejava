package com.xebia.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class InputEmployee {

	static String ine="/Users/spurwar/corejava/employeeApp/src/main/java/xmlfile/employee.xml";
	int id;
	

	public InputEmployee(int id) {
		super();
		this.id = id;
	}


	public static List<Employee> InputEmp() throws InterruptedException, ExecutionException, ParserConfigurationException, SAXException, IOException
	{
		List<Employee> employees=new ArrayList<Employee>();

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document doc = dBuilder.parse(ine);

		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("employee");

		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				int id=Integer.parseInt( eElement.getAttribute("id"));
				ThreadPoolExecutor executor= (ThreadPoolExecutor) Executors.newFixedThreadPool(12);
				InputSalary obj=new InputSalary(id);
				@SuppressWarnings("unchecked")
				FutureTask<List<Salary>> task= (FutureTask<List<Salary>>) executor.submit(obj);
				List<Salary> salary1=task.get();


				
				InputDepartment obj1=new InputDepartment(id);
				FutureTask<List<Department>> task1= (FutureTask<List<Department>>) executor.submit(obj1);
				List<Department> department1=task1.get();



			
				InputProject obj2=new InputProject(id);
				FutureTask<List<Project>> task2= (FutureTask<List<Project>>) executor.submit(obj2);
				List<Project> project1=task2.get();

		
				InputContact obj3=new InputContact(id);
				FutureTask<List<Contact>> task3= (FutureTask<List<Contact>>) executor.submit(obj3);
				List<Contact> contact1=task3.get();

			
				InputAddress obj4=new InputAddress(id);
				FutureTask<List<Address>> task4= (FutureTask<List<Address>>) executor.submit(obj4);
				List<Address> address1=task4.get();

			
				InputPersonaldetails obj5=new InputPersonaldetails(id);
				@SuppressWarnings("unchecked")
				FutureTask<List<PersonalDetails>> task5= (FutureTask<List<PersonalDetails>>) executor.submit(obj5);
				List<PersonalDetails> personaldetails1=task5.get();

				int work=Integer.parseInt(eElement.getElementsByTagName("work_exp").item(0).getTextContent());	
				String des=eElement.getElementsByTagName("designation").item(0).getTextContent();

				employees.add(new Employee(id, work,Employee.designation.valueOf( des),salary1,department1,project1,contact1,address1,personaldetails1));							
			}
		}
		return employees;
	}
}
