package controll;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {
		
//		브론즈 레벨
		
////		1~100까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.print(i+1);
//		}
//		
//		System.out.println();
//		
////		100~1까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.print(100-i);
//		}
//		System.out.println();
////		1~100까지 총 짝수만 출력
//		for (int i = 1; i < 101; i++) {
//			if (i%2==0) {
//				System.out.print(i+0);
//				
//			}
//		}
//		System.out.println();
//		for (int i = 1; i < 51; i++) {
//			System.out.print(i*2);
//				
//			}
//		System.out.println();
//		for(int i=2;i<=100;i=i+2) {
//			System.out.print(i);
//		}
		
////		실버 레벨
////		1~10까지 합 출력
//		int sum=0;
//		for (int i = 0; i <10; i++) {
//			sum+=i+1;
//			System.out.println(i+1);
//		}
//		System.out.println(sum);
		
//		정수를 하나 입력 받고 그 숫자만큼의 누적합을 구하기
		
//		
//		Scanner sc = new Scanner(System.in);
//		int num=0,sum=0;
//		String msg ="어디까지의 합을 구하고 싶나요 ? : ", data=null;
//		System.out.println(msg);
//		num=sc.nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			sum+=i+1;
//			data+=i+"+"+i+1+"="+sum;
//			
//		}
//		System.out.println(sum);
//		
		
//		골드 문제
//		A~F까지 출력
//		A~F까지 중 C 제외하고 출력
		
		
//		int num = 0;
//		char ch = ' ';
//		
//		for (int i = 0; i < 6; i++) {
//			num=65;
//			ch = (char)(num+i);
//			System.out.print(ch);
//		}
//		System.out.println();
		
//		for(int i ='A';i<='F';i++) {
//			System.out.print((char)i);
//		}
//			System.out.println();
//			
//		for(int i =0;i<6;i++) {
//			if(i==2) {
//				continue; // 만나는 즉시 다음 반복 실행
//			}
//			System.out.print((char)(i+65));
//		}
//		System.out.println();
//
//		for(int i =0;i<6;i++) {
//			if(i==2) {
//			}
//			else {
//			System.out.print((char)(i+65));
//		}
//		}
//		System.out.println();
//		
//		for(int i =0;i<5;i++) {
//			System.out.print((char)(i>1?i+66:i+65));
//			}
		
		
//		플래티넘 문제
//		0 1 2 3 0 1 2 3 0 1 2 3 출력하기
		for (int i = 0; i < 12; i++) {
			System.out.print(i%4+" ");
				
			}
		System.out.println();
//		이중for문 이용하여 풀기
		for (int i = 0; i < 3; i++) {
			for(int j=0;j<4;j++) {
				System.out.print(j+" ");
			}
		}
		
		
		
		
		
		
		
		}
		
	}
