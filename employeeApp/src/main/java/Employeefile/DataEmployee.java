package Employeefile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import Employeefile.Employee.Designation;

public class DataEmployee  {
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

	public static void main(String args[]) throws NumberFormatException, IOException, ParseException, InterruptedException, ExecutionException{
		DataEmployee employee1 = new DataEmployee();
		employee1.setValues();
	}
	

	@SuppressWarnings({ "resource", "unchecked" })
	public void setValues() throws IOException, NumberFormatException, ParseException, InterruptedException, ExecutionException {
	
		File file = new File(infile);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
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
				ProjectData projectData = new ProjectData();
				List<Project> project = projectData.setValue(id);

				DepartmentData departmentData = new DepartmentData(id);
				Future<List<Department>> futureTask1 = executor1.submit(departmentData);
				List<Department> department = futureTask1.get();
				
				AddressData addressData = new AddressData();
				List<Address> contactDetails = addressData.setValue(id);

				PersonalData personalDetailsData = new PersonalData(id);
				List<PersonalDetails> personalDetails = personalDetailsData.call();

				
			    SalaryData salaryData = new SalaryData(id);
			    Future<List<Salary>> futureTask2 = executor1.submit(salaryData);
			    List<Salary> salary = futureTask2.get();
	
				
				Employee emp = new Employee(name, startingDate, fathersName, endingDate, correspondant, designation, current, personal, workEx, gender, dOB, id, salary, project, personalDetails, department, contactDetails);

				employeeMap.put(id,emp);

			}

		}
		System.out.println("enter the ID:");
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		System.out.println(employeeMap.get(id));
	}
}

