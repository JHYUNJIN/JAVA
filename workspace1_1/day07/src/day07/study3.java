package day07;

import java.util.Scanner;

public class study3 {
	public static void main(String[] args) {
		//사용자한테 월을 입력받고 월의 마지막 일을 출력하기
		//switch
		//1,3,5,7,8,10,12 >>>31일
		//2 >>> 28일
		//4,6,9,11 >>> 30일
		
		Scanner sc = new Scanner(System.in);
		int month = 0;
		String result = null;
		System.out.println("월을 입력하세요 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12:
			result=month+"월은 31일이 마지막 일입니다.";
			break;
		case 2:
			result=month+"월은 28일이 마지막 일입니다.";
			break;
		case 4,6,9,11:
			result=month+"월은 30일이 마지막 일입니다.";
			break;
		default:
			result="잘못 입력하셨습니다.";
			
		}
		System.out.println(result);

	}
}