package com.xebia.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Employee {
    private final String directory = "C:/Users/nitishkumar/Desktop/Employee/";
    private String id;
    private int workExperience;
    private Date startDate, endDate = null;
    private Designation designation;
    private List<Address> address = new ArrayList<Address>();
    private Contact contact;
    private Department department;
    private PersonalDetails personalDetails;
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
    public Employee(String id, int workExperience, Designation designation, String startDate) throws IOException, ParseException {
        super();
        this.id = id;
        this.workExperience = workExperience;
        this.designation = designation;
        this.startDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
        this.inputAddress(id);
        this.inputContact(id);
        this.inputDepartment(id);
        this.inputPersonalDetails(id);
        this.inputProject(id);
        this.inputSalary(id);
    }

    public String getDirectory() {
        return directory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
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

    public Employee.Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Employee.Designation designation) {
        this.designation = designation;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void inputAddress(String id) throws IOException {
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "addressInput.txt"));
        //	BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"AddressOutput.txt"));
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
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "contactInput.txt"));
        //	BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"contactOutput.txt"));
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
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "departmentInput.txt"));
        //	BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"departmentOutput.txt"));
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
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "personalDetailsInput.txt"));
        //	BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"personalDetailsOutput.txt"));
        String line;
        while ((line = input.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, ",");
            while (token.hasMoreTokens()) {
                String idInput = token.nextToken("/");
                if (id.equalsIgnoreCase(idInput)) {
                    personalDetails = new PersonalDetails(id, token.nextToken("/"), token.nextToken("/"), token.nextToken("/"), token.nextToken("/"), Long.parseLong(token.nextToken("/")), token.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(token.nextToken("/")), PersonalDetails.Gender.valueOf(token.nextToken("/")), PersonalDetails.BloodGroup.valueOf(token.nextToken("/")), PersonalDetails.MaritalStatus.valueOf(token.nextToken("/")));
                } else
                    continue;
            }
        }
    }

    public void inputProject(String id) throws IOException, ParseException {
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "projectEmployeeInput.txt"));
        //	BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"projectOutput.txt"));
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
                                project.add(new Project(projectId, tokenInner.nextToken("/"), new SimpleDateFormat("dd-MM-yyyy").parse(tokenInner.nextToken("/"))));
                            } else {
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
        BufferedReader input = Files.newBufferedReader(Paths.get(directory + "salaryInput.txt"));
        //	BufferedWriter output= Files.newBufferedWriter(Paths.get(directory+"salaryOutput.txt"));
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

    public static void employeeResign(List<Employee> employee, String id) throws ParseException {
        for (Employee emp : employee) {
            if (emp.getId().equalsIgnoreCase(id)) {
                emp.setEndDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date())));
                emp.department.setEndDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date())));
                for (Project project : emp.project) {
                    project.setEndDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date())));
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Employee{" +
                "\nID:-\'" + id + '\'' +
                ", Work Experience:-" + workExperience +
                ", Start Date:-" + startDate +
                ", End Date:-" + endDate +
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
