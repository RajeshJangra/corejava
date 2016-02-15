package com.xebia.training;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EmployeeProjectInput implements Callable<List<EmployeeProject>> {
int id;
List<EmployeeProject> employeeprojectList=new ArrayList<EmployeeProject>();
EmployeeProject employeeProject=null;
public static final String  in="C:/Users/adarshgupta/GIT/corejava/employeeApp/src/main/java/com/xebia/xmlfiles/employeeProject.xml";

	public EmployeeProjectInput(int id) {
	super();
	this.id = id;
}

	
	
	public List<EmployeeProject> call() throws Exception {
		int id1,pid;
		String pname;
		Date startDate,endDate;
		File file=new File(in);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc =   dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("project");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				id1 = Integer.parseInt(eElement.getAttribute("id"));
				pid= Integer.parseInt(eElement.getElementsByTagName("pid").item(0).getTextContent());
				pname= eElement.getElementsByTagName("pname").item(0).getTextContent();
				startDate=new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startDate").item(0).getTextContent());
				//endDate=new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("endDate").item(0).getTextContent());
				employeeProject=new EmployeeProject(id1,pid,pname,startDate,null);
				employeeprojectList.add(employeeProject);
			} else {
				break;
			}
		}
		return employeeprojectList;
	}

}

/*

FileReader in = new FileReader("e:/employeeProject.txt");
		BufferedReader br=new BufferedReader(in);
		String line;
		while((line=br.readLine())!=null){
			StringTokenizer str=new StringTokenizer(line);
			while(str.hasMoreTokens()){
				id1=Integer.parseInt(str.nextToken(","));
				employeeProject=new EmployeeProject(id1,Integer.parseInt(str.nextToken(",")),str.nextToken(","),
						new SimpleDateFormat("dd-MM-yyyy").parse(str.nextToken(",")),new SimpleDateFormat("dd-MM-yyyy").parse(str.nextToken(",")));				
				if(id==id1){
					employeeprojectList.add(employeeProject);
					
				}
				else{
					continue;
				}
				
				}
			}
		for(EmployeeProject p:employeeprojectList){
			System.out.println(p);

		}
		br.close();

*/