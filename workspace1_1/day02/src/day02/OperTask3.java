package day02;

import java.util.Scanner;

public class OperTask3 {
	public static void main(String[] args) {
		/* 
		 * 성적 프로그램
		 * 1. 3과목의 변수를 입력받아 값을 저장
		 * 2. 위 점수의 총점과 평균, 합격 여부를 구함
		 *  (단, 합격 여부는 평균을 기준으로 60점 이상은 합격, 60점 미만은 불합격)
		 * 3. 합격 여부는 삼항 연산자를 활용
		 */

		Scanner sc = new Scanner(System.in);
		int math=0, kor=0, eng=0, sum=0;
		double avg=0.0;
		String str1 = "국어", str2="영어",str3="수학", 
				msg1="점수를 입력하세요", result=null;
		
		System.out.println(str1+msg1);
		kor = sc.nextInt();
		
		System.out.println(str2+msg1);
		eng = sc.nextInt();
		
		System.out.println(str3+msg1);
		math = sc.nextInt();
		
		sum=kor+eng+math;
		avg=sum/3;
		result = avg>=60? "합격":"불합격";
		
		System.out.println("평균이 "+avg+"점이므로 "+result+"입니다.");
		
		
		
		
		
		
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번쨰 과목 : ");
		int p1 = sc.nextInt();
		System.out.println("두번쨰 과목 : ");
		int p2 = sc.nextInt();
		System.out.println("세번쨰 과목 : ");
		int p3 = sc.nextInt();
		int sum = p1+p2+p3;
		int avg = sum/3;
		System.out.printf("총점 :%d ",sum);
		System.out.printf("평균 :%d ",avg);
		System.out.printf("합격여부 : ",avg ? );
*/		
		
		
		
		
		
		
	}
}
