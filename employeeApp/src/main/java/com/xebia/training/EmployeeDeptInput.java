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


public class EmployeeDeptInput implements Callable<List<EmployeeDept>>  {
	public int id;
	List<EmployeeDept> employeeDeptList=new ArrayList<EmployeeDept>();
	EmployeeDept employeeDept=null;
	public static final String  in="C:/Users/adarshgupta/GIT/corejava/employeeApp/src/main/java/com/xebia/xmlfiles/employeeDept.xml";
	public EmployeeDeptInput(int id) {
		this.id = id;
	}


	public List<EmployeeDept> call() throws Exception {
		File file=new File(in);
		int id1;
		String name;
		Date startDate,endDate;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc =   dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
		NodeList nList = doc.getElementsByTagName("Department");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				
				id1 = Integer.parseInt(eElement.getAttribute("id"));
				name = eElement.getElementsByTagName("name").item(0).getTextContent();
				startDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startDate").item(0).getTextContent());
				endDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("endDate").item(0).getTextContent());
				employeeDept=new EmployeeDept(id1,name,startDate,endDate);
				employeeDeptList.add(employeeDept);
			} else {
				break;
			}
		}
		//System.out.println(employeeDeptList);
		return employeeDeptList;
	}





}

/*	String line7;
int id1=0;
FileReader in=new FileReader("e:/employeeDept.txt");
BufferedReader br1=new BufferedReader(in);
while((line7=br1.readLine())!=null){
	StringTokenizer sttn1=new StringTokenizer(line7,",");
	while(sttn1.hasMoreTokens()){
		id1=Integer.parseInt((sttn1.nextToken(",")));
		employeeDept=new EmployeeDept(id1,sttn1.nextToken(","),new SimpleDateFormat("dd-MM-yyyy").parse(sttn1.nextToken(",")),
				new SimpleDateFormat("dd-MM-yyyy").parse(sttn1.nextToken(",")));
		if(id==id1){
			employeeDeptList.add(employeeDept);
		}else{
			break;
		}
		for(EmployeeDept empdept:employeeDeptList){
			System.out.println(empdept);
		}
	}
}
br1.close();*/