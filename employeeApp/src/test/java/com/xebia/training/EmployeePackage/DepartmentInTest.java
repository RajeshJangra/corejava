package com.xebia.training.EmployeePackage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pjhanwar on 14-02-2016.
 */

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by pjhanwar on 14-02-2016.
 */
public class DepartmentInTest  {
    @Test
    public  void testCall()throws Exception {
//        List<Department> list=new ArrayList<Department>();
        Department department=new Department(101,"Trainee",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);
//        list.add(department);
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        DepartmentIn departmentIn = new DepartmentIn(101);
        Future<Department> futureTask1=executor1.submit(departmentIn);
        Department department1= (Department) futureTask1.get();
        assertEquals(department, department1);
    }
}
/*
public class DepartmentInTest {

    @Test
    public void testCall() throws Exception {

    }
}*/
