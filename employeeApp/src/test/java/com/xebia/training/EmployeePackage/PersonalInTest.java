package com.xebia.training.EmployeePackage;

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
public class PersonalInTest  {
    @Test
    public  void testCall()throws Exception {
//        List<PersonalDetails> list = new ArrayList<PersonalDetails>();
        PersonalDetails personalDetails=new PersonalDetails(101,"a101","p101","A+","e101","l101");
//        list.add(personalDetails);
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        PersonalIn personalIn = new PersonalIn(101);
        Future<PersonalDetails> futureTask1=executor1.submit(personalIn);
        PersonalDetails personal1= (PersonalDetails) futureTask1.get();
        assertEquals(personalDetails, personal1);
    }
}