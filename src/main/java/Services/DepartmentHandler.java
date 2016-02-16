package Services;

import EntityModels.Department;
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
public class DepartmentHandler extends org.xml.sax.helpers.DefaultHandler implements Callable<List<Department>> {

    final static Logger log = Logger.getLogger(DepartmentHandler.class);

    private List<Department> departmentList = null;
    private Department department = null;

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    boolean isDepartmentId = false;
    boolean isName = false;
    boolean isStartDate = false;
    boolean isEndDate = false;

    @Override
    public void startElement(String uri, String localName, String qualifiedName, org.xml.sax.Attributes attributes) {
        if (qualifiedName.equalsIgnoreCase("DepartmentData")) {
            String id = attributes.getValue("employeeId");

            department = new Department();
            department.setId(Integer.parseInt(id));

            if (departmentList == null)
                departmentList = new ArrayList<Department>();

        } else if (qualifiedName.equalsIgnoreCase("departmentId")) {
            isDepartmentId = true;
        } else if (qualifiedName.equalsIgnoreCase("name")) {
            isName = true;
        }else if (qualifiedName.equalsIgnoreCase("startDate")) {
            isStartDate = true;
        }else if (qualifiedName.equalsIgnoreCase("endDate")) {
            isEndDate = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("DepartmentData")) {
            departmentList.add(department);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {
        if (isDepartmentId) {
            department.setId(Integer.parseInt(new String(ch, start, length)));
            isDepartmentId = false;
        } else if (isName) {
            department.setName(new String(ch, start, length));
            isName = false;
        }else if (isStartDate) {
            try {
                department.setStartDate(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            isStartDate = false;
        }else if (isEndDate) {
            try {
                department.setEndDate(new SimpleDateFormat("dd-MM-yyyy").parse(new String(ch, start, length)));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            isEndDate = false;
        }
    }

    public List<Department> call() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        DepartmentHandler handler = new DepartmentHandler();
        saxParser.parse(new File("C:\\Users\\kchoudhary\\IdeaProjects\\EmployeeApp\\src\\main\\resources\\DepartmentData.xml"), handler);
        List<Department> departmentList = handler.getDepartmentList();
//        for(Department department : departmentList)
//            log.info(department);
        return departmentList;
    }

}
