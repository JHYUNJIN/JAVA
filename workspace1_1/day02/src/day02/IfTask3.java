package day02;

import java.util.Scanner;

public class IfTask3 {
public static void main(String[] args) {
	
	/* 평균이 90점 이상 A
	 * 80점 이상 B
	 * 70점 이상 C
	 * 60점 이상 D
	 */
	
	
	Scanner sc = new Scanner(System.in);
  	int kor=0, eng=0, java=0, sum=0;
   double avg = 0.0;
   
   String name = null, msg1 = "이름을 입력하세요.",
   			msg2 = "국어점수를 입력하세요.",
   			msg3 = "영어점수를 입력하세요.",
   			msg4 = "자바점수를 입력하세요.";
  
 
	
	System.out.println("msg1");
	name = sc.next();
	System.out.println("msg2");
	kor = sc.nextInt();
	System.out.println("msg3");
	eng = sc.nextInt();
	System.out.println("msg4");
	java = sc.nextInt();

	sum = kor+eng+java;
	avg = sum/3;
	
	if(avg >= 90) {
		System.out.println("A");
	}
	else if(avg >= 80) {
		System.out.println("B");
	}
	else if(avg >= 70) {
		System.out.println("C");
	}
	else if(avg >= 60) {
		System.out.println("D");
	}
	else {
		System.out.println("F");
	}

}
}
