package com.xebia.training.DataFiles;

import com.xebia.training.Employee.Department;

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
public class DepartmentData {
    private int id;
    private String DepartmentId;
    private String deptName;
    private Date startDate;
    private Date endDate;

    public static final String input = "/home/jasleen/Jasleenfiles/DepartmentDetails.txt";

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
                id = Integer.parseInt(stringTokenizer.nextToken(","));

                DepartmentId = String.format(stringTokenizer.nextToken(","));
                deptName = stringTokenizer.nextToken(",");
                startDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer.nextToken(","));
                endDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer.nextToken(","));

                Department departmentDetails = new Department(id,DepartmentId, deptName,startDate,endDate);


            }
        }
    }
}
