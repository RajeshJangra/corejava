package com.xebia.training;

import org.xml.sax.SAXException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	Employee employee;
	Set<Project> project;
	EmployeeData employeeData;
	PersonalDetails personalDetails;
	Salary salary;
	Department department;
	Address address;
	Contact contact;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	public EmployeeData getEmployeeData() {
		return employeeData;
	}

	public void setEmployeeData(EmployeeData employeeData) {
		this.employeeData = employeeData;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

/*

	public void endate()
	{
		Calendar c=Calendar.getInstance();
		Date d= new SimpleDateFormat("dd-MM-yyyy").parse(Calendar.getInstance().toString());
	}
*/

	@Override
	public String toString() {
		return "Employee{" +

				" \n" + project +
				", \n" + employeeData +
				",\n" + personalDetails +
				", \n" + salary +
				", \n" + department +
				", \n" + address +
				",\n" + contact +
				"}\n";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Employee employee = (Employee) o;

		if (project != null ? !project.equals(employee.project) : employee.project != null) return false;
		if (employeeData != null ? !employeeData.equals(employee.employeeData) : employee.employeeData != null)
			return false;
		if (personalDetails != null ? !personalDetails.equals(employee.personalDetails) : employee.personalDetails != null)
			return false;
		if (salary != null ? !salary.equals(employee.salary) : employee.salary != null) return false;
		if (department != null ? !department.equals(employee.department) : employee.department != null) return false;
		if (address != null ? !address.equals(employee.address) : employee.address != null) return false;
		return contact != null ? contact.equals(employee.contact) : employee.contact == null;

	}

	@Override
	public int hashCode() {
		int result = project != null ? project.hashCode() : 0;
		result = 31 * result + (employeeData != null ? employeeData.hashCode() : 0);
		result = 31 * result + (personalDetails != null ? personalDetails.hashCode() : 0);
		result = 31 * result + (salary != null ? salary.hashCode() : 0);
		result = 31 * result + (department != null ? department.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (contact != null ? contact.hashCode() : 0);
		return result;
	}

	public Employee() {
		super();

	}


	public Employee(EmployeeData employeeData, Address address,Contact contact,Department department,PersonalDetails personal,Set<Project> project,Salary salary) throws NumberFormatException, IOException, InterruptedException, ExecutionException, SAXException, ParserConfigurationException {
		super();
		this.employeeData=employeeData;
		this.address=address;
		this.contact=contact;
		this.department=department;
		this.personalDetails=personal;
		this.project=project;
		this.salary=salary;
	//	EmployeeObjectRead al=new EmployeeObjectRead(id);

	//	this.threadcall();

	}


	/*public void threadcall() throws IOException, InterruptedException {

		Employee e = new Employee();

		Employee.inproject in = e.new inproject(id);
		Thread iproject = new Thread(in);
		iproject.start();
		iproject.join();
		Employee.inpersonal inper = e.new inpersonal(id);
		Thread iper = new Thread(inper);
		iper.start();
		iper.join();
		Employee.insalary insal = e.new insalary(id);
		Thread isal = new Thread(insal);
		isal.start();
		isal.join();
		Employee.indepartment indep = e.new indepartment(id);
		Thread idep = new Thread(indep);
		idep.start();
		idep.join();
		Employee.inaddress inadd = e.new inaddress(id);
		Thread iadd = new Thread(inadd);
		iadd.start();
		iadd.join();
		Employee.incontact incon = e.new incontact(id);
		Thread icon = new Thread(incon);
		icon.start();
		icon.join();
	}
*/
	/*class inproject implements Runnable {
		int id;
		String inpro = "C:/Users/mkishore/Desktop/Today work/project.txt";
		final String directory = "C:/Users/mkishore/Desktop/Today work/";
		Set<Project> project = new HashSet<Project>();
		String line;

		public inproject(int id) {
			this.id = id;
		}

		public void run() {
			try {

				File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\projectxml.xml");
				Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

				doc.getDocumentElement().normalize();

				NodeList nList = doc.getElementsByTagName("employee");

				iterateNodes(nList);


				for (Project p : project) {
					System.out.println(p);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void iterateNodes(final NodeList nList) throws ParseException {
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);

				if ((nNode.getNodeType()) == (Node.ELEMENT_NODE)) {
					printElements((Element) nNode);

				}
			}
		}

		private void printElements(final Element nNode) throws ParseException {
			Element eElement = nNode;

			if (Integer.parseInt(eElement.getAttribute("id")) == id) {


				project.add(new Project(Integer.parseInt(eElement.getAttribute("id")), Integer.parseInt(eElement.getElementsByTagName("projectid").item(0).getTextContent()), eElement.getElementsByTagName("name").item(0).getTextContent(), new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start").item(0).getTextContent()), new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("end").item(0).getTextContent())));


			}


		}
	}

	class inpersonal implements Runnable {
		int id;

		final String directory = "C:/Users/mkishore/Desktop/Today work/";
		List<PersonalDetails> personalDetails=new ArrayList<PersonalDetails>();
		String line;

		public inpersonal(int id) {
			this.id = id;
		}

		public void run() {
			try {

				File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\personalxml.xml");
				Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

				doc.getDocumentElement().normalize();

				NodeList nList = doc.getElementsByTagName("employee");

				iterateNodes(nList);


				for (PersonalDetails p : personalDetails) {
					System.out.println(p);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void iterateNodes(final NodeList nList) throws ParseException {
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);

				if ((nNode.getNodeType()) == (Node.ELEMENT_NODE)) {
					printElements((Element) nNode);

				}
			}
		}

		private void printElements(final Element nNode) throws ParseException {
			Element eElement = nNode;

			if (Integer.parseInt(eElement.getAttribute("id")) == id) {
					personalDetails.add(new PersonalDetails(Integer.parseInt(eElement.getAttribute("id")),
							Long.parseLong(eElement.getElementsByTagName("passport").item(0).getTextContent()),
							Long.parseLong(eElement.getElementsByTagName("adhar").item(0).getTextContent()),
							Long.parseLong(eElement.getElementsByTagName("voter").item(0).getTextContent()),
							Long.parseLong(eElement.getElementsByTagName("account").item(0).getTextContent()),
							eElement.getElementsByTagName("blood").item(0).getTextContent(),
							PersonalDetails.maritialStatus.valueOf(eElement.getElementsByTagName("maritial").item(0).getTextContent()),
							eElement.getElementsByTagName("name").item(0).getTextContent(),
							eElement.getElementsByTagName("father").item(0).getTextContent(),
							new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("dob").item(0).getTextContent()),
							new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start").item(0).getTextContent()),
							new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("end").item(0).getTextContent())));

			}
		}
	}
	class insalary implements Runnable {
		int id;

		final String directory = "C:/Users/mkishore/Desktop/Today work/";
		List<Salary> salary = new ArrayList<Salary>();
		String line;

		public insalary(int id) {
			this.id = id;
		}

		public void run() {
			try {
				File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\salaryxml.xml");
				Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

				doc.getDocumentElement().normalize();

				NodeList nList = doc.getElementsByTagName("employee");

				iterateNodes(nList);


				for (Salary p : salary) {
					System.out.println(p);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void iterateNodes(final NodeList nList) {
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);


				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					printElements((Element) nNode);
				}
			}
		}

		private void printElements(final Element nNode) {
			Element eElement = nNode;

			if (Integer.parseInt(eElement.getAttribute("id")) == id) {


				salary.add(new Salary(Integer.parseInt(eElement.getAttribute("id")), Integer.parseInt(eElement.getElementsByTagName("basic").item(0).getTextContent())));


			}

		}
	}

	class indepartment implements Runnable {
		int id;

		final String directory = "C:/Users/mkishore/Desktop/Today work/";

		String line;
		List<Department> department=new ArrayList<Department>();
		public indepartment(int id) {
			this.id = id;
		}

		public void run() {
			try {
				File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\departmentxml.xml");
				Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

				doc.getDocumentElement().normalize();

				NodeList nList = doc.getElementsByTagName("employee");

				iterateNodes(nList);

				for (Department p : department) {
					System.out.println(p);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void iterateNodes(final NodeList nList) throws ParseException {
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);


				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					printElements((Element) nNode);

				}
			}
		}

		private void printElements(final Element nNode) throws ParseException {
			Element eElement = nNode;

			if (Integer.parseInt(eElement.getAttribute("id")) == id) {


				department = new ArrayList<Department>();


				department.add(new Department(Integer.parseInt(eElement.getAttribute("id")), eElement.getElementsByTagName("deptname").item(0).getTextContent(), new SimpleDateFormat("dd-MM-yyyy").parse(eElement.getElementsByTagName("start").item(0).getTextContent()), null));


			}

		}
	}

	class inaddress implements Runnable {
		List<Address> address = new ArrayList<Address>();
		int id;


		public inaddress(int id) {
			this.id = id;
		}

		public void run() {
			try {
				File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\addressxml.xml");
				Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

				doc.getDocumentElement().normalize();

				NodeList nList = doc.getElementsByTagName("employee");

				iterateNodes(nList);


				for (Address p : address) {
					System.out.println(p);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void iterateNodes(final NodeList nList) {
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);


				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					printElements((Element) nNode);

				}
			}
		}

		private void printElements(final Element nNode) {
			Element eElement = nNode;

			if (Integer.parseInt(eElement.getAttribute("id")) == id) {


				address.add(new Address(id,
						Integer.parseInt(eElement.getElementsByTagName("houseno").item(0).getTextContent()),
						Integer.parseInt(eElement.getElementsByTagName("sector").item(0).getTextContent()),
						eElement.getElementsByTagName("city").item(0).getTextContent(),
						Integer.parseInt(eElement.getElementsByTagName("pincode").item(0).getTextContent()),
						eElement.getElementsByTagName("state").item(0).getTextContent(),
						eElement.getElementsByTagName("landmark").item(0).getTextContent(),
						eElement.getElementsByTagName("email_id").item(0).getTextContent(),
						Address.addresstype.valueOf(eElement.getElementsByTagName("address_type").item(0).getTextContent())));


			}

		}
	}

	class incontact implements Runnable {
		int id;
		String inpro = "C:/Users/mkishore/Desktop/Today work/project.txt";
		final String directory = "C:/Users/mkishore/Desktop/Today work/";
		Employee em=new Employee();

		String line;

		public incontact(int id) {
			this.id = id;
		}

		public void run() {
				em.contact=new ArrayList<Contact>();
			try {
				File file = new File("C:\\Users\\mkishore\\IdeaProjects\\Employee\\src\\main\\java\\com\\EmployeeTraining\\contactxml.xml");
				Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

				doc.getDocumentElement().normalize();

				NodeList nList = doc.getElementsByTagName("employee");

				iterateNodes(nList);


				for (Contact p : contact)

				{
					System.out.println(p);
				}


			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void iterateNodes(final NodeList nList) {
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);


				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					printElements((Element) nNode);

				}
			}
		}

		private void printElements(final Element nNode) {
			Element eElement = nNode;

			if (Integer.parseInt(eElement.getAttribute("id")) == id) {

				contact.add(new Contact(Integer.parseInt(eElement.getAttribute("id")), eElement.getElementsByTagName("emailid").item(0).getTextContent(), Long.parseLong(eElement.getElementsByTagName("phone").item(0).getTextContent())));

			}
		}


	}

*/
}