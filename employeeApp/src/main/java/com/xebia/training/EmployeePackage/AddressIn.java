package com.xebia.training.EmployeePackage;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

class AddressIn implements Callable<Address> {
    int id;

   Address address;
  AddressIn(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddressIn{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressIn addressIn = (AddressIn) o;

        if (id != addressIn.id) return false;
        return !(address != null ? !address.equals(addressIn.address) : addressIn.address != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public Address call() {

        try {
            File file = new File("C:\\Users\\pjhanwan\\corejava\\employeeApp\\src\\main\\java\\com\\xebia\\training\\EmployeePackage\\address.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();
          //  System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("employee");
//            System.out.println("----------------------------");
            iterateNodes(nList);
        } catch (Exception e) {
            e.printStackTrace();
        } return address;
    }

    private void iterateNodes(final NodeList nList) throws ParseException {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
//            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                printElements((Element) nNode);
            }
        }
    }

    private  void printElements(final Element nNode) throws ParseException {
        Element eElement = nNode;

        if(Integer.parseInt(eElement.getAttribute("id")) == id){

           address= new Address(id, Address.Address_type.valueOf(eElement.getElementsByTagName("address_type").item(0).getTextContent()),Integer.parseInt(eElement.getElementsByTagName("house_no").item(0).getTextContent()),
                    eElement.getElementsByTagName("streetApartment").item(0).getTextContent(), eElement.getElementsByTagName("city").item(0).getTextContent(),
                    eElement.getElementsByTagName("pincode").item(0).getTextContent(),eElement.getElementsByTagName("state").item(0).getTextContent(),eElement.getElementsByTagName("area").item(0).getTextContent());


        }

    }
}
