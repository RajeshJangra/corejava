package com.xebia.training;
//
//public class Salary {
//	private double basics;
//	private double da;
//	private double hra;
//	private double ta;
//	private double pf;
//	private double fp;
//	private double gratuity;
//	public Salary(double basics, double da, double hra, double ta, double pf,
//			double fp, double gratuity) {
//		super();
//		this.basics = basics;
//		this.da = da;
//		this.hra = hra;
//		this.ta = ta;
//		this.pf = pf;
//		this.fp = fp;
//		this.gratuity = gratuity;
//	}
//	public double getBasics() {
//		return basics;
//	}
//	public void setBasics(double basics) {
//		this.basics = basics;
//	}
//	public double getDa() {
//		return da;
//	}
//	public void setDa(double da) {
//		this.da = da;
//	}
//	public double getHra() {
//		return hra;
//	}
//	public void setHra(double hra) {
//		this.hra = hra;
//	}
//	public double getTa() {
//		return ta;
//	}
//	public void setTa(double ta) {
//		this.ta = ta;
//	}
//	public double getPf() {
//		return pf;
//	}
//	public void setPf(double pf) {
//		this.pf = pf;
//	}
//	public double getFp() {
//		return fp;
//	}
//	public void setFp(double fp) {
//		this.fp = fp;
//	}
//	public double getGratuity() {
//		return gratuity;
//	}
//	public void setGratuity(double gratuity) {
//		this.gratuity = gratuity;
//	}
//	@Override
//	public String toString() {
//		return "Salary [basics=" + basics + ", da=" + da + ", hra=" + hra
//				+ ", ta=" + ta + ", pf=" + pf + ", fp=" + fp + ", gratuity="
//				+ gratuity + "]";
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		long temp;
//		temp = Double.doubleToLongBits(basics);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(da);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(fp);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(gratuity);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(hra);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(pf);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(ta);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Salary other = (Salary) obj;
//		if (Double.doubleToLongBits(basics) != Double
//				.doubleToLongBits(other.basics))
//			return false;
//		if (Double.doubleToLongBits(da) != Double.doubleToLongBits(other.da))
//			return false;
//		if (Double.doubleToLongBits(fp) != Double.doubleToLongBits(other.fp))
//			return false;
//		if (Double.doubleToLongBits(gratuity) != Double
//				.doubleToLongBits(other.gratuity))
//			return false;
//		if (Double.doubleToLongBits(hra) != Double.doubleToLongBits(other.hra))
//			return false;
//		if (Double.doubleToLongBits(pf) != Double.doubleToLongBits(other.pf))
//			return false;
//		if (Double.doubleToLongBits(ta) != Double.doubleToLongBits(other.ta))
//			return false;
//		return true;
//	}
//	
//
//}

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