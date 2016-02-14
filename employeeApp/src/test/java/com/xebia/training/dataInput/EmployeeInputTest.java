package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EmployeeInputTest {

    @Test
    public void testInputEmployeeDetails() throws Exception {


        List<Address> addressList = new ArrayList<>();
        Address addressTemporary = new Address(1, 30, "Star Mall", "Gurgaon", "Haryana", 122001, Address.AddressType.TEMPORARY);
        Address addressPermanent = new Address(1, 15, "DLF Star Mall", "Gurgaon", "Haryana", 122001, Address.AddressType.PERMANENT);
        Address addressCorrespondence = new Address(1, 10, "DLF Cyber City", "Gurgaon", "Haryana", 122001, Address.AddressType.CORRESPONDENCE);
        addressList.add(addressTemporary);
        addressList.add(addressPermanent);
        addressList.add(addressCorrespondence);

        Contact contact = new Contact(7863962312L, "nitish@hotmail.com");

        Department department = new Department(DepartmentType.valueOf("ACCOUNT"));

        PersonalDetails personalDetails = new PersonalDetails("NITISH KUMAR", "S S SINHA", "S DEVI", "BR10101010", 324545334543L, "CUAPK5453N", new SimpleDateFormat("dd-MM-yyyy").parse("18-04-1994"), PersonalDetails.Gender.MALE, PersonalDetails.BloodGroup.O_POSITIVE, PersonalDetails.MaritalStatus.UNMARRIED);

        Project project1 = new Project(1, "SPICEJET", new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2016"));
        Project project2 = new Project(2, "INDIGO", new SimpleDateFormat("dd-MM-yyyy").parse("01-02-2016"));
        Project project3 = new Project(3, "AMAZON", new SimpleDateFormat("dd-MM-yyyy").parse("01-03-2016"));
        Set<Project> projectSet = new HashSet<>();
        projectSet.add(project1);
        projectSet.add(project2);
        projectSet.add(project3);
        Salary salary = new Salary(50000.0);

        Employee employeeTest = new Employee("XI101", 4, new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2015"), Employee.Designation.valueOf("TRAINEE"), addressList, contact, department, personalDetails, projectSet, salary);

        Employee employeeInput1 = new EmployeeInput().inputEmployeeDetails("XI101");
        Employee employeeInput2 = new EmployeeInput().inputEmployeeDetails("XI102");

        assertEquals(employeeTest, employeeInput1);
        assertNotEquals(employeeTest, employeeInput2);

    }
}