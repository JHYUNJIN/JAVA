package lambdaTask;

import java.util.Scanner;

/*
 *  두 문자열을 입력받아서 첫번째 문자열을 두번째 문자열의 길이만큼 잘라내는 프로그램 
 *  ex)
 *  첫번째 : abcde
 *  두번째 : 가나다
 *  결과 : de
 *  
 *  Main 클래스에 static 메소드를 선언한다.
 *  -매개변수로 문자열을 전달받는다. (B or F)
 *  - 전달 받은 문자열이 F면 앞에서 자르고 B면 뒤에서 자르는 람다식을 만든다.
 *  
 */


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰문자열 : ");
		String s1 = sc.next();
		System.out.println("두번쨰문자열 : ");
		String s2 = sc.next();

		SubInter si = (str1,str2) -> str1.substring(str2.length());
		
//		String str = si.mySubString(s1, s2);
		
		String str = checkString("B").mySubString(s1, s2);
		System.out.println(str);
		
		

		
		
	
	
	}
	
	static SubInter checkString(String str) {
		SubInter sub = null;
		switch(str) {
		case "F" :
			sub = (s1,s2) -> s1.substring(s2.length());
			break;
			
		case "B" : 
			sub = (s1,s2) -> s1.substring(0,s1.length()-s2.length());
			break;
		}
		
		return sub;
		
	}
	
}
