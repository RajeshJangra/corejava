package Employeefile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import Employeefile.Employee.Designation;

public class EmployeeInput{
	private final String infile = "E:/employee.txt";
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
	static int id;
	Map<Integer,Employee> employeeMap = new HashMap<Integer, Employee>();
    BufferedReader bufferedReader;

	@SuppressWarnings({ "unchecked" })
	public Map<Integer, Employee> setinput() throws IOException, NumberFormatException, ParseException, InterruptedException, ExecutionException {
	
		File file = new File(infile);
		FileReader fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {

			stringBuffer.append(line);
			StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
			while (stringTokenizer.hasMoreTokens()) {
				name = stringTokenizer.nextToken(",");
				startingDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer.nextToken(","));
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
				
				DepartmentInput departmentinput = new DepartmentInput(id);
				Future<List<Department>> futureTask1 = executor1.submit(departmentinput);
				List<Department> department = futureTask1.get();
				
				AddressInput addressinput = new AddressInput(id);
				Future<List<Address>> futureTask2 = executor1.submit(addressinput);
				List<Address> address = futureTask2.get();

				PersonalInput personalinput = new PersonalInput(id);
				Future<List<PersonalDetails>> futureTask3 = executor1.submit(personalinput);
				List<PersonalDetails> personalDetails = futureTask3.get();

				
			    SalaryInput salaryinput = new SalaryInput(id);
			    Future<List<Salary>> futureTask4 = executor1.submit(salaryinput);
			    List<Salary> salary = futureTask4.get();
	
			    ProjectInput projectinput = new ProjectInput(id);
				Future<List<Project>> futureTask5=executor1.submit(projectinput) ;
				List<Project> project = futureTask5.get();
				Employee emp = new Employee(name, startingDate, fathersName, endingDate, correspondant, designation, current, personal, workEx, gender, dOB, id, salary, project, personalDetails, department, address);

				employeeMap.put(id,emp);

			}

		}
		return employeeMap;

	}
}

