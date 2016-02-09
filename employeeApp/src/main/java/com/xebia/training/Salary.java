package com.xebia.training;

public class Salary {
	

	private int id;
	private double basic,hra,da,lta,pf,fp,gratuity;
	
	public Salary(int id, double basic) {
		super();
		this.id = id;
		this.basic = basic;
		hra=0.5*basic;
		   da=0.1*basic;
		  lta=0.1*basic;
		  pf=0.12*basic;
		  fp=0.1*basic;
		  gratuity=3*basic;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBasic() {
		return basic;
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
		return "Salary [id=" + id + ", basic=" + basic + ", hra=" + hra + ", da=" + da + ", lta=" + lta + ", pf=" + pf
				+ ", fp=" + fp + ", gratuity=" + gratuity + "]";
	}
	
	
	


}
