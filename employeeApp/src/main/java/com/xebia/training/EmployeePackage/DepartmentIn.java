package com.xebia.training.EmployeePackage;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

class DepartmentIn implements Callable <Department>{
    int id;

Department department;
    DepartmentIn(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DepartmentIn{" +
                "id=" + id +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentIn that = (DepartmentIn) o;

        if (id != that.id) return false;
        return !(department != null ? !department.equals(that.department) : that.department != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }

    public Department call() {

        try {
            File file = new File("C:\\Users\\pjhanwan\\corejava\\employeeApp\\src\\main\\java\\com\\xebia\\training\\EmployeePackage\\department.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("employee");
            iterateNodes(nList);
        } catch (Exception e) {
            e.printStackTrace();
        } return department;
    }

    private void iterateNodes(final NodeList nList) throws ParseException {
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
//            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                printElements((Element) nNode);
            }
        }
    }

    private  void printElements(final Element nNode) throws ParseException {
        Element eElement = nNode;
        if(Integer.parseInt(eElement.getAttribute("id"))== id){

            Date start_date = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start_date").item(0).getTextContent());
            Date end_date = new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("end_date").item(0).getTextContent());
end_date=EmployeeIn.date;
           department= new Department(id, eElement.getElementsByTagName("designation").item(0).getTextContent(),start_date,end_date);





//            System.out.println(project);



            }

    }
}


