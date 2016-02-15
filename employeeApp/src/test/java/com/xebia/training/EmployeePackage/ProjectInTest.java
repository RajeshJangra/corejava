package com.xebia.training.EmployeePackage;

import com.xebia.training.EmployeePackage.Project;
import com.xebia.training.EmployeePackage.ProjectIn;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.*;

public class ProjectInTest {

    @Test
    public void testCall() throws Exception {
        List<Project> list = new ArrayList<>();
        Project project = new Project(101,new SimpleDateFormat("dd-MM-yyyy").parse("19-02-2016"),
               null,"Grindr");
        list.add(project);

        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        ProjectIn project1 = new ProjectIn(101);
        Future<List<Project>> futureTask1 = executor1.submit(project1);

        List<Project> project2 = futureTask1.get();
        assertEquals(list, project2);

    }
}