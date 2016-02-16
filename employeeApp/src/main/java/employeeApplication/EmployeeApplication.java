package employeeApplication;


import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

public class EmployeeApplication {
 static int id;
 static Scanner sc;
  public static void main(String args[]) throws NumberFormatException, IOException, ParseException, InterruptedException, ExecutionException, DOMException, ParserConfigurationException, SAXException {

   EmployeeInput employee = new EmployeeInput();
   System.out.println("enter the ID:");
   sc = new Scanner(System.in);
   id=sc.nextInt();
   System.out.println(employee.setinput().get(id));
   System.out.println("enter employeeId:");
   List<Project> projects=employee.terminate(sc.nextInt()); 
   System.out.println(projects);
  }

}