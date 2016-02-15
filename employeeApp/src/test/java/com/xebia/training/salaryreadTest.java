package com.xebia.training;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertEquals;

/**
 * Created by mkishore on 2/12/2016.
 */
public class salaryreadTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCall() throws Exception {

        Salary salary = new Salary(101,175000);


        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        salaryread salaryData = new salaryread(101);
        Future<Salary> futureTask1 = executor1.submit(salaryData);
        Salary salary1 = futureTask1.get();
        assertEquals(salary, salary1);
    }
}