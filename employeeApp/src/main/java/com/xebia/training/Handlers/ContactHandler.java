package Handlers;

import com.xebia.training.Classes.Contact;
import com.xebia.training.Classes.Salary;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by jasleen on 14/2/16.
 */
public class ContactHandler extends DefaultHandler implements Callable<List<Contact>>{
    private List<Contact> contactList = null;
    private Contact contact = null;

    //getter method for employee list
    public List<Contact> getContactList()
    {
        return contactList;
    }

    boolean bContactId = false;
    boolean bStreet = false;
    boolean bHouseNumber = false;
    boolean bArea = false;
    boolean bCity = false;
    boolean bState = false;
    boolean bPincode = false;
    boolean bLandmark = false;
    boolean bPhone = false;
    boolean bEmailId = false;
    boolean bAddress = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        if (qName.equalsIgnoreCase("contact")) {             //***** doubt *****
            //create a new Employee and put it in Map
            String id = attributes.getValue("employeeId");
            //initialize Employee object and set employeeId attribute
            contact = new Contact();
            contact.setEmployeeId(Integer.parseInt(id));
            //initialize list
            if (contactList == null)
                contactList = new ArrayList<Contact>();
        } else if (qName.equalsIgnoreCase("contactId")) {
            //set boolean values for fields, will be used in setting Employee variables
            bContactId = true;
        } else if (qName.equalsIgnoreCase("street")) {
            bStreet = true;
        }else if (qName.equalsIgnoreCase("houseNumber")) {
            bHouseNumber = true;
        }else if (qName.equalsIgnoreCase("area")) {
            bArea = true;
        }else if (qName.equalsIgnoreCase("city")) {
            bCity = true;
        }else if (qName.equalsIgnoreCase("state")) {
            bState = true;
        }else if (qName.equalsIgnoreCase("landmark")) {
            bLandmark = true;
        }else if (qName.equalsIgnoreCase("pincode")) {
            bPincode = true;
        }else if (qName.equalsIgnoreCase("phone")) {
            bPhone = true;
        }else if (qName.equalsIgnoreCase("emailId")) {
            bEmailId = true;
        }/*else if (qName.equalsIgnoreCase("address")) {
            bAddress = true;
        }*/
    }


    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("contact")) {
            //add Employee object to list
            contactList.add(contact);
        }
    }


    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (bContactId) {
            //age element, set Employee age
            contact.setContactId(Integer.parseInt(new String(ch, start, length)));
            bContactId = false;
        } else if (bStreet) {
            contact.setStreet(new String(ch, start, length));
            bStreet = false;
        }else if (bArea) {
            contact.setArea(new String(ch, start, length));
            bArea = false;
        } else if (bCity) {
            contact.setCity(new String(ch, start, length));
            bCity = false;
        } else if (bState) {
            contact.setState(new String(ch, start, length));
            bState = false;
        } else if (bEmailId) {
            contact.setEmailId(new String(ch, start, length));
            bEmailId = false;
        }else if (bHouseNumber) {
            contact.setHouseNumber(new String(ch, start, length));
            bHouseNumber = false;
        } else if (bPhone) {
            contact.setPhone(Long.parseLong(new String(ch, start, length)));
            bPhone = false;
        } else if (bPincode) {
            contact.setPincode(Double.parseDouble(new String(ch, start, length)));
            bPincode = false;
        } else if (bAddress) {
            contact.setAddress(Contact.AddressType.valueOf(new String(ch, start, length)));
            bAddress = false;
        }
    }


    public List<Contact> call() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        ContactHandler handler = new ContactHandler();
        saxParser.parse(new File("/home/jasleen/IdeaProjects/JasleenEmployee/src/main/resources/contact.xml"), handler);
        //Get Employees list
        List<Contact> contactList = handler.getContactList();
        //print employee information
        for (Contact contact : contactList)
            System.out.println(contact);

        System.out.println("salary ID = " + contactList.get(0).getContactId());

        return contactList;
    }
}
