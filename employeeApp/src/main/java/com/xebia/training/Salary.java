package com.xebia.training;
import javax.xml.bind.annotation.*;
@SuppressWarnings("restriction")
@XmlRootElement
public class Salary {
private int id;
private double basic;
private double hra;
private double da;
private double lta;
private double fp;
private double gratuity;
public Salary() {
	
}
public Salary(int id, double basic) {
	super();
	this.id = id;
	this.basic = basic;
	hra = basic/5;
	da = basic/10;
	lta = basic/15;
	fp = basic/20;
	gratuity = basic/21;
	}

@XmlAttribute
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}

@XmlElement
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
	this.hra = basic/5;
}
public double getDa() {
	return da;
}
public void setDa(int da) {
	this.da = basic/10;
}
public double getLta() {
	return lta;
}
public void setLta(int lta) {
	this.lta = basic/15;
}
public double getFp() {
	return fp;
}
public void setFp(int fp) {
	this.fp = basic/20;
}
public double getGratuity() {
	return gratuity;
}
public void setGratuity(int gratuity) {
	this.gratuity = basic/21;
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
	return true;
}
public double getPay(double basic, double hra, double da, double lta, double pf, double fp, double gratuity)
{
	return 0.0;
}
@Override
public String toString() {
	return "Salary [basic=" + basic + ", hra=" + hra + ", da=" + da + ", lta="
			+ lta + ", fp=" + fp + ", gratuity=" + gratuity
			+ "]";
}



}
