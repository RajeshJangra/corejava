package com.xebia.training.EmployeeClass;

import org.joda.time.LocalDate;

import java.io.IOException;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class EmployeeApplication {

    public static void main(String[] args) throws IOException {

//        FileRead fileRead = new FileRead();
//        List<String> list = fileRead.readFromFile("C:\\Users\\kchoudhary\\IdeaProjects\\Training\\src\\main\\resources\\Contact");
//        Contact contact=new Contact(Integer.parseInt(list.get(0)),list.get(1),list.get(2),list.get(3),
//                list.get(4),list.get(5),list.get(6),
//                list.get(7),list.get(8),list.get(9));
//        System.out.println(contact.toString());
//        List<String> list1 = fileRead.readFromFile("C:\\Users\\kchoudhary\\IdeaProjects\\Training\\src\\main\\resources\\Department");
//        EmployeeDepartment employeeDepartment = new EmployeeDepartment(Integer.parseInt(list1.get(0)),list1.get(1),
//                new LocalDate(Integer.parseInt(list1.get(2)),Integer.parseInt(list1.get(3)),Integer.parseInt(list1.get(4))),
//                new LocalDate(Integer.parseInt(list1.get(5)),Integer.parseInt(list1.get(6)),Integer.parseInt(list1.get(7))));
//        System.out.println(employeeDepartment.toString());


        Employee employee = new Employee(465, "Kapil", 22, Employee.Designation.TRAINEE, Contact.AddressType.CORRESPONDENCE
                , new LocalDate(2015, 9, 01), new LocalDate(2016, 9, 01));
        System.out.println(employee.toString());
    }
}