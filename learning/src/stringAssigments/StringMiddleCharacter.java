package stringAssigments;

import java.util.Scanner;

public class StringMiddleCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = sc.nextLine();
		System.out.print("The middle character in the string: " + middleLetter(str));
	}

	public static String middleLetter(String str) {
		int beginIndex;
		if (str.length() % 2 == 0) {
			beginIndex = str.length() / 2 - 1;
			return str.substring(beginIndex, beginIndex + 2);
		} else {
			beginIndex = str.length() / 2;
			return str.substring(beginIndex, beginIndex + 1);
		}
	}
}