package Employeefile;

import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class SalaryInput implements Callable{
	 int id,EmployeeId;
	 double salaryId;
	 double basic;
	 double HRA;
	 double DA;
	 double LTA;
	 double FP;
	 double gratvity;
	public static final String infile = "E:/salary.txt";



	public SalaryInput(int employeeId) {
		super();
		this.EmployeeId = employeeId;
	}


	  
	@SuppressWarnings("resource")
	public List<Salary> call() throws IOException {
		List<Salary> list = new ArrayList<Salary>();
		File file = new File(infile);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			
			StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
			while (stringTokenizer.hasMoreTokens()) {
				id = Integer.parseInt(stringTokenizer.nextToken());
				if(EmployeeId == id){
				salaryId = Integer.parseInt(stringTokenizer.nextToken(","));
				basic = Double.parseDouble(stringTokenizer.nextToken(","));

				Salary salary = new Salary(id,salaryId, basic);
				list.add(salary);
				}
				
				else{
					break;
				}
				
			}
		}
		return list;

	}

}
