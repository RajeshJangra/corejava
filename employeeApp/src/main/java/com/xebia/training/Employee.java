package com.xebia.training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import com.xebia.training.Address;
import com.xebia.training.Address.addressType;


public class Employee {

	String line;
	private int id;
	private int work_exp;
	designation designation_obj;
	private ArrayList<Address> address;
	private ArrayList<Salary> salary;
	private ArrayList<Project> project;
private ArrayList<PersonalDetails> personaldetails;
private ArrayList<Contact> contact;

public void inputadd(int id) throws NumberFormatException, IOException
{
	
	ArrayList<Address> address=new ArrayList<Address>();
 
	
	String in4="C:\\Users\\spurwar\\Desktop\\add.txt";
	
	int n=0;
	FileReader fread4=new FileReader(in4);
	// FileWriter fwrite=new FileWriter(out);

	BufferedReader bufferedReader4 = new BufferedReader(fread4);
	// Address[] addr=new Address[3];

	while((line = bufferedReader4.readLine()) != null)
	{
		//  sb=sb+line;

		StringTokenizer st = new StringTokenizer(line);
		//String i=

		int id2=Integer.parseInt(st.nextToken("/"));
		//System.out.println(+id+" "+id2);
		if(id==id2)
		{

			
			String sec=st.nextToken("/");
			String cit=st.nextToken("/");
			String sta=st.nextToken("/");


			int ho=Integer.parseInt(st.nextToken("/"));

			int pin=Integer.parseInt(st.nextToken("/"));
			
			String str=st.nextToken("/");

			addressType ty=addressType.valueOf(st.nextToken("/"));

			address.add(new Address(id2, sec, cit, sta, ho, pin, str, ty));
			
		}//  System.out.println(x+y+n);
			// addr[n]=new Address(str,sec,cit,sta,ho,pin,id2,Address.addressType.valueOf(ty));

			//   System.out.println(addr[n]);
			//  System.out.println("Next token is : " + st.nextToken("/"));
	}
	for(Address p:address)
	{
		System.out.println(p);
	}
}


private void inputcon(int id) throws NumberFormatException, IOException
{
	 ArrayList<Contact> contact=new ArrayList<Contact>();
	 String in1="C:\\Users\\spurwar\\Desktop\\cont.txt";
	 
	 int j=0;
		FileReader fread1=new FileReader(in1);
		// FileWriter fwrite=new FileWriter(out);

		BufferedReader bufferedReader1 = new BufferedReader(fread1);
		 Contact[] cont=new Contact[3];

		while((line = bufferedReader1.readLine()) != null)
		{
			//  System.out.println(line);
			//  sb=sb+line;

			StringTokenizer st = new StringTokenizer(line);
			//String i=


			while(st.hasMoreElements())
			{
				int a=Integer.parseInt(st.nextToken("/"));
				long b=Long.parseLong(st.nextToken("/"));
				String c=st.nextToken("/");

				contact.add(new Contact(a, b, c));

				//  System.out.println(a+b+c);
				// cont[j]=new Contact(a, b,c);

				 // System.out.println(cont[j]);
				//  System.out.println("Next token is : " + st.nextToken("/"));
			}
		}
	 
		 for(Contact c1:contact)
			{
				System.out.println(c1);
			}
	 
}
 public void inputper()  throws NumberFormatException, IOException
 {
	// ArrayList<PersonalDetails> personaldetails=new ArrayList<PersonaDetails>();  
	 
	String in6="C:\\Users\\spurwar\\Desktop\\per.txt";

 }

       public void inputpro(int id) throws NumberFormatException, IOException
       {
    	   ArrayList<Project> project=new ArrayList<Project>();
    		 String in5="C:\\Users\\spurwar\\Desktop\\pro.txt";
    		 
    		 try {

    				int o=0;
    				FileReader fread5=new FileReader(in5);
    				// FileWriter fwrite=new FileWriter(out);

    				BufferedReader bufferedReader5 = new BufferedReader(fread5);
    				Project[] pro=new Project[5];

    				while((line = bufferedReader5.readLine()) != null)
    				{
    					System.out.println(line);
    					//  sb=sb+line;

    					StringTokenizer st = new StringTokenizer(line);
    					//String i=


    					
    						
    						int id3=Integer.parseInt(st.nextToken("/"));
    						
    						if(id==id3)
    							
    						{
    						
    						String na=st.nextToken("/");
                            Date date=new Date();
    						Date startdate = new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/"));
    						Date enddate= new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/"));

    						project.add(new Project(id3, na, startdate, enddate));
    						//  System.out.println(x+y+n);
    						// pro[0]=new Project(id3, na,startdate,enddate);

    						// System.out.println(pro[o]);
    						//  System.out.println("Next token is : " + st.nextToken("/"));
    					}
    				



    				//project = new Project(1, startdate, enddate,"Project");
    			} 
    		 }
    		 
    		
    		 
    		 catch (ParseException e) {
    				e.printStackTrace();
    	   
    			}
    		 
    		 for(Project p1:project)
 			{
 				System.out.println(p1);
 			}
       }
       
