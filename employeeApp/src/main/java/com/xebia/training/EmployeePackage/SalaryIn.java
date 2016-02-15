package com.xebia.training.EmployeePackage;
import com.xebia.training.EmployeePackage.Salary;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.Callable;

public class SalaryIn implements Callable <Salary> {
    int id;
    Salary salary;

    SalaryIn(int id) {
        this.id = id;
    }

    public Salary call() {

        try {
            File file = new File("C:\\Users\\pjhanwan\\corejava\\employeeApp\\src\\main\\java\\com\\xebia\\training\\EmployeePackage\\salary.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();
           // System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("employee");
           //Y
            // System.out.println("----------------------------");
            iterateNodes(nList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return salary;
    }

    private void iterateNodes(final NodeList nList) {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
           // System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) printElements((Element) nNode);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryIn salaryIn = (SalaryIn) o;

        if (id != salaryIn.id) return false;
        return !(salary != null ? !salary.equals(salaryIn.salary) : salaryIn.salary != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }

    private void printElements(final Element nNode) {
        Element eElement = nNode;

        if (id == Integer.parseInt(eElement.getAttribute("id"))) {
            salary = new Salary(Integer.parseInt(eElement.getAttribute("id")), Double.parseDouble(eElement.getElementsByTagName("basic").item(0).getTextContent()));
             //System.out.println("aayi"+salary);

        }
    }
}