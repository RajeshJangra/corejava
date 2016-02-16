package com.xebia.training;

import java.util.List;

import javax.xml.bind.annotation.*;
@SuppressWarnings("restriction")
@XmlRootElement
public class Salaries {
private List<Salary> salary;

public Salaries() {
	
}

public Salaries(List<Salary> salary) {
	super();
	this.salary = salary;
}

@XmlElement(name = "Salary")
public List<Salary> getSalary() {
	return salary;
}

public void setSalary(List<Salary> salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Salaries [salary=" + salary + "]";
}

}
