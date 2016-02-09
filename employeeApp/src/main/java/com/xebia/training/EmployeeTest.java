package com.xebia.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EmployeeTest {
    private static final String directory = "C:/Users/nitishkumar/Desktop/Employee/";

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "employeeInput.txt"));
        //	BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"salaryOutput.txt"));
        String line;
        List<Employee> employee = new ArrayList<Employee>();
        while ((line = input.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, ",");
            while (token.hasMoreTokens()) {
                employee.add(new Employee(token.nextToken("/"), Integer.parseInt(token.nextToken("/")), Employee.Designation.valueOf(token.nextToken("/")), token.nextToken("/")));
            }
        }
        System.out.println("employee = " + employee);
        Employee.employeeResign(employee, "XI101");
        System.out.println("employee = " + employee);



        /*Employee emp = new Employee("XI101", 10, Employee.Designation.CEO);
        System.out.println(emp);
        Employee emp1 = new Employee("XI102", 11, Employee.Designation.SCRUM_MASTER);
        System.out.println(emp1);*/
    }

}
