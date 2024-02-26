package day02;

import java.util.Scanner;

public class InputTask4 {
public static void main(String[] args) {
	/*
	 * 코인 노래방 프로그램 만들기
	 * 사용자에게 금액을 입력받고 부를 수 잇는 노래곡 수 , 잔돈 출력
	 * 
	 * 입력 예시
	 * 금액 입력 : 1000
	 * 
	 * 출력 예시 
	 * 3곡을 부를 수 있으며 잔돈은 100원입니다.
	 */
	
	Scanner sc = new Scanner(System.in);
	System.out.print("금액 입력 : ");
	int money = sc.nextInt();
	
	System.out.printf("%d곡을 부를 수 있으며, 잔돈은 %d원 입니다.",money/300,money%300);
	
	
	int money1=0, count1=0, change1=0;
	String msg = "\n금액 입력 : ";
	final int price1 = 300;
	
	System.out.print(msg);
	money1 = sc.nextInt();
	count1 = money1/price1;
	change1 = money1%price1; 
	System.out.println(count1 + "곡을 부를 수 있으며, 잔돈은 "+change1 +"원 입니다.");
	

}
}

/*
 * import java.util.Scanner;

public class InputTask4 {
   public static void main(String[] args) {
      
       * 코인 노래방 프로그램 만들기
       * 사용자에게 금액을 입력받고 부를수 있는 노래곡수, 잔돈 출력
       * 
       * 한곡당 300원
       *  
       * 입력예시
       * 금액 입력 : 1000
       * 
       * 출력예시
       * 3곡을 부를 수 있으며 잔돈은 100원 입니다
       
      Scanner sc = new Scanner(System.in);
      int money =0, count =0, change =0;
      String msg = "금액 입력 : ";
      final int PRICE = 300;
      
      System.out.println(msg);
      money = sc.nextInt();
      count = money/PRICE;
      change = money%PRICE;
      
      System.out.println(count+"곡을 부를 수 있으며 잔돈은 "+change+"원 입니다.");
   }
}
*/
