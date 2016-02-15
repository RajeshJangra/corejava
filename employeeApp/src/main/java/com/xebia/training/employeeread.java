package com.xebia.training;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;


public class employeeread implements Callable<EmployeeData>{
    int id;
    EmployeeData employee;

    public employeeread(int id) {
        this.id = id;
    }

    public EmployeeData call() throws Exception {


        try {
            File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\employeexml.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("employee");

            iterateNodes(nList);



            //    System.out.println(employee);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }

    private void iterateNodes(final NodeList nList) throws IOException, InterruptedException {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);


            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                printElements((Element) nNode);

            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        employeeread that = (employeeread) o;

        if (id != that.id) return false;
        return employee != null ? employee.equals(that.employee) : that.employee == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (employee != null ? employee.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "employeeread{" +
                "id=" + id +
                ", employee=" + employee +
                '}';
    }

    private void printElements(final Element nNode) throws IOException, InterruptedException {
        Element eElement = nNode;

        if (Integer.parseInt(eElement.getAttribute("id")) == id) {



            employee=new EmployeeData(id,
                    Integer.parseInt(eElement.getElementsByTagName("experience").item(0).getTextContent()),
                    EmployeeData.designation.valueOf(eElement.getElementsByTagName("designation").item(0).getTextContent()));



        }

    }

}
