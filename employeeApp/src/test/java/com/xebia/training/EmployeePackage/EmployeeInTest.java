package com.xebia.training.EmployeePackage;

import com.xebia.training.EmployeePackage.Project;
import com.xebia.training.EmployeePackage.ProjectIn;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.*;
public class EmployeeInTest {

    @Test
    public void testCall() throws Exception {
       // List<Project> list = new ArrayList<>();
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        EmployeeIn employee1 = new EmployeeIn(101);
        Future<Employee> futureTask1 = executor1.submit(employee1);

        Employee employee2 = futureTask1.get();
        Salary salary=new Salary(101,500000.00);
        List<Project> list = new ArrayList<>();
        Project project = new Project(101,new SimpleDateFormat("dd-MM-yyyy").parse("19-02-2016"),
                null,"Grindr");
        list.add(project);
        Contacts contacts=new Contacts(101,10010,"pj@gmail.com") ;
        PersonalDetails personalDetails=new PersonalDetails(101,"a101","p101","A+","e101","l101");
        Department department=new Department(101,"Trainee",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);
        Address address=new Address(101,Address.Address_type.permanentAddress,801,"sector30","gurgaon","333333","haryana","area") ;
       Employee employee = new Employee(101,"priyanka","NCJ",22,"female",Employee.MaritalStatus.unmarried,Employee.Designation.Trainee,0.0f,new SimpleDateFormat("dd-MM-yyyy").parse("22-01-1994"),new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),
               null,salary,list,address,contacts,department,personalDetails);
        System.out.println("employee 111 = " + employee);
        System.out.println("employee 122= " + employee2);

        //list.add(project);


        assertEquals(employee, employee2);

    }
}