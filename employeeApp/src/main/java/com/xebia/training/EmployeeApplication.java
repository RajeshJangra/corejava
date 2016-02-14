package com.xebia.training;

import com.xebia.training.dataInput.EmployeeInput;
import com.xebia.training.employeeFunctionalities.*;
import com.xebia.training.employeeInformation.Employee;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class EmployeeApplication {

    public static void main(String[] args) throws IOException, ParseException, ExecutionException, InterruptedException, JAXBException, ParserConfigurationException, SAXException {

        /* Input Employee Details using Employee ID */
        Employee employee = new EmployeeInput().inputEmployeeDetails("XI101");

        /* Display Employee Details using Employee ID */
        DisplayEmployee.displayEmployee("XI101");

        /* Display Employee Details using Employee Object */
        System.out.println(employee);

        /* Input All Employee Details in a List from XML file */
        List<Employee> employeeList = new Employees().inputAllEmployees();

        /* Display All Employee Details from Employee List Object */
        System.out.println(employeeList);

        /* Resign a Employee from a List of Employees using Employee ID */
        ResignEmployee.resignEmployee(employeeList, "XI101");

        /* Marshal the Details of All Employees in a Single XML file from a List of Employees*/
        MarshalEmployee.marshalEmployees(employeeList);

        /* Unmarshal the Details of All Employees from a Single XML file in a List */
        List<Employee> unmarshalledEmployees = UnmarshalEmployee.unmarshalEmployees();

        /* Display the Unmarshalled List */
        System.out.println(unmarshalledEmployees);

        /* Marshal the Details of a Employee using Employee ID */
        MarshalEmployee.marshalEmployee("XI101");
        MarshalEmployee.marshalEmployee("XI102");
        MarshalEmployee.marshalEmployee("XI103");
        MarshalEmployee.marshalEmployee("XI104");
        MarshalEmployee.marshalEmployee("XI105");

        /* Unmarshal the Details of a Employee using Employee ID */
        Employee unmarshalledEmployee = UnmarshalEmployee.unmarshalEmployee("XI101");

        /* Display the Unmarshalled Employee */
        System.out.println(unmarshalledEmployee);

    }

}
