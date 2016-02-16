package com.xebia.training.employeeFunctionalities;

import com.xebia.training.dataInput.EmployeeInput;
import com.xebia.training.employeeInformation.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeesTest {
    @Test
    public void testInputAllEmployees() throws Exception {
        List<Employee> employeeListTest = new ArrayList<>();
        Employee employee1 = new EmployeeInput().inputEmployeeDetails("XI101");
        Employee employee2 = new EmployeeInput().inputEmployeeDetails("XI102");
        Employee employee3 = new EmployeeInput().inputEmployeeDetails("XI103");
        Employee employee4 = new EmployeeInput().inputEmployeeDetails("XI104");
        Employee employee5 = new EmployeeInput().inputEmployeeDetails("XI105");
        employeeListTest.add(employee1);
        employeeListTest.add(employee2);
        employeeListTest.add(employee3);
        employeeListTest.add(employee4);
        employeeListTest.add(employee5);

        List<Employee> employeeListExpected = new Employees().inputAllEmployees();

        assertEquals(employeeListExpected, employeeListTest);

    }
}