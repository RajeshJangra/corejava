package Unittesting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import Employeefile.Salary;
import Employeefile.SalaryInput;

public class SalaryInputTest {

	public SalaryInputTest() {
	}
	ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
	@SuppressWarnings("unchecked")
	@Test
	public void calltest() throws InterruptedException, ExecutionException {
		
		List<Salary> list = new ArrayList<Salary>();
		Salary sal = new Salary(110,1.0,200000.0);
		list.add(sal);
		
		List<Salary> list1 = new ArrayList<Salary>();
		Salary sal1 = new Salary(110,1.0,2000.0);
		list1.add(sal1);
		
		
		SalaryInput salaryinput = new SalaryInput(110);
	    Future<List<Salary>> futureTask4 = executor1.submit(salaryinput);
	    List<Salary> salary = futureTask4.get();
	    assertEquals(salary,list);
	    assertNotEquals(salary,list1);
	}

}


