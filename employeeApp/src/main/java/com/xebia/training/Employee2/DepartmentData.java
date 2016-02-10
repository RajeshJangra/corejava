package com.xebia.training.Employee2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import com.xebia.training.Employee1.Department;

public class DepartmentData implements Callable<List<Department>>{
	
	private static final String input="/home/raggarwal/Department.txt";
	int EmployeeId;
	 double departmentId;
	
	int id;
	 String name;
	 Date startingDate;
	 Date endingDate;
	
	
	




	public DepartmentData(int id) {
		super();
		this.id = id;
	}







	@Override
	public List<Department> call() throws Exception {
		List<Department> list = new ArrayList<Department>();
		File file = new File(input);
		FileReader fileReader = new FileReader(file);
		BufferedReader  bufferedReader = new BufferedReader(fileReader);
		String line;
		StringBuffer stringBuffer = new StringBuffer();
		while ((line = bufferedReader.readLine() ) != null){
			stringBuffer.append(line);
			StringTokenizer stringTokenizer = new StringTokenizer(line,",");
			while(stringTokenizer.hasMoreElements()){
			EmployeeId = Integer.parseInt(stringTokenizer.nextToken());
			if(EmployeeId == id){
			
			departmentId = Double.parseDouble(stringTokenizer.nextToken(","));
			name = stringTokenizer.nextToken(",");
			startingDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer.nextToken(","));
			endingDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringTokenizer.nextToken(","));
			
			Department department = new Department(EmployeeId,departmentId, name, startingDate, endingDate);
			list.add(department);
			}
			else{
				break;
			}
			}
		}
		return list;	}

}
