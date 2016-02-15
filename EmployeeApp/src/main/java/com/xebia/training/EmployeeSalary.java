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


	public EmployeeSalary(int id,double basic) {
		//super();
		this.id=id;
		this.basic = basic;
		this.hra = 0.5*basic;
		this.da = 0.1*basic;
		this.lta = 0.1*basic;
		this.pf = 0.12*basic;
		this.fp =0.1* basic;
		this.gratuity = 3*basic;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basic);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(da);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gratuity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		temp = Double.doubleToLongBits(lta);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pf);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeSalary other = (EmployeeSalary) obj;
		if (Double.doubleToLongBits(basic) != Double
				.doubleToLongBits(other.basic))
			return false;
		if (Double.doubleToLongBits(da) != Double.doubleToLongBits(other.da))
			return false;
		if (Double.doubleToLongBits(fp) != Double.doubleToLongBits(other.fp))
			return false;
		if (Double.doubleToLongBits(gratuity) != Double
				.doubleToLongBits(other.gratuity))
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
		return "id=" + id + ", basic=" + basic + ", hra=" + hra
				+ ", da=" + da + ", lta=" + lta + ", pf=" + pf + ", fp=" + fp
				+ ", gratuity=" + gratuity + "";
	}



}
