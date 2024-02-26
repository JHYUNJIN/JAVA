package day05;

import java.util.Scanner;

public class MethodTask3 {
	//정수 num을 넘겨받아 1~num까지의 합을 출력하는 메소드
//	void from1tonum(int[]arr) {
//		int total = 0;
//		for (int i=0;i<arr.length;i++) {
//			total+= arr[i+1];
//			
//		}
//		System.out.println(total);
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] arsum = {};
//	sc.nextInt();
//	
//	}
//}
//	void getIntTotal(int num) {
//		int total = 0;
//		for(int i=0;i<num;i++) {
//			total += i+1;
//		}
//		System.out.println(total);
//	}
//	public static void main(String[] args) {
//		MethodTask3 mt3 = new MethodTask3();
//		mt3.getIntTotal(5);
//	}
//}
void getIntTotal(int num) {
	int total = 0;
	for(int i=0;i<num;i++) {
		total += i+1;
	}
	System.out.println(total);
}
public static void main(String[] args) {
	MethodTask3 mt3 = new MethodTask3();
	mt3.getIntTotal(5);
}
}
	