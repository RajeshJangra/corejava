package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Project;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class ProjectInput {
    Set<Project> projectSet = new HashSet<>();

    public Set<Project> inputProject(final String id) throws IOException, ParseException, ExecutionException, InterruptedException {
        Callable<Set<Project>> callProject = new Callable<Set<Project>>() {
            public Set<Project> call() throws Exception {
                File file = new File("src/main/java/com/xebia/training/xmlFiles/ProjectData.xml");
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("employee");
                for (int temp = 0; temp < nodeList.getLength(); temp++) {
                    Node node = nodeList.item(temp);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) node;
                        if (eElement.getAttribute("id").equalsIgnoreCase(id)) {
                            int projectId = Integer.parseInt(eElement.getElementsByTagName("projectId").item(0).getTextContent());
                            String projectName = eElement.getElementsByTagName("projectName").item(0).getTextContent();
                            String startDate = eElement.getElementsByTagName("startDate").item(0).getTextContent();
                            projectSet.add(new Project(projectId, projectName, new SimpleDateFormat("dd-MM-yyyy").parse(startDate)));
                        }
                    }
                }
                return projectSet;
            }

        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Set<Project>> projectFuture = executorService.submit(callProject);
        return projectFuture.get();
    }
}
