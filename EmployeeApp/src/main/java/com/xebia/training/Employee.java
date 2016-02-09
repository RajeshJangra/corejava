package com.xebia.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import com.xebia.training.Contact.AddressType;

//import java.util.Date;

public class Employee {
	FileReader in;
	private int id;
	private int pid;
	private String name;
	private Date startDate;
	private Date endDate;
	private Designation designation;
	private String project;
	Contact contacts;
	EmployeeProject employeeProjects;
	EmployeeDept employeeDept;
	EmployeePersonalDetails employeePersonalDetails;
	EmployeeSalary employeeSalary;

	/*private int experience;
	private long phone;
	private String email;
	private String gender;
	private String current;
	private String permanent;
	private String maritalStatus;*/

	public enum Designation{
		TRAINEE,
		CONSULTANT,
		DEVELOPER,
		CEO,
		HR;
	}



	public Employee(int id, int pid, String name,
			Date startDate, Date endDate,Designation designation) throws IOException,ParseException {
		super();
		this.id = id;
		this.pid = pid;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.designation =designation;
		this.getInputContacts(id);
		this.getInputSalary(id);
		this.inputproject(id);
		this.getInputDepartment(id);
		this.getInputEmployeeDetails(id);
		
	}




	
	public void getInputContacts(int id) throws IOException{
		in=new FileReader("e:/contact.txt");
		BufferedReader br=new BufferedReader(in);
		int id11=0;
		String line,s1=null,s2=null,s3=null,s4=null,s5=null,s6=null,s7=null;
		int i1=0,i2=0;
		AddressType a=null;
		while((line=br.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(line,",");
			while(st.hasMoreTokens())
			{
				id11=Integer.parseInt(st.nextToken(","));
				s1=(st.nextToken(","));
				s2=(st.nextToken(","));
				s3=(st.nextToken(","));
				s4=(st.nextToken(","));
				i1=Integer.parseInt(st.nextToken(","));
				s5=(st.nextToken(","));
				s6=(st.nextToken(","));
				i2=Integer.parseInt(st.nextToken(","));
				s7=(st.nextToken(","));
				a=AddressType.valueOf(st.nextToken());

			}
		}
	}

	public void getInputSalary(int id) throws IOException{
		int int31=0;
		String line5=null;
		double d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0;
		in=new FileReader("e:/employeeSalary.txt");
		BufferedReader bfrr1=new BufferedReader(in);
		while((line5=bfrr1.readLine())!=null){
			StringTokenizer strrrr1=new StringTokenizer(line5,",");
			while(strrrr1.hasMoreTokens()){
				int31=Integer.parseInt(strrrr1.nextToken(","));
				d1=Double.parseDouble(strrrr1.nextToken(","));
				d2=Double.parseDouble(strrrr1.nextToken(","));
				d3=Double.parseDouble(strrrr1.nextToken(","));
				d4=Double.parseDouble(strrrr1.nextToken(","));
				d5=Double.parseDouble(strrrr1.nextToken(","));
				d6=Double.parseDouble(strrrr1.nextToken(","));
				d7=Double.parseDouble(strrrr1.nextToken(","));
			}
		}
	}
	
	List<EmployeeProject> project1=new ArrayList<EmployeeProject>();
	
	public void inputproject(int id) throws NumberFormatException, IOException, ParseException
	 {
		  int id1;
		  in = new FileReader("e:/employeeProject.txt");
		  BufferedReader br=new BufferedReader(in);
		  String line;
		  while((line=br.readLine())!=null){
			  StringTokenizer str=new StringTokenizer(line);
			  id1=Integer.parseInt(str.nextToken(","));
			  pid=Integer.parseInt(str.nextToken(","));
			  name=str.nextToken(",");;
			  startDate=new SimpleDateFormat("dd-MM-yyyy").parse(str.nextToken(","));
			  endDate=new SimpleDateFormat("dd-MM-yyyy").parse(str.nextToken(","));;
			  EmployeeProject employeeProject=new EmployeeProject(id1,pid,name,startDate,endDate);
			  if(id==id1){
				  project1.add(employeeProject);
			  }
			  else{
				  
			  }
			  
			  }
		  for(EmployeeProject p:project1){
			  System.out.println(p);
		  }
		   
		  
	 }
	
	public void getInputDepartment(int id) throws IOException,ParseException{
		int intgr1=0;
		String line7=null;
		String str21=null;
		Date datee21=null;
		Date datee22=null;
		in=new FileReader("e:/employeeDept.txt");
		BufferedReader br1=new BufferedReader(in);
		while((line7=br1.readLine())!=null){
			StringTokenizer sttn1=new StringTokenizer(line7,",");
			while(sttn1.hasMoreTokens()){
				intgr1=Integer.parseInt((sttn1.nextToken(",")));
				str21=sttn1.nextToken(",");
				datee21=new SimpleDateFormat("dd-MM-yyyy").parse(sttn1.nextToken(","));
				datee22=new SimpleDateFormat("dd-MM-yyyy").parse(sttn1.nextToken(","));

			}
		}
	}

	public void  getInputEmployeeDetails(int id) throws IOException,ParseException{
		String strr1=null,strr2=null,strr3=null,strr4=null,strr5=null,strr6=null,strr7=null,line4=null;
		int a1=0,int21=0;		
		Date date1=null;
		EmployeePersonalDetails employeePersonalDetails=null;
		in=new FileReader("e:/Employeepersonaldetails.txt");
		BufferedReader brr1=new BufferedReader(in);
		while((line4=brr1.readLine())!=null){
			StringTokenizer strrr1=new StringTokenizer(line4,",");
			while(strrr1.hasMoreTokens()){
				int21=Integer.parseInt(strrr1.nextToken(","));
				strr1=strrr1.nextToken(",");
				strr2=strrr1.nextToken(",");
				a1=Integer.parseInt(strrr1.nextToken(","));
				date1=new SimpleDateFormat("dd-MM-yyyy").parse(strrr1.nextToken(","));
				strr3=strrr1.nextToken(",");
				strr4=strrr1.nextToken(",");
				strr5=strrr1.nextToken(",");
				strr6=strrr1.nextToken(",");
				strr7=strrr1.nextToken(",");
			}
		}
	}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", pid=" + pid + ", name=" + name
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", designation=" + designation + "]";
	}





	
	
	
	
}
