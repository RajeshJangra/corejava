package com.xebia.training.EmployeePackage;

public class Salary {

	private int id;
	private double BASIC;
	private double HRA;
	private double DA;
	private double LTA;
	private double PF;
	private double FP;
	private double GRATVITY;
	public Salary(int id,double BASIC) {
		super();
		this.id = id;
		this.BASIC = BASIC;
		HRA = 0.5*BASIC;
		DA = 0.1*BASIC;
		LTA = 0.1*BASIC;
		PF = 0.12*BASIC;
		FP = 0.1*BASIC;
		GRATVITY = 3*BASIC;
	}

	@Override
	public String toString() {
		return "EmployeePackage.Salary [id=" + id + ", BASIC=" + BASIC + ", HRA=" + HRA
				+ ", DA=" + DA + ", LTA=" + LTA + ", PF=" + PF + ", FP="
				+ FP + ", GRATVITY=" + GRATVITY + "]";
	}

	public double getBASIC() {
		return BASIC;
	}
	public void setBASIC(float bASIC) {
		BASIC = bASIC;
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
	public double getPF() {
		return PF;
	}
	public void setPF(double pF) {
		PF = pF;
	}
	public double getFP() {
		return FP;
	}
	public void setFP(double fP) {
		FP = fP;
	}
	public double getGRATVITY() {
		return GRATVITY;
	}
	public void setGRATVITY(double gRATVITY) {
		GRATVITY = gRATVITY;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
