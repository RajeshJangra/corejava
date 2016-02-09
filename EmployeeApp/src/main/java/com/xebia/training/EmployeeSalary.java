package com.xebia.training;

public class EmployeeSalary {
	private int id;
	private double basic;
	private double hra;
	private double da;
	private double lta;
	private double pf;
	private double fp;
	private double gratuity;
	public double getBasic() {
		return basic;
	}


	public EmployeeSalary(int id,double basic, double hra, double da, double lta,
			double pf, double fp, double gratuity) {
		//super();
		this.id=id;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.lta = lta;
		this.pf = pf;
		this.fp = fp;
		this.gratuity = gratuity;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getLta() {
		return lta;
	}
	public void setLta(double lta) {
		this.lta = lta;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getFp() {
		return fp;
	}
	public void setFp(double fp) {
		this.fp = fp;
	}
	public double getGratuity() {
		return gratuity;
	}
	public void setGratuity(double gratuity) {
		this.gratuity = gratuity;
	}


	@Override
	public String toString() {
		return "EmployeeSalary [id=" + id + ", basic=" + basic + ", hra=" + hra
				+ ", da=" + da + ", lta=" + lta + ", pf=" + pf + ", fp=" + fp
				+ ", gratuity=" + gratuity + "]";
	}



}
