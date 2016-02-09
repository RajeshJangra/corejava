package com.xebia.training;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class EmployeeApplication {

	public static void main(String[] args) throws ParseException {
		 FileRead fileRead=new FileRead();

		//Address address=new Address(512, "31", "Ishwarnagar Road", "Ishakchak", "Bhagalpur", 812001, "Bihar", 8653153544l, "manavmanuprakash@gmail.com");
		List<String> arrayAddress=fileRead.getData("C:\\Users\\manav\\Desktop\\address.txt");
		Address address=new Address(Integer.parseInt(arrayAddress.get(0)), arrayAddress.get(1), arrayAddress.get(2), arrayAddress.get(3), arrayAddress.get(4), Integer.parseInt(arrayAddress.get(5)), arrayAddress.get(6), Long.parseLong(arrayAddress.get(7)), arrayAddress.get(8));
		System.out.println(address.toString());
		
		//Salary salary=new Salary(4000.0, 500.0, 500.0, 200.0, 1000.0, 2000.0, 1000.0);
		List<String> arraySalary=fileRead.getData("C:\\Users\\manav\\Desktop\\salary.txt");
		Salary salary=new Salary(Double.parseDouble(arraySalary.get(0)),Double.parseDouble(arraySalary.get(1)),Double.parseDouble(arraySalary.get(2)),Double.parseDouble(arraySalary.get(3)),Double.parseDouble(arraySalary.get(4)),Double.parseDouble(arraySalary.get(5)),Double.parseDouble(arraySalary.get(6)));
		System.out.println(salary.toString());
		
		//PersonalDetails personalDetails=new PersonalDetails(512, "A+", "X356265", "HG73HH", "CT677Y");
		List<String> arrayPersonalDetails=fileRead.getData("C:\\Users\\manav\\Desktop\\personalDetails.txt");
		PersonalDetails personalDetails=new PersonalDetails(Integer.parseInt(arrayPersonalDetails.get(0)),arrayPersonalDetails.get(1),arrayPersonalDetails.get(2),arrayPersonalDetails.get(3),arrayPersonalDetails.get(4));
		System.out.println(personalDetails.toString());
		
//		String pattern = "MM/dd/yyyy";
//	    SimpleDateFormat format = new SimpleDateFormat(pattern);
//		Date startDate= format.parse("03/03/2016");
//		Date endDate= format.parse("03/03/2017");
//		Date dateOfJoining= format.parse("01/20/2016");
//		Date dateOfBirth= format.parse("07/06/1995");
//		Date dateOfEnding= format.parse("01/01/3016");
//		Project project=new Project(512, "BayBeach", startDate, endDate);
	
		
		//Employee employee= new Employee("Manav", "Diwakar", "XI512", 21, address, salary, dateOfBirth, dateOfJoining, dateOfEnding, personalDetails, 2, project, "Male", Designation.TRAINEE);
		
		
	//	List<String> arrayEmployee=fileRead.getData("C:\\Users\\manav\\Desktop\\employee.txt");
//		Employee employee= new Employee(arrayEmployee.get(0),arrayEmployee.get(1),arrayEmployee.get(2),Integer.parseInt(arrayEmployee.get(3)),arrayEmployee.get(4),arrayEmployee.get(5),arrayEmployee.get(6),arrayEmployee.get(7));
		//System.out.println("Name : "+employee.getName()+"\n Father's Name : "+employee.getFatherName()+"\n Id : "+employee.getId()+"\n Age : "+employee.getAge()+"\n Address : "+address.getHouseNumber()+" "+address.getStreet()+" "+address.getArea()+" "+address.getCity()+" "+address.getPinCode()+" "+address.getState()+"\n Salary : ");
		//System.out.println(employee.toString());
	}

}

