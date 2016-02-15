package com.xebia.training;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import java.util.concurrent.Callable;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class InputSalary implements Callable{

	 String line;
	 int id;
	 final String in2="/Users/spurwar/corejava/employeeApp/src/main/java/xmlfile/sal.xml";
	public InputSalary(int id) {
		super();
		this.id = id;
	}

	public List<Salary> call()throws NumberFormatException, IOException, ParserConfigurationException, SAXException
	       {
	    	
	    	List<Salary> salary=new ArrayList<Salary>();
	    		
	    		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	              DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	       
	              Document doc = dBuilder.parse(in2);
	           
	              doc.getDocumentElement().normalize();
	         
	              NodeList nList = doc.getElementsByTagName("salary");
	             
	              for (int temp = 0; temp < nList.getLength(); temp++) {
	                  Node nNode = nList.item(temp);
	                 
	                  if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	                      Element eElement = (Element) nNode;
	    				int d=Integer.parseInt( eElement.getAttribute("id"));
	    				if(id==d){
	    				double ba=Double.parseDouble(eElement.getElementsByTagName("basic").item(0).getTextContent());
	    				salary.add(new Salary(d, ba));
	    				}
	    				else
	    					continue;
	    			}
	    		}
	    		
		
	              
		return salary;
	}

	
	
}
