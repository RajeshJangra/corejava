package com.xebia.training;

import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@SuppressWarnings({ "restriction", "rawtypes" })
public class DepartmentUtils implements Callable {
	private int id;
	
	public DepartmentUtils(int id) {
		this.id = id;
	}

	public Department call() throws JAXBException {
		 File file = new File("department.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Departments.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Departments departments = (Departments) jaxbUnmarshaller.unmarshal(file);
			List<Department> departmentList= departments.getDepartment();
			for(Department department:departmentList)
			{
			if(department.getId()==id){
				return department;
			}
			}
			return null;
			
	}
}
