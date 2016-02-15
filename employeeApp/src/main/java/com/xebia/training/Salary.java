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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		if (Double.doubleToLongBits(basic) != Double.doubleToLongBits(other.basic))
			return false;
		if (Double.doubleToLongBits(da) != Double.doubleToLongBits(other.da))
			return false;
		if (Double.doubleToLongBits(fp) != Double.doubleToLongBits(other.fp))
			return false;
		if (Double.doubleToLongBits(gratuity) != Double.doubleToLongBits(other.gratuity))
			return false;
		if (Double.doubleToLongBits(hra) != Double.doubleToLongBits(other.hra))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(lta) != Double.doubleToLongBits(other.lta))
			return false;
		if (Double.doubleToLongBits(pf) != Double.doubleToLongBits(other.pf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(Eid=" + id + ", Basic=" + basic + ", HRA=" + hra + ", DA=" + da + ", LTA=" + lta + ", PF=" + pf
				+ ", FP=" + fp + ", Gratuity=" + gratuity + ")";
	}
	
	
	


}
