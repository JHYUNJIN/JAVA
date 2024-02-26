package operator;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
		
		/*
		 * 실습
		 * 사용자에게 키를 입력받고 정수하면 정수로 출력
		 * 실수라면 실수로 출력
		 * 예) 183 --> 183 출력
		 * 183.5 --> 183.5 출력
		 * 삼항 연산자를 사용한다.
		 * nextDouble() 사용! 
		 */
//		a-(int)a==0;
		/*
		 * 3.5-3=0.5 --> 실수
		 * 3.0-3=0.0 --> 정수
		 */
		
		Scanner sc = new Scanner(System.in);
		double height=0.0;
		boolean check = false;
		String msg ="키를 입력해주세요 : ", result=null;
		
		System.out.println(msg);
		height = sc.nextDouble();
		
		check = height-(int)height==0;
		result = check? (int)height+"cm":height+"cm";
		
		System.out.println(result);
	
		
		
	}
}
