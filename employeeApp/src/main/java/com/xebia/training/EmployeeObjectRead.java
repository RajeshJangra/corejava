package com.xebia.training;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by mkishore on 2/11/2016.
 */

public class EmployeeObjectRead {

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
  //  EmployeeObjectRead ar=new EmployeeObjectRead();

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

        return s;
    }
    public  Address addressget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        Addressread sumTask = new Addressread(id);
        Future<Address> future = service.submit(sumTask);
        Address s=future.get();

        return s;

    }
    public  Department departmentget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        departmentread sumTask = new departmentread(id);
        Future<Department> future = service.submit(sumTask);
        Department s=future.get();

        return s;

    }
  /*  public void reademp(int id) throws ParserConfigurationException, IOException, SAXException, InterruptedException {
        File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\employeexml.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("employee");

        iterateNodes(nList);
    }
    private void iterateNodes(final NodeList nList) throws IOException, InterruptedException {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);


            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                printElements((Element) nNode);

            }
        }
    }

    private void printElements(final Element nNode) throws IOException, InterruptedException {
        Element eElement = nNode;

        if (Integer.parseInt(eElement.getAttribute("id")) == id) {



                 experience=   Integer.parseInt(eElement.getElementsByTagName("experience").item(0).getTextContent());
                 designation=   Employee.designation.valueOf(eElement.getElementsByTagName("designation").item(0).getTextContent());


        }

    }*/
  public  EmployeeData employeeget(int id) throws ExecutionException, InterruptedException {

  //    EmployeeObjectRead al=new EmployeeObjectRead(id);
  //    employeeread cr=new employeeread(id);
      ExecutorService service = Executors.newFixedThreadPool(10);
      employeeread sumTask = new employeeread(id);
      Future<EmployeeData> future = service.submit(sumTask);
      EmployeeData s=future.get();



      return s;
  }
    public  PersonalDetails personalget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        contactread cr=new contactread(al.id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        personalread sumTask = new personalread(id);
        Future<PersonalDetails> future = service.submit(sumTask);
        PersonalDetails s=future.get();

          return s;
    }
    public  Set<Project> projectget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        projectread cr=new projectread(al.id);
        ExecutorService service = Executors.newFixedThreadPool(10);
        projectread sumTask = new projectread(id);
        Future<Set<Project>> future = service.submit(sumTask);
        Set<Project> s=future.get();

         return s;

    }
    public  Salary salaryget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =   Executors.newFixedThreadPool(10);
        salaryread sumTask = new salaryread(id);
        Future<Salary> future = service.submit(sumTask);
        Salary s=future.get();

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


            System.out.println("\n"+personalDetails.getName()  +"\tResigned \n");
        }


    }



    public Employee inputEmployee(final int id) throws ExecutionException, InterruptedException {
        Callable sumTask= new Callable() {
            public Employee call() throws Exception {
                    //  empget(ar.id);
                  //  System.out.println(id);
                    EmployeeObjectRead ar=new EmployeeObjectRead(id);
                    Employee emp=new Employee(ar.employeeget(ar.id),ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));
                    //  System.out.println(ar.id+""+experience);
                    System.out.println(emp);
                    return emp;
            }
        };

        ExecutorService service =  Executors.newSingleThreadExecutor();
      //  EmployeeObjectRead sumTask = new EmployeeObjectRead(id);
        Future<Employee> future = service.submit(sumTask);
        return future.get();
    }
   /* public Employee call() throws Exception {
        ar.id=id;
        System.out.println(ar.id);
        ar.salaryget(ar.id);
        Employee emp=new Employee(ar.employeeget(ar.id),ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));
        //  System.out.println(ar.id+""+experience);
        //  System.out.println(emp);
        return emp;}
*/
   /* public static void main(String[] args) throws ExecutionException, InterruptedException, IOException, ParserConfigurationException, SAXException {

      EmployeeObjectRead ar=new EmployeeObjectRead();
        ar.id=101;
      //  ar.reademp(101);
      Employee emp=new Employee(ar.employeeget(ar.id),ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));
        System.out.println(emp);
    }*/
}
