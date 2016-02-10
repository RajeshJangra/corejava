package com.xebia.training.Employee1;




public class Salary {
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private double salaryId;
	private double HRA;
	private double DA;
	private double basic;
	private double LTA;
	private double FP;
	private double gratvity;
	
	
	
	
	@Override
	public String toString() {
		return "[basic=" + basic + ", HRA="
				+ HRA + ", DA=" + DA + ", LTA=" + LTA + ", FP=" + FP
				+ ", gratvity=" + gratvity + "]";
	}
	public Salary(int id,double salaryId, double basic) {
		super();
		this.salaryId = salaryId;
		this.basic = basic;
		this.HRA = basic/5;
		DA = basic/10;
		LTA = basic/15;
		FP = basic/20;
		this.gratvity = basic/21;
	}
	
	public double getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(double salaryId) {
		this.salaryId = salaryId;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHRA() {
		return HRA;
	}
	public void setHRA(double hRA) {
		HRA = hRA;
	}
	public double getDA() {
		return DA;
	}
	public void setDA(double dA) {
		DA = dA;
	}
	public double getLTA() {
		return LTA;
	}
	public void setLTA(double lTA) {
		LTA = lTA;
	}
	public double getFP() {
		return FP;
	}
	public void setFP(double fP) {
		FP = fP;
	}
	public double getGratvity() {
		return gratvity;
	}
	public void setGratvity(double gratvity) {
		this.gratvity = gratvity;
	}
	
}
