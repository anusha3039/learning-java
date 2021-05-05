package students;

import java.util.Scanner;

public class Student1 {

	private static Scanner sc;

	public static void main(String[] args) {

		int english, chemistry, computers, physics, maths;

		float total, Percentage, Average;

		sc = new Scanner(System.in);

		System.out.println(" Please Enter ENG, CHEM, MATHS :: Marks : ");
		


		english = sc.nextInt();

		chemistry = sc.nextInt();

		maths = sc.nextInt();
		
		StudentA studentA = new StudentA(english, chemistry, maths);
		
		
		System.out.println(" Marks Percentage = " + studentA.getPercentage());
		
		System.out.println(" Please Enter ENG, CHEM, MATHS, COMPUTERS :: Marks : ");
		english = sc.nextInt();

		chemistry = sc.nextInt();

		maths = sc.nextInt();

		computers = sc.nextInt();
		
		StudentB studentB = new StudentB(english, chemistry, maths, computers);

		System.out.println(" Marks Percentage = " + studentB.getPercentage());

	}

}
