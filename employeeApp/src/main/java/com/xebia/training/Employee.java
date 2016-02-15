package com.xebia.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*class empProject{
	private int empId;
	private int projectId;
	public empProject(int empId, int projectId) {
		super();
		this.empId = empId;
		this.projectId = projectId;
	}
	*//**
	 * @return the empId
	 *//*
	public int getEmpId() {
		return empId;
	}
	*//**
	 * @param empId the empId to set
	 *//*
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	*//**
	 * @return the projectId
	 *//*
	public int getProjectId() {
		return projectId;
	}
	*/

/**

public void setProjectId(int projectId) {
    this.projectId = projectId;
}
*//* (non-Javadoc)
 * @see java.lang.Object#toString()
 *//*
@Override
public String toString() {
    return "empProject [empId=" + empId + ", projectId=" + projectId + "]";
}

}*/
public class Employee {
public  int id;
Set<Project > project;
List<PersonalDetails> personalDetails;
List<Salary> salary;
List<Department> department;
List<Address> address;
List<Contact> contact;
String line;
int i;
private int work_exp;
designation d;
static String inpro="C:/Users/mkishore/Desktop/Today work/project.txt";
final String directory="C:/Users/mkishore/Desktop/Today work/";
//	BufferedReader in = Files.newBufferedReader(Paths.get(directory+"employeeInput.txt"));


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
    return "Employee [id=" + id + ", work_exp=" + work_exp + ", d=" + d
            + "]";
}
/*

public void endate()
{
    Calendar c=Calendar.getInstance();
    Date d= new SimpleDateFormat("dd-MM-yyyy").parse(Calendar.getInstance().toString());
}
*/

enum designation
{
    TRAINEE,
    PROJECT_ENGINEER,
    JAVA_DEVELOPER,
    ACCOUNTANT,
    QA_ANALYST,
    SCRUM_MASTER;
}



/**
 * @return the id
 */
public int getId() {
    return id;
}



/**
 * @param id the id to set
 */
public void setId(int id) {
    this.id = id;
}



/**
 * @return the work_exp
 */
public int getWork_exp() {
    return work_exp;
}



/**
 * @param work_exp the work_exp to set
 */
public void setWork_exp(int work_exp) {
    this.work_exp = work_exp;
}



/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
public Employee()
{	super();

}


public Employee(int id, int work_exp,designation d1) throws NumberFormatException, IOException, InterruptedException {
    super();
    this.id = id;
    this.work_exp = work_exp;
    this.d=d1;
    this.threadcall();

}
public void threadcall() throws IOException, InterruptedException {

    Employee e=new Employee();
    Employee.inproject in=e.new inproject(id);
    Thread iproject=new Thread(in);
    iproject.start();
    iproject.join();
    Employee.inpersonal inper=e.new inpersonal(id);
    Thread iper=new Thread(inper);
    iper.start();
    iper.join();
    Employee.insalary insal=e.new insalary(id);
    Thread isal=new Thread(insal);
    isal.start();
    isal.join();
    Employee.indepartment indep=e.new indepartment(id);
    Thread idep=new Thread(indep);
    idep.start();
    idep.join();
    Employee.inaddress inadd=e.new inaddress(id);
    Thread iadd=new Thread(inadd);
    iadd.start();
    iadd.join();
    Employee.incontact incon=e.new incontact(id);
    Thread icon=new Thread(incon);
    icon.start();
    icon.join();
}

class inproject implements Runnable
{
int id;
 String inpro="C:/Users/mkishore/Desktop/Today work/project.txt";
final String directory="C:/Users/mkishore/Desktop/Today work/";
Set<Project > project;
String line;
public inproject(int id)
{
    this.id=id;
}

public void run() {
    try {




        Employee emp=new Employee();

        BufferedReader	bufferedReader = Files.newBufferedReader(Paths.get(directory+"project.txt"));
        project=new HashSet<Project>();
        while((line = bufferedReader.readLine()) != null)
        {


            StringTokenizer st = new StringTokenizer(line);
            int t=Integer.parseInt(st.nextToken("/"));

            if(t==id)
            {

                int pidpro=Integer.parseInt(st.nextToken("/"));
                String namepro=st.nextToken("/");
                String stpro=st.nextToken("/");
                String enpro=st.nextToken("/");
                project.add(new Project(t,pidpro,namepro, new SimpleDateFormat("dd-MM-yyyy").parse(stpro),null));

            }
            else
                continue;
        }
        for(Project p:project)
        {
            System.out.println(p);
        }
        bufferedReader.close();

    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
class inpersonal implements Runnable
{
    int id;

    final String directory="C:/Users/mkishore/Desktop/Today work/";
    List<PersonalDetails> personalDetails;
    String line;
    public inpersonal(int id)
    {
        this.id=id;
    }

    public void run() {
        try{
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(directory+"personaldetails.txt"));
            while((line = bufferedReader.readLine()) != null)
            {
                //	System.out.println(line);


                StringTokenizer st = new StringTokenizer(line);
                int t=Integer.parseInt(st.nextToken("/"));
                if(t==id)
                {
                    personalDetails=new ArrayList<PersonalDetails>();


                    personalDetails.add(new PersonalDetails(t,Long.parseLong(st.nextToken("/")), Long.parseLong(st.nextToken("/")), Long.parseLong(st.nextToken("/")), Long.parseLong(st.nextToken("/")),st.nextToken("/"),PersonalDetails.maritialStatus.valueOf(st.nextToken("/")), st.nextToken("/"),st.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/")),new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/")),null));

                }
                else
                    continue;
            }
            for(PersonalDetails p:personalDetails)
            {
                System.out.println(p);
            }
            bufferedReader.close();
        }
        catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class insalary implements Runnable
{
    int id;

    final String directory="C:/Users/mkishore/Desktop/Today work/";
    List<Salary> salaryList;
    String line;
    public insalary(int id)
    {
        this.id=id;
    }

    public void run() {
        try
        {


            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(directory+"salary.txt"));
            while((line = bufferedReader.readLine()) != null)
            {
                //	System.out.println(line);


                StringTokenizer st = new StringTokenizer(line);
                int t=Integer.parseInt(st.nextToken("/"));
                if(t==id)
                {
                    salary=new ArrayList<Salary>();


                    salary.add(new Salary(t,Integer.parseInt(st.nextToken("/"))));

                }
                else
                    continue;
            }
            for(Salary p:salary)
            {
                System.out.println(p);
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

class indepartment implements Runnable
{
    int id;

    final String directory="C:/Users/mkishore/Desktop/Today work/";
    List<PersonalDetails> personalDetails;
    String line;
    public indepartment(int id)
    {
        this.id=id;
    }

    public void run() {
        try
        {


            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(directory+"department.txt"));
            while((line = bufferedReader.readLine()) != null)
            {
                //	System.out.println(line);


                StringTokenizer st = new StringTokenizer(line);
                int t=Integer.parseInt(st.nextToken("/"));
                if(t==id)
                {
                    department=new ArrayList<Department>();


                    department.add(new Department(t,st.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/")), null));

                }
                else
                    continue;
            }
            for(Department p:department)
            {
                System.out.println(p);
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
class inaddress implements Runnable
{
    int id;
    String inpro="C:/Users/mkishore/Desktop/Today work/project.txt";
    final String directory="C:/Users/mkishore/Desktop/Today work/";
    Set<Project > project;
    String line;
    public inaddress(int id)
    {
        this.id=id;
    }

    public void run() {
        try
        {


            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(directory+"address.txt"));
            while((line = bufferedReader.readLine()) != null)
            {
                //	System.out.println(line);


                StringTokenizer st = new StringTokenizer(line);
                int t=Integer.parseInt(st.nextToken("/"));
                if(t==id)
                {
                    address=new ArrayList<Address>();


                    address.add( new Address(t,Integer.parseInt(st.nextToken("/")),Integer.parseInt(st.nextToken("/")),st.nextToken("/"),Integer.parseInt(st.nextToken("/")),st.nextToken("/"),st.nextToken("/"),st.nextToken("/"),Address.addresstype.valueOf(st.nextToken("/"))));

                }
                else
                    continue;
            }
            for(Address p:address)
            {
                System.out.println(p);
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
class incontact implements Runnable
{
    int id;
    String inpro="C:/Users/mkishore/Desktop/Today work/project.txt";
    final String directory="C:/Users/mkishore/Desktop/Today work/";
    Set<Project > project;
    String line;
    public incontact(int id)
    {
        this.id=id;
    }

    public void run() {
        try {
            contact = new ArrayList<Contact>();
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(directory + "personaldetails.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                //	System.out.println(line);


                StringTokenizer st = new StringTokenizer(line);
                int t = Integer.parseInt(st.nextToken("/"));
                if (t == id) {


                    contact.add(new Contact(t, st.nextToken("/"), Long.parseLong(st.nextToken("/"))));

                } else
                    continue;
            }
            for (Contact p : contact) {
                System.out.println(p);
            }
            bufferedReader.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}

}