package com.xebia.training.employeeFunctionalities;

import com.xebia.training.dataInput.EmployeeInput;

import java.util.concurrent.ExecutionException;

public class DisplayEmployee {
    public static void displayEmployee(String id) throws ExecutionException, InterruptedException {
        System.out.println("Details of Employee ID " + id + " :" + new EmployeeInput().inputEmployeeDetails(id));
    }

}
