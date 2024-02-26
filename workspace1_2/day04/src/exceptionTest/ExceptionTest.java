package exceptionTest;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc.next();
		}
		catch(NullPointerException e) {
			System.out.println("Null이에요");
		}
		catch(Exception e) {
			System.out.println("예기치못한 오류");
			
		}
		/*
		 *  우리가 try에서 어떤 오류가 발생할 것인지 예상하기 힘들다. 예상치 못한 오류가 발생할 수 있는데
		 *  예상치 못한 오률ㄹ 잡기위해 Exception 타입의 변수를 사용한다.
		 *  모든 예외의 조상은 Exception 클래스이다.
		 *  즉 어떤 예외가 발생하더라도 Exception 타입의 참조변수에 저장가능하다.(업캐스팅)
		 */
	}
}
