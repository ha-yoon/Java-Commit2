package opreation;

public class Ex02 {

	public static void main(String[] args) {

		int a, b, c, d;

		a = 10;
		b = 20;
		c = 30;
		d = 40;

		int result1 = a + b * c - d;
		System.out.println("10 + 20 * 30 - 40 : " + result1);

		boolean result2 = a < b&& c > d;
		System.out.println("10 < 20 && 30 > 40 : " + result2);
	

		boolean result3 = a > b || c < d;
		System.out.println("10 > 20 || 30 < 40 : " + result3);

	}

}