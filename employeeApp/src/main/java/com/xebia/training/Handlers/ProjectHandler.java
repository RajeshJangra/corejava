package Handlers;

import com.xebia.training.Classes.Project;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;


/**
 * Created by jasleen on 14/2/16.
 */
public class ProjectHandler extends DefaultHandler implements Callable<List<Project>> {

    private List<Project> projectList = null;
    private Project project = null;

    //getter method for employee list
    public List<Project> getProjectList() {
        return projectList;
    }

    boolean bProjectId = false;
    boolean bProjectName = false;
    boolean bStartDate = false;
    boolean bEndDate = false;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        if (qName.equalsIgnoreCase("project")) {             //***** doubt *****
            //create a new Employee and put it in Map
            String id = attributes.getValue("employeeId");
            //initialize Employee object and set employeeId attribute
            project = new Project();
            project.setId(Integer.parseInt(id));
            //initialize list
            if (projectList == null)
                projectList = new ArrayList<Project>();
        } else if (qName.equalsIgnoreCase("projectId")) {
            //set boolean values for fields, will be used in setting Employee variables
            bProjectId = true;
        } else if (qName.equalsIgnoreCase("projectName")) {
            bProjectName = true;
        } else if (qName.equalsIgnoreCase("startDate")) {
            bStartDate = true;
        } else if (qName.equalsIgnoreCase("endDate")) {
            bEndDate = true;
        }
    }


    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("project")) {
            //add Employee object to list
            projectList.add(project);
        }
    }


    @Override
    public void characters(char ch[], int start, int length) {

        if (bProjectId) {
            //age element, set Employee age
            project.setId(Integer.parseInt(new String(ch, start, length)));
            bProjectId = false;
        } else if (bProjectName) {
            project.setName(new String(ch, start, length));
            bProjectName = false;
        } else if (bStartDate) {

            try {
                project.setStartDate(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            bStartDate = false;
        } else if (bEndDate) {
            try {
                project.setEndDate(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            bEndDate = false;
        }


    }


    public List<Project> call() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        ProjectHandler handler = new ProjectHandler();
        saxParser.parse(new File("/home/jasleen/IdeaProjects/JasleenEmployee/src/main/resources/project.xml"), handler);
        //Get Employees list
        List<Project> projectList = handler.getProjectList();
        //print employee information
        for (Project project : projectList)
            System.out.println(project);
        return projectList;
    }
}
