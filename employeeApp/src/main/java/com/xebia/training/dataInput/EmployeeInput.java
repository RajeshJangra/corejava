package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * Created by nitishkumar on 12-Feb-16.
 */
public class EmployeeInput {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeInput that = (EmployeeInput) o;
        return employeeList.equals(that.employeeList);
    }

    @Override
    public int hashCode() {
        return employeeList.hashCode();
    }

    public List<Employee> inputEmployeeDetails() throws ExecutionException, InterruptedException {
        Callable<List<Employee>> callEmployee = new Callable<List<Employee>>() {
            public List<Employee> call() throws Exception {
                File file = new File("src/main/java/com/xebia/training/xmlFiles/EmployeeData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node nNode = nodeList.item(temp);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Employee employee = new Employee();
                        Element element = (Element) nNode;
                        String id = element.getAttribute("id");
                        employee.setId(id);
                        int workExperience = Integer.parseInt(element.getElementsByTagName("workExperience").item(0).getTextContent());
                        Employee.Designation designation = Employee.Designation.valueOf(element.getElementsByTagName("designation").item(0).getTextContent());
                        Date startDate = new SimpleDateFormat("dd-MM-yyyy").parse(element.getElementsByTagName("startDate").item(0).getTextContent());
                        List<Address> address = new AddressInput().inputAddress(id);
                        Contact contact = new ContactInput().inputContact(id);
                        Department department = new DepartmentInput().inputDepartment(id);
                        PersonalDetails personalDetails = new PersonalDetailsInput().inputPersonalDetails(id);
                        Set<Project> project = new ProjectInput().inputProject(id);
                        Salary salary = new SalaryInput().inputSalary(id);

                        employee.setWorkExperience(workExperience);
                        employee.setDesignation(designation);
                        employee.setStartDate(startDate);
                        employee.setAddress(address);
                        employee.setContact(contact);
                        employee.setDepartment(department);
                        employee.setPersonalDetails(personalDetails);
                        employee.setProject(project);
                        employee.setSalary(salary);
                        employeeList.add(employee);
                    }
                }
                return employeeList;
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<List<Employee>> listFuture = executorService.submit(callEmployee);
        return listFuture.get();
    }
}
