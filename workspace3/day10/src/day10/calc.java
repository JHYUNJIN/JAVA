package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "1. 더하기\t"
				+ "2.빼 기\t"
				+ "3. 곱하기\t"
				+ "4. 나누기\t"
				+ "0. 나가기";
		String first_num="첫번째숫자를 입력해주세요.";
		String second_num="두번째숫자를 입력해주세요.";
		String choice="";
		int num1=0,num2=0,result=0;
		while(choice!="0") {
			System.out.println(menu);
			choice=sc.next();
			
			switch (choice) {
				case "1":
					System.out.print(first_num);
					num1=sc.nextInt();
					System.out.print(second_num);
					num2=sc.nextInt();
					result=num1+num2;
					System.out.println(result);
					break;
				case "2":
					System.out.print(first_num);
					num1=sc.nextInt();
					System.out.print(second_num);
					num2=sc.nextInt();
					result=num1-num2;
					System.out.println(result);
					break;
				case "3":
					System.out.print(first_num);
					num1=sc.nextInt();
					System.out.print(second_num);
					num2=sc.nextInt();
					result=num1*num2;
					System.out.println(result);
					break;
				case "4":
					System.out.print(first_num);
					num1=sc.nextInt();
					System.out.print(second_num);
					num2=sc.nextInt();
					result=num1/num2;
					System.out.println(result);
					break;
				case "0":
					System.out.println("계산기 종료!");
					return;
		
				default:
					System.out.print("다시 입력해주세요.");
					continue;
			}
		
		}
		
	}	
}
