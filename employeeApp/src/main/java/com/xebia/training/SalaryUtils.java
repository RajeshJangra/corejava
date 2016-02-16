package com.xebia.training;

import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@SuppressWarnings({ "restriction", "rawtypes" })
public class SalaryUtils implements Callable{
	private int id;
	
	public SalaryUtils(int id) {
		this.id = id;
	}

	public Salary call() throws JAXBException {
		 File file = new File("salary.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Salaries.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Salaries salaries = (Salaries) jaxbUnmarshaller.unmarshal(file);
			List<Salary> saList=salaries.getSalary();
			for(Salary salary:saList)
			{
			if(salary.getId()==id)	
			{
			return new Salary(id, salary.getBasic());
			}
		}
			return null;
	}
	
}
