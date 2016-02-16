package com.xebia.training.EmployeePackage;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pjhanwar on 16-02-2016.
 */
public class ContactsTest {

    @Test
    public void testEquals() throws Exception {

            Contacts x = new Contacts(101,500000,"pk@gmail.com");  // equals and hashCode check name field value
            Contacts y = new Contacts(101,500000,"pk@gmail.com");
            Assert.assertTrue(x.equals(y) && y.equals(x));
        }

        @Test
        public void testHashCode() throws Exception {
            Contacts x = new Contacts(101,500000,"pk@gmail.com");  // equals and hashCode check name field value
            Contacts y = new Contacts(101,500000,"pk@gmail.com");

            Assert.assertTrue(x.hashCode() == y.hashCode());

        }
    }


