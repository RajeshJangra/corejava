package Employeefile;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class EmployeeApplication {
	static int id;
	static Scanner sc;
		public static void main(String args[]) throws NumberFormatException, IOException, ParseException, InterruptedException, ExecutionException {

			EmployeeInput employee = new EmployeeInput();
			System.out.println("enter the ID:");
			sc = new Scanner(System.in);
			id=sc.nextInt();
			System.out.println(employee.setinput().get(id));
			
		}

}
