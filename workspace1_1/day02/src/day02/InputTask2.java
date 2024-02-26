package day02;

import java.util.Scanner;

public class InputTask2 {
public static void main(String[] args) {
	/*
	 * 두 정수를 입력받고 합을 출력한다
	 * next()
	 * 
	 * ex)
	 * 정수1 입력 : 10
	 * 정수2 입력 : 30
	 * 
	 * 두 정수의 합은 40입니다.
	 */
	
	Scanner sc = new Scanner(System.in);
		
	
	String msg1 = "정수1 입력 : ", msg2 = "정수2 입력 : ";
	System.out.print(msg1);
	int num1 = Integer.parseInt(sc.next());
	System.out.print(msg2);
	int num2 = Integer.parseInt(sc.next());
	
	System.out.printf("두 정수의 합은 :%d ",(num1+num2),"입니다.");
	

}
}
