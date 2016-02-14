package com.xebia.training;

import com.xebia.training.employeeInformation.Employee;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by nitishkumar on 11-Feb-16.
 */
@XmlRootElement(name = "employees")
class Employees {
    private List<Employee> employeeList;

    public Employees() {
    }

    public Employees(final List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @XmlElement(name = "employee")
    public List<Employee> getEmployees() {
        return employeeList;
    }

    public void setEmployees(final List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" + employeeList +
                '}';
    }
}
