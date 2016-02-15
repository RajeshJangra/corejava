package com.xebia.training.EmployeePackage;
import java.util.*;

import java.util.List;

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

    private String name;
    private String fatherName;
    private int age;
    private String gender;
    private MaritalStatus maritalStatus;
    private Designation designation;
    private float workExp;
    private Date dob;
    private Date startDate;
    private Date endDate;
    private Salary salary;
    private List<Project> project;
    private Address address;
    private Contacts contacts;
    private Department department;
    private PersonalDetails  personaldetails;

    public Employee(int id, String name, String fatherName, int age, String gender,
                    MaritalStatus maritalStatus, Designation designation, float workExp,
                    Date dob, Date startDate, Date endDate, Salary salary, List<Project> project,
                    Address address, Contacts contacts, Department department, PersonalDetails personaldetails) {
        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.designation = designation;
        this.workExp = workExp;
        this.dob = dob;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
        this.project = project;
        this.address = address;
        this.contacts = contacts;
        this.department = department;
        this.personaldetails = personaldetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (age != employee.age) return false;
        if (Float.compare(employee.workExp, workExp) != 0) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (fatherName != null ? !fatherName.equals(employee.fatherName) : employee.fatherName != null) return false;
        if (gender != null ? !gender.equals(employee.gender) : employee.gender != null) return false;
        if (maritalStatus != employee.maritalStatus) return false;
        if (designation != employee.designation) return false;
        if (dob != null ? !dob.equals(employee.dob) : employee.dob != null) return false;
        if (startDate != null ? !startDate.equals(employee.startDate) : employee.startDate != null) return false;
        if (endDate != null ? !endDate.equals(employee.endDate) : employee.endDate != null) return false;
        if (salary != null ? !salary.equals(employee.salary) : employee.salary != null) return false;
        if (project != null ? !project.equals(employee.project) : employee.project != null) return false;
        if (address != null ? !address.equals(employee.address) : employee.address != null) return false;
        if (contacts != null ? !contacts.equals(employee.contacts) : employee.contacts != null) return false;
        if (department != null ? !department.equals(employee.department) : employee.department != null) return false;
        return !(personaldetails != null ? !personaldetails.equals(employee.personaldetails) : employee.personaldetails != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fatherName != null ? fatherName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        result = 31 * result + (workExp != +0.0f ? Float.floatToIntBits(workExp) : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (project != null ? project.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (personaldetails != null ? personaldetails.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", designation=" + designation +
                ", workExp=" + workExp +
                ", dob=" + dob +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", salary=" + salary +
                ", project=" + project +
                ", address=" + address +
                ", contacts=" + contacts +
                ", department=" + department +
                ", personaldetails=" + personaldetails +
                '}';
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public PersonalDetails getPersonaldetails() {
        return personaldetails;
    }

    public void setPersonaldetails(PersonalDetails personaldetails) {
        this.personaldetails = personaldetails;
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



