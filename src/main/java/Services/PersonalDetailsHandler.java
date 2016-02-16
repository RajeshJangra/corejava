package Services;

import EntityModels.PersonalDetails;
import org.apache.log4j.Logger;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by kchoudhary on 14-Feb-16.
 */
public class PersonalDetailsHandler extends org.xml.sax.helpers.DefaultHandler implements Callable<List<PersonalDetails>> {

    private List<PersonalDetails> personalDetailsList = null;
    private PersonalDetails personalDetails = null;

    public List<PersonalDetails> getPersonalDetailsList() {
        return personalDetailsList;
    }

    boolean isPersonalDetailsID = false;
    boolean isFatherName = false;
    boolean isGender = false;
    boolean isDob = false;
    boolean isBloodGroup = false;
    boolean isMaritalStatus = false;
    boolean isPassportInformation = false;
    boolean isAdharNO = false;
    boolean isDrivingLicenceNo = false;

    @Override
    public void startElement(String uri, String localName, String qualifiedName, org.xml.sax.Attributes attributes) {
        if (qualifiedName.equalsIgnoreCase("PersonalData")) {
            String id = attributes.getValue("employeeId");

            personalDetails = new PersonalDetails();
            personalDetails.setId(Integer.parseInt(id));

            if (personalDetailsList == null)
                personalDetailsList = new ArrayList<PersonalDetails>();

        } else if (qualifiedName.equalsIgnoreCase("personalDetailsID")) {
            isPersonalDetailsID = true;
        } else if (qualifiedName.equalsIgnoreCase("fatherName")) {
            isFatherName = true;
        } else if (qualifiedName.equalsIgnoreCase("gender")) {
            isGender = true;
        } else if (qualifiedName.equalsIgnoreCase("dob")) {
            isDob = true;
        } else if (qualifiedName.equalsIgnoreCase("bloodGroup")) {
            isBloodGroup = true;
        } else if (qualifiedName.equalsIgnoreCase("maritalStatus")) {
            isMaritalStatus = true;
        } else if (qualifiedName.equalsIgnoreCase("passportInformation")) {
            isPassportInformation = true;
        } else if (qualifiedName.equalsIgnoreCase("adharNO")) {
            isAdharNO = true;
        } else if (qualifiedName.equalsIgnoreCase("drivingLicenceNo")) {
            isDrivingLicenceNo = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("PersonalData")) {
            personalDetailsList.add(personalDetails);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {
        if (isPersonalDetailsID) {
            personalDetails.setId(Integer.parseInt(new String(ch, start, length)));
            isPersonalDetailsID = false;
        } else if (isFatherName) {
            personalDetails.setFatherName(new String(ch, start, length));
            isFatherName = false;
        } else if (isGender) {
            personalDetails.setGender(new String(ch, start, length));
            isGender = false;
        } else if (isDob) {
            personalDetails.setDob(new String(ch, start, length));
            isDob = false;
        } else if (isBloodGroup) {
            personalDetails.setBloodGroup(new String(ch, start, length));
            isBloodGroup = false;
        } else if (isMaritalStatus) {
            personalDetails.setMaritalStatus(new String(ch, start, length));
            isMaritalStatus = false;
        } else if (isPassportInformation) {
            personalDetails.setPassportInformation(new String(ch, start, length));
            isPassportInformation = false;
        } else if (isAdharNO) {
            personalDetails.setAdhaarNo(new String(ch, start, length));
            isAdharNO = false;
        } else if (isDrivingLicenceNo) {
            personalDetails.setDrivingLicenceNo(new String(ch, start, length));
            isDrivingLicenceNo = false;
        }

    }

    public List<PersonalDetails> call() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        PersonalDetailsHandler handler = new PersonalDetailsHandler();
        saxParser.parse(new File("C:\\Users\\kchoudhary\\IdeaProjects\\EmployeeApp\\src\\main\\resources\\PersonalData.xml"), handler);
        List<PersonalDetails> personalDetailsList = handler.getPersonalDetailsList();
        return personalDetailsList;

    }

}
