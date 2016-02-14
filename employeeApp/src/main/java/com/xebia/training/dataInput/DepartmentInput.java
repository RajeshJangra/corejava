package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Department;
import com.xebia.training.employeeInformation.DepartmentType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.*;

/**
 * Created by nitishkumar on 11-Feb-16.
 */
public class DepartmentInput {
    Department department = null;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentInput that = (DepartmentInput) o;
        return department.equals(that.department);
    }

    @Override
    public int hashCode() {
        return department.hashCode();
    }

    public Department inputDepartment(final String id) throws IOException, ExecutionException, InterruptedException {
        Callable<Department> callDepartment = new Callable<Department>() {
            public Department call() throws Exception {
                File file = new File("src/main/java/com/xebia/training/xmlFiles/DepartmentData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node nNode = nodeList.item(temp);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        if (eElement.getAttribute("id").equalsIgnoreCase(id)) {
                            DepartmentType deptName = DepartmentType.valueOf(eElement.getElementsByTagName("deptName").item(0).getTextContent());
                            department = new Department(deptName);
                        }
                    }
                }
                return department;
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Department> departmentFuture = executorService.submit(callDepartment);
        return departmentFuture.get();
    }
}
