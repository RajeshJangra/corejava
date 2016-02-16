

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

//import employeeApplication.Address;
//import employeeApplication.Address.AddressType;
//import employeeApplication.AddressInput;
import employeeApplication.Department;
import employeeApplication.DepartmentInput;

public class DepartmentInputTest {

 ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
 
 @SuppressWarnings("unchecked")
 @Test
 public void calltest() throws InterruptedException, ExecutionException, ParseException {
  
  DepartmentInput departmentInput = new DepartmentInput(1);
  Future<List<Department>> futureTask2 = executor1.submit(departmentInput);
  List<Department> department = futureTask2.get();
  
  List<Department> list = new ArrayList<Department>();
  Department department1 = new Department(1,1.0,"INFORMATICS",new SimpleDateFormat("dd-MM-yyyy").parse("03-02-2015"),
		   new SimpleDateFormat("dd-MM-yyyy").parse("03-07-2016"));
  list.add(department1);
  System.out.println(list);
  System.out.println(department);
  assertEquals(department,list);
 }

}