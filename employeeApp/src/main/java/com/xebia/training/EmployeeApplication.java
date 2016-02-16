package com.xebia.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.xml.sax.SAXException;
import sun.java2d.pipe.hw.BufferedContextProvider;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

class EmployeeApplication
{
	static Logger log=Logger.getLogger(EmployeeApplication.class.getName());

	public static void main(String s[]) throws NumberFormatException, IOException, InterruptedException, ExecutionException, SAXException, ParserConfigurationException, ParseException, JAXBException

	{

		BasicConfigurator.configure();

		System.out.println("Enter employee id:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

			EmployeeObjectRead ar = new EmployeeObjectRead(a);

			Employee employee = ar.inputEmployee(a);


			ar.empget(employee);
			log.info(employee);

			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			System.out.println();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			//Marshal the employees list in file
			String f = "employee" + a + ".xml";
			jaxbMarshaller.marshal(employee, new File("C:\\Users\\mkishore\\GIT\\corejava\\employeeApp\\src\\main\\java\\com\\xebia\\training\\employeeXml\\" + f));
			log.info("Employee Id" + a + " details has been written into file employee" + a + " successfully");
		}

		}


