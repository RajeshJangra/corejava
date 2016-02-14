package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Address;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by nitishkumar on 12-Feb-16.
 */
public class AddressInputTest {


    @Test
    public void testInputAddress() throws Exception {

        List<Address> addressList= new ArrayList<>();
        Address addressTemporary=new Address(1,30,"Star Mall","Gurgaon","Hariyana",122001,Address.AddressType.TEMPORARY);
        Address addressPermanent=new Address(1,15,"DLF Star Mall","Gurgaon","Hariyana",122001,Address.AddressType.PERMANENT);
        Address addressCorrespondence=new Address(1,10,"DLF Cyber City","Gurgaon","Hariyana",122001,Address.AddressType.CORRESPONDENCE);
        addressList.add(addressTemporary);
        addressList.add(addressPermanent);
        addressList.add(addressCorrespondence);

        AddressInput addressInput=new AddressInput();
        assertEquals(addressList,addressInput.inputAddress("XI101"));
    }
}