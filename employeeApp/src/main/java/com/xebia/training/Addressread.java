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

 class Addressread implements Callable<List<Address>> {
    int id;
    List<Address> address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Addressread that = (Addressread) o;

        if (id != that.id) return false;
        return address != null ? address.equals(that.address) : that.address == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public Addressread(int id) {
        this.id = id;
    }

    public List<Address> call() throws Exception {
        try {address=new ArrayList<Address>();
            File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\addressxml.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("employee");

            iterateNodes(nList);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return address;
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


            address.add(new Address(id,
                    Integer.parseInt(eElement.getElementsByTagName("houseno").item(0).getTextContent()),
                    Integer.parseInt(eElement.getElementsByTagName("sector").item(0).getTextContent()),
                    eElement.getElementsByTagName("city").item(0).getTextContent(),
                    Integer.parseInt(eElement.getElementsByTagName("pincode").item(0).getTextContent()),
                    eElement.getElementsByTagName("state").item(0).getTextContent(),
                    eElement.getElementsByTagName("landmark").item(0).getTextContent(),
                    eElement.getElementsByTagName("email_id").item(0).getTextContent(),
                    Address.addresstype.valueOf(eElement.getElementsByTagName("address_type").item(0).getTextContent())));


        }

    }


}

