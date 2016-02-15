package com.xebia.training;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.Department;
import com.xebia.training.InputProject;
import com.xebia.training.Project;

public class InputProjectTest {
	
	ThreadPoolExecutor executor3= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

	@Test
	public void test() throws ParseException, InterruptedException, ExecutionException {
		
		 List<Project> list = new ArrayList<Project>();
		Project  proj = new Project(101,"Project", new SimpleDateFormat("dd-MM-yyyy").parse("10-01-2016"),null);
		  list.add(proj);
		 
		  InputProject obj2=new InputProject(101);
			FutureTask<List<Project>> task2= (FutureTask<List<Project>>) executor3.submit(obj2);
			List<Project> project1=task2.get();
			
			assertEquals(project1,list);
		  
		
		
	}

}
