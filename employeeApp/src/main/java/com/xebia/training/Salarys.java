package com.xebia.training;

/**
 * Created by mkishore on 2/14/2016.
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "employees")
@XmlAccessorType (XmlAccessType.FIELD)

public class Salarys {
    @XmlElement(name = "employee")
    private List<Salary> sal = null;

    public List<Salary> getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Salarys{" +
                "sal=" + sal +
                '}';
    }

    public void setEmployees(List<Salary> sal) {
        this.sal = sal;
    }
}
