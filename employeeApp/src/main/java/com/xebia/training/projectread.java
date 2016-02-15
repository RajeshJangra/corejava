package com.xebia.training;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * Created by mkishore on 2/11/2016.
 */
public class projectread implements Callable<Set<Project>>{
    int id;
    Set<Project> project;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        projectread that = (projectread) o;

        if (id != that.id) return false;
        return project != null ? project.equals(that.project) : that.project == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (project != null ? project.hashCode() : 0);
        return result;
    }

    public projectread(int id) {
        this.id = id;
    }

    public Set<Project> call() throws Exception {
        try {project=new HashSet<Project>();
            File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\projectxml.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("employee");

            iterateNodes(nList);




        } catch (Exception e) {
            e.printStackTrace();
        }
        return project;
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

        if (Integer.parseInt(eElement.getAttribute("id")) == id) {


            project.add(new Project(Integer.parseInt(eElement.getAttribute("id")), Integer.parseInt(eElement.getElementsByTagName("projectid").item(0).getTextContent()), eElement.getElementsByTagName("name").item(0).getTextContent(), new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start").item(0).getTextContent()), new allread().date));


        }

    }

}
