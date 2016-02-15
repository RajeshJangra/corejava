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
        List<Address> list = new ArrayList<Address>();
        Address address = new Address(101,71,30,"Gurgaon",249403,"Uttrakhand","Hilly","kishor@gmail.com",Address.addresstype.CORRESPONDANCE);
        list.add(address);

        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        Addressread addressData = new Addressread(101);
        Future<List<Address>> futureTask1 = executor1.submit(addressData);

        List<Address> addresses1 = futureTask1.get();
        assertEquals(list, addresses1);

    }
}