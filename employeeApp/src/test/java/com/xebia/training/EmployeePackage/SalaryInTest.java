package com.xebia.training.EmployeePackage;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pjhanwar on 14-02-2016.
 */

import org.junit.Test;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by pjhanwar on 14-02-2016.
 */
public class SalaryInTest  {
    @Test
    public  void testCall()throws Exception {
//        List<PersonalDetails> list = new ArrayList<PersonalDetails>();


        Salary salary=new Salary(101,500000.00);
//        list.add(personalDetails);
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        SalaryIn salaryIn = new SalaryIn(101);
        Future<Salary> futureTask1=executor1.submit(salaryIn);
        Salary salary1= (Salary) futureTask1.get();
        assertEquals(salary, salary1);
    }
}