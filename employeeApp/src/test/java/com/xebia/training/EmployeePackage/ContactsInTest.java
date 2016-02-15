package com.xebia.training.EmployeePackage;

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
public class ContactsInTest  {
    @Test
    public  void testCall()throws Exception {

        Contacts contacts=new Contacts(101,10010,"pj@gmail.com") ;

        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        ContactsIn contactsIn = new ContactsIn(101);
        Future<Contacts> futureTask1=executor1.submit(contactsIn);
        Contacts contacts1= (Contacts) futureTask1.get();
        assertEquals(contacts, contacts1);
    }
}

