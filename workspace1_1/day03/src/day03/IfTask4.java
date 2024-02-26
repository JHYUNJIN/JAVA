package day03;

import java.util.Scanner;

public class IfTask4 {
public static void main(String[] args) {
	/*
	 * 자격증 시험을 보는데 4과목이 있고
	 * 한 과목이라도 60점 미만이면 과락으로 불합격
	 * 
	 * 입력
	 * 과목 1 점수를 입력하세요
	 * 과목 2 점수를 입력하세요
	 * 과목 3 점수를 입력하세요
	 * 과목 4 점수를 입력하세요
	 * 
	 * 출력
	 * 불합격입니다.
	 * 합격입니다.
	 * if 문으로
	 * 과목1 <60||과목2<60
	 */
	Scanner sc = new Scanner(System.in);
	int score1=0,score2=0,score3=0,score4=0;
	String msg = "점수를 입력하세요 : ";
	
	System.out.println(msg);
	score1 = sc.nextInt();
	System.out.println(msg);
	score2 = sc.nextInt();
	System.out.println(msg);
	score3 = sc.nextInt();
	System.out.println(msg);
	score4 = sc.nextInt();
	
	
	if( score1 < 60 || score2 < 60 || score3 < 60 || score4 < 60) {
	System.out.println("불합격입니다.");
	}
	else {
		System.out.println("합격");
	}
	
	
}	

}