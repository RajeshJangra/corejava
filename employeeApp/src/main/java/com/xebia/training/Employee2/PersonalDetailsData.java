package com.Employee2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import com.Employee1.PersonalDetails;
import com.Employee1.PersonalDetails.MarritalStatus;

public class PersonalDetailsData implements Callable<List<PersonalDetails>> {
	private static final String input="/home/raggarwal/Personaldetails.txt";
	int id;
	 int personalDetailsID;
	 String adharNO;
	 String panNO;
	 String bloodGroup;
	 MarritalStatus marritalStatus;
	 String drivingLicenceNo;
	 int EmployeeID;
	 
	


	public PersonalDetailsData(int employeeID) {
		super();
		EmployeeID = employeeID;
	}




	@Override
	public List<PersonalDetails> call() throws Exception {
		List<PersonalDetails> list = new ArrayList();
		File file = new File(input);
		FileReader fileReader = new FileReader(file);
		BufferedReader  bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine() ) != null){
			stringBuffer.append(line);
			StringTokenizer stringTokenizer = new StringTokenizer(line,",");
			while(stringTokenizer.hasMoreElements()){
			id = Integer.parseInt(stringTokenizer.nextToken());
			if(EmployeeID == id){
			personalDetailsID = Integer.parseInt(stringTokenizer.nextToken(","));
			adharNO = stringTokenizer.nextToken(",");
			panNO = stringTokenizer.nextToken(",");
			bloodGroup = stringTokenizer.nextToken(",");
			marritalStatus = MarritalStatus.valueOf(stringTokenizer.nextToken(","));
			drivingLicenceNo = stringTokenizer.nextToken(",");
			
			PersonalDetails personalDetails = new PersonalDetails(id,personalDetailsID, adharNO, panNO, bloodGroup, marritalStatus, drivingLicenceNo);
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
