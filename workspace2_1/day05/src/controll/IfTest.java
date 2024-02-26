package controll;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수 입력받고 대소비교
		Scanner sc = new Scanner(System.in);
		int num1=0,num2=0;
		String msg1 = "첫번째 숫자를 입력 해주세요 : ", msg2 = "두번째 숫자를 입력 해주세요 : ",result=null;
		

		System.out.print(msg1);
		num1=sc.nextInt();
		System.out.print(msg2);
		num2=sc.nextInt();
		
		if(num1 > num2) {
			result="큰 값 : "+num1;
		}
		else if(num1 < num2) {
			result="큰 값 : "+num2;
		}
		else {
			result="두 수는 같습니다.";
		}
			
		System.out.println(result);
		
	
	}
}
