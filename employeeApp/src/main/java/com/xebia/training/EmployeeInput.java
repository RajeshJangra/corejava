package com.xebia.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.xebia.training.Employee.Designation;

public class EmployeeInput implements Callable<List<Employee>> {
	List<Employee> employeeList = new ArrayList<Employee>();
	ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors
			.newFixedThreadPool(10);
	int id1;
	public static final String in = "C:/Users/adarshgupta/GIT/corejava/employeeApp/src/main/java/com/xebia/xmlfiles/employee.xml";
	Employee employee = null;

	public EmployeeInput(int id1) {
		super();
		this.id1 = id1;
	}

	public List<Employee> call() throws Exception {
		int id = 101;
		String name;
		Date startDate, endDate;
		Designation designation;
		File file = new File(in);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("employee");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				id1 = Integer.parseInt(eElement.getAttribute("id"));
				name = eElement.getElementsByTagName("name").item(0)
						.getTextContent();
				startDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement
						.getElementsByTagName("startDate").item(0)
						.getTextContent());
				endDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement
						.getElementsByTagName("endDate").item(0)
						.getTextContent());
				designation = Designation.valueOf(eElement
						.getElementsByTagName("designation").item(0)
						.getTextContent());

				if (id == id1) {

					/*
					 * EmployeeInput employeeInput=new EmployeeInput(id1);
					 * Future<List<Employee>>
					 * future6=executor.submit(employeeInput); List<Employee>
					 * list6=new ArrayList<Employee>(); list6=future6.get();
					 */

					EmployeeDeptInput employeeDeptInput = new EmployeeDeptInput(
							id1);
					Future<List<EmployeeDept>> future1 = executor
							.submit(employeeDeptInput);
					List<EmployeeDept> list1 = new ArrayList<EmployeeDept>();
					list1 = future1.get();

					ContactInput contactInput = new ContactInput(id1);
					Future<List<Contact>> future2 = executor
							.submit(contactInput);
					List<Contact> list2 = new ArrayList<Contact>();
					list2 = future2.get();

					EmployeePersonalDetailsInput employeePersonalDetailsInput = new EmployeePersonalDetailsInput(
							id1);
					Future<List<EmployeePersonalDetails>> future3 = executor
							.submit(employeePersonalDetailsInput);
					List<EmployeePersonalDetails> list3 = new ArrayList<EmployeePersonalDetails>();
					list3 = future3.get();

					EmployeeSalaryInput employeeSalaryInput = new EmployeeSalaryInput(
							id1);
					Future<List<EmployeeSalary>> future4 = executor
							.submit(employeeSalaryInput);
					List<EmployeeSalary> list4 = new ArrayList<EmployeeSalary>();
					list4 = future4.get();

					EmployeeProjectInput employeeProjectInput = new EmployeeProjectInput(
							id1);
					Future<List<EmployeeProject>> future5 = executor
							.submit(employeeProjectInput);
					List<EmployeeProject> list5 = new ArrayList<EmployeeProject>();
					list5 = future5.get();

					employee = new Employee(id1, name, startDate, endDate,
							designation, list2, list5, list1, list3, list4);
					employeeList.add(employee);
				} else {
					/*
					 * str.nextToken(","); str.nextToken(",");
					 * str.nextToken(","); str.nextToken(",");
					 * str.nextToken(","); continue;
					 */break;
				}

			} else {
				break;
			}
		}
		return employeeList;
	}

	public List<Employee> inputEmployee() throws InterruptedException,
			ExecutionException {
		Future<List<Employee>> fl = executor.submit(new EmployeeInput(id1));
		return fl.get();
	}

}

/*
 * Employee employee=null; FileReader in=new FileReader("e:/Employee.txt");
 * BufferedReader bfr=new BufferedReader(in); String lineread;
 * while((lineread=bfr.readLine())!=null){ StringTokenizer str=new
 * StringTokenizer(lineread,","); while(str.hasMoreTokens()){
 * id1=Integer.parseInt(str.nextToken(","));
 */

