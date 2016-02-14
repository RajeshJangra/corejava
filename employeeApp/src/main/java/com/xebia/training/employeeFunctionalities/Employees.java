package com.xebia.training.employeeFunctionalities;

import com.xebia.training.dataInput.EmployeeInput;
import com.xebia.training.employeeInformation.Employee;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@XmlRootElement(name = "employees")
public class Employees {
    private List<Employee> employeeList = new ArrayList<>();

    public Employees(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employees() {
    }

    @XmlElement(name = "employee")
    public List<Employee> getEmployees() {
        return employeeList;
    }

    public void setEmployees(final List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Employees{" + employeeList +
                '}';
    }

    public List<Employee> inputAllEmployees() throws ParserConfigurationException, IOException, SAXException, ExecutionException, InterruptedException {
        File file = new File("src/main/java/com/xebia/training/xmlFiles/EmployeeData.xml");
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
        document.getDocumentElement().normalize();
        NodeList nodeList = document.getElementsByTagName("employee");
        for (int temp = 0; temp < nodeList.getLength(); temp++) {
            Node node = nodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String id = element.getAttribute("id");
                Employee employee = new EmployeeInput().inputEmployeeDetails(id);
                employeeList.add(employee);
            }
        }
        return employeeList;

    }
}
