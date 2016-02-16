package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.PersonalDetails;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.*;

public class PersonalDetailsInput {
    PersonalDetails personalDetails = null;

    public PersonalDetails inputPersonalDetails(final String id) throws IOException, ParseException, ExecutionException, InterruptedException {
        Callable<PersonalDetails> callPersonalDetails = new Callable<PersonalDetails>() {
            public PersonalDetails call() throws Exception {
                File file = new File("src/main/java/com/xebia/training/xmlFiles/PersonalDetailsData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node node = nodeList.item(temp);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) node;
                        if (eElement.getAttribute("id").equalsIgnoreCase(id)) {
                            String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                            String fatherName = eElement.getElementsByTagName("fatherName").item(0).getTextContent();
                            String motherName = eElement.getElementsByTagName("motherName").item(0).getTextContent();
                            String drivingLicenceNo = eElement.getElementsByTagName("drivingLicenceNo").item(0).getTextContent();
                            long adharNo = Long.parseLong(eElement.getElementsByTagName("adharNo").item(0).getTextContent());
                            String panNo = eElement.getElementsByTagName("panNo").item(0).getTextContent();
                            String dateOfBirth = eElement.getElementsByTagName("dateOfBirth").item(0).getTextContent();
                            PersonalDetails.Gender gender = PersonalDetails.Gender.valueOf(eElement.getElementsByTagName("gender").item(0).getTextContent());
                            PersonalDetails.BloodGroup bloodGroup = PersonalDetails.BloodGroup.valueOf(eElement.getElementsByTagName("bloodGroup").item(0).getTextContent());
                            PersonalDetails.MaritalStatus maritalStatus = PersonalDetails.MaritalStatus.valueOf(eElement.getElementsByTagName("maritalStatus").item(0).getTextContent());
                            personalDetails = new PersonalDetails(name, fatherName, motherName, drivingLicenceNo, adharNo, panNo, new SimpleDateFormat("dd-MM-yyyy").parse(dateOfBirth), gender, bloodGroup, maritalStatus);
                        }
                    }
                }
                return personalDetails;
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<PersonalDetails> personalDetailsFuture = executorService.submit(callPersonalDetails);
        return personalDetailsFuture.get();
    }

}
