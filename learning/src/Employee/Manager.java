package Employee;

public class Manager extends Member {

	public Manager(String name, int age, String phonenumber, String address, int salary, String department) {
		super(name, age, phonenumber, address, salary);
		setDepartment(department);
	}

	String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	

}
