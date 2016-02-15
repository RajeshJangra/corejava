package com.xebia.training.EmployeeXMLReader;

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

import com.xebia.training.EmployeeEntities.Project;

public class ProjectData implements Callable<List<Project>> {
	private static final String input = "src/main/java/com/XmlFiles/Project.xml";
	int EmployeeID;
	double projectId;
	String name;
	Date endDate;
	Date startDate;
	private int id;
	int empID;
	int pID;
	String endDate1;

	public ProjectData(int id) {
		super();
		this.id = id;
	}

	@Override
	public List<Project> call() throws Exception {

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

				if (EmployeeID == id) {
					projectId = Double.parseDouble(eElement
							.getElementsByTagName("projectId").item(0)
							.getTextContent());
					name = eElement.getElementsByTagName("name").item(0)
							.getTextContent();
					startDate = new SimpleDateFormat("dd-MM-yyyy")
							.parse(eElement.getElementsByTagName("startDate")
									.item(0).getTextContent());
					endDate1 = eElement.getElementsByTagName("endDate").item(0)
							.getTextContent();

					if (endDate1.isEmpty()) {

						endDate = null;

					} else {
						
						endDate = new SimpleDateFormat("dd-MM-yyyy")
								.parse(endDate1);
						
					}

					Project project1 = new Project(id, projectId, name,
							startDate, endDate);

					
					list.add(project1);

				}

				else {
					break;
				}

			}

		}

		return list;

	}
}
