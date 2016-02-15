package com.xebia.training;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by mkishore on 2/15/2016.
 */
public class getjaxb {
    public static void main(String[] args) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Salarys.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Salarys emps = (Salarys) jaxbUnmarshaller.unmarshal( new File("C:\\temp\\employeesal.xml") );

        for(Salary emp : emps.getSal())
        {
           /* System.out.println(emp.getId());
            System.out.println(emp.getFirstName());*/
            System.out.println(emp);
            emp.setBasic(10000);
        }
        JAXBContext jaxbContext1 = JAXBContext.newInstance(Salarys.class);
        Marshaller jaxbMarshaller = jaxbContext1.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(emps, System.out);
        jaxbMarshaller.marshal(emps, new File("c:/temp/employeesal.xml"));
    }

}
