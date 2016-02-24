package com.xebia.training.DataRead;

import com.xebia.training.Classes.Contact;
//import com.xebia.training.Classes.Personal;
import com.xebia.training.Classes.Project;
import com.xebia.training.Classes.Salary;
import Handlers.ContactHandler;
//import Handlers.PersonalHandler;
import Handlers.ProjectHandler;
import Handlers.SalaryHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by jasleen on 14/2/16.
 */
public class EmployeeApplication
{
    public EmployeeApplication(){}

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ExecutionException, InterruptedIOException, InterruptedException {

        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        SalaryHandler salaryData = new SalaryHandler();
        Future<List<Salary>> futureTask1 = executor1.submit(salaryData);
        List<Salary> salary = futureTask1.get();

        ProjectHandler projectData = new ProjectHandler();
        Future<List<Project>> futureTask2 = executor1.submit(projectData);
        List<Project> project = futureTask2.get();

        ContactHandler contactData = new ContactHandler();
        Future<List<Contact>> futureTask3 = executor1.submit(contactData);
        List<Contact> contact = futureTask3.get();
//
//        ProjectHandler departmentData = new ProjectHandler();
//        Future<List<Project>> futureTask4 = executor1.submit(departmentData);
//        List<Project> department = futureTask4.get();
//
       /* PersonalHandler personalData = new PersonalHandler();
        Future<List<Personal>> futureTask5 = executor1.submit(personalData);
        List<Personal> personal = futureTask5.get();

*/
    }

}
