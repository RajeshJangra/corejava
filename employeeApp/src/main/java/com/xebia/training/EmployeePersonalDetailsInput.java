package com.xebia.training;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//import java.util.Date;


public class EmployeePersonalDetailsInput implements Callable<List<EmployeePersonalDetails>> {
	int id;
	List<EmployeePersonalDetails> employeePersonalDetailsList=new ArrayList<EmployeePersonalDetails>();
	public static final String  in="C:/Users/adarshgupta/GIT/corejava/employeeApp/src/main/java/com/xebia/xmlfiles/employeePersonalDetails.xml";
	EmployeePersonalDetails employeePersonalDetails=null;
	public EmployeePersonalDetailsInput(int id) {
		super();
		this.id = id;
	}
	
	public List<EmployeePersonalDetails> call() throws Exception {
		
		File file=new File(in);
		int id1;
		int age;
		String name,fathername,maritalStatus,passport,aadhar,bloodgroup,gender;
		Date dob;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc =   dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
		NodeList nList = doc.getElementsByTagName("PersonalDetails");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				id1 = Integer.parseInt(eElement.getAttribute("id"));
				name=eElement.getElementsByTagName("name").item(0).getTextContent();
				fathername=eElement.getElementsByTagName("fathername").item(0).getTextContent();
				age=Integer.parseInt(eElement.getElementsByTagName("age").item(0).getTextContent());
				dob=new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("dob").item(0).getTextContent());
				maritalStatus=eElement.getElementsByTagName("maritalStatus").item(0).getTextContent();
				passport=eElement.getElementsByTagName("passport").item(0).getTextContent();
				aadhar=eElement.getElementsByTagName("aadhar").item(0).getTextContent();
				bloodgroup=eElement.getElementsByTagName("bloodgroup").item(0).getTextContent();
				gender=eElement.getElementsByTagName("gender").item(0).getTextContent();
				employeePersonalDetails=new EmployeePersonalDetails(id1,name,fathername,age,dob,maritalStatus,passport,aadhar,bloodgroup,gender);
				employeePersonalDetailsList.add(employeePersonalDetails);
			
			} else {
				break;
			}
		}
		
				return employeePersonalDetailsList;
	}

}

/*

String line4=null;
		int id1=0;
		EmployeePersonalDetails employeePersonalDetails=null;
		FileReader in=new FileReader("e:/Employeepersonaldetails.txt");
		BufferedReader brr1=new BufferedReader(in);
		while((line4=brr1.readLine())!=null){
			StringTokenizer strrr1=new StringTokenizer(line4,",");
			while(strrr1.hasMoreTokens()){
				id1=Integer.parseInt(strrr1.nextToken(","));
				employeePersonalDetails=new EmployeePersonalDetails(id1,strrr1.nextToken(","),strrr1.nextToken(","),
						Integer.parseInt(strrr1.nextToken(",")),new SimpleDateFormat("dd-MM-yyyy").parse(strrr1.nextToken(",")),strrr1.nextToken(","),
						strrr1.nextToken(","),strrr1.nextToken(","),strrr1.nextToken(","),strrr1.nextToken(","));
				if(id==id1){
					  employeePersonalDetailsList.add(employeePersonalDetails);
				  }
				  else{
					  break;
					  
				  }
				 for(EmployeePersonalDetails emp:employeePersonalDetailsList){
					  System.out.println(emp);
			}
			}
		}
		brr1.close();


*/