package com.xebia.training;

import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertEquals;

/**
 * Created by mkishore on 2/12/2016.
 */
public class employeereadTest {
   EmployeeData empdata;
    List<Address> address;
    List<Contact> contactlist;
    List<Department> departmentlist;
    List<Salary> salarylist;
    Set<Project> projectlist;
    @Test
    public void testCall() throws Exception {
        EmployeeData list = new EmployeeData(101,3,EmployeeData.designation.QA_ANALYST);

       // empdata=new EmployeeData(101,3, EmployeeData.designation.QA_ANALYST);



        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        employeeread empData = new employeeread(101);
        Future<EmployeeData >futureTask1 = executor1.submit(empData);

        EmployeeData employees1 = futureTask1.get();
        assertEquals(list, employees1);
    }
}