package day07;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		// 주사위 게임
		// 랜덤한 주사위 값을 뽑아서 입력한 값과 일치하는지 확인
		// 값의 범위는 1~6
		//range(6)
		// 값을 맞출 때 까지 프로그램이 진행된다.
		//while
		
//		
//		//while(isTrue) {
//		i++;
//		System.out.println(i+"번째 정현진");
//		if(i==300) {
//			isTrue = false;//

		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while(true) {
			double num1 = Math.random();
			int com = (int)(num1*6)+1;
			System.out.println("주사위를 던집니다.");
			System.out.println("값을 입력하세요.");
			int num2 = sc.nextInt();
			if(com==num2) {
				System.out.println("맞췄습니다. 프로그램을 종료합니다.");
				isRun=false;
			}
			else {
				System.out.println("틀렸습니다. 주사위 값은" +com+"입니다.");
			}
		}
		
		// 맞췄습니다. 프로그램 종료
		// 틀렸씁니다. 컴퓨터의 주사위는 몇입니다.
	}

}
