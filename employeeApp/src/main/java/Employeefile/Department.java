package Employeefile;

import java.util.Date;

 class Department {

	double departmentId;
	@SuppressWarnings("unused")
	private int id;
	private String name;
	private Date startingDate;
	private Date endingDate;
	
	
	
	public Department(int id,double departmentId, String name, Date startingDate,
			Date endingDate) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.name = name;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
	}
	
	public String toString() {
		return " [DepartmentId=" + departmentId + ", name=" + name
				+ ", startingDate=" + startingDate + ", endingDate="
				+ endingDate + "]";
	}

}
