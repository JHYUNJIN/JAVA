package day02;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
		/*
		 * 두 자릿수의 정수를 입려받고 십의자리, 일의자리를 출력하는 프로그램 만들기
		 * 
		 * 1. 변수 3개를 선언(int)
		 * 2. 출력한다. (두 자릿수의 정수를 입력하세요 : )
		 * 3. 입력받아서 변수에 저장한다.
		 * 4. 연산한다.
		 * 	4-1. 입력받은 값을 10으로 나눈다.
		 * 	4-2. 입력받은 값을 10으로 나눈 나머지를 구한다.
		 * 5. 결과를 출력한다.
		 * 
		 */

	Scanner sc = new Scanner(System.in);
	System.out.println("두 자릿수의 정수를 입력하세요 : ");
	int num1 = sc.nextInt();
	System.out.printf("십의 자리 숫자는 %d 일의 자리 숫자는 %d 입니다.",num1/10,num1%10);
	
	
	int number = 0, result10=0, result1=0;
	String msg = "두 자릿수의 정수를 입력하세요 : ";
	
	System.out.println(msg);
	number = sc.nextInt();
	result10 = number/10;
	result1 = number%10;
	System.out.println("십의 자리는 "+result10+"이고 일의자리는 "+result1+"입니다.");
	
	
	
	
	}
	
	

}
