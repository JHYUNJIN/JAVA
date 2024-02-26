package operator;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
		
//		두 정수 입력 받기
		Scanner sc = new Scanner(System.in);
		int num1=0,num2=0;
		String msg1 = "첫번째 숫자를 입력 해주세요 : ", msg2 = "두번째 숫자를 입력 해주세요 : ",result=null;
		boolean isBigger = false, isSame = false;
		

		System.out.print(msg1);
		num1=sc.nextInt();
		System.out.print(msg2);
		num2=sc.nextInt();
		
		isBigger = num1>num2;
		isSame = num1==num2;
		
		
		result = isBigger? "큰 값은 : "+num1 : isSame ? "두 수는 같습니다." : "큰 값은 : "+num2 ;
		
		System.out.println(result);
		
	}

}
