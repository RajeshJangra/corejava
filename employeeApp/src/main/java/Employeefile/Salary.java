package Employeefile;

public class Salary {
	
	int id;
	private double salaryId;
	private double HRA;
	private double DA;
	private double basic;
	private double LTA;
	private double FP;
	private double gratuty;
	
	
	public String toString() {
		return "basic=" + basic + ", HRA="+ HRA + ", DA=" + DA + ", LTA=" + LTA + ", FP=" 
	           + FP+ ", gratvity=" + gratuty;
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
		if (Double.doubleToLongBits(DA) != Double.doubleToLongBits(other.DA))
			return false;
		if (Double.doubleToLongBits(FP) != Double.doubleToLongBits(other.FP))
			return false;
		if (Double.doubleToLongBits(HRA) != Double.doubleToLongBits(other.HRA))
			return false;
		if (Double.doubleToLongBits(LTA) != Double.doubleToLongBits(other.LTA))
			return false;
		if (Double.doubleToLongBits(basic) != Double
				.doubleToLongBits(other.basic))
			return false;
		if (Double.doubleToLongBits(gratuty) != Double
				.doubleToLongBits(other.gratuty))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(salaryId) != Double
				.doubleToLongBits(other.salaryId))
			return false;
		return true;
	}



	public Salary(int id,double salaryId, double basic) 
	{
		super();
		this.salaryId = salaryId;
		this.basic = basic;
		this.HRA = basic/5;
		DA = basic/10;
		LTA = basic/15;
		FP = basic/20;
		this.gratuty = basic/21;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(double salaryId) {
		this.salaryId = salaryId;
	}
}