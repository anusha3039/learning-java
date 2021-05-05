package Employee;

public class EmpMang {

	public static void main(String[] args) {

		Employee emp = new Employee("anu", 23, "9995664766", "Guntur", 124323, "developer");
		Manager mngr = new Manager("ram", 24, "99669690621", "hyd", 214552, "squad lead");
		emp.printSalary();

		mngr.printSalary();

	}

}
