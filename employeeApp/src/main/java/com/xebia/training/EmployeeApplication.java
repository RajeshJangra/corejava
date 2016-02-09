package com.xebia.training;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import com.xebia.training.Address.addressType;
public class EmployeeApplication {
	static String line;
	static String des="C:\\Users\\spurwar\\Desktop\\"
			+ "";
	//static String in1="C:\\Users\\spurwar\\Desktop\\cont.txt";
	//static String in2="C:\\Users\\spurwar\\Desktop\\sal.txt";
	//static String in3="C:\\Users\\spurwar\\Desktop\\dept.txt";
	//static String in4="C:\\Users\\spurwar\\Desktop\\add.txt";
	//static String in5="C:\\Users\\spurwar\\Desktop\\pro.txt";
	static String in6="C:\\Users\\spurwar\\Desktop\\per.txt";


	public static <T> void main(String[] args) throws IOException
	{
		//	Employee <Integer> emp = new Employee (1, 3, Employee.designation.JAVADEVELOPER);

		//	Employee <String> emp1 = new Employee ("S100", 3, Employee.designation.JAVADEVELOPER);

		//List<Employee<T>> employee=new ArrayList<Employee>;
	
	//	Salary salary=null;;
	
	Contact contact=null;;
	Department department=null;
	PersonalDetails personaldetails=null;
				ArrayList<Project> project=new ArrayList<Project>();
				
		int i=0;
		FileReader fread=new FileReader(des+"raj.txt");
		// FileWriter fwrite=new FileWriter(out);

		BufferedReader bufferedReader = new BufferedReader(fread);
		 Employee[] emp=new Employee[3];

		while((line = bufferedReader.readLine()) != null)
		{
			//  System.out.println(line);
			//  sb=sb+line;

			StringTokenizer st = new StringTokenizer(line);
			//String i=


			while(st.hasMoreElements())
			{
				//Integer x=Integer.valueOf(st.nextToken("/"));
				int x=Integer.parseInt(st.nextToken("/"));
				int y=Integer.parseInt(st.nextToken("/"));
				String n=st.nextToken("/");

			//	employee.add(new Employee<Integer>(x, y, Employee.designation.valueOf(n), address, salary, project, personaldetails, contact, department));
				// employee.add(new Employee<T>(id, work_exp, designation_obj, address, salary, project, personaldetails, contact, department),y,n);


				//  System.out.println(x+y+n);
				   emp[i]=new Employee(x, y,Employee.designation.valueOf( n),   personaldetails);

				System.out.println(emp[i]);
				//  System.out.println("Next token is : " + st.nextToken("/"));
			}
		}
		// Employee employeevalues=employee.get(0);
//		int j=0;
//		FileReader fread1=new FileReader(in1);
//		// FileWriter fwrite=new FileWriter(out);
//
//		BufferedReader bufferedReader1 = new BufferedReader(fread1);
//		 Contact[] cont=new Contact[3];
//
//		while((line = bufferedReader1.readLine()) != null)
//		{
//			//  System.out.println(line);
//			//  sb=sb+line;
//
//			StringTokenizer st = new StringTokenizer(line);
//			//String i=
//
//
//			while(st.hasMoreElements())
//			{
//				int a=Integer.parseInt(st.nextToken("/"));
//				long b=Long.parseLong(st.nextToken("/"));
//				String c=st.nextToken("/");
//
//				//contact.add(new Contact(a, b, c));
//
//				//  System.out.println(a+b+c);
//				 cont[j]=new Contact(a, b,c);
//
//				  System.out.println(cont[j]);
//				//  System.out.println("Next token is : " + st.nextToken("/"));
//			}
//		}
//		// Contact contactvalues=contact.get(0);

		/*int n=0;
		FileReader fread4=new FileReader(in4);
		// FileWriter fwrite=new FileWriter(out);

		BufferedReader bufferedReader4 = new BufferedReader(fread4);
		// Address[] addr=new Address[3];

		while((line = bufferedReader4.readLine()) != null)
		{
			System.out.println(line);
			//  sb=sb+line;

			StringTokenizer st = new StringTokenizer(line);
			//String i=


			while(st.hasMoreElements())
			{

				String str=st.nextToken("/");
				String sec=st.nextToken("/");
				String cit=st.nextToken("/");
				String sta=st.nextToken("/");


				int ho=Integer.parseInt(st.nextToken("/"));

				int pin=Integer.parseInt(st.nextToken("/"));
				int id2=Integer.parseInt(st.nextToken("/"));


				addressType ty=addressType.valueOf(st.nextToken("/"));

				address.add(new Address(str, sec, cit, sta, ho, pin, id2, ty));
				//  System.out.println(x+y+n);
				// addr[n]=new Address(str,sec,cit,sta,ho,pin,id2,Address.addressType.valueOf(ty));

				//   System.out.println(addr[n]);
				//  System.out.println("Next token is : " + st.nextToken("/"));
			}
		}
*/


		//Address add = new Address("1", "5", "Delhi", "Delhi", 20, 803117, 1,Address.addressType.Correspondence);

//	/*	int k=0;
//		FileReader fread2=new FileReader(in2);
//		// FileWriter fwrite=new FileWriter(out);
//
//		BufferedReader bufferedReader2 = new BufferedReader(fread2);
//		 Salary [] sal=new Salary[9];
//
//		while((line = bufferedReader2.readLine()) != null)
//		{
//			// System.out.println(line);
//			//  sb=sb+line;
//
//			StringTokenizer st = new StringTokenizer(line);
//			//String i=
//
//
//			while(st.hasMoreElements())
//			{
//				int d=Integer.parseInt(st.nextToken("/"));
//				double ba=Double.parseDouble(st.nextToken("/"));
//				/* double hr=Double.parseDouble(st.nextToken("/"));
//			   double da=Double.parseDouble(st.nextToken("/"));
//			   double lt=Double.parseDouble(st.nextToken("/"));
//			   double pf=Double.parseDouble(st.nextToken("/"));
//			   double fp=Double.parseDouble(st.nextToken("/"));
//			   double gr=Double.parseDouble(st.nextToken("/")); */
//
//				//salary.add(new Salary(d, ba));
//
//				//  System.out.println();
//				 sal[k]=new Salary(d,ba);
//
//			System.out.println(sal[k]);
//				// System.out.println("Next token is : " + st.nextToken("/"));
//			}
//		} 



		//	Salary sal = new Salary(1, 10000, 5000, 5000, 2000, 1200, 2000, 1000);

		//Contact con = new Contact(1, 9325256521l, "purwarshubham@gmail.com");
		//Department dept=null;
		//	Project project=null;
		//PersonalDetails per=null;
	/*	try {


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


				while(st.hasMoreElements())
				{
					int id1=Integer.parseInt(st.nextToken("/"));

					String de=st.nextToken("/");
					Date startdate = new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/"));
					Date enddate= new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/"));

				//	department.add(new Department(id1, de, startdate, enddate));
					//  System.out.println(x+y+n);
					 dept[m]=new Department(id1, de, startdate, enddate);

					System.out.println(dept[m]);
					//  System.out.println("Next token is : " + st.nextToken("/"));
				}
			}

			//dept = new Department(1, "Management", startdate, enddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		*/
		
		try {


			int p=0;
			FileReader fread6=new FileReader(in6);
			// FileWriter fwrite=new FileWriter(out);

			BufferedReader bufferedReader6 = new BufferedReader(fread6);
			  PersonalDetails[] pers=new PersonalDetails[10];

			while((line = bufferedReader6.readLine()) != null)
			{
				//System.out.println(line);
				//  sb=sb+line;

				StringTokenizer st = new StringTokenizer(line);
				//String i=


				while(st.hasMoreElements())
				{
					int id4=Integer.parseInt(st.nextToken("/"));
					int ag=Integer.parseInt(st.nextToken("/"));
					String nam=st.nextToken("/");
					String fnam=st.nextToken("/");
					String gen=st.nextToken("/");
					String bg=st.nextToken("/");
					String ma=st.nextToken("/");
					Date date = new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/"));
					long ad=Long.parseLong(st.nextToken("/"));

				//	personaldetails.add(new PersonalDetails(id4, ag, nam, fnam, gen, bg, ma, date, ad));

					//  System.out.println(x+y+n);
					  pers[p] =new PersonalDetails(id4, ag,nam,fnam,gen,bg,ma,date,ad);

					System.out.println(pers[p]);
					//  System.out.println("Next token is : " + st.nextToken("/"));
				}
			}



			// per=new PersonalDetails(1, 21, "Shubham", "R R Purwar", "Male", "O+", "UnMarried", date, 123456);
		} catch (ParseException e) {
			e.printStackTrace();
		}


		//	System.out.println(emp);
		//	System.out.println(emp1);
		//	System.out.println(add);
		//System.out.println(sal);
		//System.out.println(con);
		//	System.out.println(dept);
		//	System.out.println(project);
		//	System.out.println(per);

	}


}

