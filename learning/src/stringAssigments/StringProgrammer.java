package stringAssigments;

import java.util.Scanner;

public class StringProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Programmer";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string word : ");
		String s2 = sc.nextLine();
		sc.close();
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
