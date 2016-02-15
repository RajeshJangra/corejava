package com.xebia.training.EmployeePackage;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.Callable;

class PersonalIn implements Callable <PersonalDetails>{
    int id;
 PersonalDetails personalDetails;
    PersonalIn(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonalIn{" +
                "id=" + id +
                ", personalDetails=" + personalDetails +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalIn that = (PersonalIn) o;

        if (id != that.id) return false;
        return !(personalDetails != null ? !personalDetails.equals(that.personalDetails) : that.personalDetails != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personalDetails != null ? personalDetails.hashCode() : 0);
        return result;
    }

    public PersonalDetails call() {

        try {
            File file = new File("C:\\Users\\pjhanwan\\corejava\\employeeApp\\src\\main\\java\\com\\xebia\\training\\EmployeePackage\\personal.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();
          //  System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("employee");
   //         System.out.println("----------------------------");
            iterateNodes(nList);
        } catch (Exception e) {
            e.printStackTrace();
        }return personalDetails;
    }

    private void iterateNodes(final NodeList nList) {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
           // System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) printElements((Element) nNode);
        }
    }

    private  void printElements(final Element nNode) {
        Element eElement = nNode;
        if (Integer.parseInt(eElement.getAttribute("id")) == id) {
           personalDetails= new PersonalDetails(id,eElement.getElementsByTagName("adharNo").item(0).getTextContent(),eElement.getElementsByTagName("panNo").item(0).getTextContent(),eElement.getElementsByTagName("bloodGroup").item(0).getTextContent(),
                    eElement.getElementsByTagName("electionId").item(0).getTextContent(),eElement.getElementsByTagName("licenceNo").item(0).getTextContent());

        }
    }
}
