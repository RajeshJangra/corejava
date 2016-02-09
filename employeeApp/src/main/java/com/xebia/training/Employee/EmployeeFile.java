package com.xebia.training.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jasleen on 1/2/16.
 */
public class EmployeeFile {
    public static void main(String[] args) {
        int count = 0;
        String array[] = new String[100];
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("/home/jasleen/Jasleenfiles/input.txt"));
            while ((line = br.readLine()) != ",") {
                array[count++] = line;
                //  System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

