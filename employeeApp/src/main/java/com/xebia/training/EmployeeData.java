package com.xebia.training;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mkishore on 2/12/2016.
 */
@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeData {
    int id;
    int experience;
    enum designation {
        TRAINEE,
        PROJECT_ENGINEER,
        JAVA_DEVELOPER,
        ACCOUNTANT,
        QA_ANALYST,
        SCRUM_MASTER;
    }
    designation d;

    public EmployeeData(int id,int experience,designation d)
    {
       this.id=id;
        this.experience=experience;
        this.d=d;
    }
    public int getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeData that = (EmployeeData) o;

        if (id != that.id) return false;
        if (experience != that.experience) return false;
        return d == that.d;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + experience;
        result = 31 * result + (d != null ? d.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", experience=" + experience +
                ", d=" + d +
                '}';
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public designation getD() {
        return d;
    }

    public void setD(designation d) {
        this.d = d;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeData() {
    }
}
