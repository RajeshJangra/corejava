package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Address;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AddressInputTest {


    @Test
    public void testInputAddress() throws Exception {
        List<Address> addressListTest = new ArrayList<>();
        Address addressTemporary = new Address(1, 30, "Star Mall", "Gurgaon", "Haryana", 122001, Address.AddressType.TEMPORARY);
        Address addressPermanent = new Address(1, 15, "DLF Star Mall", "Gurgaon", "Haryana", 122001, Address.AddressType.PERMANENT);
        Address addressCorrespondence = new Address(1, 10, "DLF Cyber City", "Gurgaon", "Haryana", 122001, Address.AddressType.CORRESPONDENCE);
        addressListTest.add(addressTemporary);
        addressListTest.add(addressPermanent);
        addressListTest.add(addressCorrespondence);

        List<Address> addressListInput1 = new AddressInput().inputAddress("XI101");
        List<Address> addressListInput2 = new AddressInput().inputAddress("XI102");

        assertEquals(addressListInput1, addressListTest);
        assertNotEquals(addressListInput2, addressListTest);
    }
}