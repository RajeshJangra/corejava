package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Salary;
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
public class SalaryInput {
    Salary salary = null;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaryInput that = (SalaryInput) o;
        return salary.equals(that.salary);
    }

    @Override
    public int hashCode() {
        return salary.hashCode();
    }

    public Salary inputSalary(final String id) throws IOException, ExecutionException, InterruptedException {
        Callable<Salary> callSalary = new Callable<Salary>() {
            public Salary call() throws Exception {
                File file = new File("src/main/java/com/xebia/training/xmlFiles/SalaryData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node nNode = nodeList.item(temp);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        if (eElement.getAttribute("id").equalsIgnoreCase(id)) {
                            salary = new Salary(id, Double.parseDouble(eElement.getElementsByTagName("basic").item(0).getTextContent()));
                        }
                    }
                }
                return salary;
            }


        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Salary> salaryFuture = executorService.submit(callSalary);
        return salaryFuture.get();
    }
}




