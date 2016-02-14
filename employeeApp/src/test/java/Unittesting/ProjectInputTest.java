package Unittesting;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import Employeefile.Project;
import Employeefile.ProjectInput;

public class ProjectInputTest {

	ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
	
	@Test
	public void calltest() throws InterruptedException, ExecutionException, ParseException {
		
			ProjectInput projectinput = new ProjectInput(110);
			@SuppressWarnings("unchecked")
			Future<List<Project>> futureTask5=executor1.submit(projectinput) ;
			List<Project> project = futureTask5.get();

			List<Project> list = new ArrayList<Project>();
			Project project1 = new Project(110,1,"JetAirways", new SimpleDateFormat("dd-MM-yyyy").parse("11-01-2016"), null);
			Project project2 = new Project(110,2,"Mckenzi", new SimpleDateFormat("dd-MM-yyyy").parse("21-05-2016"), null);
			list.add(project1);
			list.add(project2);
			
			//System.out.println(project);
			//System.out.println(list);
			assertEquals(project,list);
	}

}
