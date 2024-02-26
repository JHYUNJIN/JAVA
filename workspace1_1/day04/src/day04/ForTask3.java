package day04;

import java.util.Scanner;

public class ForTask3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
/*	System.out.println("단을 입력하시오");
	int a = sc.next();
	for(int i=0;i<10;i++) {
		System.out.println(i);
	}
*/
	for(int i=2;i<10;i++) {
		System.out.println(i+"단");
		for(int j=1;j<10;j++) {
			System.out.println(i+"*"+j+"="+(i*j));
			
		}
	}
	
	
	
}
}
