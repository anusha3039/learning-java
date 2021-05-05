package students;

import java.util.Arrays;

public class StudentB extends Marks {

	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;

	public StudentB(int sub1, int sub2, int sub3, int sub4) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getSub4() {
		return sub4;
	}

	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}

	public double getPercentage() {
		return getPercentage(Arrays.asList(sub1, sub2, sub3, sub4));
	}
}
