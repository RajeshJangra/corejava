package com.xebia.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class InputDepartment implements Callable {

	String line;
	int id;
	final String in1="/Users/spurwar/corejava/employeeApp/src/main/java/xmlfile/Dept.xml";
	
	public InputDepartment(int id) {
		super();
		this.id = id;
	}
	public List<Department> call()throws NumberFormatException, IOException, ParserConfigurationException, SAXException
    {
	
	List<Department> department=new ArrayList<Department>();
	   

	   try {


		   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		     Document doc = dBuilder.parse(in1);
		   
		     doc.getDocumentElement().normalize();
	
		     NodeList nList = doc.getElementsByTagName("department");
		   
		     for (int temp = 0; temp < nList.getLength(); temp++) {
		         Node nNode = nList.item(temp);
		        
		         if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		             Element eElement = (Element) nNode;
					int id1=Integer.parseInt( eElement.getAttribute("id"));
                           if(id==id1)
                           {
				
					

					String de=eElement.getElementsByTagName("Name").item(0).getTextContent();
					Date startdate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startdate").item(0).getTextContent());
					Date enddate= new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("enddate").item(0).getTextContent());

					department.add(new Department(id1, de, startdate, enddate));
				   }
                           else
   	    					continue;
			}
			} 
	 
	   }
	   catch (ParseException e) {
			e.printStackTrace();
		}
		
	   return department;
	   
   }
		

}
	
	
	

