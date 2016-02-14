package com.xebia.training.employeeFunctionalities;

import com.xebia.training.dataInput.EmployeeInput;
import com.xebia.training.employeeInformation.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MarshalEmployee {
    public static void marshalEmployees(List<Employee> employeeList) throws JAXBException {
        Employees employees = new Employees(employeeList);
        JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(employees, new File("src/main/java/com/xebia/training/xmlFiles/marshalledEmployees/EmployeeList.xml"));
    }

    public static void marshalEmployee(Employee employee) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(employee, new File("src/main/java/com/xebia/training/xmlFiles/marshalledEmployees/Employee.xml"));
    }

    public static void marshalEmployee(final String id) throws JAXBException, ExecutionException, InterruptedException {
        Employee employee = new EmployeeInput().inputEmployeeDetails(id);
        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(employee, new File("src/main/java/com/xebia/training/xmlFiles/marshalledEmployees/" + id + ".xml"));
    }

}
