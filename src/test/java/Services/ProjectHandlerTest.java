package Services;

import EntityModels.Contact;
import EntityModels.Project;
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
public class ProjectHandlerTest {

    ProjectHandler mock = mock(ProjectHandler.class);
    Project project = new Project();
    ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);

    @Test
    public void testGetContactList() throws Exception {
        List<Project> projectList = new ArrayList<Project>();
        when(mock.getProjectList()).thenReturn(projectList);
    }

    @Test
    public void testCall() throws Exception {
        ProjectHandler projectHandler = new ProjectHandler();
        Future<List<Project>> future = poolExecutor.submit(projectHandler);
        List<Project> projects = future.get();
        List<Project> projectList = projectHandler.getProjectList();
        assertNotNull(project);
        assertNotEquals(projects, project);
        assertNotEquals(projectList, project);
    }
}