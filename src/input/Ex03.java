package input;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Scanner 를 사용해서 이름 나이 키 몸무게를 입력받아 출력

		Scanner scan = new Scanner(System.in);

		System.out.print(" 이름 : ");
		String name = scan.next();
		System.out.println(name);

		System.out.print(" 나이 : ");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.print(" 키 : ");
		double height = scan.nextDouble();
		System.out.println(height);

		System.out.print(" 몸무게 : ");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);

		scan.close();
	}

}