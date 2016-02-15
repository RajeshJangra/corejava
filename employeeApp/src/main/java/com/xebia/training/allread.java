package com.xebia.training;

import org.xml.sax.SAXException;

import javax.xml.bind.annotation.XmlRootElement;
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

public class allread {

    int id;
    Date date=null;
    int experience;
    EmployeeData.designation designation;
    Set<Project> project;
    List<PersonalDetails> personalDetails;
    List<Salary> salary;
    List<Department> department;
    List<Address> address;
    List<Contact> contact;

    String line;
  //  allread ar=new allread();

    public allread()
    {

    }
    public allread(int id)
    {
        this.id=id;
      //  ar.id=id;


    }
    public  List<Contact> contactget(int id) throws ExecutionException, InterruptedException {
        allread al=new allread(id);
        contactread cr=new contactread(al.id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        contactread sumTask = new contactread(id);
        Future<List<Contact>> future = service.submit(sumTask);
        List<Contact> s=future.get();
        for(Contact a:s)
        {
            System.out.println(a);
        }
        return s;
    }
    public  List<Address> addressget(int id) throws ExecutionException, InterruptedException {
        allread al=new allread(id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        Addressread sumTask = new Addressread(id);
        Future<List<Address>> future = service.submit(sumTask);
        List<Address> s=future.get();
        for(Address a:s)
        {
            System.out.println(a);
        }
        return s;

    }
    public  List<Department> departmentget(int id) throws ExecutionException, InterruptedException {
        allread al=new allread(id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        departmentread sumTask = new departmentread(id);
        Future<List<Department>> future = service.submit(sumTask);
        List<Department> s=future.get();
        for(Department a:s)
        {
            System.out.println(a);
        }
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

  //    allread al=new allread(id);
  //    employeeread cr=new employeeread(id);
      ExecutorService service = Executors.newFixedThreadPool(10);
      employeeread sumTask = new employeeread(id);
      Future<EmployeeData> future = service.submit(sumTask);
      EmployeeData s=future.get();

          System.out.println(s);

      return s;
  }
    public  List<PersonalDetails> personalget(int id) throws ExecutionException, InterruptedException {
        allread al=new allread(id);
        contactread cr=new contactread(al.id);
        ExecutorService service =  Executors.newFixedThreadPool(10);
        personalread sumTask = new personalread(id);
        Future<List<PersonalDetails>> future = service.submit(sumTask);
        List<PersonalDetails> s=future.get();
        for(PersonalDetails a:s)
        {
            System.out.println(a);
        }
          return s;
    }
    public  Set<Project> projectget(int id) throws ExecutionException, InterruptedException {
        allread al=new allread(id);
        projectread cr=new projectread(al.id);
        ExecutorService service = Executors.newFixedThreadPool(10);
        projectread sumTask = new projectread(id);
        Future<Set<Project>> future = service.submit(sumTask);
        Set<Project> s=future.get();
        for(Project a:s)
        {
            System.out.println(a);
        }
         return s;

    }
    public  List<Salary> salaryget(int id) throws ExecutionException, InterruptedException {
        allread al=new allread(id);
        ExecutorService service =   Executors.newFixedThreadPool(10);
        salaryread sumTask = new salaryread(id);
        Future<List<Salary>> future = service.submit(sumTask);
        List<Salary> s=future.get();
        for(Salary a:s)
        {
            System.out.println(a);
        }
        return s;
    }
    public void empget(Employee employee) throws InterruptedException, ParserConfigurationException, SAXException, IOException, ExecutionException, ParseException {    allread ar=new allread();

        System.out.println("Want employee to resign(Y/N):");
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine();
        if(choice.equals("Y"))
        {
            Calendar c=Calendar.getInstance();
            DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        //    System.out.println(dateFormat.format(c.getTime()));
            date=new SimpleDateFormat("dd-MM-yyyy").parse(dateFormat.format(c.getTime()));
            for(Department department:employee.getDepartment())
            {
                department.setEnddate(date);
            }

                for (Project project:employee.getProject())
                {
                    project.setEnddate(date);
                }
            for(PersonalDetails personalDetails:employee.getPersonalDetails())
            {
                personalDetails.setEndDate(date);
            }


        }


    }



    public Employee inputEmployee(final int id) throws ExecutionException, InterruptedException {
        Callable sumTask= new Callable() {
            public Employee call() throws Exception {
                    //  empget(ar.id);
                  //  System.out.println(id);
                    allread ar=new allread(id);
                    Employee emp=new Employee(ar.employeeget(ar.id),ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));
                    //  System.out.println(ar.id+""+experience);
                    System.out.println(emp);
                    return emp;
            }
        };

        ExecutorService service =  Executors.newSingleThreadExecutor();
      //  allread sumTask = new allread(id);
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

      allread ar=new allread();
        ar.id=101;
      //  ar.reademp(101);
      Employee emp=new Employee(ar.employeeget(ar.id),ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));
        System.out.println(emp);
    }*/
}
