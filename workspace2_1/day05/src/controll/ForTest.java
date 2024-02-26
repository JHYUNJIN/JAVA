package controll;

import java.util.Iterator;
import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		
//		이름 10번 출력
		Scanner sc = new Scanner(System.in);
		String name = null,msg="이름을 입력해주세요 : ";
		System.out.println(msg);
		name=sc.next();
		for (int i = 0; i < 10; i++) {
//			System.out.println(i+1+name);
			System.out.println(name);
		}
		
		int a = 10, b=0;
		b = a++;  // --> b=a ++ 
		System.out.println(b);
		System.out.println(a);
		b = ++a; // --> ++a = b
		System.out.println(b);
		
	}
}
