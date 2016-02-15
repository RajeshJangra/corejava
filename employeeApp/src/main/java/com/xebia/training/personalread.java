package com.xebia.training;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by mkishore on 2/11/2016.
 */
public class personalread implements Callable<List<PersonalDetails>>{
    int id;
    List<PersonalDetails> personal;

    public personalread(int id) {
        this.id = id;
    }

    public List<PersonalDetails> call() throws Exception {
        try {personal=new ArrayList<PersonalDetails>();
            File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\personalxml.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("employee");

            iterateNodes(nList);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return personal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        personalread that = (personalread) o;

        if (id != that.id) return false;
        return personal != null ? personal.equals(that.personal) : that.personal == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personal != null ? personal.hashCode() : 0);
        return result;
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


            personal.add(new PersonalDetails(Integer.parseInt(eElement.getAttribute("id")),
                    Long.parseLong(eElement.getElementsByTagName("passport").item(0).getTextContent()),
                    Long.parseLong(eElement.getElementsByTagName("adhar").item(0).getTextContent()),
                    Long.parseLong(eElement.getElementsByTagName("voter").item(0).getTextContent()),
                    Long.parseLong(eElement.getElementsByTagName("account").item(0).getTextContent()),
                    eElement.getElementsByTagName("blood").item(0).getTextContent(),
                    PersonalDetails.maritialStatus.valueOf(eElement.getElementsByTagName("maritial").item(0).getTextContent()),
                    eElement.getElementsByTagName("name").item(0).getTextContent(),
                    eElement.getElementsByTagName("father").item(0).getTextContent(),
                    new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("dob").item(0).getTextContent()),
                    new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start").item(0).getTextContent()),
                    new allread().date));




        }

    }

}
