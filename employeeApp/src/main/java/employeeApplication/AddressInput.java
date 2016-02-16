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

import employeeApplication.Address.AddressType;

@SuppressWarnings("rawtypes")
public class AddressInput implements Callable {
 public static final String infile="C:/java_prog/corejava/employeeApp/src/main/java/xmlInput/Address.xml";
  double ContactId;
  AddressType addressType;
  int id;
  int EmployeeId;
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
 

 public AddressInput(int employeeId) {
  super();
  this.EmployeeId = employeeId;
 }
 
 public List<Address> call() throws IOException, ParserConfigurationException, SAXException{
  List<Address> list = new ArrayList<Address>();
   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(infile);
         doc.getDocumentElement().normalize();
         NodeList nList = doc.getElementsByTagName("address");
         for (int temp = 0; temp < nList.getLength(); temp++) 
         {
             Node nNode = nList.item(temp);
       
             if (nNode.getNodeType() == Node.ELEMENT_NODE) 
             {
                Element eElement = (Element) nNode;
    id = Integer.parseInt(eElement.getAttribute("id"));
    if(EmployeeId == id){
    ContactId = Double.parseDouble(eElement.getElementsByTagName("ContactId").item(0).getTextContent());
    addressType = AddressType.valueOf(eElement.getElementsByTagName("addressType").item(0).getTextContent());
    houseNo = Integer.parseInt(eElement.getElementsByTagName("houseNo").item(0).getTextContent());
    street =eElement.getElementsByTagName("street").item(0).getTextContent();
    area =eElement.getElementsByTagName("area").item(0).getTextContent();
    city =eElement.getElementsByTagName("city").item(0).getTextContent();
    pinCode =Integer.parseInt(eElement.getElementsByTagName("pinCode").item(0).getTextContent());
    state = eElement.getElementsByTagName("state").item(0).getTextContent();
    landmark = eElement.getElementsByTagName("landmark").item(0).getTextContent();
    phoneNo = Double.parseDouble(eElement.getElementsByTagName("phoneNo").item(0).getTextContent());
    email =eElement.getElementsByTagName("email").item(0).getTextContent();
    skypeid =eElement.getElementsByTagName("skypeid").item(0).getTextContent();
    
    Address address = new Address(id,ContactId, houseNo, street, area, city, pinCode, state, landmark, phoneNo, email, skypeid,addressType);
    list.add(address);
    }
    else{
     break;
    }
   }
  }
  return list;
 }


}