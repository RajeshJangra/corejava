package com.Employee1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutionException;

import com.Employee1.ContactDetails.AddressType;
import com.Employee1.Employee.Designation;
import com.Employee1.PersonalDetails.MarritalStatus;
import com.Employee2.ContactDetailsData;
import com.Employee2.DepartmentData;
import com.Employee2.EmployeeData;
import com.Employee2.PersonalDetailsData;
import com.Employee2.ProjectData;
import com.Employee2.SalaryData;

public class EmployeeApplication {
	public static void main(String args[]) throws ParseException,
			NumberFormatException, IOException, InterruptedException, ExecutionException {

		EmployeeData employee = new EmployeeData();
		employee.setValues();
		

		
	}

}
