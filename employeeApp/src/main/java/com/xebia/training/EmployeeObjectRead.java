package com.xebia.training;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 * Created by mkishore on 2/11/2016.
 */

public class EmployeeObjectRead {
    static Logger log=Logger.getLogger(EmployeeApplication.class.getName());
    int id;
    Date date=null;
    int experience;
    EmployeeData.designation designation;
    Set<Project> project;
    List<PersonalDetails> personalDetails;
    Salary salary;
    List<Department> department;
    List<Address> address;
    List<Contact> contact;

    String line;

    public EmployeeObjectRead()
    {

    }
    public EmployeeObjectRead(int id)
    {
        this.id=id;
      //  ar.id=id;


    }
    public  Contact contactget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        contactread cr=new contactread(al.id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        contactread sumTask = new contactread(id);
        Future<Contact> future = service.submit(sumTask);
        Contact s=future.get();
        log.info("Contact Details Read");
        return s;
    }
    public  Address addressget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        Addressread sumTask = new Addressread(id);
        Future<Address> future = service.submit(sumTask);
        Address s=future.get();
        log.info("Address Details Read");
        return s;

    }
    public  Department departmentget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        departmentread sumTask = new departmentread(id);
        Future<Department> future = service.submit(sumTask);
        Department s=future.get();
        log.info("Department Details Read");
        return s;

    }

  public  EmployeeData employeeget(int id) throws ExecutionException, InterruptedException {


      ExecutorService service = Executors.newFixedThreadPool(10);
      employeeread sumTask = new employeeread(id);
      Future<EmployeeData> future = service.submit(sumTask);
      EmployeeData s=future.get();
      log.info("Employee Bsic Details Read");


      return s;
  }
    public  PersonalDetails personalget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        contactread cr=new contactread(al.id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        personalread sumTask = new personalread(id);
        Future<PersonalDetails> future = service.submit(sumTask);
        PersonalDetails s=future.get();
        log.info("Personal Details Read");
          return s;
    }
    public  Set<Project> projectget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        projectread cr=new projectread(al.id);
        ExecutorService service = Executors.newFixedThreadPool(10);
        projectread sumTask = new projectread(id);
        Future<Set<Project>> future = service.submit(sumTask);
        Set<Project> s=future.get();
        log.info("Project Details Read");
         return s;

    }
    public  Salary salaryget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =   Executors.newFixedThreadPool(10);
        salaryread sumTask = new salaryread(id);
        Future<Salary> future = service.submit(sumTask);
        Salary s=future.get();
        log.info("Salary Details Read");
        return s;
    }
    public void empget(Employee employee) throws InterruptedException, ParserConfigurationException, SAXException, IOException, ExecutionException, ParseException {    EmployeeObjectRead ar=new EmployeeObjectRead();

        System.out.println("Want employee to resign(Y/N):");
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine();
        if(choice.equals("Y"))
        {
            Calendar c=Calendar.getInstance();
            DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        //    System.out.println(dateFormat.format(c.getTime()));
            date=new SimpleDateFormat("dd-MM-yyyy").parse(dateFormat.format(c.getTime()));
            Department department=employee.getDepartment();

                department.setEnddate(date);


                for (Project project:employee.getProject())
                {
                    project.setEnddate(date);
                }
           PersonalDetails personalDetails=employee.getPersonalDetails();

                personalDetails.setEndDate(date);


            log.info("\n"+personalDetails.getName()  +"\tResigned \n");
        }


    }



    public Employee inputEmployee(final int id) throws ExecutionException, InterruptedException {
        Callable sumTask= new Callable() {
            public Employee call() throws Exception {

                    EmployeeObjectRead ar=new EmployeeObjectRead(id);

                    Employee emp=new Employee(ar.employeeget(ar.id),ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));

                    log.info(emp);
                    return emp;
            }
        };

        ExecutorService service =  Executors.newSingleThreadExecutor();
      //  EmployeeObjectRead sumTask = new EmployeeObjectRead(id);
        Future<Employee> future = service.submit(sumTask);

        return future.get();
    }

}
