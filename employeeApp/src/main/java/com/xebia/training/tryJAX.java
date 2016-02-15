/*
package com.xebia.training;

import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.ExecutionException;

*/
/**
 * Created by mkishore on 2/14/2016.
 *//*

public class tryJAX {
    //Initialize the employees list

    static Employee Emp=null;
    static
    { allread ar=new allread(101);
        try {
             Emp=ar.empget(101);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }





    }

    public static void main(String[] args) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        System.out.println();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in console
        jaxbMarshaller.marshal(Emp, System.out);

        //Marshal the employees list in file
        jaxbMarshaller.marshal(Emp, new File("c:/temp/employee.xml"));
    }
}
*/
