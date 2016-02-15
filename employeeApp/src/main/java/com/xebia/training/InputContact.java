package com.xebia.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

public class InputContact implements Callable {

	
	String line;
	int id;
	final String in1="/Users/spurwar/corejava/employeeApp/src/main/java/xmlfile/contact.xml";
	 public InputContact(int id) {
		super();
		this.id = id;
	}
	 
	 public List<Contact> call()throws NumberFormatException, IOException, SAXException, ParserConfigurationException{
	
		
		 ArrayList<Contact> contact=new ArrayList<Contact>();
	 
	 
	
	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
  
     Document doc = dBuilder.parse(in1);
    
     doc.getDocumentElement().normalize();
  
     NodeList nList = doc.getElementsByTagName("contact");
  
     for (int temp = 0; temp < nList.getLength(); temp++) {
         Node nNode = nList.item(temp);
       
         if (nNode.getNodeType() == Node.ELEMENT_NODE) {
             Element eElement = (Element) nNode;
			int id7=Integer.parseInt( eElement.getAttribute("id"));

				if(id==id7)
				{
				
				long b=Long.parseLong(eElement.getElementsByTagName("phone").item(0).getTextContent());
				String c=eElement.getElementsByTagName("email").item(0).getTextContent();

				contact.add(new Contact(id7, b, c));
				}
				
				else
                    continue;

			}
		
		}
		return contact;
	 
	
}
}
