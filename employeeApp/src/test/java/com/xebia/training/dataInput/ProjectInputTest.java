package com.xebia.training.dataInput;

import com.xebia.training.employeeInformation.Project;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ProjectInputTest {

    @Test
    public void testInputProject() throws Exception {
        Project projectTest1 = new Project(1, "SPICEJET", new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2016"));
        Project projectTest2 = new Project(2, "INDIGO", new SimpleDateFormat("dd-MM-yyyy").parse("01-02-2016"));
        Project projectTest3 = new Project(3, "AMAZON", new SimpleDateFormat("dd-MM-yyyy").parse("01-03-2016"));
        Set<Project> projectSetTest = new HashSet<>();
        projectSetTest.add(projectTest1);
        projectSetTest.add(projectTest2);
        projectSetTest.add(projectTest3);

        Set<Project> projectInput1 = new ProjectInput().inputProject("XI101");
        Set<Project> projectInput2 = new ProjectInput().inputProject("XI102");

        assertEquals(projectInput1, projectSetTest);
        assertNotEquals(projectInput2, projectSetTest);
    }
}