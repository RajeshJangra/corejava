package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class EmployeeInput {
    Employee employee = null;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeInput that = (EmployeeInput) o;

        return employee.equals(that.employee);

    }

    @Override
    public int hashCode() {
        return employee.hashCode();
    }

    public Employee inputEmployeeDetails(final String id) throws ExecutionException, InterruptedException {
        Callable<Employee> callEmployee = new Callable<Employee>() {
            public Employee call() throws Exception {
                File file = new File("src/main/java/com/xebia/training/xmlFiles/EmployeeData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node node = nodeList.item(temp);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        String idAttribute = element.getAttribute("id");
                        if (id.equalsIgnoreCase(idAttribute)) {
                            int workExperience = Integer.parseInt(element.getElementsByTagName("workExperience").item(0).getTextContent());
                            Employee.Designation designation = Employee.Designation.valueOf(element.getElementsByTagName("designation").item(0).getTextContent());
                            Date startDate = new SimpleDateFormat("dd-MM-yyyy").parse(element.getElementsByTagName("startDate").item(0).getTextContent());
                            List<Address> address = new AddressInput().inputAddress(id);
                            Contact contact = new ContactInput().inputContact(id);
                            Department department = new DepartmentInput().inputDepartment(id);
                            PersonalDetails personalDetails = new PersonalDetailsInput().inputPersonalDetails(id);
                            Set<Project> project = new ProjectInput().inputProject(id);
                            Salary salary = new SalaryInput().inputSalary(id);
                            employee = new Employee(id, workExperience, startDate, designation, address, contact, department, personalDetails, project, salary);
                        }
                    }
                }
                return employee;
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Employee> listFuture = executorService.submit(callEmployee);
        return listFuture.get();
    }
}
