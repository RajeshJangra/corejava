
package com.xebia.training;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertEquals;



public class allreadTest {
    EmployeeData empdata;
    List<Address> address;
    List<Contact> contactlist;
    List<Department> departmentlist;
    List<Salary> salarylist;
    Set<Project> projectlist;
    @Test
    public void testReademp() throws Exception {
     //   Employee list = new Employee();
        address=new ArrayList<Address>();
        address.add(new Address(101,71,30,"Gurgaon",249403,"Uttrakhand","Hilly","kishor@gmail.com",Address.addresstype.CORRESPONDANCE));
        contactlist = new ArrayList<Contact>();
        Contact contact = new Contact(101,"kishor@gmail.com",9458943313l);
        contactlist.add(contact);
        departmentlist = new ArrayList<Department>();
        Department department = new Department(101,"Finance",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);
        departmentlist.add(department);
        List<PersonalDetails> personallist = new ArrayList<PersonalDetails>();
        PersonalDetails personal = new PersonalDetails(101,1234443l,344455l,233444l,4433444444l,"B +",PersonalDetails.maritialStatus.SINGLE,"Mandavi","N.K.Nigam",new SimpleDateFormat("dd-MM-yyyy").parse("26-01-1996"),new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2018"));
        personallist.add(personal);
        projectlist = new HashSet<Project>();
        Project project = new Project(101,1002,"XYZ",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),new SimpleDateFormat("dd-MM-yyyy").parse("18-02-2018"));
        projectlist.add(project);
        salarylist = new ArrayList<Salary>();
        Salary salary = new Salary(101,175000);
        salarylist.add(salary);
        empdata=new EmployeeData(101,3, EmployeeData.designation.QA_ANALYST);
        Employee emp = new Employee(empdata,address,contactlist,departmentlist,personallist,projectlist,salarylist);


        Employee employee = new allread().inputEmployee(101);
      //  Employee s=future.get();

     assertEquals(emp, employee);

    }
}
