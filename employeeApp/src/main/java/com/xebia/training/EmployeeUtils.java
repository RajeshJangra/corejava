package com.xebia.training;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.xml.bind.*;
public class EmployeeUtils{

	 @SuppressWarnings({ "restriction", "unchecked" })
	 	public Employee getEmployee(int id) throws JAXBException, InterruptedException, ExecutionException
	 {
		 AddressUtils addressUtils=new AddressUtils(id);
		 DepartmentUtils departmentUtils=new DepartmentUtils(id);
		 PersonalDetailsUtils personalDetailsUtils=new PersonalDetailsUtils(id);
		 ProjectUtils projectUtils=new ProjectUtils(id);
		 SalaryUtils salaryUtils=new SalaryUtils(id);
		 ExecutorService executorService = Executors.newFixedThreadPool(6);
		 Future<Address> futureAddress=executorService.submit(addressUtils);
		 Address address=futureAddress.get();
		 Future<Department> futureDepartment=executorService.submit(departmentUtils);
		 Department department=futureDepartment.get();
		 Future<PersonalDetail> futurePersonalDetail=executorService.submit(personalDetailsUtils);
		 PersonalDetail personalDetail=futurePersonalDetail.get();
		 Future<List<Project>> futureProjects=executorService.submit(projectUtils);
		 List<Project> projects=futureProjects.get();
		 Future<Salary> futureSalary=executorService.submit(salaryUtils);
		 Salary salary=futureSalary.get();
		 
		 
	File file = new File("employee.xml");
	JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	Employees employees = (Employees) jaxbUnmarshaller.unmarshal(file);
	List<Employee> employeesList=employees.getEmployees();
	for(Employee employee:employeesList)
	{
		if(employee.getId()==id)
		{
			employee.setAddress(address);
			employee.setDepartment(department);
			employee.setPersonalDetail(personalDetail);
			employee.setProject(projects);
			employee.setSalary(salary);
			return employee;
		}
	}
	return null;
}
	 @SuppressWarnings("restriction")
	public Employee terminate(int id) throws JAXBException, InterruptedException, ExecutionException {
		EmployeeUtils employeeUtils= new EmployeeUtils();
		Employee employee=employeeUtils.getEmployee(id);
		List<Project> projects=employee.getProject();
		List<Project> projectUpdated=new ArrayList<Project>();
		for(Project project:projects)
		{
			if(project.getEndDate()==null)
			{
				project.setEndDate(new Date());
				
			}
			projectUpdated.add(project);
		}
		
			employee.setProject(projectUpdated);
			return employee;
	}
	
}
