package opreation;

public class Ex01 {

	public static void main(String[] args) {

		int i, j;

		i = +100; 
		j = -200;

		System.out.println(i + j); 

		
		int x = 1;
		int y = 1;

		x++;
		y = x;
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);

		++x;
		y = x;
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);

		x = y = 1;
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);

	
		y = ++x;
		
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);

		y = x++;
	
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);
	}

}