package day05;

import java.util.Scanner;

public class ArrayTask3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//5개의 정수를 입력한 뒤 배열에 담고 최대값과 최소값 출력하기

	int[] ar = new int[5];
	String msg = "번째 정수 입력 : ";
	int max, min = 0;

	for(int i=0; i<ar.length;i++) {
		System.out.println(i+1+msg);	
		ar[i] = sc.nextInt();
	}
	max = ar[0];
	min = ar[0];

	for(int i=1; i<ar.length;i++) {
		if(max<ar[i]) {
			max = ar[i];
	}
		else if(min>ar[i]) {
			min=ar[i];
		}
	}
		
	System.out.println("최대값 : "+max);
	System.out.println("최대값 : "+min);

}}
