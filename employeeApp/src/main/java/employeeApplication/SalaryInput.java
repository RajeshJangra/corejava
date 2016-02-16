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

@SuppressWarnings("rawtypes")
public class SalaryInput implements Callable{
  int id,EmployeeId;
  double salaryId;
  double basic;
  double HRA;
  double DA;
  double LTA;
  double FP;
  double gratvity;
 public static final String inputFile = "C:/java_prog/corejava/employeeApp/src/main/java/xmlInput/salary.xml";



 public SalaryInput(int employeeId) {
  super();
  this.EmployeeId = employeeId;
 }


   
 public List<Salary> call() throws IOException, SAXException, ParserConfigurationException {
  
  List<Salary> list = new ArrayList<Salary>();
   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         NodeList nList = doc.getElementsByTagName("salary");
         for (int temp = 0; temp < nList.getLength(); temp++) 
         {
             Node nNode = nList.item(temp);
       
             if (nNode.getNodeType() == Node.ELEMENT_NODE) 
             {
                Element eElement = (Element) nNode;
                id = Integer.parseInt(eElement.getAttribute("id"));
    
                if(EmployeeId == id)
    {
    salaryId = Integer.parseInt(eElement.getElementsByTagName("salaryId").item(0).getTextContent());
    basic = Double.parseDouble( eElement.getElementsByTagName("basic").item(0).getTextContent());

    Salary salary = new Salary(id,salaryId, basic);
    list.add(salary);
    }
    
    else{
     break;
    }
             }
    
  }
  return list;

 }

}