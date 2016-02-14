package com.xebia.training.employeeFunctionalities;

import com.xebia.training.employeeInformation.Employee;
import com.xebia.training.employeeInformation.Project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ResignEmployee {
    public static void resignEmployee(List<Employee> employee, String id) throws ParseException {
        for (Employee emp : employee) {
            if (emp.getId().equalsIgnoreCase(id)) {
                emp.setEndDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date())));
                emp.getDepartment().setEndDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date())));
                for (Project project : emp.getProject()) {
                    project.setEndDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date())));
                }
                System.out.println("\n\n" + emp.getPersonalDetails().getName() + " (" + emp.getId() + ") Successfully Resigned !!!\nUpdated Details are:" + emp);
            }
        }

    }
}
