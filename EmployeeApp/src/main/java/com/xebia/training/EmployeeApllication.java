package com.xebia.training;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.xebia.training.Contact.AddressType;

public class EmployeeApllication {


	public static  void main(String[] args) throws IOException, ParseException {

		Employee employee=null;
		FileReader in;
		Date startDate=new SimpleDateFormat("dd-MM-yyyy").parse("20-05-2016");
		Date endDate=new SimpleDateFormat("dd-MM-yyyy").parse("20-01-2018");

		employee =new Employee(101,10,"ADARSH",startDate,endDate,Employee.Designation.CONSULTANT);
		System.out.println(employee);

	}
}
