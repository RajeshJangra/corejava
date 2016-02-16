package com.xebia.training.Employee2;

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

import com.xebia.training.Employee1.Salary;

public class SalaryData implements Callable<List<Salary>> {
	public int id;
	public double salaryId;
	public double basic;

	public double HRA;
	public double DA;

	public double LTA;
	public double FP;
	public double gratvity;
	public int EmployeeId;
	public static final String input = "/home/jasleen/corejava/employeeApp/src/main/java/com/XmlFiles/Salary.xml";

	public SalaryData(int employeeId) {
		super();
		EmployeeId = employeeId;
	}

	@Override
	public String toString() {
		return "[basic=" + basic + ", HRA=" + HRA + ", DA=" + DA + ", LTA="
				+ LTA + ", FP=" + FP + ", gratvity=" + gratvity + "]";
	}

	@Override
	public List<Salary> call() throws Exception {
		List<Salary> list = new ArrayList<>();
		File file = new File(input);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("salary");
		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				id = Integer.parseInt(eElement.getAttribute("id"));
				if (EmployeeId == id) {

					salaryId = Integer.parseInt(eElement
							.getElementsByTagName("salaryId").item(0)
							.getTextContent());
					basic = Double.parseDouble(eElement
							.getElementsByTagName("basic").item(0)
							.getTextContent());

					Salary salary = new Salary(id, salaryId, basic);
					list.add(salary);
				} else {
					break;
				}
			}

		}
		return list;
	}

}
