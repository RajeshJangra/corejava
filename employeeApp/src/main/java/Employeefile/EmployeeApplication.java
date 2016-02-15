package Employeefile;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

public class EmployeeApplication {
	static int id,id1;
	static Scanner sc;
	static String choice;
		public static void main(String args[]) throws NumberFormatException, IOException, ParseException, InterruptedException, ExecutionException, DOMException, ParserConfigurationException, SAXException {

			EmployeeInput employee = new EmployeeInput();

			Map<Integer, Employee> Emp=employee.setinput();
			sc=new Scanner(System.in);
			System.out.println("Want to print whole employee database:-");
			choice=sc.nextLine();
			if(choice.equalsIgnoreCase("y"))
			{
				System.out.println(Emp);
			}
			else
			{
				System.out.println("enter the ID:");
				sc = new Scanner(System.in);
				id=sc.nextInt();
				System.out.println(Emp.get(id));
				System.out.println("enter projecid to terminate:");
				id1=sc.nextInt();
				Termination term=new Termination();
				System.out.println(term.terminate(Emp,id1,id).get(id));
			}
		}

}
