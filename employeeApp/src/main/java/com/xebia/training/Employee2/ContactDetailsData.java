package com.Employee2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import com.Employee1.ContactDetails;
import com.Employee1.ContactDetails.AddressType;

public class ContactDetailsData implements Callable<List<ContactDetails>>{
	public static final String input="/home/raggarwal/ContactDetails.txt";
	 double ContactId;
	 AddressType addressType;
	 int id;
	 int houseNo;
	 String street;
	 String area;
	 String city;
	 double pinCode;
	 String state;
	 String landmark;
	 double phoneNo;
	 String email;
	 String skypeid;
	 int EmployeeId;
	 




	public ContactDetailsData(int employeeId) {
		super();
		EmployeeId = employeeId;
	}





	@Override
	public List<ContactDetails> call() throws Exception {
		List<ContactDetails> list = new ArrayList<ContactDetails>();
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
				if(EmployeeId == id){
				ContactId = Double.parseDouble(stringTokenizer.nextToken());
				addressType = AddressType.valueOf(stringTokenizer.nextToken());
				houseNo = Integer.parseInt(stringTokenizer.nextToken());
				street = stringTokenizer.nextToken();
				area = stringTokenizer.nextToken();
				city = stringTokenizer.nextToken();
				pinCode = Double.parseDouble(stringTokenizer.nextToken());
				state = stringTokenizer.nextToken();
				landmark = stringTokenizer.nextToken();
				phoneNo = Double.parseDouble(stringTokenizer.nextToken());
				email = stringTokenizer.nextToken();
				skypeid = stringTokenizer.nextToken();
				
				ContactDetails contactDetails = new ContactDetails(id,ContactId, houseNo, street, area, city, pinCode, state, landmark, phoneNo, email, skypeid,addressType);
				list.add(contactDetails);
				}
				else{
					break;
				}
			}
		}
		return list;
	}

}
