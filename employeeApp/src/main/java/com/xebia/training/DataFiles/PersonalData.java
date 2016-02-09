package com.xebia.training.DataFiles;

import com.xebia.training.Employee.PersonalDetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by jasleen on 3/2/16.
 */
public class PersonalData {

    private String personalId;
    private String drivingLicenseNumber;
    private String adhaarNumber;
    private String passportNumber;
    private String bloodGroup;
    private int id;
    private String empName;
    private int age;
    private String designation;
    private Date dateOfBirth;
    private String maritalStatus;
    private Date startDate;
    private Date endDate;
    private String nameOfFather;
    private int workEx;

    public static final String input = "/home/jasleen/Jasleenfiles/personalDetails.txt";
    private void fileRead() throws IOException, ParseException {
        File file = new File(input);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
            StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
            while (stringTokenizer.hasMoreElements()) {

                personalId = String.format(stringTokenizer.nextToken(","));
                drivingLicenseNumber= stringTokenizer.nextToken(",");
                adhaarNumber = stringTokenizer.nextToken(",");
                passportNumber = stringTokenizer.nextToken(",");
                bloodGroup = stringTokenizer.nextToken(",");
                id= Integer.parseInt(stringTokenizer.nextToken(","));
                designation =stringTokenizer.nextToken(",");
                workEx = Integer.parseInt(stringTokenizer.nextToken(","));
                maritalStatus = stringTokenizer.nextToken(",");
                nameOfFather = stringTokenizer.nextToken(",");
                dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer.nextToken(","));
                startDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer.nextToken(","));
                endDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer.nextToken(","));

                PersonalDetails personalDetails = new PersonalDetails( personalId, drivingLicenseNumber,
                        adhaarNumber,passportNumber,bloodGroup,id,empName,age,designation,dateOfBirth,maritalStatus,
                        startDate,endDate,nameOfFather,workEx);

            }
        }
    }

}


