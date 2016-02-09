package com.xebia.training;
//import java.util.Date;
//enum Designation{
//	JavaDeveloper,Consultant,Trainee;
//}
//
//public class Employee {
//	private int   id;
//	private String name;
//	private String fatherName;
//	private int age;
//	private Address address;
//	private Salary salary;
//	private Date dateofBirth;
//	private Date dateofJoining;
//	private Date dateofEnding;
//	private int workExp;
//	private PersonalDetail personalDetail;
//	private Project project;
//	private String gender;
//	private Designation designation;
//	public Employee(int  id, String name, String fatherName, int age,
//			Address address, Salary salary, Date dateofBirth,
//			Date dateofJoining, Date dateofEnding, int workExp,
//			PersonalDetail personalDetail, Project project, String gender,
//			Designation designation) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.fatherName = fatherName;
//		this.age = age;
//		this.address = address;
//		this.salary = salary;
//		this.dateofBirth = dateofBirth;
//		this.dateofJoining = dateofJoining;
//		this.dateofEnding = dateofEnding;
//		this.workExp = workExp;
//		this.personalDetail = personalDetail;
//		this.project = project;
//		this.gender = gender;
//		this.designation = designation;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getFatherName() {
//		return fatherName;
//	}
//	public void setFatherName(String fatherName) {
//		this.fatherName = fatherName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	public Salary getSalary() {
//		return salary;
//	}
//	public void setSalary(Salary salary) {
//		this.salary = salary;
//	}
//	public Date getDateofBirth() {
//		return dateofBirth;
//	}
//	public void setDateofBirth(Date dateofBirth) {
//		this.dateofBirth = dateofBirth;
//	}
//	public Date getDateofJoining() {
//		return dateofJoining;
//	}
//	public void setDateofJoining(Date dateofJoining) {
//		this.dateofJoining = dateofJoining;
//	}
//	public Date getDateofEnding() {
//		return dateofEnding;
//	}
//	public void setDateofEnding(Date dateofEnding) {
//		this.dateofEnding = dateofEnding;
//	}
//	public int getWorkExp() {
//		return workExp;
//	}
//	public void setWorkExp(int workExp) {
//		this.workExp = workExp;
//	}
//	public PersonalDetail getPersonalDetail() {
//		return personalDetail;
//	}
//	public void setPersonalDetail(PersonalDetail personalDetail) {
//		this.personalDetail = personalDetail;
//	}
//	public Project getProject() {
//		return project;
//	}
//	public void setProject(Project project) {
//		this.project = project;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public Designation getDesignation() {
//		return designation;
//	}
//	public void setDesignation(Designation designation) {
//		this.designation = designation;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result
//				+ ((dateofBirth == null) ? 0 : dateofBirth.hashCode());
//		result = prime * result
//				+ ((dateofEnding == null) ? 0 : dateofEnding.hashCode());
//		result = prime * result
//				+ ((dateofJoining == null) ? 0 : dateofJoining.hashCode());
//		result = prime * result
//				+ ((designation == null) ? 0 : designation.hashCode());
//		result = prime * result
//				+ ((fatherName == null) ? 0 : fatherName.hashCode());
//		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((project == null) ? 0 : project.hashCode());
//		result = prime * result + workExp;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (age != other.age)
//			return false;
//		if (dateofBirth == null) {
//			if (other.dateofBirth != null)
//				return false;
//		} else if (!dateofBirth.equals(other.dateofBirth))
//			return false;
//		if (dateofEnding == null) {
//			if (other.dateofEnding != null)
//				return false;
//		} else if (!dateofEnding.equals(other.dateofEnding))
//			return false;
//		if (dateofJoining == null) {
//			if (other.dateofJoining != null)
//				return false;
//		} else if (!dateofJoining.equals(other.dateofJoining))
//			return false;
//		if (designation != other.designation)
//			return false;
//		if (fatherName == null) {
//			if (other.fatherName != null)
//				return false;
//		} else if (!fatherName.equals(other.fatherName))
//			return false;
//		if (gender == null) {
//			if (other.gender != null)
//				return false;
//		} else if (!gender.equals(other.gender))
//			return false;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (project == null) {
//			if (other.project != null)
//				return false;
//		} else if (!project.equals(other.project))
//			return false;
//		if (workExp != other.workExp)
//			return false;
//		return true;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", fatherName="
//				+ fatherName + ", age=" + age + ", dateofBirth=" + dateofBirth
//				+ ", dateofJoining=" + dateofJoining + ", dateofEnding="
//				+ dateofEnding + ", workExp=" + workExp + ", project="
//				+ project + ", gender=" + gender + ", designation="
//				+ designation + "]";
//	}
//	
//	
//	
//	
//}
//
//	


 import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Employee {
    private final String directory = "C:/Users/vishalsingh/Desktop/Employee/";
    		private String id;
    private int workExperience;
    private Designation designation;
    private List<Address> address = new ArrayList<Address>();
    private Contact contact;
    private Department department;
    private PersonalDetail personalDetails;
    private Set<Project> project = new HashSet<Project>();
    private Salary salary;

    enum Designation {
        TRAINEE,
        PROJECT_ENGINEER,
        JAVA_DEVELOPER,
        ACCOUNTANT,
        QA_ANALYST,
        SCRUM_MASTER,
        CEO
    }

    /**
     * @param id
     * @param workExperience
     * @param designation
     * @throws IOException
     */
    public Employee(String id, int workExperience, Designation designation) throws IOException, ParseException {
        super();
        this.id = id;
        this.workExperience = workExperience;
        this.designation = designation;
        this.inputAddress(id);
        this.inputContact(id);
        this.inputDepartment(id);
        this.inputPersonalDetails(id);
        this.inputProject(id);
        this.inputSalary(id);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the workExperience
     */
    public int getWorkExperience() {
        return workExperience;
    }

    /**
     * @param workExperience the workExperience to set
     */
    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    /**
     * @return the designation
     */
    public Designation getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public void inputAddress(String id) throws IOException {
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "address.txt"));
        // BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"AddressOutput.txt"));
        String line;
        while ((line = input.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, ",");
            while (token.hasMoreTokens()) {
                String idInput = token.nextToken("/");
                if (id.equalsIgnoreCase(idInput)) {
                    address.add(new Address(id, Integer.parseInt(token.nextToken("/")), Integer.parseInt(token.nextToken("/")), token.nextToken("/"), token.nextToken("/"), token.nextToken("/"), Integer.parseInt(token.nextToken("/")), Address.AddressType.valueOf(token.nextToken("/"))));
                } else
                    continue;
            }
        }
    }

    public void inputContact(String id) throws IOException {
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "contact.txt"));
        // BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"contactOutput.txt"));
        String line;
        while ((line = input.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, ",");
            while (token.hasMoreTokens()) {
                String idInput = token.nextToken("/");
                if (id.equalsIgnoreCase(idInput)) {
                    contact = new Contact(id, Long.parseLong(token.nextToken("/")), token.nextToken("/"));
                } else
                    continue;
            }
        }
    }

    public void inputDepartment(String id) throws IOException {
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "department.txt"));
        // BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"departmentOutput.txt"));
        String line;
        while ((line = input.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, ",");
            while (token.hasMoreTokens()) {
                String idInput = token.nextToken("/");
                if (id.equalsIgnoreCase(idInput)) {
                    department = new Department(id, DepartmentType.valueOf(token.nextToken("/")));
                } else
                    continue;
            }
        }
    }

    public void inputPersonalDetails(String id) throws IOException, ParseException {
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "personalDetails.txt"));
        // BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"personalDetailsOutput.txt"));
        String line;
        while ((line = input.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, ",");
            while (token.hasMoreTokens()) {
                String idInput = token.nextToken("/");
                if (id.equalsIgnoreCase(idInput)) {
                    personalDetails = new PersonalDetail(id, token.nextToken("/"), token.nextToken("/"), token.nextToken("/"), token.nextToken("/"), Long.parseLong(token.nextToken("/")), token.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(token.nextToken("/")), PersonalDetail.Gender.valueOf(token.nextToken("/")), PersonalDetail.BloodGroup.valueOf(token.nextToken("/")), PersonalDetail.MaritalStatus.valueOf(token.nextToken("/")));
                } else
                    continue;
            }
        }
    }

    public void inputProject(String id) throws IOException, ParseException {
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "project.txt"));
        // BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"projectOutput.txt"));
        String line;
        while ((line = input.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, ",");
            while (token.hasMoreTokens()) {
                String idInput = token.nextToken("/");
                if (id.equalsIgnoreCase(idInput)) {
                    int projectId = Integer.parseInt(token.nextToken("/"));
                    BufferedReader inputDetails = Files.newBufferedReader(Paths.get(directory + "projectInput.txt"));
                    String lineProjectDetails;
                    while ((lineProjectDetails = inputDetails.readLine()) != null) {
                        StringTokenizer tokenInner = new StringTokenizer(lineProjectDetails, ",");
                        while (tokenInner.hasMoreTokens()) {
                            int projectIdInput = Integer.parseInt(tokenInner.nextToken("/"));
                            if (projectId == projectIdInput) {
                                project.add(new Project(projectId, tokenInner.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(tokenInner.nextToken("/")), new SimpleDateFormat("dd-MM-yyyy").parse(tokenInner.nextToken("/"))));
                            }  else {
                                tokenInner.nextToken("/");
                                tokenInner.nextToken("/");
                                tokenInner.nextToken("/");
                                continue;
                            }
                        }
                    }
                    inputDetails.close();
                } else
                    continue;
            }
        }
    }

    public void inputSalary(String id) throws IOException {
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "salary.txt"));
        // BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"salaryOutput.txt"));
        String line;
        while ((line = input.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, ",");
            while (token.hasMoreTokens()) {
                String idInput = token.nextToken("/");
                if (id.equalsIgnoreCase(idInput)) {
                    salary = new Salary(id, Integer.parseInt(token.nextToken("/")));
                } else
                    continue;
            }
        }
    }


    @Override
    public String toString() {
        return "Employee{" +
                "\nID:-\'" + id + '\'' +
                ", Work Experience:-" + workExperience +
                ", Designation:-" + designation +
                ", \n\nAddress:-" + address +
                ", \n\nContact:-" + contact +
                ", \n\nDepartment:-" + department +
                ", \n\nPersonal Details:-" + personalDetails +
                ", \n\nProject:-" + project +
                ", \n\nSalary:-" + salary +
                "\n}\n\n\n";
    }
}