package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Address;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class AddressInput {
    List<Address> address = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressInput that = (AddressInput) o;
        return address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return address.hashCode();
    }

    public List<Address> inputAddress(final String id) throws IOException, ExecutionException, InterruptedException {
        Callable<List<Address>> callAddress = new Callable<List<Address>>() {
            public List<Address> call() throws Exception {

                File file = new File("src/main/java/com/xebia/training/xmlFiles/AddressData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node node = nodeList.item(temp);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        if (element.getAttribute("id").equalsIgnoreCase(id)) {
                            int houseNo = Integer.parseInt(element.getElementsByTagName("houseNo").item(0).getTextContent());
                            int sector = Integer.parseInt(element.getElementsByTagName("sector").item(0).getTextContent());
                            String street = element.getElementsByTagName("street").item(0).getTextContent();
                            String city = element.getElementsByTagName("city").item(0).getTextContent();
                            String state = element.getElementsByTagName("state").item(0).getTextContent();
                            int pin = Integer.parseInt(element.getElementsByTagName("pin").item(0).getTextContent());
                            String addressType = element.getAttribute("addressType");
                            address.add(new Address(houseNo, sector, street, city, state, pin, Address.AddressType.valueOf(addressType)));

                        }
                    }
                }
                return address;
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<List<Address>> listFuture = executorService.submit(callAddress);
        return listFuture.get();
    }
}
