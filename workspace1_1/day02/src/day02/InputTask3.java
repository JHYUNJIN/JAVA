package day02;

import java.util.Scanner;

public class InputTask3 {
public static void main(String[] args) {
	/*
	 * ex) 내가 좋아하는 숫자는 00이고, 내가 좋아하는 동물은 00이다.
	 * 
	 *  printf();
	 */
	
	Scanner sc = new Scanner(System.in);
	String msg1 ="좋아하는 숫자 : ", msg2 ="좋아하는 동물 : ";
	int number = 0;
	
	System.out.print("좋아하는 숫자 : ");
	number = sc.nextInt();
	System.out.print("좋아하는 동물 : ");
	String str = sc.next();
	System.out.printf("내가 좋아하는 숫자는 %d 이고 내가 좋아하는 동물은 %s 입니다.\n",number,str);

	System.out.println(msg1);
	number = Integer.parseInt(sc.next());
	System.out.println(msg2);
	String animal = sc.next();
	
	System.out.printf("내가 좋아하는 숫자는 %d이고 내가 좋아하는 동물은 %s입니다",number,animal);
}
	
}
