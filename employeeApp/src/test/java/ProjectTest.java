
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import employeeApplication.Project;
import employeeApplication.ProjectInput;

public class ProjectTest {

 ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
 
 @SuppressWarnings("unchecked")
 @Test
 public void calltest() throws InterruptedException, ExecutionException, ParseException {
  
  ProjectInput projectinput = new ProjectInput(1);
  Future<List<Project>> futureTask2 = executor1.submit(projectinput);
  List<Project> project = futureTask2.get();
  
  List<Project> list = new ArrayList<Project>();
  Project projectinput1 = new Project(1,1,"BEACHBODY", new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2016"),
		    null);
  Project projectinput2=new Project(1,2,"JETAIRWAYS",new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2017"),null);
  Project projectinput3=new Project(1,3,"WEBDESIGN",new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2018"),null);
  list.add(projectinput1);
  list.add(projectinput2);
  list.add(projectinput3);
  System.out.println(list);
  System.out.println(project);
  assertEquals(project,list);
 }

}
