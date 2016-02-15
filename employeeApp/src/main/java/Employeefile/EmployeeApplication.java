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
		public static void main(String args[]) throws NumberFormatException, IOException, ParseException, InterruptedException, ExecutionException, DOMException, ParserConfigurationException, SAXException {

			EmployeeInput employee = new EmployeeInput();
			System.out.println("enter the ID:");
			sc = new Scanner(System.in);
			id=sc.nextInt();
			Map<Integer, Employee> Emp=employee.setinput();
			System.out.println(Emp.get(id));
			System.out.println("enter projecid to terminate:");
			id1=sc.nextInt();
			Termination term=new Termination();
			System.out.println(term.terminate(Emp,id1).get(id));
		}

}
