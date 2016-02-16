
package com.xebia.training;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;



public class employeeobjectreadTest {
    EmployeeData empdata;
    Address address;
    Contact contact;
    Salary salarylist;
    Set<Project> projectlist;
    @Test
    public void testReademp() throws Exception {
     //   Employee list = new Employee();


        address=(new Address(101,71,30,"Gurgaon",249403,"Uttrakhand","Hilly","kishor@gmail.com",Address.addresstype.CORRESPONDANCE));

        Contact contact = new Contact(101,"kishor@gmail.com",9458943313l);


        Department department = new Department(101,"Finance",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);


        PersonalDetails personal = new PersonalDetails(101,1234443l,344455l,233444l,4433444444l,"B +",PersonalDetails.maritialStatus.SINGLE,"Mandavi","N.K.Nigam",new SimpleDateFormat("dd-MM-yyyy").parse("26-01-1996"),new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);

        projectlist = new HashSet<Project>();
        Project project = new Project(101,1002,"XYZ",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"),null);
        projectlist.add(project);

        Salary salary = new Salary(101,175000);

        empdata=new EmployeeData(101,3, EmployeeData.designation.QA_ANALYST);
        Employee emp = new Employee(empdata,address,contact,department,personal,projectlist,salary);


        Employee employee = new EmployeeObjectRead().inputEmployee(101);
      //  Employee s=future.get();

     assertEquals(emp, employee);

    }
}
