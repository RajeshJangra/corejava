package com.xebia.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import static org.junit.Assert.*;
public class ProjectTest {
	@Test
	@SuppressWarnings("unchecked")
	public void callTest() throws InterruptedException, ExecutionException, ParseException {
		ProjectUtils projectUtils=new ProjectUtils(512);
		 ExecutorService executorService = Executors.newFixedThreadPool(6);
		 Future<List<Project>> futureProjects=executorService.submit(projectUtils);
		 List<Project> projects=futureProjects.get();
		 List<Project> projects2=new ArrayList<Project>();
		 Project project=new Project(512, 3425, "SPICEJET", new SimpleDateFormat("dd-MM-yyyy").parse("20-01-2016"), null);
		 projects2.add(project);
		 assertEquals(projects2,projects);
	}
}
