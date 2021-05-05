package Employee;

class Employee extends Member {

	public Employee(String name, int age, String phonenumber, String address, int salary, String specialization) {
		super(name, age, phonenumber, address, salary);
		setSpecialization(specialization);
	}

	String specialization;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


}
