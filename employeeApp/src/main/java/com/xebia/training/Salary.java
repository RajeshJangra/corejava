package com.xebia.training;

public class Salary {
	private int id;
	private double basic;
	private double hra;
	private double da;
	private double lta;
	private double pf;
	private double fp;
	private double gratuity;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Salary [id=" + id + ", basic=" + basic + ", hra=" + hra
				+ ", da=" + da + ", lta=" + lta + ", pf=" + pf + ", fp=" + fp
				+ ", gratuity=" + gratuity + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the hra
	 */
	public double getHra() {
		return hra;
	}
	/**
	 * @param hra the hra to set
	 */
	public void setHra(double hra) {
		this.hra = hra;
	}
	/**
	 * @return the da
	 */
	public double getDa() {
		return da;
	}
	/**
	 * @param da the da to set
	 */
	public void setDa(double da) {
		this.da = da;
	}
	/**
	 * @return the lta
	 */
	public double getLta() {
		return lta;
	}
	/**
	 * @param lta the lta to set
	 */
	public void setLta(double lta) {
		this.lta = lta;
	}
	/**
	 * @return the pf
	 */
	public double getPf() {
		return pf;
	}
	/**
	 * @param pf the pf to set
	 */
	public void setPf(double pf) {
		this.pf = pf;
	}
	/**
	 * @return the fp
	 */
	public double getFp() {
		return fp;
	}
	/**
	 * @param fp the fp to set
	 */
	public void setFp(double fp) {
		this.fp = fp;
	}
	/**
	 * @return the gratuity
	 */
	public double getGratuity() {
		return gratuity;
	}
	/**
	 * @param gratuity the gratuity to set
	 */
	public void setGratuity(double gratuity) {
		this.gratuity = gratuity;
	}
	


}
