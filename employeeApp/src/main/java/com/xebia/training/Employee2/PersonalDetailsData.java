package com.xebia.training.Employee2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.xebia.training.Employee1.PersonalDetails;
import com.xebia.training.Employee1.PersonalDetails.MarritalStatus;

public class PersonalDetailsData implements Callable<List<PersonalDetails>> {
	private static final String input="/home/jasleen/corejava/employeeApp/src/main/java/com/XmlFiles/PersonalDetails.xml";
	int id;
	 int personalDetailsID;
	 String adharNO;
	 String panNO;
	 String bloodGroup;
	 MarritalStatus marritalStatus;
	 String drivingLicenceNo;
	 int EmployeeID;
	 
	


	public PersonalDetailsData(int employeeID) {
		super();
		EmployeeID = employeeID;
	}




	
	@Override
	public List<PersonalDetails> call() throws Exception {
		List<PersonalDetails> list = new ArrayList<>();
		File file = new File(input);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("PersonalDetails");
        for (int temp = 0; temp < nList.getLength(); temp++){
        	
      	  Node nNode = nList.item(temp);
           
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          	  Element eElement = (Element) nNode;
          	  
			id = Integer.parseInt(eElement.getAttribute("id"));
			if(EmployeeID == id){
			personalDetailsID = Integer.parseInt(eElement.getElementsByTagName("personalDetailsID").item(0).getTextContent());
			adharNO = eElement.getElementsByTagName("adharNO").item(0).getTextContent();
			panNO = eElement.getElementsByTagName("panNO").item(0).getTextContent();
			bloodGroup = eElement.getElementsByTagName("bloodGroup").item(0).getTextContent();
			marritalStatus = MarritalStatus.valueOf(eElement.getElementsByTagName("marritalStatus").item(0).getTextContent());
			drivingLicenceNo = eElement.getElementsByTagName("drivingLicenceNo").item(0).getTextContent();
			
			PersonalDetails personalDetails = new PersonalDetails(id,personalDetailsID, adharNO, panNO, bloodGroup, marritalStatus, drivingLicenceNo);
			list.add(personalDetails);
			}
			else{
				break;
			}
			
			}
		}
		return list;
		
	}

}
