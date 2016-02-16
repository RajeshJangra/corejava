package employeeApplication;


import java.util.Date;

 public class Department {

 double departmentId;
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
 

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Department other = (Department) obj;
	if (Double.doubleToLongBits(departmentId) != Double
			.doubleToLongBits(other.departmentId))
		return false;
	if (endingDate == null) {
		if (other.endingDate != null)
			return false;
	} else if (!endingDate.equals(other.endingDate))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (startingDate == null) {
		if (other.startingDate != null)
			return false;
	} else if (!startingDate.equals(other.startingDate))
		return false;
	return true;
}

public String toString() {
  return " [DepartmentId=" + departmentId + ", name=" + name
    + ", startingDate=" + startingDate + ", endingDate="
    + endingDate + "]";
 }

}