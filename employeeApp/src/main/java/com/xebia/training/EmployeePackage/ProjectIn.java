package com.xebia.training.EmployeePackage;
import com.xebia.training.EmployeePackage.Project;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public   class ProjectIn implements Callable<List<Project>> {
    //<List<Salary>>{
    int id;
    List<Project> project = new ArrayList<Project>();

    public ProjectIn(int id) {
        this.id = id;
    }

    public List<Project> call() throws Exception {
        // public List<Salary> call() throws Exception {

        try {
            File file = new File("C:\\Users\\pjhanwan\\corejava\\employeeApp\\src\\main\\java\\com\\xebia\\training\\EmployeePackage\\project.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("employee");
            iterateNodes(nList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectIn projectIn = (ProjectIn) o;

        if (id != projectIn.id) return false;
        return !(project != null ? !project.equals(projectIn.project) : projectIn.project != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (project != null ? project.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectIn{" +
                "id=" + id +
                ", project=" + project +
                '}';
    }

    private void iterateNodes(final NodeList nList) throws ParseException {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                printElements((Element) nNode);

            }
        }
    }

    private void printElements(final Element nNode) throws ParseException {
        Element eElement = nNode;
//static Date endDate=null;
        if (Integer.parseInt(eElement.getAttribute("id")) == id) {
            Date startDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start_date").item(0).getTextContent());
            Date endDate = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("end_date").item(0).getTextContent());

            project.add(new Project(id, startDate, EmployeeIn.date, eElement.getElementsByTagName("project_name").item(0).getTextContent()));
//            System.out.println(project);

        }

    }


}