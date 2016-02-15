package com.xebia.training.EmployeePackage;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.Callable;

class ContactsIn implements Callable<Contacts>{
    int id;
    Contacts contacts;
    public ContactsIn(int id)
    {
        this.id=id;
    }

  @Override
    public String toString() {
        return "ContactsIn{" +
                "id=" + id +
                ", contacts=" + contacts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactsIn that = (ContactsIn) o;

        if (id != that.id) return false;
        return !(contacts != null ? !contacts.equals(that.contacts) : that.contacts != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
        return result;
    }

    public Contacts call(){

        try {
            File file = new File("C:\\Users\\pjhanwan\\corejava\\employeeApp\\src\\main\\java\\com\\xebia\\training\\EmployeePackage\\contacts.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();
          //  System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("employee");
//            System.out.println("----------------------------");
            iterateNodes(nList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contacts;
    }

    private void iterateNodes(final NodeList nList) {
        for (int temp = 0; temp < nList.getLength(); temp++) {
          Node nNode = nList.item(temp);
//            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) printElements((Element) nNode);
        }
    }

    private  void printElements(final Element nNode) {
        Element eElement = nNode;
//        System.out.println("Employee id : " + eElement.getAttribute("id"));
//        System.out.println("phone_no : " + eElement.getElementsByTagName("phone_no").item(0).getTextContent());
//        System.out.println("mail_id : " + eElement.getElementsByTagName("mail_id").item(0).getTextContent());
        if (Integer.parseInt(eElement.getAttribute("id")) == id) {
          contacts  = new Contacts(id, Integer.parseInt(eElement.getElementsByTagName("phone_no").item(0).getTextContent()),
                    eElement.getElementsByTagName("mail_id").item(0).getTextContent());

        }


    }
}
