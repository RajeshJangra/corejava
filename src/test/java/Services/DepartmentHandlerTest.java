package Services;

import EntityModels.Contact;
import EntityModels.Department;
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
public class DepartmentHandlerTest {

    DepartmentHandler mock = mock(DepartmentHandler.class);
    Department department = new Department();
    ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);

    @Test
    public void testGetContactList() throws Exception {
        List<Department> departmentList = new ArrayList<Department>();
        when(mock.getDepartmentList()).thenReturn(departmentList);
    }

    @Test
    public void testCall() throws Exception {
        DepartmentHandler departmentHandler = new DepartmentHandler();
        Future<List<Department>> future = poolExecutor.submit(departmentHandler);
        List<Department> departments = future.get();
        List<Department> departmentList = departmentHandler.getDepartmentList();
        assertNotNull(department);
        assertNotEquals(departments,department);
        assertNotEquals(departmentList,department);
    }
}