package com.xebia.training;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by mkishore on 2/10/2016.
 */
public class salaryread implements Callable<Salary>{
    int id;
    Salary salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        salaryread that = (salaryread) o;

        if (id != that.id) return false;
        return salary != null ? salary.equals(that.salary) : that.salary == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }

    public salaryread(int id) {
        this.id = id;
    }

    public Salary call() throws Exception {
        try {salary=new Salary();
            File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\salaryxml.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("employee");

            iterateNodes(nList);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return salary;
    }

    private void iterateNodes(final NodeList nList) throws ParseException {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);


            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                printElements((Element) nNode);

            }
        }
    }

    private void printElements(final Element nNode) throws ParseException {
        Element eElement = nNode;

        if (Integer.parseInt(eElement.getAttribute("id")) == id) {


salary=new Salary(id, Integer.parseInt(eElement.getElementsByTagName("basic").item(0).getTextContent()));


        }

    }

}



