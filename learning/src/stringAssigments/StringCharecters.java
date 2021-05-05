package stringAssigments;
import java.util.Scanner;
public class StringCharecters {
	private static Scanner sc;

	public static void main(String args[]) {

		int aLetterCount = 0;
		int eLetterCount = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter a string value : ");
		String scanedLine = sc.nextLine();
		for (int i = 0; i < scanedLine.length(); i++) {
			if ("a".equals(Character.toString(scanedLine.charAt(i)))) {
				aLetterCount++;
			} else if ("e".equals(Character.toString(scanedLine.charAt(i)))) {
				eLetterCount++;
			}

		}
		System.out.println(" a letter repeated following times: " + aLetterCount);
		System.out.println(" e letter repeated following times: " + eLetterCount);

	}
}