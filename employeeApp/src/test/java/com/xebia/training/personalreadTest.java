package com.xebia.training;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertEquals;

/**
 * Created by mkishore on 2/12/2016.
 */
public class personalreadTest {

    @Test
    public void testCall() throws Exception {
        List<PersonalDetails> list = new ArrayList<PersonalDetails>();
        PersonalDetails personal = new PersonalDetails(102,1234443l,344455l,233444l,4433444444l,"B +",PersonalDetails.maritialStatus.SINGLE,"Mandavi","N.K.Nigam",new SimpleDateFormat("dd-MM-yyyy").parse("26-01-1996"),new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);
        list.add(personal);

        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        personalread departData = new personalread(102);
        Future<List<PersonalDetails>> futureTask1 = executor1.submit(departData);

        List<PersonalDetails> personal1 = futureTask1.get();
        assertEquals(list, personal1);
    }
}