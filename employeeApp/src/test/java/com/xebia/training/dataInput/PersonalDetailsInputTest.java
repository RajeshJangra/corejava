package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.PersonalDetails;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PersonalDetailsInputTest {

    @Test
    public void testInputPersonalDetails() throws Exception {
        PersonalDetails personalDetailsTest = new PersonalDetails("NITISH KUMAR", "S S SINHA", "S DEVI", "BR10101010", 324545334543L, "CUAPK5453N", new SimpleDateFormat("dd-MM-yyyy").parse("18-04-1994"), PersonalDetails.Gender.MALE, PersonalDetails.BloodGroup.O_POSITIVE, PersonalDetails.MaritalStatus.UNMARRIED);

        PersonalDetails personalDetailsInput1 = new PersonalDetailsInput().inputPersonalDetails("XI101");
        PersonalDetails personalDetailsInput2 = new PersonalDetailsInput().inputPersonalDetails("XI102");

        assertEquals(personalDetailsInput1, personalDetailsTest);
        assertNotEquals(personalDetailsInput2, personalDetailsTest);
        assertEquals(personalDetailsInput1.toString(), personalDetailsTest.toString());
        assertEquals(personalDetailsInput1.hashCode(), personalDetailsTest.hashCode());
    }
}