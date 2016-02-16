package employeeApplication;


import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import employeeApplication.PersonalDetails.MaritalStatus;

@SuppressWarnings("rawtypes")
public class PersonalInput implements Callable{

  private static final String infile="C:/java_prog/corejava/employeeApp/src/main/java/xmlInput/personal.xml";
  int id;
  int EmployeeID;
   int personalDetailsID;
   String adharNO;
   String panNO;
   String bloodGroup;
   MaritalStatus maritalStatus;
   String drivingLicenceNo;
   
   
  public PersonalInput(int iD) {
   super();
   this.id = iD;
  }


  public List<PersonalDetails> call() throws IOException, ParserConfigurationException, SAXException{
    
    List<PersonalDetails> list = new ArrayList<PersonalDetails>();
    
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
          DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
          Document doc = dBuilder.parse(infile);
          doc.getDocumentElement().normalize();
          NodeList nList = doc.getElementsByTagName("personal");
          for (int temp = 0; temp < nList.getLength(); temp++) 
          {
              Node nNode = nList.item(temp);
        
              if (nNode.getNodeType() == Node.ELEMENT_NODE) 
              {
                 Element eElement = (Element) nNode;
     EmployeeID = Integer.parseInt(eElement.getAttribute("EmployeeID"));
    if(EmployeeID == id){
    personalDetailsID =Integer.parseInt(eElement.getElementsByTagName("personalDetailsID").item(0).getTextContent());
    adharNO =eElement.getElementsByTagName("adharNO").item(0).getTextContent();
    panNO =eElement.getElementsByTagName("panNO").item(0).getTextContent();
    bloodGroup =eElement.getElementsByTagName("bloodGroup").item(0).getTextContent();
    maritalStatus = MaritalStatus.valueOf(eElement.getElementsByTagName("maritalStatus").item(0).getTextContent());
    drivingLicenceNo =eElement.getElementsByTagName("drivingLicenceNo").item(0).getTextContent();
    
    PersonalDetails personalDetails = new PersonalDetails(id,personalDetailsID, adharNO, panNO, bloodGroup, maritalStatus, drivingLicenceNo);
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