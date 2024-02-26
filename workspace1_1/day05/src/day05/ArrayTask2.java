package day05;

import java.util.Scanner;

public class ArrayTask2 {
public static void main(String[] args) {
	// 0,1,2,3,4,0,1,2,3,4 배열에 담고 출력 (10개)
	// A-F까지의 배열에 값 넣고 출력하기
	Scanner sc = new Scanner(System.in);
	int[] ar = new int[10];
	
	for(int i=0; i<ar.length;i++) {
		ar[i] = i%5;
		System.out.print(ar[i]);
	}
	System.out.println();

	char[] A = new char[6];
	for(int i=0; i<A.length;i++) {
		A[i] = (char)(i+65);
		System.out.print(A[i]);
	}
	System.out.println();

	
	
	// A~F 까지 중 C를 제외하고 출력
	char[] B = new char[5];
	int temp = 0;
	for(int i=0; i<B.length;i++) {
		temp = i;
		if (temp>1) {
			temp++;
		}
		B[i] = (char)(temp+65);
		System.out.print(B[i]);
	}	
	System.out.println();
	
	
	// A~F 까지 중 D를 제외하고 출력
	char[] c = new char [5];
	int pass = 0;
	for(int j=0; j<c.length;j++){
		pass = j;
		if (pass>3) {
			pass++;
		}
		c[j] = (char)(pass+65);
		System.out.print(c[j]);
	
	}
	
  }
}