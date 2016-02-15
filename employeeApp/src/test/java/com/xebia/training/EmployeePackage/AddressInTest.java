package com.xebia.training.EmployeePackage;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.*;

/**
 * Created by pjhanwar on 14-02-2016.
 */


    public class AddressInTest  {
        @Test
        public  void testCall()throws Exception {

          Address address=new Address(101,Address.Address_type.permanentAddress,801,"sector30","gurgaon","333333","haryana","area") ;

            ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
            AddressIn addressIn = new AddressIn(101);
            Future<Address> futureTask2=executor1.submit(addressIn);
            Address address1= (Address) futureTask2.get();
            assertEquals(address, address1);
        }
    }


