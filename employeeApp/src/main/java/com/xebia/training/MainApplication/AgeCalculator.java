package com.xebia.training.MainApplication;

import com.xebia.training.EmployeeEntities.Employee;

import java.util.Calendar;

/**
 * Created by raggarwal on 29/2/16.
 */
public class AgeCalculator {
    Employee employee;

    public AgeCalculator(Employee employee) {
        this.employee = employee;
    }

    public int ageCal(){

        int age = dateCalculator() - getBirthYear();
        return age;
    }

    public int dateCalculator(){
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        return currentyear;
    }


    public int getBirthYear(){
        Calendar year1 = Calendar.getInstance();
        year1.setTime(employee.getDOB());
        int year = year1.get(Calendar.YEAR);


        return year;
    }



}
