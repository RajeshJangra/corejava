package com.xebia.training.EmployeePackage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

public class EmployeeIn implements Callable<Employee> {
    static Logger log=Logger.getLogger(EmployeeApplication.class.getName());
    Employee employee;
    int id;
    static Date date;
    Date date1, date2;

    public EmployeeIn(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeIn{" +
                "employee=" + employee +
                ", id=" + id +
                ", date1=" + date1 +
                ", date2=" + date2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeIn that = (EmployeeIn) o;

        if (id != that.id) return false;
        if (employee != null ? !employee.equals(that.employee) : that.employee != null) return false;
        if (date1 != null ? !date1.equals(that.date1) : that.date1 != null) return false;
        return !(date2 != null ? !date2.equals(that.date2) : that.date2 != null);

    }

    @Override
    public int hashCode() {
        int result = employee != null ? employee.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (date1 != null ? date1.hashCode() : 0);
        result = 31 * result + (date2 != null ? date2.hashCode() : 0);
        return result;
    }

    public static void resignEmployee(Employee employee) throws ParseException {
        Scanner sc = new Scanner(System.in);
        log.info("does employee want to resign? Y/N ");
        String reply = sc.nextLine();
        if (reply.equals("Y")) {
            Calendar c = Calendar.getInstance();
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            //    System.out.println(dateFormat.format(c.getTime()));
            date = new SimpleDateFormat("dd-MM-yyyy").parse(dateFormat.format(c.getTime()));
            employee.setEndDate(date);
            employee.getDepartment().setEndDate(date);
            for (Project project : employee.getProject()) {
                project.setEndDate(date);
            }
            log.info(employee.getName()+" Sucessfully Resigned\nUpdated Details are\n"+employee);

        } else {
            date = null;
            log.info("No Employee to resign");
        }

    }

    public Employee call() {

        try {

            File file = new File("C:\\Users\\pjhanwan\\corejava\\employeeApp\\src\\main\\java\\com\\xebia\\training\\EmployeePackage\\Employee.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();
            //  System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("employee");
            // System.out.println("----------------------------");
            iterateNodes(nList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;

    }

    private void iterateNodes(final NodeList nList) throws ParseException, ExecutionException, InterruptedException {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            // System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                printElements((Element) nNode);
            }
        }
    }

    private void printElements(final Element nNode) throws ParseException, ExecutionException, InterruptedException {
        Element eElement = nNode;
int count=0;

        if (Integer.parseInt(eElement.getAttribute("id")) == id) {
            SalaryIn salaryIn = new SalaryIn(id);
            ProjectIn projectIn = new ProjectIn(id);
            AddressIn addressIn = new AddressIn(id);
            ContactsIn contactsIn = new ContactsIn(id);
            DepartmentIn departmentIn = new DepartmentIn(id);
            PersonalIn personalIn = new PersonalIn(id);

            ExecutorService executorService = Executors.newFixedThreadPool(6);

            Future<Salary> salaryFuture = executorService.submit(salaryIn);
            Salary salary = salaryFuture.get();

            Future<List<Project>> projectFuture = executorService.submit(projectIn);
            List<Project> project = projectFuture.get();

            Future<Address> addressFuture = executorService.submit(addressIn);
            Address address = addressFuture.get();

            Future<Contacts> contactsFuture = executorService.submit(contactsIn);
            Contacts contacts = contactsFuture.get();


            Future<Department> departmentFuture = executorService.submit(departmentIn);
            Department department = departmentFuture.get();

            Future<PersonalDetails> personaldetailsFuture = executorService.submit(personalIn);
            PersonalDetails personaldetails = personaldetailsFuture.get();


            Date dob = null, startDate = null, endDate = null;

            dob = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("dob").item(0).getTextContent());

            startDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start_date").item(0).getTextContent());
            endDate = EmployeeIn.date;


            employee = new Employee(id, eElement.getElementsByTagName("name").item(0).getTextContent(), eElement.getElementsByTagName("father_name").item(0).getTextContent(),
                    Integer.parseInt(eElement.getElementsByTagName("age").item(0).getTextContent()), eElement.getElementsByTagName("gender").item(0).getTextContent(),
                    Employee.MaritalStatus.valueOf(eElement.getElementsByTagName("Marital_Status").item(0).getTextContent()),
                    Employee.Designation.valueOf(eElement.getElementsByTagName("designation").item(0).getTextContent()),
                    Float.parseFloat(eElement.getElementsByTagName("workExp").item(0).getTextContent()), dob, startDate, endDate, salary, project, address, contacts,
                    department, personaldetails);

        }


        }

    }



