package day03;

import java.util.Scanner;

public class SwitchTask2 {
public static void main(String[] args) {
	/*
	 * 정수를 입력받아서 홀수인지 짝수인지 출력하기
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	
	int num1=0, num2=0;
	String msg = "정수를 입력해주세요 : ";
	String result = "";
	System.out.printf(msg);
	num1 = sc.nextInt();
	num2=num1%2;
	String add="홀수입니다";
	String even="짝수입니다";
	
	switch(num2) {
    case 1:
    	result = add;
    	break;
    default:
    	result = even;
	}
	System.out.println(result);

}
}
