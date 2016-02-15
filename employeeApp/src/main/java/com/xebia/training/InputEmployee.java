package com.xebia.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class InputEmployee {
	
	static String ine="/Users/spurwar/corejava/employeeApp/src/main/java/xmlfile/employee.xml";
	
	
	
    public static void InputEmp() throws InterruptedException, ExecutionException, ParserConfigurationException, SAXException, IOException
    {
    	
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter id");
    	int id=sc.nextInt();
    	
    	
    		
    					ArrayList<Project> project=new ArrayList<Project>();
    					
    					ThreadPoolExecutor executor1= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    					InputSalary obj=new InputSalary(id);
    					FutureTask<List<Salary>> task= (FutureTask<List<Salary>>) executor1.submit(obj);
    					List<Salary> salary1=task.get();
    					
    					
    					ThreadPoolExecutor executor2= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    					InputDepartment obj1=new InputDepartment(id);
    					FutureTask<List<Department>> task1= (FutureTask<List<Department>>) executor2.submit(obj1);
    					List<Department> department1=task1.get();
    					
    					
    					
    					ThreadPoolExecutor executor3= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    					InputProject obj2=new InputProject(id);
    					FutureTask<List<Project>> task2= (FutureTask<List<Project>>) executor3.submit(obj2);
    					List<Project> project1=task2.get();
    					
    					ThreadPoolExecutor executor4= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    					InputContact obj3=new InputContact(id);
    					FutureTask<List<Contact>> task3= (FutureTask<List<Contact>>) executor4.submit(obj3);
    					List<Contact> contact1=task3.get();
    					
    					ThreadPoolExecutor executor5= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    					InputAddress obj4=new InputAddress(id);
    					FutureTask<List<Address>> task4= (FutureTask<List<Address>>) executor5.submit(obj4);
    					List<Address> address1=task4.get();
    					
    					
    					ThreadPoolExecutor executor6= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    					InputPersonaldetails obj5=new InputPersonaldetails(id);
    					FutureTask<List<PersonalDetails>> task5= (FutureTask<List<PersonalDetails>>) executor6.submit(obj5);
    					List<PersonalDetails> personaldetails1=task5.get();
    	
    	
    	int i=0;
   	 Employee[] emp=new Employee[3];
   				 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
   			     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
   			  
   			     Document doc = dBuilder.parse(ine);
   			  
   			     doc.getDocumentElement().normalize();
   			   
   			     NodeList nList = doc.getElementsByTagName("employee");
   			 
   			     for (int temp = 0; temp < nList.getLength(); temp++) {
   			         Node nNode = nList.item(temp);
   			     
   			         if (nNode.getNodeType() == Node.ELEMENT_NODE) {
   			             Element eElement = (Element) nNode;
   						int ide=Integer.parseInt( eElement.getAttribute("id"));				
   						if(id==ide)
   						{

   							
   						int work=Integer.parseInt(eElement.getElementsByTagName("work_exp").item(0).getTextContent());	
   							String des=eElement.getElementsByTagName("designation").item(0).getTextContent();
   							
   							 emp[i]=new Employee(ide, work,Employee.designation.valueOf( des),salary1,department1,project1,contact1,address1,personaldetails1);							
   							System.out.println(emp[i]);
   						}
   						else
   							
   						
   				           continue;
   					}
   					
   				}
   				
    	
    
    }
}
