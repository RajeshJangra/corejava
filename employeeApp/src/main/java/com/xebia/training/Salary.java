package com.xebia.training;

public class Salary {
    String id;
    double basic, houseRentAllowance, leaveTravelAllowance, flexiPay, providentFund, grossSalary, netSalary;

    /*
     * @param basic
     * @param houseRentAllowance
     * @param leaveTravelAllowance
     * @param flexiPay
     * @param providentFund
     * @param grossSalary
     * @param netSalary
     */
    public Salary(String id, double basic) {
        super();
        this.id = id;
        this.basic = basic;
        this.houseRentAllowance = 0.5 * basic;
        this.leaveTravelAllowance = 0.1 * basic;
        this.flexiPay = 0.25 * basic;
        this.providentFund = 0.12 * basic;
        this.grossSalary = this.basic + this.houseRentAllowance + this.leaveTravelAllowance + this.flexiPay + this.providentFund;
        this.netSalary = this.grossSalary - this.providentFund;
    }

    /**
     * @return the basic
     */
    public double getBasic() {
        return basic;
    }

    /**
     * @param basic the basic to set
     */
    public void setBasic(double basic) {
        this.basic = basic;
    }

    /**
     * @return the houseRentAllowance
     */
    public double getHouseRentAllowance() {
        return houseRentAllowance;
    }

    /**
     * @param houseRentAllowance the houseRentAllowance to set
     */
    public void setHouseRentAllowance(double houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    /**
     * @return the leaveTravelAllowance
     */
    public double getLeaveTravelAllowance() {
        return leaveTravelAllowance;
    }

    /**
     * @param leaveTravelAllowance the leaveTravelAllowance to set
     */
    public void setLeaveTravelAllowance(double leaveTravelAllowance) {
        this.leaveTravelAllowance = leaveTravelAllowance;
    }

    /**
     * @return the flexiPay
     */
    public double getFlexiPay() {
        return flexiPay;
    }

    /**
     * @param flexiPay the flexiPay to set
     */
    public void setFlexiPay(double flexiPay) {
        this.flexiPay = flexiPay;
    }

    /**
     * @return the providentFund
     */
    public double getProvidentFund() {
        return providentFund;
    }

    /**
     * @param providentFund the providentFund to set
     */
    public void setProvidentFund(double providentFund) {
        this.providentFund = providentFund;
    }

    /**
     * @return the grossSalary
     */
    public double getGrossSalary() {
        return grossSalary;
    }

    /**
     * @param grossSalary the grossSalary to set
     */
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    /**
     * @return the netSalary
     */
    public double getNetSalary() {
        return netSalary;
    }

    /**
     * @param netSalary the netSalary to set
     */
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
