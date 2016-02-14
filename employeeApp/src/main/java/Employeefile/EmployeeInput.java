package Employeefile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Employeefile.Employee.Designation;

public class EmployeeInput{
	final String infile = "C:/Users/Administrator/corejava/employeeApp/src/main/java/Xml/Employee.xml";
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
	String unknown;
	Date dOB;
	static int id;
	Map<Integer,Employee> employeeMap = new HashMap<Integer, Employee>();


	@SuppressWarnings("unchecked")
	public Map<Integer, Employee> setinput() throws IOException, ParserConfigurationException, SAXException, DOMException, ParseException, InterruptedException, ExecutionException {
	
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(infile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("employee");
        for (int temp = 0; temp < nList.getLength(); temp++) 
        {
            Node nNode = nList.item(temp);
      
            if (nNode.getNodeType() == Node.ELEMENT_NODE) 
            {
               Element eElement = (Element) nNode;
               unknown=eElement.getAttribute("EmployeeID");
				name =eElement.getElementsByTagName("name").item(0).getTextContent();
				startingDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startingDate").item(0).getTextContent());
				fathersName = eElement.getElementsByTagName("fathersName").item(0).getTextContent();
				
				correspondant =eElement.getElementsByTagName("correspondant").item(0).getTextContent();
				designation = Designation.valueOf(eElement.getElementsByTagName("designation").item(0).getTextContent());
				current =eElement.getElementsByTagName("current").item(0).getTextContent();
				personal =eElement.getElementsByTagName("personal").item(0).getTextContent();
				workEx =eElement.getElementsByTagName("workEx").item(0).getTextContent();
				gender =eElement.getElementsByTagName("gender").item(0).getTextContent();
				dOB = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("dOB").item(0).getTextContent());
				id = Integer.parseInt(eElement.getElementsByTagName("id").item(0).getTextContent());
				endingDate =null;
				
				ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
				
				DepartmentInput departmentinput = new DepartmentInput(id);
				Future<List<Department>> futureTask1 = executor1.submit(departmentinput);
				List<Department> department = futureTask1.get();
				
				AddressInput addressinput = new AddressInput(id);
				Future<List<Address>> futureTask2 = executor1.submit(addressinput);
				List<Address> address = futureTask2.get();

				PersonalInput personalinput = new PersonalInput(id);
				Future<List<PersonalDetails>> futureTask3 = executor1.submit(personalinput);
				List<PersonalDetails> personalDetails = futureTask3.get();

				
			    SalaryInput salaryinput = new SalaryInput(id);
			    Future<List<Salary>> futureTask4 = executor1.submit(salaryinput);
			    List<Salary> salary = futureTask4.get();
	
			    ProjectInput projectinput = new ProjectInput(id);
				Future<List<Project>> futureTask5=executor1.submit(projectinput) ;
				List<Project> project = futureTask5.get();
				
				Employee emp = new Employee(name, startingDate, fathersName, endingDate, correspondant, designation, current, personal, workEx, gender, dOB, id, salary, project, personalDetails, department, address);

				employeeMap.put(id,emp);

			}

		}
		return employeeMap;

	}
	Project terminate()
	{
		Project project=new Project();
		project.setEndDate();
		return project;
	}
}

