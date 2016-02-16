package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Contact;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ContactInputTest {

    @Test
    public void testInputContact() throws Exception {
        Contact contactTest = new Contact(7863962312L, "nitish@hotmail.com");

        Contact contactInput1 = new ContactInput().inputContact("XI101");
        Contact contactInput2 = new ContactInput().inputContact("XI102");

        assertEquals(contactInput1, contactTest);
        assertNotEquals(contactInput2, contactTest);
        assertEquals(contactInput1.toString(), contactTest.toString());
        assertEquals(contactInput1.hashCode(), contactTest.hashCode());
    }
}