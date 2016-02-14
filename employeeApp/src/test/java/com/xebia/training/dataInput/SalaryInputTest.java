package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Salary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SalaryInputTest {

    @Test
    public void testInputSalary() throws Exception {
        Salary salaryTest = new Salary(50000.0);
        Salary SalaryInput1 = new SalaryInput().inputSalary("XI101");
        Salary SalaryInput2 = new SalaryInput().inputSalary("XI102");

        assertEquals(SalaryInput1, salaryTest);
        assertNotEquals(SalaryInput2, salaryTest);
    }
}