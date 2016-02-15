package testing;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.Contact;
import com.xebia.training.Department;

public class InputDepartmentTest {
	
	ThreadPoolExecutor executor2= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

	@Test
	public void test() throws ParseException {

		 List<Department> list = new ArrayList<Department>();
		 Department dep = new Department(101,"Management", new SimpleDateFormat("dd-MM-yyyy").parse("10-01-2016"),new SimpleDateFormat("dd-MM-yyyy").parse("10-01-2016"));
		  list.add(dep);
	}

}
