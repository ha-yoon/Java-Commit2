package input;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
	
		
		System.out.print("키코드 입력하고 엔터 : ");

		int KeyCode;

		KeyCode = System.in.read();
		
		System.out.println(KeyCode);

		KeyCode = System.in.read(); 
		System.out.println(KeyCode);

		KeyCode = System.in.read();
		System.out.println(KeyCode);


	}

}