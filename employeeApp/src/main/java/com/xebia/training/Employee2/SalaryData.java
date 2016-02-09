package com.Employee2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import com.Employee1.Salary;



public class SalaryData implements Callable<List<Salary>> {
	public int id;
	public double salaryId;
	public double basic;

	public double HRA;
	public double DA;

	public double LTA;
	public double FP;
	public double gratvity;
	public int EmployeeId;
	public static final String input = "/home/raggarwal/Salary.txt";
	
	

	public SalaryData(int employeeId) {
		super();
		EmployeeId = employeeId;
	}
	

	@Override
	public String toString() {
		return "[basic=" + basic + ", HRA="
				+ HRA + ", DA=" + DA + ", LTA=" + LTA + ", FP=" + FP
				+ ", gratvity=" + gratvity + "]";
	}



	@Override
	public List<Salary> call() throws Exception {
		List<Salary> list = new ArrayList();
		File file = new File(input);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {

			stringBuffer.append(line);
			StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
			while (stringTokenizer.hasMoreTokens()) {
				id = Integer.parseInt(stringTokenizer.nextToken());
				if (EmployeeId == id) {
					salaryId = Integer.parseInt(stringTokenizer.nextToken(","));
					basic = Double.parseDouble(stringTokenizer.nextToken(","));

					Salary salary = new Salary(id, salaryId, basic);
					list.add(salary);
					
				}

				else {
					break;
				}

			}
		}
		
		return list;
	}

}
