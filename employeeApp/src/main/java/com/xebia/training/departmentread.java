package com.xebia.training;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.Callable;

/**
 * Created by mkishore on 2/11/2016.
 */
public class departmentread implements Callable<Department> {
    int id;
    Department depart;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        departmentread that = (departmentread) o;

        if (id != that.id) return false;
        return depart != null ? depart.equals(that.depart) : that.depart == null;

    }
//override
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (depart != null ? depart.hashCode() : 0);
        return result;
    }

    public departmentread(int id) {
        this.id = id;
    }

    public Department call() throws Exception {
        try {depart=new Department();
            File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\departmentxml.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("employee");

            iterateNodes(nList);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return depart;
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


            depart= new Department(Integer.parseInt(eElement.getAttribute("id")), eElement.getElementsByTagName("deptname").item(0).getTextContent(), new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start").item(0).getTextContent()),new EmployeeObjectRead().date);




        }

    }


}
