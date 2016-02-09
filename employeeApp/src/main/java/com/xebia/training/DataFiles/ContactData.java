package com.xebia.training.DataFiles;

import com.xebia.training.Employee.ContactDetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by jasleen on 3/2/16.
 */
public class ContactData {
    int id;
    String contactID;
    private String street;
    private String houseNumber;
    private String area;
    private String city;
    private String state;
    private int pincode;
    private String Landmark;
    private int phone;
    private String emailId;
    private ContactDetails.AddressType address;

public static final String input = "/home/jasleen/Jasleenfiles/contactDetails.txt";
private void fileRead() throws IOException {
    File file = new File(input);
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line;
    StringBuffer stringBuffer = new StringBuffer();
    while ((line = bufferedReader.readLine()) != null) {
        stringBuffer.append(line);
        StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
        while (stringTokenizer.hasMoreElements()) {
            id= Integer.parseInt(stringTokenizer.nextToken(","));
            contactID = String.format(stringTokenizer.nextToken(","));
            street= stringTokenizer.nextToken(",");
            houseNumber = stringTokenizer.nextToken(",");
            area = stringTokenizer.nextToken(",");
            city = stringTokenizer.nextToken(",");
            state =stringTokenizer.nextToken(",");
            pincode = Integer.parseInt(stringTokenizer.nextToken(","));
            Landmark = stringTokenizer.nextToken(",");
            address = ContactDetails.AddressType.valueOf(stringTokenizer.nextToken(","));
            phone = Integer.parseInt(stringTokenizer.nextToken(","));
            emailId = stringTokenizer.nextToken(",");

        ContactDetails contactDetails = new ContactDetails(id,contactID,street,houseNumber,area,city,state,pincode,
        Landmark, phone,emailId,address);

         }
    }
}

}
