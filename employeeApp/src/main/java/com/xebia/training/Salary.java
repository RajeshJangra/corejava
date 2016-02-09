package com.xebia.training;

public class Salary {
private double basic;
private double hra;
private double da;
private double lta;
private double pf;
private double fp;
private double gratuity;
public Salary(double basic, double hra, double da, double lta, double pf, double fp, double gratuity) {
	super();
	this.basic = basic;
	this.hra = hra;
	this.da = da;
	this.lta = lta;
	this.pf = pf;
	this.fp = fp;
	this.gratuity = gratuity;
}
public double getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}
public double getHra() {
	return hra;
}
public void setHra(int hra) {
	this.hra = hra;
}
public double getDa() {
	return da;
}
public void setDa(int da) {
	this.da = da;
}
public double getLta() {
	return lta;
}
public void setLta(int lta) {
	this.lta = lta;
}
public double getPf() {
	return pf;
}
public void setPf(int pf) {
	this.pf = pf;
}
public double getFp() {
	return fp;
}
public void setFp(int fp) {
	this.fp = fp;
}
public double getGratuity() {
	return gratuity;
}
public void setGratuity(int gratuity) {
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
	Salary other = (Salary) obj;
	if (Double.doubleToLongBits(basic) != Double.doubleToLongBits(other.basic))
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
	if (Double.doubleToLongBits(lta) != Double.doubleToLongBits(other.lta))
		return false;
	if (Double.doubleToLongBits(pf) != Double.doubleToLongBits(other.pf))
		return false;
	return true;
}
public double getPay(double basic, double hra, double da, double lta, double pf, double fp, double gratuity)
{
	return 0.0;
}
@Override
public String toString() {
	return "Salary [basic=" + basic + ", hra=" + hra + ", da=" + da + ", lta="
			+ lta + ", pf=" + pf + ", fp=" + fp + ", gratuity=" + gratuity
			+ "]";
}



}
