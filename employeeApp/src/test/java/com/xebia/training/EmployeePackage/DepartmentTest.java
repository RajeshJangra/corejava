package com.xebia.training.EmployeePackage;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pjhanwar on 16-02-2016.
 */
public class DepartmentTest {

    @Test
    public void testEquals() throws Exception {
        Salary x = new Salary(101,500000);  // equals and hashCode check name field value
        Salary y = new Salary(102,600000);
        Assert.assertTrue(x.equals(y) && y.equals(x));
    }

    @Test
    public void testHashCode() throws Exception {
        Salary x = new Salary(101,500000);  // equals and hashCode check name field value
        Salary y = new Salary(102,600000);

        Assert.assertTrue(x.hashCode() == y.hashCode());

    }
}