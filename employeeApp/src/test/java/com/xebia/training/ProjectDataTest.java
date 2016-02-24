package com.xebia.training;

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

import com.xebia.training.Employee1.Project;
import com.xebia.training.Employee2.ProjectData;

public class ProjectDataTest {

	@Test
	public void test() throws ParseException, InterruptedException, ExecutionException {
		List<Project> list = new ArrayList<>();
		Project project = new Project(1, 1, "Pioneer", new SimpleDateFormat(
				"dd-MM-yyyy").parse("11-01-2014"), null);
		
		list.add(project);
		Project project1 = new Project(1, 2, "Pantha", new SimpleDateFormat(
				"dd-MM-yyyy").parse("11-01-2014"),new SimpleDateFormat(
						"dd-MM-yyyy").parse("15-02-2016"));
		list.add(project1);
		Project project2 = new Project(1, 3, "Grindr", new SimpleDateFormat(
				"dd-MM-yyyy").parse("11-01-2014"),null);
		list.add(project2);
		
		ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
		ProjectData projectData = new ProjectData(1);
		Future<List<Project>> futureTask = executor1.submit(projectData);
		List<Project> project3 = futureTask.get();
		
		assertEquals(list,project3);
		
		
	}

}
