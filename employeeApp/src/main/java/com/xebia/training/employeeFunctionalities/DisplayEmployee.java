package com.xebia.training.employeeFunctionalities;

import com.xebia.training.employeeInformation.Employee;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class DisplayEmployee {
    static Logger log = Logger.getLogger(DisplayEmployee.class.getName());

    public static void displayEmployee(List<Employee> employeeList, String id) throws ExecutionException, InterruptedException {
        log.info("\nDisplaying Details of Employee id " + id);
        for (Employee employee : employeeList) {
            if (employee.getId().equalsIgnoreCase(id)) {
                log.info("Details of Employee ID " + employee.getId() + " :" + employee);
            }
        }
    }


}
