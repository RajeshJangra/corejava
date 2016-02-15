/*
package com.xebia.training;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

*/
/**
 * Created by mkishore on 2/12/2016.
 *//*

public class employeeapplicationcall {
    static int id;
    public static int experience;
    EmployeeData.designation designation;
    //   List<Employee> employees;
    Set<Project> project;
    List<PersonalDetails> personalDetails;
    List<Salary> salary;
    List<Department> department;
    List<Address> address;
    List<Contact> contact;
    String line;
    employeeapplicationcall ar;
    // List<Employee> employee;
    public employeeapplicationcall()
    {

    }
    public employeeapplicationcall(int id)
    {
        this.id=id;

    }
    public List<Contact> contactget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        contactread cr=new contactread(al.id);
        ExecutorService service =  Executors.newSingleThreadExecutor();
        contactread sumTask = new contactread(al.id);
        Future<List<Contact>> future = service.submit(sumTask);
        List<Contact> s=future.get();
        for(Contact a:s)
        {
            System.out.println(a);
        }
        return s;
    }
    public List<Address> addressget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =  Executors.newSingleThreadExecutor();
        Addressread sumTask = new Addressread(al.id);
        Future<List<Address>> future = service.submit(sumTask);
        List<Address> s=future.get();
        for(Address a:s)
        {
            System.out.println(a);
        }
        return s;

    }
    public List<Department> departmentget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =  Executors.newSingleThreadExecutor();
        departmentread sumTask = new departmentread(al.id);
        Future<List<Department>> future = service.submit(sumTask);
        List<Department> s=future.get();
        for(Department a:s)
        {
            System.out.println(a);
        }
        return s;

    }
    */
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

      }*//*

    public EmployeeData employeeget(int id) throws ExecutionException, InterruptedException {
        System.out.println("Entered");
        employeeapplicationcall al=new employeeapplicationcall(id);
        employeeread cr=new employeeread(al.id);
        ExecutorService service =  Executors.newSingleThreadExecutor();
        employeeread sumTask = new employeeread(al.id);
        Future<EmployeeData> future = service.submit(sumTask);
        EmployeeData s=future.get();

        System.out.println(s);

        return s;
    }
    public List<PersonalDetails> personalget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        contactread cr=new contactread(al.id);
        ExecutorService service =  Executors.newSingleThreadExecutor();
        personalread sumTask = new personalread(al.id);
        Future<List<PersonalDetails>> future = service.submit(sumTask);
        List<PersonalDetails> s=future.get();
        for(PersonalDetails a:s)
        {
            System.out.println(a);
        }
        return s;
    }
    public Set<Project> projectget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        projectread cr=new projectread(al.id);
        ExecutorService service =  Executors.newSingleThreadExecutor();
        projectread sumTask = new projectread(al.id);
        Future<Set<Project>> future = service.submit(sumTask);
        Set<Project> s=future.get();
        for(Project a:s)
        {
            System.out.println(a);
        }
        return s;

    }
    public List<Salary> salaryget(int id) throws ExecutionException, InterruptedException {
        EmployeeObjectRead al=new EmployeeObjectRead(id);
        ExecutorService service =  Executors.newSingleThreadExecutor();
        salaryread sumTask = new salaryread(ar.id);
        Future<List<Salary>> future = service.submit(sumTask);
        List<Salary> s=future.get();
        for(Salary a:s)
        {
            System.out.println(a);
        }
        return s;
    }
    */
/*public Employee empget(int id) throws InterruptedException, ParserConfigurationException, SAXException, IOException, ExecutionException {    EmployeeObjectRead ar=new EmployeeObjectRead();


        Employee emp=new Employee(ar.employeeget(ar.id),ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));
      //  System.out.println(ar.id+""+experience);
      //  System.out.println(emp);
        return emp;
    }*//*


   public void empcall(int id) throws ExecutionException, InterruptedException, ParserConfigurationException, SAXException, IOException {
        ar.id=id;
        System.out.println(ar.id);
       List<Salary> s=ar.salaryget(ar.id);
       for(Salary sa:s)
       {
           System.out.println(sa);
       }

       */
/* Employee emp=new Employee(ar.employeeget(101),ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));
        //  System.out.println(ar.id+""+experience);
        //  System.out.println(emp);
        return emp;*//*


    }
   */
/* public static void main(String[] args) throws ExecutionException, InterruptedException, IOException, ParserConfigurationException, SAXException {

      EmployeeObjectRead ar=new EmployeeObjectRead();
        ar.id=101;
        ar.reademp(101);
      Employee emp=new Employee(ar.id,ar.experience,ar.designation,ar.addressget(ar.id),ar.contactget(ar.id),ar.departmentget(ar.id),ar.personalget(ar.id),ar.projectget(ar.id),ar.salaryget(ar.id));
        System.out.println(emp);
    }*//*

}


*/
