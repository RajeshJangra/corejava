package com.xebia.training.Employee2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.xebia.training.Employee1.Department;

public class DepartmentData implements Callable<List<Department>>{
	
	private static final String input="src/main/java/com/XmlFiles/Department.xml";
	int EmployeeId;
	 double departmentId;
	
	int id;
	 String name;
	 Date startingDate;
	 Date endingDate;
	
	
	




	public DepartmentData(int id) {
		super();
		this.id = id;
	}







	@Override
	public List<Department> call() throws Exception {
		List<Department> list = new ArrayList<Department>();
		File file = new File(input);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("Department");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
			EmployeeId =Integer.parseInt(eElement.getAttribute("EmployeeId"));
			if(EmployeeId == id){
			
			departmentId = Double.parseDouble(eElement.getElementsByTagName("departmentId").item(0).getTextContent());
			name = eElement.getElementsByTagName("name").item(0).getTextContent();
			startingDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startingDate").item(0).getTextContent());
			endingDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("endingDate").item(0).getTextContent());
			
			Department department = new Department(EmployeeId,departmentId, name, startingDate, endingDate);
			list.add(department);
			}
			else{
				break;
			}
			}
		}
		return list;	}

}
