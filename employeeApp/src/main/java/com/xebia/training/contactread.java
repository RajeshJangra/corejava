package com.xebia.training;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by mkishore on 2/11/2016.
 */
public class contactread implements Callable<List<Contact>>{
    int id;
    List<Contact> contact=new ArrayList<Contact>();
    public contactread(int id)
    {
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        contactread that = (contactread) o;

        if (id != that.id) return false;
        return contact != null ? contact.equals(that.contact) : that.contact == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        return result;
    }

    public List<Contact> call() throws Exception {
    try {
        File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\contactxml.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("employee");

        iterateNodes(nList);





    } catch (Exception e) {
        e.printStackTrace();
    }
        return contact;

}

    private void iterateNodes(final NodeList nList) {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);


            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                printElements((Element) nNode);

            }
        }
    }

    private void printElements(final Element nNode) {
        Element eElement = nNode;

        if (Integer.parseInt(eElement.getAttribute("id")) == id) {

            contact.add(new Contact(Integer.parseInt(eElement.getAttribute("id")), eElement.getElementsByTagName("emailid").item(0).getTextContent(), Long.parseLong(eElement.getElementsByTagName("phone").item(0).getTextContent())));

        }
    }



}
