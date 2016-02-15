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
public class contactreadTest {

    @Test
    public void testCall() throws Exception {
        List<Contact> list = new ArrayList<Contact>();
        Contact contact = new Contact(101,"kishor@gmail.com",9458943313l);
        list.add(contact);

        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        contactread addressData = new contactread(101);
        Future<List<Contact>> futureTask1 = executor1.submit(addressData);

        List<Contact> contacts1 = futureTask1.get();
        assertEquals(list, contacts1);

    }
    }
