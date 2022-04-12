package input;

import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("문자열을 입력 : ");

		String str = scan.next();
	
		System.out.println(str);

		System.out.print("정수를 입력 : ");
		int a = scan.nextInt();
	
		System.out.println(a);

		System.out.print("실수를 입력 : ");

		double b = scan.nextDouble();
	
		System.out.println(b);

		System.out.print("문자열을 입력 : ");

		String str2 = scan.nextLine();
	
		System.out.println(str2);

		scan.close();
	
	}

}