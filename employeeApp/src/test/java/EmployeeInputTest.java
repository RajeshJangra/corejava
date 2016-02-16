
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import employeeApplication.Address;
import employeeApplication.Address.AddressType;
import employeeApplication.Department;
import employeeApplication.Employee;
import employeeApplication.Employee.Designation;
import employeeApplication.EmployeeInput;
import employeeApplication.PersonalDetails;
import employeeApplication.PersonalDetails.MaritalStatus;
import employeeApplication.Project;
import employeeApplication.Salary;


public class EmployeeInputTest {
 public EmployeeInputTest() {
 
}
 @Test
 public void setInputtest() throws DOMException, IOException, ParserConfigurationException, SAXException, ParseException, InterruptedException, ExecutionException {
  
  Map<Integer,Employee> employeeMap = new HashMap<Integer, Employee>();
  
  
  Date startingDate = new SimpleDateFormat("dd-MM-yyyy").parse("03-02-2015");
  Date dOB = new SimpleDateFormat("dd-MM-yyyy").parse("30-08-1992");
  
  EmployeeInput employee = new EmployeeInput();
  employeeMap=employee.setinput();
  //System.out.println(employeeMap.get(110));
  
  List<Address> list2 = new ArrayList<Address>();
  Address address = new Address(1,1.0,420,"14","PAPRATAND","GIRIDIH",815301, "JHARKHAND", "NOTHING",977516,
		    "VISHALSINGH@xebia.com","VISHALSINGH0007",AddressType.PERMANENT);
  list2.add(address);
  
  List<Department> list3 = new ArrayList<Department>();
  Department department= new Department(1,1.0,"INFORMATICS",new SimpleDateFormat("dd-MM-yyyy").parse("03-02-2015"),
		   new SimpleDateFormat("dd-MM-yyyy").parse("03-07-2016")); 
  list3.add(department);
  
  List<PersonalDetails> list4 = new ArrayList<PersonalDetails>();
  PersonalDetails personal = new PersonalDetails(1,1, "ASDFGHJKL", "QWERTYUIOP",
		    "B+ve", MaritalStatus.SINGLE,
		   "ZXCVBNM");
  list4.add(personal);
  
  List<Project> list = new ArrayList<Project>();
  Project project1=new Project(1,1,"BEACHBODY", new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2016"),null);
  Project project2 = new Project(1,2,"JETAIRWAYS",new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2017"),null);
  Project project3 = new Project(1,3,"WEBDESIGN",new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2018"),null);
  list.add(project1);
  list.add(project2);
  list.add(project3);
 
  List<Salary> list1 = new ArrayList<Salary>();
  Salary sal = new Salary(1,511,30000);
  list1.add(sal);
  
  Employee emp = new Employee("VISHAL", startingDate,"AWADH SINGH", null,"VISHALSINGH@xebia.com",Designation.TRAINEE,"13/B gurgaon,haryana,India"
    ,"B-26,PAPRATAND,GIRIDIH","1","MALE", dOB,1, list1, list,list4,list3,list2);
  System.out.println(employeeMap.get(1));
  System.out.println(emp);
  
  assertEquals(employeeMap.get(1).toString(),emp.toString());
 }
  @Test
 public void terminattest() throws ParseException, InterruptedException, ExecutionException
  {
	  List<Project> list = new ArrayList<Project>();
	  Project project1 = new Project(1,1,"BEACHBODY", new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2016"), new Date());
	  Project project2 = new Project(1,2,"JETAIRWAYS", new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2017"), new Date());
	  Project project3 = new Project(1,3,"WEBDESIGN",new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2018"),new Date());
	  list.add(project1);
	  list.add(project2);
	  list.add(project3);
	  System.out.println(list);
	  EmployeeInput employee = new EmployeeInput();
	  List<Project> projects=employee.terminate(1); 
	  System.out.println(projects);
	 
	  assertEquals(list.toString(),projects.toString());
  }
  
  
  
 }
 


