package com.xebia.training.employeeFunctionalities;

import com.xebia.training.employeeInformation.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class UnmarshalEmployee {
    public static List<Employee> unmarshalEmployees() throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
        final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Employees employeesUnmarshalled = (Employees) unmarshaller.unmarshal(new FileInputStream("src/main/java/com/xebia/training/xmlFiles/marshalledEmployees/EmployeeList.xml"));
        return employeesUnmarshalled.getEmployees();
    }

    public static Employee unmarshalEmployee(final String id) throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return ((Employee) unmarshaller.unmarshal(new FileInputStream("src/main/java/com/xebia/training/xmlFiles/marshalledEmployees/" + id + ".xml")));
    }
}
