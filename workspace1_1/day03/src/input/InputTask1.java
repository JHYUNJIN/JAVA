package input;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		
//		[실습]
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		단, next()만 사용.
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2=0, result=0;
		String msg1 = "첫번째 정수 입력 : ", msg2 = "두번째 정수 입력 : ";
		
		System.out.println(msg1);
		num1=sc.nextInt();

		System.out.println(msg1);
		num2=sc.nextInt();

		result = num1+num2;
		System.out.println("두 정수의 합은 : "+result+"입니다.");
		
		   // 강사님 코드
//	      int firstNumber = 0, lastNumber = 0, result = 0;
//	      String msg1 = "첫번째 정수 : ", msg2 = "두번째 정수 : ";
//	      Scanner sc = new Scanner(System.in);
//	      
//	      System.out.print(msg1);
//	      firstNumber = Integer.parseInt(sc.next());
//	      
//	      System.out.print(msg2);
//	      lastNumber = Integer.parseInt(sc.next());
//	      
//	      result = firstNumber + lastNumber;
//	      
//	      System.out.printf("%d + %d = %d", firstNumber, lastNumber, result);
	    
		
		
		
		
		
		
		
	}
}