       public void inputdept(int id) throws NumberFormatException, IOException
       {
    	  
    	   ArrayList<Department> department=new ArrayList<Department>();
    	   
    	 String in3="C:\\Users\\spurwar\\Desktop\\dept.txt";
    	   try {


   			int m=0;
   			FileReader fread3=new FileReader(in3);
   			// FileWriter fwrite=new FileWriter(out);

   			BufferedReader bufferedReader3 = new BufferedReader(fread3);
   			Department[] dept=new Department[5];

   			while((line = bufferedReader3.readLine()) != null)
   			{
   				System.out.println(line);
   				//  sb=sb+line;

   				StringTokenizer st = new StringTokenizer(line);
   				//String i=
   				int id1=Integer.parseInt(st.nextToken("/"));
                               if(id==id1)
                               {
   				
   					

   					String de=st.nextToken("/");
   					Date startdate = new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/"));
   					Date enddate= new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/"));

   					department.add(new Department(id1, de, startdate, enddate));
   					//  System.out.println(x+y+n);
   					// dept[m]=new Department(id1, de, startdate, enddate);

   					//System.out.println(dept[m]);
   					//  System.out.println("Next token is : " + st.nextToken("/"));
   				}
   			}
    	   

   			//dept = new Department(1, "Management", startdate, enddate);
   		} 
    	   
    	   catch (ParseException e) {
   			e.printStackTrace();
   		}
   		
    	   for(Department d1:department)
			{
				System.out.println(d1);
			}
    	   
       }
       public void inputsal(int id)throws NumberFormatException, IOException
       {
    	 
    	   ArrayList<Salary> salary=new ArrayList<Salary>();
    	String in2="C:\\Users\\spurwar\\Desktop\\sal.txt";
    		
    		int k=0;
    		FileReader fread2=new FileReader(in2);
    		// FileWriter fwrite=new FileWriter(out);

    		BufferedReader bufferedReader2 = new BufferedReader(fread2);
    		// Salary [] sal=new Salary[9];

    		while((line = bufferedReader2.readLine()) != null)
    		{
    			// System.out.println(line);
    			//  sb=sb+line;

    			StringTokenizer st = new StringTokenizer(line);
    			//String i=


    			while(st.hasMoreElements())
    			{
    				int d=Integer.parseInt(st.nextToken("/"));
    				double ba=Double.parseDouble(st.nextToken("/"));
    				/* double hr=Double.parseDouble(st.nextToken("/"));
    			   double da=Double.parseDouble(st.nextToken("/"));
    			   double lt=Double.parseDouble(st.nextToken("/"));
    			   double pf=Double.parseDouble(st.nextToken("/"));
    			   double fp=Double.parseDouble(st.nextToken("/"));
    			   double gr=Double.parseDouble(st.nextToken("/")); */

    				salary.add(new Salary(d, ba));

    				// System.out.println();
    				// sal[k]=new Salary(d,ba);

    			//System.out.println(sal[k]);
    				// System.out.println("Next token is : " + st.nextToken("/"));
    			}
    		}


    		for(Salary s:salary)
    		{
    			System.out.println(s);
    		}
    	}

    		
    		
    	   
    	   
       

public Employee(int id, int work_exp, designation designation_obj,
		PersonalDetails personaldetails) throws NumberFormatException, IOException {
	super();
	this.id = id;
	this.work_exp = work_exp;
	this.designation_obj = designation_obj;
	this.inputadd(id);
	this.inputsal(id);
	this.inputpro(id);
	//this.personaldetails = personaldetails;
	this.inputcon(id);
	this.inputdept(id);
}

private Department department;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWork_exp() {
		return work_exp;
	}

	public void setWork_exp(int work_exp) {
		this.work_exp = work_exp;
	}

	public designation getDesignation_obj() {
		return designation_obj;
	}

	public void setDesignation_obj(designation designation_obj) {
		this.designation_obj = designation_obj;
	}

	
	
	enum designation
	{
		TRAINEE,
		PROJECTENGINEER,
		JAVADEVELOPER,
		ACCOUNTANT,
		QAANALYST,
		SCRUMMASTER,
		CEO;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", work_exp=" + work_exp + ", designation_obj=" + designation_obj + "]";
	}
	
}
