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

public class DepartmentInput {
    Department department = null;

    public Department inputDepartment(final String id) throws IOException, ExecutionException, InterruptedException {
        Callable<Department> callDepartment = new Callable<Department>() {
            public Department call() throws Exception {
                File file = new File("src/main/java/com/xebia/training/xmlFiles/DepartmentData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node node = nodeList.item(temp);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) node;
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
