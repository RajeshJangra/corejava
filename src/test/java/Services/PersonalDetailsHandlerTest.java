package Services;

import EntityModels.Contact;
import EntityModels.PersonalDetails;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by kchoudhary on 15-Feb-16.
 */
public class PersonalDetailsHandlerTest {

    PersonalDetailsHandler mock = mock(PersonalDetailsHandler.class);
    PersonalDetails personalDetails = new PersonalDetails();
    ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);

    @Test
    public void testGetContactList() throws Exception {
        List<PersonalDetails> personalDetailsList = new ArrayList<PersonalDetails>();
        when(mock.getPersonalDetailsList()).thenReturn(personalDetailsList);
    }

    @Test
    public void testCall() throws Exception {
        PersonalDetailsHandler personalDetailsHandler = new PersonalDetailsHandler();
        Future<List<PersonalDetails>> future = poolExecutor.submit(personalDetailsHandler);
        List<PersonalDetails> personalDetailses = future.get();
        List<PersonalDetails> personalDetailsList = personalDetailsHandler.getPersonalDetailsList();
        assertNotNull(personalDetails);
        assertNotEquals(personalDetailses, personalDetails);
        assertNotEquals(personalDetailsList, personalDetails);
    }
}