package com.xebia.training;

import java.util.concurrent.ExecutionException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBException;



@SuppressWarnings("restriction")
public class EmployeeApplication {
	static Logger log=Logger.getLogger(EmployeeApplication.class.getName());
	public static void main(String[] args) throws JAXBException, InterruptedException, ExecutionException {
		EmployeeUtils employeeUtils=new EmployeeUtils();
		
		BasicConfigurator.configure();
		  log.info(employeeUtils.getEmployee(512));

	}

}
