package com.xebia.training;

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
public class AddressreadTest {

    @Test
    public void testCall() throws Exception {

        Address address = new Address(101,71,30,"Gurgaon",249403,"Uttrakhand","Hilly","kishor@gmail.com",Address.addresstype.CORRESPONDANCE);


        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        Addressread addressData = new Addressread(101);
        Future<Address> futureTask1 = executor1.submit(addressData);

        Address addresses1 = futureTask1.get();
        assertEquals(address, addresses1);

    }
}