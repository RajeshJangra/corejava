package com.xebia.training.Classes;

/**
 * Created by jasleen on 13/2/16.
 */
public class Salary {
    public int id;
    public int salaryId;
    public double basic;
    public double hrAllowance;
    public double domesticAllowance;
    public double leaveTravelAllowance;
    public double profidentFund;
    public double flexyPay;
    public double gratuity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getHrAllowance() {
        return hrAllowance;
    }

    public void setHrAllowance(double hrAllowance) {
        this.hrAllowance = hrAllowance;
    }

    public double getDomesticAllowance() {
        return domesticAllowance;
    }

    public void setDomesticAllowance(double domesticAllowance) {
        this.domesticAllowance = domesticAllowance;
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

    public double getFlexyPay() {
        return flexyPay;
    }

    public void setFlexyPay(double flexyPay) {
        this.flexyPay = flexyPay;
    }

    public double getGratuity() {
        return gratuity;
    }

    public void setGratuity(double gratuity) {
        this.gratuity = gratuity;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeeId=" + id +
                ", salaryId=" + salaryId +
                ", basic=" + basic +
                ", hrAllowance=" + hrAllowance +
                ", domesticAllowance=" + domesticAllowance +
                ", leaveTravelAllowance=" + leaveTravelAllowance +
                ", profidentFund=" + profidentFund +
                ", flexyPay=" + flexyPay +
                ", gratuity=" + gratuity +
                '}';
    }

    public void calculateSalary(double basic){
        hrAllowance = 0.04*basic;
        domesticAllowance = 0.08*basic;
        leaveTravelAllowance = 0.07*basic;
        profidentFund = 0.12*basic;
        flexyPay = 0.56*basic;
        gratuity = 0.85*basic;
    }


}
