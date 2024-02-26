package day02;

import java.util.Scanner;

public class OperTask1 {

	public static void main(String[] args) {
		
	/* 두 정수를 입력받아서 큰 수가 무엇인지 출력하시오
	 * 
	 * 입력 예시
	 * 첫번쨰 정수 :
	 * 두번쨰 정수 :
	 * 
	 * 출력 예시
	 * 큰 수는 00 입니다.	
	 */
		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2=0; //result=0;//
		String msg1 = "첫번째 정수 : ", msg2="두번째 정수 : ", result = null;
		System.out.print(msg1);
		num1 = sc.nextInt();
		
		System.out.print(msg2);
		num2 = sc.nextInt();
		
		result=num1>num2?"큰 수는 : "+num1:num1==num2?"같습니다." : "큰 수는 :"+num2;
		System.out.println(result);
		
		
		
		
	}
}
