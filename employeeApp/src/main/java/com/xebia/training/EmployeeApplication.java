package com.xebia.training;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

class EmployeeApplication
{
	static Logger log=Logger.getLogger(EmployeeApplication.class.getName());

	public static void main(String s[]) throws NumberFormatException, IOException, InterruptedException, ExecutionException, SAXException, ParserConfigurationException, ParseException, JAXBException

	{
		PropertyConfigurator.configure("src/main/resources/log4j.properties");

		log.debug("Hiiiii");
		System.out.println("Enter employee id:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		EmployeeObjectRead ar=new EmployeeObjectRead(a);
		Employee employee=ar.inputEmployee(a);



		ar.empget(employee);

		System.out.println(employee);


		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		System.out.println();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		//Marshal the employees list in console
	//	jaxbMarshaller.marshal(employee, System.out);

		//Marshal the employees list in file
		String f="employee"+a+".xml";
		jaxbMarshaller.marshal(employee, new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\"+f));
		System.out.println("Employee Id"+a+" details has been written into file employee"+a+" successfully");
	}
}
/*static String line;
static String directory="C:/Users/mkishore/Desktop/Today work/";
static String inemployee="C:/Users/mkishore/Desktop/Today work/employee.txt";
static String indepart="C:/Users/mkishore/Desktop/Today work/department.txt";
static String inpersonal="C:/Users/mkishore/Desktop/Today work/personaldetails.txt";
static String inpro="C:/Users/mkishore/Desktop/Today work/project.txt";
static String insal="C:/Users/mkishore/Desktop/Today work/salary.txt";
static String inadd="C:/Users/mkishore/Desktop/Today work/address.txt";
static String incontact="C:/Users/mkishore/Desktop/Today work/contact.txt";*//*

		
	*/
/*	FileReader fread=new FileReader(inemployee);

	
		BufferedReader bufferedReader = new BufferedReader(fread);
		Employee[] emp=new Employee[3];
		while((line = bufferedReader.readLine()) != null)
		{
	

			StringTokenizer st = new StringTokenizer(line);
		
			int n=Integer.parseInt(st.nextToken("/"));
			int t=Integer.parseInt(st.nextToken("/"));
			String d=st.nextToken("/");
			System.out.println(n+t+d);
			emp[i]=new Employee(n, t,Employee.designation.valueOf(d));
			System.out.println(emp[i]);
			
			while(st.hasMoreElements())
			{
				System.out.println("Next token is : " + st.nextToken("/"));
			}

		}*//*

	*/
/*	PersonalDetails per[]=new PersonalDetails[3];
		try {i=0;
			 fread=new FileReader(inpersonal);
			//	FileWriter fwrite=new FileWriter(out);

				 bufferedReader = new BufferedReader(fread);
				
				while((line = bufferedReader.readLine()) != null)
				{
					System.out.println(line);
				

					StringTokenizer st = new StringTokenizer(line);
				
					per[i] = new PersonalDetails(Integer.parseInt(st.nextToken("/")),Long.parseLong(st.nextToken("/")), Long.parseLong(st.nextToken("/")), Long.parseLong(st.nextToken("/")), Long.parseLong(st.nextToken("/")),st.nextToken("/"),PersonalDetails.maritialstatus.valueOf(st.nextToken("/")), st.nextToken("/"),st.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/")), st.nextToken("/"), st.nextToken("/"),st.nextToken("/"));
					System.out.println(per[i]);
					
			
		
			per[i].agecalc();
				}
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}*//*

	*/
/*	try {
			i=0;
			 fread=new FileReader(insal);
			//	FileWriter fwrite=new FileWriter(out);

				 bufferedReader = new BufferedReader(fread);
				Salary sal[]=new Salary[3];
				while((line = bufferedReader.readLine()) != null)
				{
					System.out.println(line);
				

					StringTokenizer st = new StringTokenizer(line);
				
					sal[i] = new Salary(Integer.parseInt(st.nextToken("/")),Integer.parseInt(st.nextToken("/")));
					System.out.println(sal[i]);
					i++;

				}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*//*

	

	*/
/*try {
		i=0;
		 fread=new FileReader(indepart);
		//	FileWriter fwrite=new FileWriter(out);

			 bufferedReader = new BufferedReader(fread);
			Department dep[]=new Department[3];
			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			

				StringTokenizer st = new StringTokenizer(line);
			
				dep[i] = new Department(Integer.parseInt(st.nextToken("/")),st.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/")), new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/")));
				System.out.println(dep[i]);
				i++;

			}
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}*//*

	*/
/*try {
//		Project pro=new Project(101,"Mandavi",new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2016"), new SimpleDateFormat("dd-MM-yyyy").parse("18-01-2018"));
//		System.out.println(pro);
		i=0;
		 fread=new FileReader(inpro);
		//	FileWriter fwrite=new FileWriter(out);

			 bufferedReader = new BufferedReader(fread);
			Project pro[]=new Project[3];
			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			

				StringTokenizer st = new StringTokenizer(line);
			
				pro[i] = new Project(Integer.parseInt(st.nextToken("/")),Integer.parseInt(st.nextToken("/")),st.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/")), new SimpleDateFormat("dd-MM-yyyy").parse(st.nextToken("/")));
				System.out.println(pro[i]);
				i++;
			}	
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*//*

	
*/
/*	try {
		i=0;
		 fread=new FileReader(inadd);
		//	FileWriter fwrite=new FileWriter(out);

			 bufferedReader = new BufferedReader(fread);
			Address add[]=new Address[3];
			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			

				StringTokenizer st = new StringTokenizer(line);
			
				add[i] = new Address(Integer.parseInt(st.nextToken("/")),Integer.parseInt(st.nextToken("/")),Integer.parseInt(st.nextToken("/")),st.nextToken("/"),Integer.parseInt(st.nextToken("/")),st.nextToken("/"),st.nextToken("/"),st.nextToken("/"),Address.addresstype.valueOf(st.nextToken("/")));
				System.out.println(add[i]);
				i++;

			}
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	*//*

*/
/*	try {
		i=0;
		 fread=new FileReader(incontact);
		//	FileWriter fwrite=new FileWriter(out);

			 bufferedReader = new BufferedReader(fread);
			Contact con[]=new Contact[3];
			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			

				StringTokenizer st = new StringTokenizer(line);
			
				con[i] = new Contact(Integer.parseInt(st.nextToken("/")),st.nextToken("/"),Long.parseLong(st.nextToken("/")));
				System.out.println(con[i]);
				i++;

			}
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}*//*


	
*/
