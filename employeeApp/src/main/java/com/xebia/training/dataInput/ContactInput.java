package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Contact;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.*;

public class ContactInput {
    Contact contact = null;

    public Contact inputContact(final String id) throws IOException, ExecutionException, InterruptedException {
        Callable<Contact> callContact = new Callable<Contact>() {
            public Contact call() throws Exception {

                File file = new File("src/main/java/com/xebia/training/xmlFiles/ContactData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node node = nodeList.item(temp);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) node;
                        if (eElement.getAttribute("id").equalsIgnoreCase(id)) {
                            String email = eElement.getElementsByTagName("email").item(0).getTextContent();
                            long phone = Long.parseLong(eElement.getElementsByTagName("phone").item(0).getTextContent());
                            contact = new Contact(phone, email);
                        }
                    }
                }
                return contact;
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Contact> contactFuture = executorService.submit(callContact);
        return contactFuture.get();
    }

}
