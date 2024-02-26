package input;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		
//		자동 import 단축키
//		컨트롤 쉬프트 o
		
//		초기값 : 어떤 값을 넣을지 아직 모를 때
//		정수 : 0
//		실수 : 0.0
//		문자 : ' ' (공백문자)
//		문자열 : null 또는 "" (빈문자열)
		
//		String name = null;
//		System.out.println(name + "님 환영합니다.");
		
		Scanner sc = new Scanner(System.in);
		String name = ""; // "" 대신 null 사용해도 됨
		String firstName = null;
		
//		System.out.print("이름을 입력해주세요 : ");
//		
////		sc.next() 는 스페이스바를 기준으로 구분한다.
//		name = sc.next();
//		firstName = sc.next();
//		System.out.println(name + firstName + "님 환영합니다.");

		
		System.out.print("이름을 입력해주세요 : ");
		
//		sc.nextLine() 은 줄바꿈(엔터)을 기준으로 구분한다.
		name = sc.nextLine();
		firstName = sc.nextLine();
		
		System.out.println(name + firstName + "님 환영합니다.");
		
	}
}
