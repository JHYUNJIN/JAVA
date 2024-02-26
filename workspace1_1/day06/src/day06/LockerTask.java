package day06;

import java.util.Scanner;

public class LockerTask {
	int[] setLockerPw(int[] arPw) {
		for(int i=0;i<arPw.length;i++) {
			System.out.println(i+1+msg);
			arPw[i] = sc.nextInt();
		}
		return arPw;
	}
	String checkLockerPw(int lockerPw, int inputPw ) {
		String result = null;
		if(lockerPw == inputPw) {
			result="비밀번호가 일치합니다.";
		}
		else {
			result="비밀번호가 일치하지 않습니다.";
		}
		return result;
	}
	// 5칸 짜리 사물함의 비밀번호를 각각 배열에 저장한다.
	// 사용자에게 이용할 사물함 번호를 물어본다.
	// 비밀번호를 입력받아 확인한다
	// 일치/불일치를 출력한다.
	
	
	
	
	//static은 제일 먼저 실행되게 하는 함수
	static	Scanner sc = new Scanner(System.in);
	static	String msg = "번 사물함의 비밀번호 설정 : ";
	public static void main(String[] args) {
		int[] arPw = new int[5];
		String choiceMsg = "이용할 사물함의 번호 : ";
		String inputMsg = "비밀번호를 입력하세요 : ";
		int choice = 0, inputPw=0;
		String result = "";
		LockerTask lt = new LockerTask();
		lt.setLockerPw(arPw);
		
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		System.out.println(inputMsg);
		inputPw = sc.nextInt();
		
		result = lt.checkLockerPw(arPw[choice-1],inputPw);
		System.out.println(result);
		
		
		
		
		
		
	}
	
	
	
	
}
