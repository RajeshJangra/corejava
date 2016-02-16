package com.xebia.training.AbstractData;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.xebia.training.Classes.Project;

public class ProjectAbstractData {
	final String input = "src/main/java/com/XmlFiles/Project.xml";
	int EmployeeID;
	int projectId;
	String name;
	Date endDate = null;
	Date startDate;
	int id;
	int empID;
	int pID;

	public ProjectAbstractData(int empID, int pID) {
		this.empID = empID;
		this.pID = pID;
	}

	public void projectData() throws ParserConfigurationException,
			SAXException, IOException, DOMException, ParseException,
			TransformerException {

		List<Project> list = new ArrayList<Project>();

		File file = new File(input);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("project");
		

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				
				EmployeeID = Integer.parseInt(eElement
						.getAttribute("EmployeeID"));

				if (EmployeeID == empID) {
					projectId = Integer.parseInt(eElement
							.getElementsByTagName("projectId").item(0)
							.getTextContent());
					name = eElement.getElementsByTagName("name").item(0)
							.getTextContent();
					startDate = new SimpleDateFormat("dd-MM-yyyy")
							.parse(eElement.getElementsByTagName("startDate")
									.item(0).getTextContent());
					if (projectId == pID) {
						System.out.println(pID + " " + projectId);
						Date date = new Date();
						SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
						String date3 = ft.format(date);
						
/*
						endDate = new SimpleDateFormat("dd-MM-yyyy")
								.parse(eElement.getElementsByTagName("endDate")
										.item(0).getTextContent());
						if ("endDate".equals(eElement.getNodeName())) {
							eElement.setTextContent(date1);
						}*/
						Element endDate = doc.createElement("endDate");
						endDate.appendChild(doc.createTextNode(date3));
						Node project = doc.getElementsByTagName("project").item(projectId-1);
						project.appendChild(endDate);
						


					} else {
						endDate = null;
					}

					/*
					 * Project project1 = new Project(id, projectId, name,
					 * startDate, endDate);
					 */

					// list.add(project1);
					TransformerFactory transformerFactory = TransformerFactory
							.newInstance();
					Transformer transformer = transformerFactory
							.newTransformer();
					DOMSource source = new DOMSource(doc);
					StreamResult consoleResult = new StreamResult(new File(input));
			         transformer.transform(source, consoleResult);

				}

				else {
					break;
				}

			}

		}

		// return list;

	}

}
