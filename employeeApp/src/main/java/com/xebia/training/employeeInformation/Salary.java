package com.xebia.training.employeeInformation;

import org.apache.log4j.Logger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"basic", "houseRentAllowance", "leaveTravelAllowance", "flexiPay", "providentFund", "grossSalary", "netSalary"})
public class Salary {
    static Logger log = Logger.getLogger(Salary.class.getName());
    double basic, houseRentAllowance, leaveTravelAllowance, flexiPay, providentFund, grossSalary, netSalary;

    public Salary() {
    }

    public Salary(double basic) {
        //  log.info("Salary Constructor Called");
        this.basic = basic;
        this.houseRentAllowance = 0.5 * basic;
        this.leaveTravelAllowance = 0.1 * basic;
        this.flexiPay = 0.25 * basic;
        this.providentFund = 0.12 * basic;
        this.grossSalary = this.basic + this.houseRentAllowance + this.leaveTravelAllowance + this.flexiPay + this.providentFund;
        this.netSalary = this.grossSalary - this.providentFund;
        //  log.info("Salary Class Variable Instantiated "+this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salary salary = (Salary) o;

        return Double.compare(salary.basic, basic) == 0 && Double.compare(salary.houseRentAllowance, houseRentAllowance) == 0 && Double.compare(salary.leaveTravelAllowance, leaveTravelAllowance) == 0 && Double.compare(salary.flexiPay, flexiPay) == 0 && Double.compare(salary.providentFund, providentFund) == 0 && Double.compare(salary.grossSalary, grossSalary) == 0 && Double.compare(salary.netSalary, netSalary) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(basic);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(houseRentAllowance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(leaveTravelAllowance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(flexiPay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(providentFund);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(grossSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(netSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @XmlElement(name = "basic")
    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    @XmlElement(name = "houseRentAllowance")
    public double getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public void setHouseRentAllowance(double houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    @XmlElement(name = "leaveTravelAllowance")
    public double getLeaveTravelAllowance() {
        return leaveTravelAllowance;
    }

    public void setLeaveTravelAllowance(double leaveTravelAllowance) {
        this.leaveTravelAllowance = leaveTravelAllowance;
    }

    @XmlElement(name = "flexiPay")
    public double getFlexiPay() {
        return flexiPay;
    }

    public void setFlexiPay(double flexiPay) {
        this.flexiPay = flexiPay;
    }

    @XmlElement(name = "providentFund")
    public double getProvidentFund() {
        return providentFund;
    }

    public void setProvidentFund(double providentFund) {
        this.providentFund = providentFund;
    }

    @XmlElement(name = "grossSalary")
    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @XmlElement(name = "netSalary")
    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    @Override
    public String toString() {
        return "\nBasic= Rs" + basic +
                ", House Rent Allowance= Rs" + houseRentAllowance +
                ", Leave Travel Allowance= Rs" + leaveTravelAllowance +
                ", Flexi Pay= Rs" + flexiPay +
                ", Provident Fund= Rs" + providentFund +
                ", Gross Salary= Rs" + grossSalary +
                ", Net Salary= Rs" + netSalary;
    }
}
