package day05;

import java.util.Scanner;

public class MethodTask2 {
	int getTotal(int[] arr) {
		int total=0;
		for(int i=0; i<arr.length;i++) {
			total += arr[i];
		}
		System.out.println(total);
		return total;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask2 mt2 = new MethodTask2();
		int[] arNum = {1,3,4,5,6};
		int a = mt2.getTotal(arNum);
		System.out.println(a);
	}
}	