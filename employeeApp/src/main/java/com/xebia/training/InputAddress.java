package com.xebia.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.xebia.training.Address.addressType;

public class InputAddress implements Callable<List<Address>> {

	String line;
	int id;
	final String in1="/Users/spurwar/corejava/employeeApp/src/main/java/xmlfile/address.xml";
	
	public InputAddress(int id) {
		super();
		this.id = id;
	}
	
	 public List<Address> call()throws NumberFormatException, IOException, ParserConfigurationException, SAXException{
	 
		 ArrayList<Address> address=new ArrayList<Address>();
		 
			
		 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	  
	     Document doc = dBuilder.parse(in1);
	   
	     doc.getDocumentElement().normalize();
	  
	     NodeList nList = doc.getElementsByTagName("address");
	 
	     for (int temp = 0; temp < nList.getLength(); temp++) {
	         Node nNode = nList.item(temp);
	       //  System.out.println("\nCurrent Element :" + nNode.getNodeName());
	         if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	             Element eElement = (Element) nNode;
				int id2=Integer.parseInt( eElement.getAttribute("id"));				
				if(id==id2)
				{

					
					String sec=eElement.getElementsByTagName("sector").item(0).getTextContent();
					String cit=eElement.getElementsByTagName("city").item(0).getTextContent();
					String sta=eElement.getElementsByTagName("state").item(0).getTextContent();


					int ho=Integer.parseInt(eElement.getElementsByTagName("houseno").item(0).getTextContent());

					int pin=Integer.parseInt(eElement.getElementsByTagName("pin").item(0).getTextContent());
					
					String str= eElement.getElementsByTagName("street").item(0).getTextContent();

					addressType ty= addressType.valueOf(eElement.getElementsByTagName("addtype").item(0).getTextContent());

					address.add(new Address(id2, sec, cit, sta, ho, pin, str, ty));
					
				}
				else
		            continue;
			}
			
		}
		return address;

		 
	 }
}
	

