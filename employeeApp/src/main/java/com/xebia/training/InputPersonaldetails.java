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

public class InputPersonaldetails implements Callable{

	String line;
	int id;
	final String in1="/Users/spurwar/corejava/employeeApp/src/main/java/xmlfile/personaldetails.xml";
	
	public InputPersonaldetails(int id) {
		super();
		this.id = id;
	}
	
	public List<PersonalDetails> call()throws NumberFormatException, IOException, SAXException, ParserConfigurationException{
		
		
		ArrayList<PersonalDetails> personaldetails=new ArrayList<PersonalDetails>();  
		 
	
	    
		try {


			int p=0;
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		  
		     Document doc = dBuilder.parse(in1);
		   
		     doc.getDocumentElement().normalize();
		 
		     NodeList nList = doc.getElementsByTagName("personaldetails");
		   
		     for (int temp = 0; temp < nList.getLength(); temp++) {
		         Node nNode = nList.item(temp);
		        
		         if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		             Element eElement = (Element) nNode;
					int id4=Integer.parseInt( eElement.getAttribute("id"));
					
					if(id==id4)
					{
					int ag=Integer.parseInt(eElement.getElementsByTagName("age").item(0).getTextContent());
					String nam=eElement.getElementsByTagName("name").item(0).getTextContent();
					String fnam=eElement.getElementsByTagName("fathername").item(0).getTextContent();
					String gen=eElement.getElementsByTagName("gender").item(0).getTextContent();
					String bg=eElement.getElementsByTagName("bloodgroup").item(0).getTextContent();
					String ma=eElement.getElementsByTagName("maritalstatus").item(0).getTextContent();
					Date date = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("dob").item(0).getTextContent());
					long ad=Long.parseLong(eElement.getElementsByTagName("aadharno").item(0).getTextContent());

				personaldetails.add(new PersonalDetails(id4, ag, nam, fnam, gen, bg, ma, date, ad));

					}
					else
	                    continue;
				}
				
				}
					
					
				
			



		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return personaldetails;
		
		
		
	 }

		
	}
	
	
