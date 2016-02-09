package com.Employee2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import com.Employee1.ContactDetails;
import com.Employee1.Department;
import com.Employee1.Employee;
import com.Employee1.Employee.Designation;
import com.Employee1.PersonalDetails;
import com.Employee1.Project;
import com.Employee1.Salary;
import com.MapInterface.EmployeeMap;

public class EmployeeData {
	private static final String input = "/home/raggarwal/abc.txt";
	String name;
	Date startingDate;
	String fathersName;
	Date endingDate;
	String correspondant;

	Designation designation = null;
	String current;
	String personal;
	String workEx;
	String gender;
	Date dOB;
	int id;
	Map<Integer,Employee> employeeMap = new HashMap();

	public static void main(String args[]) throws IOException, ParseException, NumberFormatException, InterruptedException, ExecutionException {
		EmployeeData employee1 = new EmployeeData();
		employee1.setValues();
	}

	public void setValues() throws NumberFormatException, IOException,
			ParseException, InterruptedException, ExecutionException {

		File file = new File(input);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {

			stringBuffer.append(line);
			StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
			while (stringTokenizer.hasMoreTokens()) {
				name = stringTokenizer.nextToken(",");
				startingDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer
						.nextToken(","));
				fathersName = stringTokenizer.nextToken(",");
				
				correspondant = stringTokenizer.nextToken(",");
				designation = Designation.valueOf(stringTokenizer.nextToken(","));
				current = stringTokenizer.nextToken(",");
				personal = stringTokenizer.nextToken(",");
				workEx = stringTokenizer.nextToken(",");
				gender = stringTokenizer.nextToken(",");
				dOB = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer
						.nextToken(","));
				id = Integer.parseInt(stringTokenizer.nextToken(","));
				endingDate =null;

				
				
				ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
				
				
				
				
				SalaryData salaryData = new SalaryData(id);
				Future<List<Salary>> futureTask1 = executor1.submit(salaryData);
				
				List<Salary> salary = futureTask1.get();
				
				

				
				
				
				
				ProjectData projectData = new ProjectData(id);
				Future<List<Project>> futureTask = executor1.submit(projectData);
				
				List<Project> project = futureTask.get();
				

				List<Future<List<PersonalDetails>>> list2 = new ArrayList();
				PersonalDetailsData personalDetailsData = new PersonalDetailsData(id);
				Future<List<PersonalDetails>> futureTask2 = executor1.submit(personalDetailsData);
				List<PersonalDetails> personalDetails = futureTask2.get();

				List<Future<List<Department>>> list3 = new ArrayList();
				DepartmentData departmentData = new DepartmentData(id);
				Future<List<Department>> futureTask3 = executor1.submit(departmentData);
				List<Department> department = futureTask3.get();

				List<Future<List<Department>>> list4 = new ArrayList();
				ContactDetailsData contactDetailsData = new ContactDetailsData(id);
				Future<List<ContactDetails>> futureTask4 = executor1.submit(contactDetailsData);
				List<ContactDetails> contactDetails = futureTask4.get();
				
				Employee emp = new Employee(name, startingDate, fathersName, endingDate, correspondant, designation, current, personal, workEx, gender, dOB, id, salary, project, personalDetails, department, contactDetails);

				
			
			
			employeeMap.put(id,emp);
			
			
			
			//	System.out.println(emp + "\n");

			}

		}

		EmployeeMap eMap = new EmployeeMap(employeeMap);
		fileReader.close();

	}

}
