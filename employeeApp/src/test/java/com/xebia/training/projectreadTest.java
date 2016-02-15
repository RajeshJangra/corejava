package com.xebia.training;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertEquals;

/**
 * Created by mkishore on 2/12/2016.
 */
public class projectreadTest {

    @Test
    public void testCall() throws Exception {
        Set<Project> list = new HashSet<Project>();
        Project project = new Project(103,1002,"XYZ",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);
       Project project1=new Project(103,1003,"CDZ",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);
        list.add(project);
        list.add(project1);
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        projectread projectData = new projectread(103);
        Future<Set<Project>> futureTask1 = executor1.submit(projectData);
        Set<Project> salary1 = futureTask1.get();
        assertEquals(list, salary1);
    }
}