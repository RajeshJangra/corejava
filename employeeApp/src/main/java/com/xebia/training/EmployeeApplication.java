package com.xebia.training;

import com.xebia.training.dataInput.EmployeeInput;
import com.xebia.training.employeeInformation.Employee;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.ExecutionException;

public class EmployeeApplication {

    public static void main(String[] args) throws IOException, ParseException, ExecutionException, InterruptedException, JAXBException {


        Employees employees = new Employees(new EmployeeInput().inputEmployeeDetails());
        // System.out.println(employees.getEmployees());
        System.out.println(employees.getEmployees());
        Employee.employeeResign(employees.getEmployees(), "XI101");
        System.out.println(employees.getEmployees());

      /*  Employees employees = new Employees(employeeList);
        JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);*/
        /*Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(employees, new File("employeeList.xml"));
        jaxbMarshaller.marshal(employees, System.out);*/

        //     Employee.employeeResign(employeeList, "XI101");
       /* jaxbMarshaller.marshal(employees, new File("employeeList.xml"));
        jaxbMarshaller.marshal(employees, System.out);*/

        //    System.out.println("employee = " + employeeList);

     /* final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Employees employeesUnmarshalled = (Employees)unmarshaller.unmarshal(new FileInputStream("employeeList.xml"));
     //   System.out.println(employeesUnmarshalled);
        System.out.println(employeesUnmarshalled.getEmployees().get(0));*/

    }

}
