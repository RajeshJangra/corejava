package Employeefile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@SuppressWarnings("rawtypes")
public class DepartmentInput implements Callable {
		
		private static final String infile="C:/Users/Administrator/corejava/employeeApp/src/main/java/Xml/Department.xml";
		int EmployeeId;
		 double departmentId;
		 int id;
		 String name;
		 Date startingDate;
		 Date endingDate;

		public DepartmentInput(int id) {
			super();
			this.id = id;
		}


		public List<Department> call() throws  ParserConfigurationException, SAXException, IOException, DOMException, ParseException{
			
			
			 List<Department> list = new ArrayList<Department>();			
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(infile);
	         doc.getDocumentElement().normalize();
	         NodeList nList = doc.getElementsByTagName("Department");
	         for (int temp = 0; temp < nList.getLength(); temp++) 
	         {
	             Node nNode = nList.item(temp);
	       
	             if (nNode.getNodeType() == Node.ELEMENT_NODE) 
	             {
	                Element eElement = (Element) nNode;
				EmployeeId = Integer.parseInt(eElement.getAttribute("EmployeeId"));
				if(EmployeeId == id){
				
				departmentId = Double.parseDouble(eElement.getElementsByTagName("departmentId").item(0).getTextContent());
				name =eElement.getElementsByTagName("name").item(0).getTextContent();
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
			return list;
		}

	}


