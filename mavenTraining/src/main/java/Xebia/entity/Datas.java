package Xebia.entity;

public class Datas {
	int ID;
	private String name;
	public enum Martial
	{
		married,
		divorced;
	}
	public Martial martial;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Datas(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Datas [ID=" + ID + ", name=" + name + ", getID()=" + getID()
				+ ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
