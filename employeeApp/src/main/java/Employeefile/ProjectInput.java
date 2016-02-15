package Employeefile;

import java.io.*;
import java.text.*;
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
public class ProjectInput implements Callable{
	private static final String infile = "C:/Users/Administrator/corejava/employeeApp/src/main/java/Xml/project.xml";
	int EmployeeID,id;
	double projectId;
	String name;
	Date endDate;
	Date startDate;

	
	public ProjectInput(int id) {
		super();
		this.id = id;
	}


	public List<Project> call() throws IOException, ParseException, ParserConfigurationException, SAXException {
		 
		 List<Project> list = new ArrayList<Project>();
		 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(infile);
         doc.getDocumentElement().normalize();
         NodeList nList = doc.getElementsByTagName("project");
         for (int temp = 0; temp < nList.getLength(); temp++) 
         {
             Node nNode = nList.item(temp);
       
             if (nNode.getNodeType() == Node.ELEMENT_NODE) 
             {
                Element eElement = (Element) nNode;
				EmployeeID = Integer.parseInt(eElement.getAttribute("EmployeeID"));
				if (EmployeeID == id) {
					projectId = Double.parseDouble(eElement.getElementsByTagName("projectId").item(0).getTextContent());
					name = eElement.getElementsByTagName("name").item(0).getTextContent();
					startDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("startDate").item(0).getTextContent());
					endDate = null;
					Project project1 = new Project(id, projectId, name,startDate, endDate);

					list.add(project1);

				} 

			}

		}
		return list;

	}
}
