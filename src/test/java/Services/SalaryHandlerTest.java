package Services;

import EntityModels.Contact;
import EntityModels.Salary;
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
public class SalaryHandlerTest {

    SalaryHandler mock = mock(SalaryHandler.class);
    Salary salary = new Salary();
    ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);

    @Test
    public void testGetContactList() throws Exception {
        List<Salary> salaryList = new ArrayList<Salary>();
        when(mock.getSalaryList()).thenReturn(salaryList);
    }

    @Test
    public void testCall() throws Exception {
        SalaryHandler salaryHandler = new SalaryHandler();
        Future<List<Salary>> future = poolExecutor.submit(salaryHandler);
        List<Salary> salaries = future.get();
        List<Salary> salaryList = salaryHandler.getSalaryList();
        assertNotNull(salary);
        assertNotEquals(salaries, salary);
        assertNotEquals(salaryList, salary);
    }
}