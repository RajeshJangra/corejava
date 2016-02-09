package Employeefile;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.ExecutionException;

public class EmployeeApplication {
	
		public static void main(String args[]) throws NumberFormatException, IOException, ParseException, InterruptedException, ExecutionException {

			DataEmployee employee = new DataEmployee();
			employee.setValues();
			
		}

}
