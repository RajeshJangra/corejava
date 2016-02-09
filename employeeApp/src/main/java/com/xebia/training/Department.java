package com.xebia.training;
//
//import java.util.Date;
//
//public class Department {
//	private String name;
//	private int id;
//	private Date startDate;
//	private Date endDate;
//	public Department(String name, int id, Date startDate, Date endDate) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.startDate = startDate;
//		this.endDate = endDate;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public Date getStartDate() {
//		return startDate;
//	}
//	public void setStartDate(Date startDate) {
//		this.startDate = startDate;
//	}
//	public Date getEndDate() {
//		return endDate;
//	}
//	public void setEndDate(Date endDate) {
//		this.endDate = endDate;
//	}
//	@Override
//	public String toString() {
//		return "Department [name=" + name + ", id=" + id + "]";
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Department other = (Department) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
//	
//
//}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

enum DepartmentType {
    ACCOUNT("D01", "01-01-2000", "01-01-2020"),
    MANAGEMENT("D02", "01-01-2001", "01-01-2020"),
    IT("D03", "01-01-2002", "01-01-2020"),
    LOGISTICS("D04", "01-01-2003", "01-01-2020"),
    ADMIN("D05", "01-01-2004", "01-01-2020"),
    HR("D06", "01-01-2005", "01-01-2020"),
    OTHERS("D07", "01-01-2006", "01-01-2020");
    private String departmentId;
    private Date startDate, endDate;

    private DepartmentType(String departmentId, String startDate, String endDate) {
        this.departmentId = departmentId;
        try {
            this.startDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
            this.endDate = new SimpleDateFormat("dd-MM-yyyy").parse(endDate);
        } catch (ParseException p) {
            p.printStackTrace();
        }
    }

    /**
     * @return the departmentId
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

public class Department {
    String id, deptId, deptName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    Date startDate, endDate;

    Department(String id, DepartmentType departmentType) {
        this.id = id;
        this.deptId = departmentType.getDepartmentId();
        this.deptName = departmentType.name();
        this.startDate = departmentType.getStartDate();
        this.endDate = departmentType.getEndDate();
    }

    @Override
    public String toString() {
        return "\nDept Id='" + deptId + '\'' +
                ", Dept Name='" + deptName + '\'' +
                ", Start Date=" + startDate +
                ", End Date=" + endDate;
    }
}