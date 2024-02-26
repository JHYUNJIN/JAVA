package day02;

import java.util.Scanner;

public class IfTask1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2=0; //result=0;//
		String msg1 = "첫번째 정수 : ", msg2="두번째 정수 : ", result = null;
		
		System.out.print(msg1);
		num1 = sc.nextInt();
		System.out.print(msg2);
		num2 = sc.nextInt();
		
/*		if(num1>num2) {
			result = "큰 수 : "+num1;
		}
		
		if(num2>num1) {
			result = "큰 수 : "+num2;
		}
		
		if(num1==num2) {
			result = "같습니다.";
		}
*/
		
		if(num1>num2) {
			result = "큰 수 : "+num1;
		}
		
		else if(num2>num1) {
			result = "큰 수 : "+num2;
		}
		
		else{
			result = "같습니다.";
		}
		
		System.out.println(result);
		
		
	}

}
