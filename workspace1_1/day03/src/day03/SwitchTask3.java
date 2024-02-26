package day03;

import java.util.Scanner;

public class SwitchTask3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 월을 입력하세요 :
		 * 6 7 8 여름
		 * 9 10 11 가을
		 * 12 1 2 겨울
		 * 3 4 5 봄
		 * 나머지 잘못입력했습니다.
		 */
		
		int month=0;
		String season="", msg="월을 입력해주세요 : ";
		System.out.print(msg);
		month = sc.nextInt();
		
		String sp = "봄 입니다";
		String su = "여름 입니다";
		String fa = "가을 입니다";
		String wi = "겨울 입니다";
		
		switch(month) {
		case 3,4,5:
			season = sp;
		break;

		case 6,7,8:
			season = su;
		break;

		case 9,10,11:
			season = fa;
		break;

		case 12,1,2:
			season = wi;
		break;
		
		default :
			season = "잘못입력하였습니다.";
		}
		System.out.println(season);
		
		
	}

}
