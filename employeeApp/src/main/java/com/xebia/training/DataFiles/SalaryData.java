package com.xebia.training.DataFiles;

import com.xebia.training.Employee.SalaryDetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;

/**
 * Created by jasleen on 3/2/16.
 */
public class SalaryData {
    private int id;
    private String salId;
    private double basic;

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
                salId = String.format(stringTokenizer.nextToken(","));
                basic = Double.parseDouble(stringTokenizer.nextToken(","));

                SalaryDetails salaryDetails = new SalaryDetails(id,salId,basic);
            }
        }
    }

}
