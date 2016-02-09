package com.xebia.training.EmployeeClass;

import org.joda.time.LocalDate;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by kchoudhary on 25-Jan-16.
 */

public class Employee implements Serializable {

    public enum Designation {
        TRAINEE,
        CONSULTANT,
        SENIOR_CONSULTANT,
        MANAGER,
        HR,
        CEO;
    }

    private int id;
    private String name;
    private int age;
    private Designation workExperience;
    private Contact.AddressType addressType;
    private LocalDate startDate;
    private LocalDate endDate;
    Contact contact;
    EmployeeDepartment employeeDepartment;
    EmployeePersonalDetails employeePersonalDetails;
    EmployeeProject employeeProject;
    EmployeeSalary employeeSalary;

    Employee(int id, String name, int age, Designation designation,
             Contact.AddressType addressType, LocalDate startDate, LocalDate endDate) throws IOException {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workExperience = designation;
        this.addressType = addressType;
        this.startDate = startDate;
        this.endDate = endDate;

        FileRead fileRead = new FileRead();
        List<String> contactList = fileRead.readFromFile("C:\\Users\\kchoudhary\\IdeaProjects\\Training\\src\\main\\resources\\Contact");
        Contact contact=new Contact(Integer.parseInt(contactList.get(0)),contactList.get(1),contactList.get(2),contactList.get(3),
                contactList.get(4),contactList.get(5),contactList.get(6),
                contactList.get(7),contactList.get(8),contactList.get(9));
        System.out.println(contact.toString());
        List<String> departmentList = fileRead.readFromFile("C:\\Users\\kchoudhary\\IdeaProjects\\Training\\src\\main\\resources\\Department");
        EmployeeDepartment employeeDepartment = new EmployeeDepartment(Integer.parseInt(departmentList.get(0)),departmentList.get(1),
                new LocalDate(Integer.parseInt(departmentList.get(2)),Integer.parseInt(departmentList.get(3)),Integer.parseInt(departmentList.get(4))),
                new LocalDate(Integer.parseInt(departmentList.get(5)),Integer.parseInt(departmentList.get(6)),Integer.parseInt(departmentList.get(7))));
        System.out.println(employeeDepartment.toString());

//        employeePersonalDetails = new EmployeePersonalDetails(001, "Karan Singh", "Male", new LocalDate(1992, 9, 15), "B+",
//                "Single", "222F2222GHH2", "555DF555", "DL555d55d5");

        List<String> detailsList = fileRead.readFromFile("C:\\Users\\kchoudhary\\IdeaProjects\\Training\\src\\main\\resources\\PersonalDetails");
        EmployeePersonalDetails employeePersonalDetails = new EmployeePersonalDetails(Integer.parseInt(detailsList.get(0)),
                detailsList.get(1),detailsList.get(2),
                new LocalDate(Integer.parseInt(detailsList.get(3)),Integer.parseInt(detailsList.get(4)),Integer.parseInt(detailsList.get(5))),
                detailsList.get(6),detailsList.get(7),detailsList.get(8),detailsList.get(10),detailsList.get(10));
        System.out.println(employeePersonalDetails.toString());


        employeeProject = new EmployeeProject(001, "Pantha", "01/09/15", "22/12/15");
        employeeSalary = new EmployeeSalary(100000);
       // System.out.println(contact.toString());
       // System.out.println(employeeDepartment.toString());
        System.out.println(employeePersonalDetails.toString());
        System.out.println(employeeProject.toString());
        employeeSalary.calculateSalary(employeeSalary.getBasic());
        System.out.println(employeeSalary.toString());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Designation getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Designation workExperience) {
        this.workExperience = workExperience;
    }


    public Contact.AddressType getCorrespondenceAddress() {
        return addressType;
    }

    public void setAddressType(Contact.AddressType addressType) {
        this.addressType = addressType;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", workExperience='" + workExperience + '\'' +
                ", Address Type='" + addressType + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
