package com.xebia.training.Employee2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.xebia.training.Employee1.ContactDetails;
import com.xebia.training.Employee1.ContactDetails.AddressType;

public class ContactDetailsData implements Callable<List<ContactDetails>>{
	public static final String input="src/main/java/com/XmlFiles/ContactDetails.xml";
	 double ContactId;
	 AddressType addressType;
	 int id;
	 int houseNo;
	 String street;
	 String area;
	 String city;
	 double pinCode;
	 String state;
	 String landmark;
	 double phoneNo;
	 String email;
	 String skypeid;
	 int EmployeeId;
	 




	public ContactDetailsData(int employeeId) {
		super();
		EmployeeId = employeeId;
	}





	@Override
	public List<ContactDetails> call() throws Exception {
		List<ContactDetails> list = new ArrayList<ContactDetails>();
		File file = new File(input);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("contactDetails");
        for (int temp = 0; temp < nList.getLength(); temp++){
        	
      	  Node nNode = nList.item(temp);
           
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          	  Element eElement = (Element) nNode;
          	  
		
		
		
		
				id = Integer.parseInt(eElement.getAttribute("id"));
				if(EmployeeId == id){
				ContactId = Double.parseDouble(eElement.getElementsByTagName("ContactId").item(0).getTextContent());
				addressType = AddressType.valueOf(eElement.getElementsByTagName("addressType").item(0).getTextContent());
				houseNo = Integer.parseInt(eElement.getElementsByTagName("houseNo").item(0).getTextContent());
				street = eElement.getElementsByTagName("street").item(0).getTextContent();
				area = eElement.getElementsByTagName("area").item(0).getTextContent();
				city = eElement.getElementsByTagName("city").item(0).getTextContent();
				pinCode = Double.parseDouble(eElement.getElementsByTagName("pinCode").item(0).getTextContent());
				state = eElement.getElementsByTagName("state").item(0).getTextContent();
				landmark = eElement.getElementsByTagName("landmark").item(0).getTextContent();
				phoneNo = Double.parseDouble(eElement.getElementsByTagName("phoneNo").item(0).getTextContent());
				email = eElement.getElementsByTagName("email").item(0).getTextContent();
				skypeid = eElement.getElementsByTagName("skypeid").item(0).getTextContent();
				
				ContactDetails contactDetails = new ContactDetails(id,ContactId, houseNo, street, area, city, pinCode, state, landmark, phoneNo, email, skypeid,addressType);
				list.add(contactDetails);
				}
				else{
					break;
				}
			}
		}
		return list;
	}

}
