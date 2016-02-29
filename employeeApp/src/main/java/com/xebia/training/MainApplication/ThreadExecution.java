package com.xebia.training.MainApplication;

import com.xebia.training.EmployeeEntities.*;
import com.xebia.training.EmployeeXMLReader.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by raggarwal on 29/2/16.
 */
public class ThreadExecution {

    Map<Integer,Employee> employeeMap;

    // Map<Integer,Employee> employeeMap = new HashMap();
public ThreadExecution(Map<Integer, Employee> employeeMap) {
    this.employeeMap = employeeMap;
    }

    public Map<Integer,Employee> executeThreads(Employee employee1) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);




        SalaryData salaryData = new SalaryData(employee1.getId());
        Future<List<Salary>> futureTask1 = executor1.submit(salaryData);
        List<Salary> salary = futureTask1.get();
        employee1.setSalary(salary);



        ProjectData projectData = new ProjectData(employee1.getId());
        Future<List<Project>> futureTask = executor1.submit(projectData);
        List<Project> project = futureTask.get();
        employee1.setProject(project);



        PersonalDetailsData personalDetailsData = new PersonalDetailsData(employee1.getId());
        Future<List<PersonalDetails>> futureTask2 = executor1.submit(personalDetailsData);
        List<PersonalDetails> personalDetails = futureTask2.get();
        employee1.setPersonalDetails(personalDetails);


        DepartmentData departmentData = new DepartmentData(employee1.getId());
        Future<List<Department>> futureTask3 = executor1.submit(departmentData);
        List<Department> department = futureTask3.get();
        employee1.setDepartment(department);


        ContactDetailsData contactDetailsData = new ContactDetailsData(employee1.getId());
        Future<List<ContactDetails>> futureTask4 = executor1.submit(contactDetailsData);
        List<ContactDetails> contactDetails = futureTask4.get();
        employee1.setContactDetails(contactDetails);

        employeeMap.put(employee1.getId(),employee1);

        return employeeMap;


    }

}
