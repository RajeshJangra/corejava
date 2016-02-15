package com.xebia.training;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertEquals;

/**
 * Created by mkishore on 2/12/2016.
 */
public class departmentreadTest {

    @Test
    public void testCall() throws Exception {

        Department department = new Department(102,"Developer",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);

        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        departmentread departData = new departmentread(102);
        Future<Department> futureTask1 = executor1.submit(departData);

        Department depart1 = futureTask1.get();
        assertEquals(department, depart1);
    }
}