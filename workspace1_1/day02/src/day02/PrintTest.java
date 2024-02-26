package day02;

public class PrintTest {
public static void main(String[] args) {

	System.out.print("안녕");
	System.out.print("하세요");
	System.out.print("\n안녕\n");
	System.out.print("하세요");
	System.out.println("안녕하세요");
	System.out.print("안녕하세요");
	String name = "정현진";
	System.out.print(name+"\n");
	System.out.print("  정현진님\n");
	System.out.print("반갑습니다\n");
	System.out.print("=====================\n");
	System.out.printf("제이름은 %s반갑습니다\n",name);
	System.out.print("=====================\n");
	
	int score = 100;
	System.out.printf("제 자바 점수는 %d점 입니다",score );
	System.out.println();
	System.out.printf("제 평균점수는 %.2f입니다.",98.5469);
	System.out.println();
	System.out.printf("제 학점은 %c입니다.",'A');
	System.out.printf("자바점수는 %010d점입니다.",score);
	System.out.printf("자바점수는 %10d점입니다.",score);
	System.out.println();
	System.out.println();
	
	String str1 = "마이쮸";
	String str2 = "김밥";
	String str3 = "아이스크림";
	
	int price1 = 500;
	int price2 = 1500;
	int price3 = 3000;
	
	System.out.println("\t영수증");
	System.out.println("====================");
	System.out.printf("마이쮸\t %10d개%10d원\n",1,price1);
	System.out.printf("김밥\t %10d개%10d원\n",2,price2);
	System.out.printf("아이스크림\t %10d개%10d원\n",3,price3);
	
	
	
	System.out.println("==========영수증==========");
	System.out.printf("마이쮸\t\t%5d개%10d원\n",1,price1);
	System.out.printf("김밥\t\t%5d개%10d원\n",2,price2);
	System.out.printf("아이스크림\t\t%5d개%10d원\n",3,price3);
	

	
	
	
	
}
}
