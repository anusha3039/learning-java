package students;

import java.util.List;

public class Marks {

	public double getPercentage(List<Integer> markList) {
//		System.out.println(" Marks = " + markList.toString());

		double percentage = 0;
		double subs = markList.size();
		if (!markList.isEmpty()) {
			int total = 0;

			for (int subMarks : markList) {
				total += subMarks;
			}
			System.out.println(" Total = " + total + " total subs :: " + subs);
			return (total / (subs * 100)) * 100;
		}

		return percentage;

	}

}
