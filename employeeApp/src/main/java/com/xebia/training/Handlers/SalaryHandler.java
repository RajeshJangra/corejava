package Handlers;

import com.xebia.training.Classes.Salary;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by jasleen on 13/2/16.
 */
public class SalaryHandler extends DefaultHandler implements Callable<List<Salary>> {

        private List<Salary> salaryList = null;
        private Salary salary = null;

        //getter method for employee list
        public List<Salary> getSalaryList()
        {
            return salaryList;
        }
        boolean bSalaryId = false;
        boolean bBasic = false;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {

            if (qName.equalsIgnoreCase("salary")) {             //***** doubt *****
                //create a new Employee and put it in Map
                String id = attributes.getValue("employeeId");
                //initialize Employee object and set employeeId attribute
                salary = new Salary();
                salary.setId(Integer.parseInt(id));
                //initialize list
                if (salaryList == null)
                    salaryList = new ArrayList<Salary>();
            } else if (qName.equalsIgnoreCase("salaryId")) {
                //set boolean values for fields, will be used in setting Employee variables
                bSalaryId = true;
            } else if (qName.equalsIgnoreCase("basic")) {
                bBasic = true;
            }
        }


        @Override
        public void endElement(String uri, String localName, String qName) {
            if (qName.equalsIgnoreCase("salary")) {
                //add Employee object to list
                salaryList.add(salary);
            }
        }


        @Override
        public void characters(char ch[], int start, int length) {

            if (bSalaryId) {
                //age element, set Employee age
                salary.setSalaryId(Integer.parseInt(new String(ch, start, length)));
                bSalaryId = false;
            } else if (bBasic) {
                salary.setBasic(Double.parseDouble(new String(ch, start, length)));
                salary.calculateSalary(salary.getBasic());
                bBasic = false;
            }

        }

    public List<Salary> call() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        SalaryHandler handler = new SalaryHandler();
        saxParser.parse(new File("/home/jasleen/IdeaProjects/JasleenEmployee/src/main/resources/salary.xml"), handler);
        //Get Employees list
        List<Salary> salaryList = handler.getSalaryList();
        //print employee information
        for(Salary salary : salaryList)
            System.out.println(salary);

        System.out.println("salary ID = " + salaryList.get(0).getSalaryId());

        return salaryList;
    }

}
