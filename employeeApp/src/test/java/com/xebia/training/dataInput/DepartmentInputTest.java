package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Department;
import com.xebia.training.employeeInformation.DepartmentType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DepartmentInputTest {

    @Test
    public void testInputDepartment() throws Exception {
        Department departmentTest = new Department(DepartmentType.valueOf("ACCOUNT"));

        Department departmentInput1 = new DepartmentInput().inputDepartment("XI101");
        Department departmentInput2 = new DepartmentInput().inputDepartment("XI102");

        assertEquals(departmentInput1, departmentTest);
        assertNotEquals(departmentInput2, departmentTest);
    }
}