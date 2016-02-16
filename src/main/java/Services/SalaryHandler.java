package Services;

import EntityModels.Salary;
import org.apache.log4j.Logger;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by kchoudhary on 13-Feb-16.
 */
public class SalaryHandler extends org.xml.sax.helpers.DefaultHandler implements Callable<List<Salary>> {

    final static Logger log = Logger.getLogger(SalaryHandler.class);

    private List<Salary> salaryList = null;
    private Salary salary = null;

    public List<Salary> getSalaryList() {
        return salaryList;
    }

    boolean isSalaryId = false;
    boolean isBasic = false;

    @Override
    public void startElement(String uri, String localName, String qualifiedName, org.xml.sax.Attributes attributes) {
        if (qualifiedName.equalsIgnoreCase("SalaryData")) {
            String id = attributes.getValue("employeeId");

            salary = new Salary();
            salary.setId(Integer.parseInt(id));

            if (salaryList == null)
                salaryList = new ArrayList<Salary>();

        } else if (qualifiedName.equalsIgnoreCase("salaryId")) {
            isSalaryId = true;
        } else if (qualifiedName.equalsIgnoreCase("basic")) {
            isBasic = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("SalaryData")) {
            salaryList.add(salary);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {
        if (isSalaryId) {
            salary.setId(Integer.parseInt(new String(ch, start, length)));
            isSalaryId = false;
        } else if (isBasic) {
            salary.setBasic(Double.parseDouble(new String(ch, start, length)));
            isBasic = false;
            salary.calculateSalary(salary.getBasic());
        }
    }

        public List<Salary> call() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        SalaryHandler handler = new SalaryHandler();
        saxParser.parse(new File("C:\\Users\\kchoudhary\\IdeaProjects\\EmployeeApp\\src\\main\\resources\\SalaryData.xml"), handler);
        List<Salary> salaryList = handler.getSalaryList();
//        for(Salary salary : salaryList)
//            log.info(salary);
        return salaryList;
    }
}
