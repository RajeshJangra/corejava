package Employeefile;

import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;

import Employeefile.PersonalDetails.MaritalStatus;

public class PersonalData implements Callable<Object> {

		private static final String infile="E:/personaldetails.txt";
		int id;
		int EmployeeID;
		 int personalDetailsID;
		 String adharNO;
		 String panNO;
		 String bloodGroup;
		 MaritalStatus maritalStatus;
		 String drivingLicenceNo;
		 
		 
		public PersonalData(int employeeID) {
			super();
			this.EmployeeID = employeeID;
		}


		@SuppressWarnings("resource")
		public List<PersonalDetails> call() throws IOException{
			List<PersonalDetails> list = new ArrayList<PersonalDetails>();
			File file = new File(infile);
			FileReader fileReader = new FileReader(file);
			BufferedReader  bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine() ) != null)
			{
				StringTokenizer stringTokenizer = new StringTokenizer(line,",");
				while(stringTokenizer.hasMoreElements()){
				id = Integer.parseInt(stringTokenizer.nextToken());
				if(EmployeeID == id){
				personalDetailsID = Integer.parseInt(stringTokenizer.nextToken(","));
				adharNO = stringTokenizer.nextToken(",");
				panNO = stringTokenizer.nextToken(",");
				bloodGroup = stringTokenizer.nextToken(",");
				maritalStatus = MaritalStatus.valueOf(stringTokenizer.nextToken(","));
				drivingLicenceNo = stringTokenizer.nextToken(",");
				
				PersonalDetails personalDetails = new PersonalDetails(id,personalDetailsID, adharNO, panNO, bloodGroup, maritalStatus, drivingLicenceNo);
				list.add(personalDetails);
				}
				else{
					break;
				}
				
				}
			}
			return list;
		}

}
