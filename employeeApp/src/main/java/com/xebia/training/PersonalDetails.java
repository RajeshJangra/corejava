package com.xebia.training;

import java.util.Calendar;
import java.util.Date;

public class PersonalDetails {
	private int id;
	private long passportNo,adharNo,voterId,accountNo;
	private String bloodGroup,name,fatherName;
	private Date dob,startdate,enddate;
	enum maritialStatus
	{
		SINGLE,
		DIVORCEE,
		MARRIED;
	}
	maritialStatus m;

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
	 * @return the passport_no
	 */
	public long getPassport_no() {
		return passportNo;
	}
	/**
	 * @param passport_no the passport_no to set
	 */
	public void setPassport_no(long passport_no) {
		this.passportNo = passport_no;
	}
	/**
	 * @return the adhar_no
	 */
	public long getAdhar_no() {
		return adharNo;
	}
	/**
	 * @param adhar_no the adhar_no to set
	 */
	public void setAdhar_no(long adhar_no) {
		this.adharNo = adhar_no;
	}
	/**
	 * @return the voter_id
	 */
	public long getVoter_id() {
		return voterId;
	}
	/**
	 * @param voter_id the voter_id to set
	 */
	public void setVoter_id(long voter_id) {
		this.voterId = voter_id;
	}
	/**
	 * @return the account_no
	 */
	public long getAccount_no() {
		return accountNo;
	}
	/**
	 * @param account_no the account_no to set
	 */
	public void setAccount_no(long account_no) {
		this.accountNo = account_no;
	}
	/**
	 * @return the bloodgroup
	 */
	public String getBloodgroup() {
		return bloodGroup;
	}
	/**
	 * @param bloodgroup the bloodgroup to set
	 */
	public void setBloodgroup(String bloodgroup) {
		this.bloodGroup = bloodgroup;
	}
	/**
	 * @return the maritial_status
	 */
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the father_name
	 */
	public String getFather_name() {
		return fatherName;
	}
	/**
	 * @param father_name the father_name to set
	 */
	public void setFather_name(String father_name) {
		this.fatherName = father_name;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getEnddate() {
		return enddate;
	}
	/**
	 * @param enddate the dob to set
	 */
	public void setDate(Date enddate) {
		this.enddate = enddate;
	}
	public Date getStartdatedate() {
		return startdate;
	}
	/**
	 * @param startdate the dob to set
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public PersonalDetails(int id, long passport_no, long adhar_no,
			long voter_id, long account_no, String bloodgroup,
			 maritialStatus M, String name, String father_name, Date dob,Date startdate,Date enddate) {
		super();
		this.id = id;
		this.passportNo = passport_no;
		this.adharNo = adhar_no;
		this.voterId = voter_id;
		this.accountNo = account_no;
		this.bloodGroup = bloodgroup;
		this.m = M;
		this.name = name;
		this.fatherName = father_name;
		this.dob = dob;
		this.startdate=startdate;
		this.enddate=enddate;
		this.agecalc();
		
	}
	public void agecalc()
	{	Calendar c1=Calendar.getInstance();
	c1.setTime(dob);
		int dbyear=c1.get(Calendar.YEAR);
	//	System.out.println(dbyear);
		Calendar c=Calendar.getInstance();
		int now=c.get(Calendar.YEAR);
		int age=now-dbyear;
		System.out.println("Age calculated is"+age);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonalDetails [id=" + id + ", passport_no=" + passportNo
				+ ", adhar_no=" + adharNo + ", voter_id=" + voterId
				+ ", account_no=" + accountNo + ", bloodgroup=" + bloodGroup
				+ ", maritial_status=" + m + ", name=" + name
				+ ", father_name=" + fatherName + ", dob=" + dob
				+",startdate="+startdate+",enddate=" +enddate+ "]";
	}

	
}
