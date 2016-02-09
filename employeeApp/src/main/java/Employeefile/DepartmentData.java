package Employeefile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;

public class DepartmentData implements Callable {
		
		private static final String infile="E:/department.txt";
		int EmployeeId;
		 double departmentId;
		 int id;
		 String name;
		 Date startingDate;
		 Date endingDate;

		public String toString() {
			return "DepartmentData [EmployeeId=" + EmployeeId + ", departmentId=" + departmentId
					+ ", name=" + name + ", startingDate=" + startingDate
					+ ", endingDate=" + endingDate + "]";
		}





		public DepartmentData(int id) {
			super();
			this.id = id;
		}





		@SuppressWarnings("resource")
		public List<Department> call() throws NumberFormatException, IOException, ParseException{
			List<Department> list = new ArrayList<Department>();
			
			
			File file = new File(infile);
			FileReader fileReader = new FileReader(file);
			BufferedReader  bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine() ) != null){
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
			return list;
		}

	}


