package Employee;

abstract class LearnAbstract {

	public LearnAbstract() {
		System.out.println("This is constructor of abstract class");

	}

	public abstract void aMethod();

	public void aMethod1() {
		System.out.println("This is a normal method of abstract class");

	}

}

public class SubClass extends LearnAbstract {


	public void aMethod() {
		System.out.println("This is abstract method");{
			
			
		}
		
		
	}
	
	

}