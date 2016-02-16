package Services;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kchoudhary on 15-Feb-16.
 */
public class EmployeeExecutorTest {

    EmployeeExecutor employeeExecutor;

    @Before
    public void setUp() throws Exception {
        employeeExecutor = new EmployeeExecutor();
    }

    @Test
    public void testPrintEmployeeData() throws Exception {
        List dataOfEmployee1 = new ArrayList();
        dataOfEmployee1.add(new ContactHandler().call().get(0));
        List dataOfEmployee2 = new ArrayList();
        dataOfEmployee2.add(new ContactHandler().call().get(1));
        assertNotEquals(dataOfEmployee1,dataOfEmployee2);
        assertEquals(new ContactHandler().call().get(0)+"",dataOfEmployee1.get(0)+"");
        assertEquals(new ContactHandler().call().get(1)+"",dataOfEmployee2.get(0)+"");
        assertEquals("15-09-1993",new PersonalDetailsHandler().call().get(0).getDob());
        assertNotEquals(new AgeCalculator(new PersonalDetailsHandler().call().get(0).getDob()),new AgeCalculator(new PersonalDetailsHandler().call().get(1).getDob()));
        assertNotNull(new AgeCalculator(new PersonalDetailsHandler().call().get(1).getDob()));
    }
}