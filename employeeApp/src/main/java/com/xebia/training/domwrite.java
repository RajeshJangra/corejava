package com.xebia.training;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by mkishore on 2/13/2016.
 */
public class domwrite {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;

        try {
            documentBuilder=documentBuilderFactory.newDocumentBuilder();
            Document document=documentBuilder.newDocument();
            Element rootelement=document.createElement("Employees");
            document.appendChild(rootelement);
            rootelement.appendChild(getEmployees(document,"1","Trainee"));
            TransformerFactory transformer =TransformerFactory.newInstance();
            Transformer transform=transformer.newTransformer();
            transform.setOutputProperty(OutputKeys.INDENT,"yes");
            DOMSource source=new DOMSource(document);
            StreamResult file=new StreamResult(new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\emps.xml"));
            transform.transform(source,file);
            System.out.println("Done");
        }

        catch (Exception e)
        {

        }
    }
    private static Node getEmployees(Document doc,String id,String designation)
    {
        Element element=doc.createElement("Employee");
        element.setAttribute("id",id);
        element.appendChild(getEmployeeElements(doc,element,"designation",designation));
        return element;
    }

    private static Node getEmployeeElements(Document doc, Element element, String designation, String designation1) {
        Element node=doc.createElement(designation);
        node.appendChild(doc.createTextNode(designation1));
        return node;
    }

}

class test
{
    String i;
    String desgnation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        test test = (test) o;

        if (i != null ? !i.equals(test.i) : test.i != null) return false;
        return desgnation != null ? desgnation.equals(test.desgnation) : test.desgnation == null;

    }

    @Override
    public int hashCode() {
        int result = i != null ? i.hashCode() : 0;
        result = 31 * result + (desgnation != null ? desgnation.hashCode() : 0);
        return result;
    }

    public test(String desgnation, String i) {
        this.desgnation = desgnation;
        this.i = i;
    }
}