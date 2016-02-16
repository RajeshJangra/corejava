package employeeApplication;



import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Employee {

  private String name;
  private Date startingDate;
  private String fathersName;
  private int age;
  private Date endingDate;
  private String correspondant;
  static Designation designation;
  private String current;
        private String personal;
  private String workEx;
  private int id;
  private String gender;
  private Date DOB;
  
  public List<Salary> salary;
  public List<Project> projectData;
  public List<PersonalDetails> personalDetails;
  public List<Department> department;
  public List<Address> address;
  
  public enum Designation{
    TRAINEE,
    CONSULTANT,
    SENIOR_CONSULTANT,
    PRINCIPLE_CONSULTANT,
    CEO,
    CTO,
    TECHNICAL_DIRECTOR;
   }
  @SuppressWarnings("static-access")
  public Employee(String name, Date startingDate, String fathersName,Date endingDate, String correspondant,
    Designation designation, String current, String personal,String workEx, String gender, Date dOB, 
    int id,List<Salary> salary,List<Project> projectData,List<PersonalDetails> personalDetails,
    List<Department> department,List<Address> address) 
  {
   super();
   this.name = name;
   this.startingDate = startingDate;
   this.fathersName = fathersName;
   @SuppressWarnings("unused")
   int year = Calendar.getInstance().get(Calendar.YEAR);
   this.DOB = dOB;
   this.age = dateCalculator() -getBirthYear();
   this.endingDate = endingDate;
   this.correspondant = correspondant;
   this.designation = designation;
   this.current = current;
   this.personal = personal;
   this.workEx = workEx;
   this.gender = gender;
   this.id = id;
   this.salary = salary;
   this.projectData= projectData;
   this.personalDetails = personalDetails;
   this.department = department;
   this.address = address;
   
      
  }
  


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (DOB == null) {
		if (other.DOB != null)
			return false;
	} else if (!DOB.equals(other.DOB))
		return false;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (age != other.age)
		return false;
	if (correspondant == null) {
		if (other.correspondant != null)
			return false;
	} else if (!correspondant.equals(other.correspondant))
		return false;
	if (current == null) {
		if (other.current != null)
			return false;
	} else if (!current.equals(other.current))
		return false;
	if (department == null) {
		if (other.department != null)
			return false;
	} else if (!department.equals(other.department))
		return false;
	if (endingDate == null) {
		if (other.endingDate != null)
			return false;
	} else if (!endingDate.equals(other.endingDate))
		return false;
	if (fathersName == null) {
		if (other.fathersName != null)
			return false;
	} else if (!fathersName.equals(other.fathersName))
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (personal == null) {
		if (other.personal != null)
			return false;
	} else if (!personal.equals(other.personal))
		return false;
	if (personalDetails == null) {
		if (other.personalDetails != null)
			return false;
	} else if (!personalDetails.equals(other.personalDetails))
		return false;
	if (projectData == null) {
		if (other.projectData != null)
			return false;
	} else if (!projectData.equals(other.projectData))
		return false;
	if (salary == null) {
		if (other.salary != null)
			return false;
	} else if (!salary.equals(other.salary))
		return false;
	if (startingDate == null) {
		if (other.startingDate != null)
			return false;
	} else if (!startingDate.equals(other.startingDate))
		return false;
	if (workEx == null) {
		if (other.workEx != null)
			return false;
	} else if (!workEx.equals(other.workEx))
		return false;
	return true;
}



public int dateCalculator()
  {
   int currentyear = Calendar.getInstance().get(Calendar.YEAR);
   return currentyear;
  }
  
  
  public int getBirthYear()
  {
   Calendar year1 = Calendar.getInstance();
   year1.setTime(DOB);
   int year = year1.get(Calendar.YEAR);
   return year;
  }

  public String toString() {
   return "Employee [ \nEmployeeId=" + id + ", startingDate=" + startingDate
     + ", fathersName=" + fathersName + ", age=" + age
     + ", endingDate=" + endingDate + ", correspondant="
     + correspondant + ", current=" + current + ", personal="
     + personal + ", workEx=" + workEx + ",name=" + name + ", gender="
     + gender + ", DOB=" + DOB + ",\n salary=" + salary
     + ",\n projectData=" + projectData + ",\n personalDetails="
     + personalDetails + ",\n department=" + department
     + ",\n Address=" + address + "\n]";
  }
}

