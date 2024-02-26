package day02;

import java.util.Scanner;

public class TestDay02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 30;
		double b = 0.5;
		String str = "안녕하세요 저는 정현진입니다.";
				
		
		System.out.println(str);
		System.out.println("나이는 "+(a+b)+"살");
		System.out.printf("나이는 %d살이고 ",a);
		System.out.print("연봉은 "+(a*3000000+"원")+"입니다.\n\n");
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.printf("%s님의 나이는 %d살이며, 연봉은 %d만원 입니다.\n\n",name,a,a*300);
		
		
		
		//영수증 
		
		String item1 = "김밥";
		String item2 = "커피";
		String item3 = "아이스크림";
		
		
		int price1 = 3000; //김밥
		int price2 = 1500; //커피
		int price3= 500; //아이스크림
		
		
		System.out.print("김밥 : ");
		int count1 = sc.nextInt();
		
		System.out.print("커피 : ");
		int count2 = sc.nextInt();
		
		System.out.print("아이스크림 : ");
		
		int count3 = sc.nextInt();
		
		int item1_1 = price1*count1;
		int item2_2 = price2*count2;
		int item3_3 = price3*count3;
				
		
		
		System.out.println("\t영수증\t");
		System.out.println("======================");
		System.out.printf("%s\t %s개\t %d원\n",item1,count1,price1*count1);
		System.out.printf("%s\t %s개\t %d원\n",item2,count2,price2*count2);
		System.out.printf("%s\t %s개\t %d원\n",item3,count3,price3*count3);
		System.out.println("======================");
		System.out.printf("합계  \t\t%d원",item1_1 + item2_2 + item3_3);
		
		
	}

}
