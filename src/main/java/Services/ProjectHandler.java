package Services;

import EntityModels.Project;
import org.apache.log4j.Logger;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by kchoudhary on 14-Feb-16.
 */
public class ProjectHandler extends org.xml.sax.helpers.DefaultHandler implements Callable<List<Project>> {

    final static Logger log = Logger.getLogger(ProjectHandler.class);

    private List<Project> projectList = null;
    private Project project = null;

    public List<Project> getProjectList() {
        return projectList;
    }

    boolean isProjectId = false;
    boolean isDesignation = false;
    boolean isName = false;
    boolean isStartDate = false;
    boolean isEndDate = false;

    @Override
    public void startElement(String uri, String localName, String qualifiedName, org.xml.sax.Attributes attributes) {
        if (qualifiedName.equalsIgnoreCase("ProjectData")) {
            String id = attributes.getValue("employeeId");

            project = new Project();
            project.setId(Integer.parseInt(id));

            if (projectList == null)
                projectList = new ArrayList<Project>();

        } else if (qualifiedName.equalsIgnoreCase("projectId")) {
            isProjectId = true;
        } else if (qualifiedName.equalsIgnoreCase("name")) {
            isName = true;
        } else if (qualifiedName.equalsIgnoreCase("designation")) {
            isDesignation = true;
        } else if (qualifiedName.equalsIgnoreCase("startDate")) {
            isStartDate = true;
        } else if (qualifiedName.equalsIgnoreCase("endDate")) {
            isEndDate = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("ProjectData")) {
            projectList.add(project);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {
        if (isProjectId) {
            project.setId(Integer.parseInt(new String(ch, start, length)));
            isProjectId = false;
        } else if (isName) {
            project.setName(new String(ch, start, length));
            isName = false;
        } else if (isDesignation) {
            project.setDesignation(Project.Designation.valueOf(new String(ch, start, length)));
            isDesignation = false;
        } else if (isStartDate) {
            try {
                project.setStartDate(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            isStartDate = false;
        } else if (isEndDate) {
            try {
                project.setEndDate(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            isEndDate = false;
        }
    }

    public List<Project> call() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        ProjectHandler handler = new ProjectHandler();
        saxParser.parse(new File("C:\\Users\\kchoudhary\\IdeaProjects\\EmployeeApp\\src\\main\\resources\\ProjectData.xml"), handler);
        List<Project> projectList = handler.getProjectList();
//        for (Project project : projectList)
//           log.info(project);
        return projectList;
    }
}
