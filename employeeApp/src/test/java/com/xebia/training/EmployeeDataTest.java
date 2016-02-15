package com.xebia.training;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.xebia.training.EmployeeEntities.ContactDetails;
import com.xebia.training.EmployeeEntities.Department;
import com.xebia.training.EmployeeEntities.Employee;
import com.xebia.training.EmployeeEntities.PersonalDetails;
import com.xebia.training.EmployeeEntities.Project;
import com.xebia.training.EmployeeEntities.Salary;


public class EmployeeDataTest {
	


	@Test
	public void test() {
		Salary sal = Mockito.mock(Salary.class);
		Department department = Mockito.mock(Department.class);
		ContactDetails contactDetails = Mockito.mock(ContactDetails.class);
		PersonalDetails personal = Mockito.mock(PersonalDetails.class);
		Project project = Mockito.mock(Project.class);
		
	//	when(sal.toString()).thenReturn(":");
		
		List<Employee> list = new ArrayList<>();
	///	Employee employee = new Employee(name, startingDate, fathersName, endingDate, correspondant, designation, current, personal, workEx, gender, dOB, id, salary, project, personalDetails, department, contactDetails)
	}

}
