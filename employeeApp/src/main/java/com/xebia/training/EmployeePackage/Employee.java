package com.xebia.training.EmployeePackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee {
    public enum MaritalStatus {
        married,
        unmarried,
        diverse,
        widow,
        widower;
    }

    public enum Designation {
        CEO,
        Manager,
        Trainee,
        Accountant,
        Developer,
        Peon;
    }

    private int id;
    Set<Project> project;
    List<PersonalDetails> personalDetails;
    List<Salary> salary;
    List<Department> department;
    List<Address> address;
    List<Contacts> contact;
    static String line;
    static String line1;

    private String name;
    //private EmployeePackage.Address.Address_type permanentAddress;
    private String fatherName;
    private int age;
    private String gender;
    private MaritalStatus maritalStatus;
    private Designation designation;
    private float workExp;
    //	private String project;
    private Date dob;
    private Date startDate;
    private Date endDate;
    static String address_file = "C:/Users/pjhanwan/Desktop/address.txt";
    static String contacts_file = "C:/Users/pjhanwan/Desktop/contact.txt";
    static String department_file = "C:/Users/pjhanwan/Desktop/department.txt";
    static String employee_file = "C:/Users/pjhanwan/Desktop/employee.txt";
    static String personal_file = "C:/Users/pjhanwan/Desktop/personal_details.txt";
    static String project_file = "C:/Users/pjhanwan/Desktop/project.txt";
    static String salary_file = "C:/Users/pjhanwan/Desktop/salary.txt";



    private void inputAddress(int id) throws IOException {
        int m = 0;
        try {
            FileReader freader = new FileReader(address_file);
            BufferedReader bufferedReader = new BufferedReader(freader);
            address = new ArrayList<Address>();
            while ((line = bufferedReader.readLine()) != null) {
                //	System.out.println(line);


                StringTokenizer st1 = new StringTokenizer(line);
                int t = Integer.parseInt(st1.nextToken("/"));

                if (t == id) {


                    int i1 = t;
                    Address.Address_type d1 = (Address.Address_type.valueOf(st1.nextToken("/")));

                    int i2 = Integer.parseInt(st1.nextToken("/"));
                    String d2 = st1.nextToken("/");
                    String d3 = st1.nextToken("/");
                    String d4 = st1.nextToken("/");
                    String d5 = st1.nextToken("/");
                    String d6 = st1.nextToken("/");

                    address.add(new Address(i1, d1, i2, d2, d3, d4, d5, d6));

                } else
                    continue;
            }
            for (Address s : address) {
                System.out.println(s);
            }
            bufferedReader.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inputContacts(int id) throws IOException {
        int n = 0;
        try {
            FileReader freader = new FileReader(contacts_file);
            BufferedReader bufferedReader = new BufferedReader(freader);
            contact = new ArrayList<Contacts>();
            while ((line = bufferedReader.readLine()) != null) {
                //	System.out.println(line);


                StringTokenizer st1 = new StringTokenizer(line);
                int t = Integer.parseInt(st1.nextToken("/"));

                if (t == id) {

                    int i1 = t;
                    int t1 = Integer.parseInt(st1.nextToken("/"));
                    String s7 = st1.nextToken("/");
                    contact.add(new Contacts(i1, t1, s7));

                } else
                    continue;
            }
            for (Contacts s : contact) {
                System.out.println(s);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inputDepartment(int id) throws IOException {
        //	int i = 0;
        try {
            FileReader freader = new FileReader(department_file);
            BufferedReader bufferedReader = new BufferedReader(freader);
            department = new ArrayList<Department>();
            while ((line = bufferedReader.readLine()) != null) {
                //	System.out.println(line);


                StringTokenizer st1 = new StringTokenizer(line);
                int t = Integer.parseInt(st1.nextToken("/"));

                if (t == id) {


                    int i1 = t;
                    String d = st1.nextToken("/");
                    Date e = new SimpleDateFormat("dd-MM-yyyy").parse(st1.nextToken("/"));
                    Date f = new SimpleDateFormat("dd-MM-yyyy").parse(st1.nextToken("/"));

                    department.add(new Department(i1, d, e, f));

                } else
                    continue;
            }
            for (Department s : department) {
                System.out.println(s);
            }
            bufferedReader.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*	private void inputEmployee(int id) throws IOException {
            int j = 0;
            try {
                FileReader freader = new FileReader(employee_file);
                BufferedReader bufferedReader = new BufferedReader(freader);
                EmployeePackage.Employee[] emp = new EmployeePackage.Employee[3];
                while ((line1 = bufferedReader.readLine()) != null) {

                    StringTokenizer st1 = new StringTokenizer(line1, "");
                    while (st1.hasMoreElements()) {
                        int t1 = Integer.parseInt(st1.nextToken("/"));
                        String d1 = st1.nextToken("/");
                        //	EmployeePackage.Address.Address_type d2 = (EmployeePackage.Address.Address_type.valueOf(st1.nextToken("/")));
                        String d3 = st1.nextToken("/");
                        //	EmployeePackage.Address.Address_type d4 =(EmployeePackage.Address.Address_type.valueOf(st1.nextToken("/")));
                        //	EmployeePackage.Address.Address_type d5 = (EmployeePackage.Address.Address_type.valueOf(st1.nextToken("/")));
                        EmployeePackage.Employee.MaritalStatus d6 = (EmployeePackage.Employee.MaritalStatus.valueOf(st1.nextToken("/")));

                        String d7 = st1.nextToken("/");
                        EmployeePackage.Employee.Designation d8 = (EmployeePackage.Employee.Designation.valueOf(st1.nextToken("/")));
                        float f2 = Float.parseFloat(st1.nextToken("/"));
                        String d9 = st1.nextToken("/");

                        Date e1 = new SimpleDateFormat("dd-MM-yyyy").parse(st1.nextToken("/"));
                        Date f1 = new SimpleDateFormat("dd-MM-yyyy").parse(st1.nextToken("/"));
                        Date g1 = new SimpleDateFormat("dd-MM-yyyy").parse(st1.nextToken("/"));

                        emp[j] = new EmployeePackage.Employee(t1, d1, d3, d6, d7, d8, f2, d9, e1, f1, g1);
                        System.out.println(emp[j]);
                        j++;


                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    private void inputPersonal(int id) throws IOException {
        int k = 0;
        try {
            FileReader freader = new FileReader(personal_file);
            BufferedReader bufferedReader = new BufferedReader(freader);
            personalDetails = new ArrayList<PersonalDetails>();
            while ((line = bufferedReader.readLine()) != null) {
                //	System.out.println(line);


                StringTokenizer st1 = new StringTokenizer(line);
                int t = Integer.parseInt(st1.nextToken("/"));

                if (t == id) {

                    int i1 = t;
                    String s1 = st1.nextToken("/");
                    String s2 = st1.nextToken("/");
                    String s3 = st1.nextToken("/");
                    String s4 = st1.nextToken("/");
                    String s5 = st1.nextToken("/");


                    personalDetails.add(new PersonalDetails(i1, s1, s2, s3, s4, s5));

                } else
                    continue;
            }
            for (PersonalDetails s : personalDetails) {
                System.out.println(s);
            }
            bufferedReader.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inputProject(int id) throws IOException {

        int l = 0;
        try {
            FileReader freader = new FileReader(project_file);
            BufferedReader bufferedReader = new BufferedReader(freader);
            project = new HashSet<Project>();
            while ((line = bufferedReader.readLine()) != null) {
                //	System.out.println(line);


                StringTokenizer st1 = new StringTokenizer(line);
                int t = Integer.parseInt(st1.nextToken("/"));

                if (t == id) {
                    int i1 = t;
                    Date d1 = new SimpleDateFormat("dd-MM-yyyy").parse(st1.nextToken("/"));
                    Date d2 = new SimpleDateFormat("dd-MM-yyyy").parse(st1.nextToken("/"));

                    String s6 = st1.nextToken("/");
                    project.add(new Project(i1, d2, d1, s6));

                } else
                    continue;
            }
            for (Project s : project) {
                System.out.println(s);
            }
            bufferedReader.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    class inSalary implements Runnable{
        int id;
        public inSalary(int id)
        {
            this.id=id;
        }
        public void run() {
            int p = 0;

            try {
                FileReader freader = new FileReader(salary_file);
                BufferedReader bufferedReader = new BufferedReader(freader);
                salary = new ArrayList<Salary>();
                while ((line = bufferedReader.readLine()) != null) {
                    //	System.out.println(line);


                    StringTokenizer st = new StringTokenizer(line);
                    int t = Integer.parseInt(st.nextToken("/"));

                    if (t == id) {
                        int f1 = t;
                        double f2 = Double.parseDouble(st.nextToken("/"));
                        salary.add(new Salary(f1, f2));

                    } else
                        continue;
                }
                for (Salary s : salary) {
                    System.out.println(s);
                }
                bufferedReader.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    /*public EmployeePackage.Address.Address_type getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(EmployeePackage.Address.Address_type permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public EmployeePackage.Address.Address_type getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(EmployeePackage.Address.Address_type currentAddress) {
        this.currentAddress = currentAddress;
    }

    public EmployeePackage.Address.Address_type getCorrespondentAddress() {
        return correspondentAddress;
    }

    public void setCorrespondentAddress(EmployeePackage.Address.Address_type correspondentAddress) {
        this.correspondentAddress = correspondentAddress;
    }*/
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getWorkExp() {
        return workExp;
    }

    public void setWorkExp(float workExp) {
        this.workExp = workExp;
    }

/*
    public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
*/

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Employee(int id) throws IOException, InterruptedException {
        super();

        this.id = id;

        this.inputAddress(id);
        this.inputContacts(id);
        this.inputDepartment(id);

        this.inputPersonal(id);
        this.inputProject(id);
       this.threadcall(id);

    }
    public void threadcall(int id) throws IOException, InterruptedException {
        Employee emp=new Employee();
        Employee.inSalary sal=emp.new inSalary(id);
        Thread insalary=new Thread(sal);
        insalary.start();
      //  insalary.join();
    }
    public Employee()
    {
        super();
    }
    public Employee(int id, String name,
                    String fatherName,

                    MaritalStatus maritalStatus, String gender,
                    Designation designation, float workExp, Date dob,
                    Date startDate, Date endDate) {
        super();
        this.id = id;
        this.name = name;

        //this.permanentAddress = permanentAddress;
        this.fatherName = fatherName;
		/*this.currentAddress = currentAddress;
		this.correspondentAddress = correspondentAddress;*/
        this.maritalStatus = maritalStatus;

        this.gender = gender;
        this.designation = designation;
        this.workExp = workExp;
        //	this.project = project;
        this.dob = dob;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String toString() {
        return "EmployeePackage.Employee [id=" + id + ", name=" + name

                + ", fatherName=" + fatherName + ", maritalStatus="
                + maritalStatus + ", age=" + age + ", gender=" + gender
                + ", designation=" + designation + ", workExp=" + workExp
                + ", project=" + ", dob=" + dob + ", startDate="
                + startDate + ", endDate=" + endDate + "]";
    }


    public void agecalc() {
        Calendar c = Calendar.getInstance();
        int now = c.get(Calendar.YEAR);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(dob);
        int dobyear = c1.get(Calendar.YEAR);
        int age = now - dobyear;
        System.out.println("Age calculated is" + age);
    }


}



