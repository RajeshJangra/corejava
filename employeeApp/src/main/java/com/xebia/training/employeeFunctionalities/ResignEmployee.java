package com.xebia.training.employeeFunctionalities;

import com.xebia.training.employeeInformation.Employee;
import com.xebia.training.employeeInformation.Project;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ResignEmployee {
    static Logger log = Logger.getLogger(ResignEmployee.class.getName());

    public static void resignEmployee(List<Employee> employeeList, String id) throws ParseException, InterruptedException, ExecutionException, JAXBException, FileNotFoundException {
        log.info("\nResignEmployee Called");
        for (Employee emp : employeeList) {
            Date date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));
            if (emp.getId().equalsIgnoreCase(id)) {
                emp.setEndDate(date);
                emp.getDepartment().setEndDate(date);
                for (Project project : emp.getProject()) {
                    project.setEndDate(date);
                }
                log.info("\n" + emp.getPersonalDetails().getName() + " (" + emp.getId() + ") Successfully Resigned !!!\nUpdated Details are:" + emp);
            }
        }
    }
}

