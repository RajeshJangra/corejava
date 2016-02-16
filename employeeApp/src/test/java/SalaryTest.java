

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

import employeeApplication.Salary;
import employeeApplication.SalaryInput;

public class SalaryTest {

 ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
 
 @SuppressWarnings("unchecked")
 @Test
 public void calltest() throws InterruptedException, ExecutionException, ParseException {
  
  SalaryInput salaryInput = new SalaryInput(1);
  Future<List<Salary>> futureTask2 = executor1.submit(salaryInput);
  List<Salary> salary = futureTask2.get();
  
  List<Salary> list = new ArrayList<Salary>();
  Salary salary1 = new Salary(1,511,30000);
  list.add(salary1);
  System.out.println(list);
  System.out.println(salary);
  assertEquals(salary,list);
 }
}
