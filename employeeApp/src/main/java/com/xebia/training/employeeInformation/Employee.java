package com.xebia.training.employeeInformation;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@XmlType
public class Employee {

    private String id;
    private int workExperience;
    private Date startDate, endDate = null;
    private Designation designation;
    private List<Address> address = new ArrayList<>();
    private Contact contact;
    private Department department;
    private PersonalDetails personalDetails;
    private Set<Project> project = new HashSet<>();
    private Salary salary;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (workExperience != employee.workExperience) return false;
        if (!id.equals(employee.id)) return false;
        if (!startDate.equals(employee.startDate)) return false;
        if (!endDate.equals(employee.endDate)) return false;
        if (designation != employee.designation) return false;
        if (!address.equals(employee.address)) return false;
        if (!contact.equals(employee.contact)) return false;
        if (!department.equals(employee.department)) return false;
        if (!personalDetails.equals(employee.personalDetails)) return false;
        if (!project.equals(employee.project)) return false;
        return salary.equals(employee.salary);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + workExperience;
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        result = 31 * result + designation.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + contact.hashCode();
        result = 31 * result + department.hashCode();
        result = 31 * result + personalDetails.hashCode();
        result = 31 * result + project.hashCode();
        result = 31 * result + salary.hashCode();
        return result;
    }

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "workExperience")
    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @XmlElement(name = "designation")
    public Employee.Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Employee.Designation designation) {
        this.designation = designation;
    }

    @XmlElement(name = "startDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @XmlElement(name = "endDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @XmlElement(name = "address")
    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @XmlElement(name = "contact")
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @XmlElement(name = "department")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @XmlElement(name = "personalDetails")
    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    @XmlElement(name = "project")
    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }

    @XmlElement(name = "salary")
    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID:-\'" + id + '\'' +
                ", Work Experience:-" + workExperience +
                ", Start Date:-" + startDate +
                ", End Date:-" + endDate +
                ", Designation:-" + designation +
                ", \n\nAddress:-" + address +
                ", \n\nContact:-" + contact +
                ", \n\nDepartment:-" + department +
                ", \n\nPersonal Details:-" + personalDetails +
                ", \n\nproject:-" + project +
                ", \n\nSalary:-" + salary +
                "\n}\n\n\n";
    }

    public enum Designation {
        TRAINEE,
        PROJECT_ENGINEER,
        JAVA_DEVELOPER,
        ACCOUNTANT,
        QA_ANALYST,
        SCRUM_MASTER,
        CEO
    }
}

