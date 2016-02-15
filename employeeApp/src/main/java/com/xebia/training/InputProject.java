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

public class InputProject implements Callable{

	String line;
	int id;
	final String in5="/Users/spurwar/corejava/employeeApp/src/main/java/xmlfile/pro.xml";
	
	public InputProject(int id) {
		super();
		this.id = id;
	}
	
	public List<Project> call()throws NumberFormatException, IOException, ParserConfigurationException, SAXException
	{
		
		List<Project> project=new ArrayList<Project>();
		
		 
		 try {
			
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		  
		     Document doc = dBuilder.parse(in5);
		   
		     doc.getDocumentElement().normalize();
		    
		     NodeList nList = doc.getElementsByTagName("project");
		    
		     for (int temp = 0; temp < nList.getLength(); temp++) {
		         Node nNode = nList.item(temp);
		        
		         if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		             Element eElement = (Element) nNode;
					int id3=Integer.parseInt( eElement.getAttribute("id"));
						if(id==id3)
							
						{
						
						String na=eElement.getElementsByTagName("name").item(0).getTextContent();
                       
						Date startdate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startdate").item(0).getTextContent());
						Date enddate= new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("enddate").item(0).getTextContent());

						project.add(new Project(id3, na, startdate, enddate));
					
						
					}
				
						else
		                    continue;


		         }
			} 
		 }
		 
		
		 
		 catch (ParseException e) {
				e.printStackTrace();
	   
			}
		 
		 return project;
   }
		
		
		
	}
	
	

