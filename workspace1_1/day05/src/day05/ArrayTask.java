package day05;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		//100~1 까지의 값 배열에 넣고 출력
		
//		int[] arData = new int[100];
//		
//		for(int i=0; i<arData.length;i++) {
//			arData[i] = 100-i;
//		}
//		for(int i=0; i<arData.length;i++) {
//			System.out.print(arData[i]+" ");
//		}
//		int[] arData = new int[101];
//		for(int i=0; i<arData.length;i++) {
//			arData[i] = i+1;
//		}
//		for(int i=1; i<arData.length;i++) {
//			System.out.println(arData[100-i]);
//		}
		
		//1~10까지의 값을 배열에 넣고 총합 구하기
		
//		int[] arData = new int[10];
//		int sum = 0;
//		for(int i=0; i<arData.length;i++) {
//			arData[i]=i+1;
//			sum += arData[i];
//		}
//		
////		for(int i=0; i<arData.length;i++) {
////		}
//		
//		System.out.print(sum);
		
		// 3명의 자바 점수를 입력받아 배열에 저장하고 평균을 출력하기
		Scanner sc = new Scanner(System.in);
		int[] arJava = new int[3];
		String msg = "번 학생의 자바점수 : ";
		int sum=0;
		
		for(int i=0; i<arJava.length;i++) {
			System.out.println(i+1+msg);
			arJava[i] = sc.nextInt();
		}
		for(int i=0; i<arJava.length;i++) {
			sum += arJava[i];
		}
		System.out.println("java 점수 평균은 : "+sum/3.0);
	}
}

