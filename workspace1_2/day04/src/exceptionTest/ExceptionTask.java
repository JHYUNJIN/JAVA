package exceptionTest;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		/*
		 * 3개의 정수를 입력받기
		 * 무한 입력 상태로 구현 (while)
		 * q를 입력시 나가기 (문자열 비교)
		 * 3개의 정수는 배열에 담기
		 * if문은 한번만 사용
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수입력 : ",tmp=null;
		int[] arNum = new int[3];
		int idx=0;
		
		while(true) {
			System.out.println(++idx+msg);
			tmp = sc.next();
			if(tmp.equals("q"))break;
			arNum[idx-1]=Integer.parseInt(tmp);
//			try {
//			}
//			catch(NumberFormatException e) {
//				System.out.println("정수만 입력하세요");
//			}
//			catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("이미 3번 입력했어요");
//			}
			
			
		}
		System.out.println(Arrays.toString(arNum));
	}
}
