package Services;

import EntityModels.Contact;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by kchoudhary on 15-Feb-16.
 */
public class ContactHandlerTest {

    ContactHandler mock = mock(ContactHandler.class);
    Contact contact = new Contact();
    ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);

    @Test
    public void testGetContactList() throws Exception {
        List<Contact> contactList = new ArrayList<Contact>();
        when(mock.getContactList()).thenReturn(contactList);
    }

    @Test
    public void testCall() throws Exception {
        ContactHandler contactHandler = new ContactHandler();
        Future<List<Contact>> contactFuture = poolExecutor.submit(contactHandler);
        List<Contact> contacts = contactFuture.get();
        List<Contact> contactList = contactHandler.getContactList();
        assertNotNull(contact);
        assertNotEquals(contacts,contact);
        assertNotEquals(contactList,contact);
    }
}