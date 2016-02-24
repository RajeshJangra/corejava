/*
package com.xebia.training.Handlers;

import com.xebia.training.Classes.Personal;
import com.xebia.training.Classes.Project;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

*/
/**
 * Created by jasleen on 14/2/16.
 *//*

public class PersonalHandler extends DefaultHandler implements Callable<List<Personal>>{
    private List<Personal> personalList = null;
    private Personal personal = null;

    //getter method for employee list
    public List<Personal> getPersonalList() {
        return personalList;
    }

    boolean bPersonalId = false;
    boolean bDrivingLicenseNumber = false;
    boolean bAdhaarNumber = false;
    boolean bPassportNumber = false;
    boolean bBloodGroup = false;
    boolean bMaritalStatus = false;
    boolean bDateofBirth = false;
    boolean bDesignation = false;
    boolean bStartDate = false;
    boolean bEndDate = false;
    boolean bWorkEx = false;
    boolean bFatherName = false;
    boolean bAge = false;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        if (qName.equalsIgnoreCase("personal")) {
            String id = attributes.getValue("employeeId");
            personal = new Personal();
            personal.setEmployeeId(Integer.parseInt(id));
            if (personalList == null)
                personalList = new ArrayList<Personal>();
        } else if (qName.equalsIgnoreCase("personalId")) {
            bPersonalId = true;
        } else if (qName.equalsIgnoreCase("drivingLicenseNumber")) {
            bDrivingLicenseNumber = true;
        } else if (qName.equalsIgnoreCase("adhaarNumber")) {
            bAdhaarNumber = true;
        } else if (qName.equalsIgnoreCase("bloodGroup")) {
            bBloodGroup = true;
        } else if (qName.equalsIgnoreCase("passportNumber")) {
            bPassportNumber = true;
        } else if (qName.equalsIgnoreCase("maritalStatus")) {
            bMaritalStatus = true;
        } */
/*else if (qName.equalsIgnoreCase("dateOfBirth")) {
            bDateofBirth = true;

        }*//*
 else if (qName.equalsIgnoreCase("designation")) {
            bDesignation = true;
        } else if (qName.equalsIgnoreCase("startDate")) {
            bStartDate = true;
        } else if (qName.equalsIgnoreCase("endDate")) {
            bEndDate = true;
        } else if (qName.equalsIgnoreCase("workEx")) {
            bWorkEx = true;
        } else if (qName.equalsIgnoreCase("nameOfFather")) {
            bFatherName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            bAge = true;
        }

    }



    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("personal")) {
            //add Employee object to list
            personalList.add(personal);
        }
    }


    @Override
    public void characters(char ch[], int start, int length) {

        if (bPersonalId) {
            //age element, set Employee age
            personal.setPersonalId(Integer.parseInt(new String(ch, start, length)));
            bPersonalId = false;
        } else if (bDrivingLicenseNumber) {
            personal.setDrivingLicenseNumber(new String(ch, start, length));
            bDrivingLicenseNumber = false;
        } else if (bAdhaarNumber) {
            personal.setAdhaarNumber(new String(ch, start, length));
            bAdhaarNumber = false;
        } else if (bPassportNumber) {
            personal.setPassportNumber(new String(ch, start, length));
            bPassportNumber = false;
        } else if (bBloodGroup) {
            personal.setBloodGroup(new String(ch, start, length));
            bBloodGroup = false;
        } else if (bDateofBirth) {
            try {
                personal.setDateOfBirth(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
                System.out.println(" Date of birth= " + bDateofBirth);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            bDateofBirth = false;
        } else if (bMaritalStatus) {
            personal.setMaritalStatus(new String(ch, start, length));
            bMaritalStatus = false;
        } else if (bStartDate) {
            try {
                personal.setStartDate(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            bStartDate = false;
        } else if (bEndDate) {
            try {
                personal.setStartDate(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            bEndDate = false;
        } else if (bFatherName) {
            personal.setNameOfFather(new String(ch, start, length));
            bFatherName = false;
        }else if (bWorkEx) {
            personal.setWorkEx(Float.parseFloat(new String(ch, start, length)));
            bWorkEx = false;
        }else if (bDesignation) {
            personal.setDesignation(Personal.Designation.valueOf(new String(ch, start, length)));
            bDesignation = false;
        }else if (bAge) {
            personal.setAge(Integer.parseInt(new String(ch, start, length)));
            personal.calculateAge();
            bAge = false;
        }

        }


        public List<Personal> call ()throws Exception {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            PersonalHandler handler = new PersonalHandler();
            saxParser.parse(new File("/home/jasleen/IdeaProjects/JasleenEmployee/src/main/resources/personal.xml"), handler);
            //Get Employees list
            System.out.println("inpersonal");
            List<Personal> personalList = handler.getPersonalList();
            //print employee information

            for (Personal personal : personalList)
                System.out.println(personal);
            return personalList;
        }



    }
*/
