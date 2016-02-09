package com.xebia.training.Employee;

/**
 * Created by jasleen on 27/1/16.
 */
public class SalaryDetails {
    private int id;
    private double basic;
    private double hrAllowance;
    private double domesticAllowance;
    private double leaveTravelAllowance;
    private double profidentFund;
    private double flexyPay;
    private double gratuity;

    public double getGratuity() {
        return gratuity;
    }
    public void setGratuity(double gratuity) {
        this.gratuity = gratuity;
    }
    public double getFlexyPay() {
        return flexyPay;
    }
    public void setFlexyPay(double flexyPay) {
        this.flexyPay = flexyPay;
    }
    public double getLeaveTravelAllowance() {
        return leaveTravelAllowance;
    }
    public void setLeaveTravelAllowance(double leaveTravelAllowance) {
        this.leaveTravelAllowance = leaveTravelAllowance;
    }

    public double getProfidentFund() {
        return profidentFund;
    }
    public void setProfidentFund(double profidentFund) {
        this.profidentFund = profidentFund;
    }
    public double getDomesticAllowance() {
        return domesticAllowance;
    }
    public void setDomesticAllowance(double domesticAllowance) {
        this.domesticAllowance = domesticAllowance;
    }
    public double getHrAllowance() {
        return hrAllowance;
    }
    public void setHrAllowance(double hrAllowance) {
        this.hrAllowance = hrAllowance;
    }
    public double getBasic() {
        return basic;
    }
    public void setBasic(double basic) {
        this.basic = basic;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "salaryDetails{" +
                "id=" + id +
                ", basic=" + basic+
                '}';
    }
    public SalaryDetails(int id, String salId, double basic) {
        this.id = id;
        this.basic = basic;

    }
    public void calculateSalaryDetails(double basic)
    {
        hrAllowance = 0.05*basic;
        System.out.println("hrallowance = " +hrAllowance);
        domesticAllowance = 0.07*basic;
        System.out.println("domesticAllowance = " + domesticAllowance);
        leaveTravelAllowance = 0.08*basic;
        System.out.println("leaveTravelAllowance = " + leaveTravelAllowance);
        profidentFund = 0.125*basic;
        System.out.println("profidentFund = " + profidentFund);
        flexyPay = 0.03*basic;
        System.out.println("flexyPay = " + flexyPay);
        gratuity = 0.04 *basic;
        System.out.println("gratuity = " + gratuity);
        // we can use work ex to determine whether the gratuity is given to a particular employee
        
        
        
    }
}
