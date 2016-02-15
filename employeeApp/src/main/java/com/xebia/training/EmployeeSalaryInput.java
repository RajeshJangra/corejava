package com.xebia.training;

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

//import com.xebia.training.*;

public class EmployeeSalaryInput implements Callable<List<EmployeeSalary>> {
	int id;
	EmployeeSalary employeeSalary=null;
	public static final String  in="C:/Users/adarshgupta/GIT/corejava/employeeApp/src/main/java/com/xebia/xmlfiles/employeeSalary.xml";

	public EmployeeSalaryInput(int id) {
		super();
		this.id = id;
	}
	
	List<EmployeeSalary> employeeSalaryList=new ArrayList<EmployeeSalary>();
	public List<EmployeeSalary> call() throws Exception {
		File file=new File(in);
		double basic;
		int id1;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		  Document doc =   dBuilder.parse(file);
		  doc.getDocumentElement().normalize();
		  NodeList nList = doc.getElementsByTagName("salary");
		  for (int temp = 0; temp < nList.getLength(); temp++) {

			   Node nNode = nList.item(temp);

			   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			    Element eElement = (Element) nNode;
			    id1 = Integer.parseInt(eElement.getAttribute("id"));
			    if (id1== id) {
			     basic = Double.parseDouble(eElement.getElementsByTagName("basic").item(0).getTextContent());

			     EmployeeSalary employeeSalary = new EmployeeSalary(id,basic);
			    employeeSalaryList.add(employeeSalary);
			    //System.out.println(employeeSalary);
			    } else {
			     break;
			    }
			   }

			  }
		  

		return employeeSalaryList;

	}
}
/*	String line5=null;
int id1=0;
double basics=0.0;
FileReader in=new FileReader("e:/employeeSalary.txt");
BufferedReader bfrr1=new BufferedReader(in);
while((line5=bfrr1.readLine())!=null){
	StringTokenizer strrrr1=new StringTokenizer(line5,",");
	while(strrrr1.hasMoreTokens()){
		id1=Integer.parseInt(strrrr1.nextToken(","));
		basics=Double.parseDouble(strrrr1.nextToken(","));
		employeeSalary=new EmployeeSalary(id1,basics);
		employeeSalary=new EmployeeSalary(id1,Double.parseDouble(strrrr1.nextToken(",")),Double.parseDouble(strrrr1.nextToken(",")),
				Double.parseDouble(strrrr1.nextToken(",")),Double.parseDouble(strrrr1.nextToken(",")),Double.parseDouble(strrrr1.nextToken(",")),
				Double.parseDouble(strrrr1.nextToken(",")),Double.parseDouble(strrrr1.nextToken(",")));
		if(id==id1){
			employeeSalaryList.add(employeeSalary);
		}
		else{
			break;
		}
		for(EmployeeSalary sal:employeeSalaryList){
			System.out.println(sal);
		}
	}
}

bfrr1.close();*/