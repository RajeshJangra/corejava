package Services;

import EntityModels.Contact;
import org.apache.log4j.Logger;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by kchoudhary on 13-Feb-16.
 */
public class ContactHandler extends org.xml.sax.helpers.DefaultHandler implements Callable<List<Contact>> {

    private List<Contact> contactList = null;
    private Contact contact = null;

    public List<Contact> getContactList() {
        return contactList;
    }

    boolean isContactId = false;
    boolean isName = false;
    boolean isAddressType = false;
    boolean isHouseNo = false;
    boolean isStreetOrApartment = false;
    boolean isArea = false;
    boolean isCity = false;
    boolean isState = false;
    boolean isPincode = false;
    boolean isLandmark = false;
    boolean isPhoneNo = false;
    boolean isEmail = false;

    @Override
    public void startElement(String uri, String localName, String qualifiedName, org.xml.sax.Attributes attributes) {
        if (qualifiedName.equalsIgnoreCase("ContactsData")) {
            String id = attributes.getValue("employeeId");

            contact = new Contact();
            contact.setContactId(Integer.parseInt(id));

            if (contactList == null)
                contactList = new ArrayList<Contact>();

        } else if (qualifiedName.equalsIgnoreCase("contactId")) {
            isContactId = true;
        } else if (qualifiedName.equalsIgnoreCase("name")) {
            isName = true;
        } else if (qualifiedName.equalsIgnoreCase("addressType")) {
            isAddressType = true;
        } else if (qualifiedName.equalsIgnoreCase("houseNo")) {
            isHouseNo = true;
        } else if (qualifiedName.equalsIgnoreCase("streetOrApartment")) {
            isStreetOrApartment = true;
        } else if (qualifiedName.equalsIgnoreCase("area")) {
            isArea = true;
        } else if (qualifiedName.equalsIgnoreCase("city")) {
            isCity = true;
        } else if (qualifiedName.equalsIgnoreCase("state")) {
            isState = true;
        } else if (qualifiedName.equalsIgnoreCase("pincode")) {
            isPincode = true;
        } else if (qualifiedName.equalsIgnoreCase("landmark")) {
            isLandmark = true;
        } else if (qualifiedName.equalsIgnoreCase("phoneNo")) {
            isPhoneNo = true;
        } else if (qualifiedName.equalsIgnoreCase("email")) {
            isEmail = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("ContactsData")) {
            contactList.add(contact);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {
        if (isContactId) {
            contact.setContactId(Integer.parseInt(new String(ch, start, length)));
            isContactId = false;
        } else if (isName) {
            contact.setName(new String(ch, start, length));
            isName = false;
        } else if (isAddressType) {
            contact.setAddressType(Contact.AddressType.valueOf(new String(ch, start, length)));
            isAddressType = false;
        } else if (isHouseNo) {
            contact.setHouseNo(new String(ch, start, length));
            isHouseNo = false;
        } else if (isStreetOrApartment) {
            contact.setStreetOrApartment(new String(ch, start, length));
            isStreetOrApartment = false;
        } else if (isArea) {
            contact.setArea(new String(ch, start, length));
            isArea = false;
        } else if (isCity) {
            contact.setCity(new String(ch, start, length));
            isCity = false;
        } else if (isState) {
            contact.setState(new String(ch, start, length));
            isState = false;
        } else if (isPincode) {
            contact.setPincode(new String(ch, start, length));
            isPincode = false;
        } else if (isLandmark) {
            contact.setLandmark(new String(ch, start, length));
            isLandmark = false;
        } else if (isPhoneNo) {
            contact.setPhoneNo(new String(ch, start, length));
            isPhoneNo = false;
        } else if (isEmail) {
            contact.setEmail(new String(ch, start, length));
            isEmail = false;
        }
    }

    public List<Contact> call() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        ContactHandler handler = new ContactHandler();
        saxParser.parse(new File("C:\\Users\\kchoudhary\\IdeaProjects\\EmployeeApp\\src\\main\\resources\\ContactsData.xml"), handler);
        List<Contact> contactList = handler.getContactList();
        return contactList;
    }
}

