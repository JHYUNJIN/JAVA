package classTask;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
//		기본생성자로 객체화
		SuperCar s1 = new SuperCar();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		String msg="1. 시동 켜기\n"
				+ "2. 시동 끄기\n"
				+ "3. 프로그램 종료\n";
//		System.out.println(sc1.check);
		
		while(choice != 3) {
			System.out.println(msg);
			choice=sc.nextInt();
		
			switch(choice) {
			case 1:
				s1.engineStart();
				break;
			case 2:
				s1.engineStop();
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다."
						+ " 안녕히 가십시오.");
				break;
			default:
				System.out.println("잘못입력하였습니다. 다시 선택해주세요.");
				break;
			}
		
		}
		
		
		
		
	}
}
