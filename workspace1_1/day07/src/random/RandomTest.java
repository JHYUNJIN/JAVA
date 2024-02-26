package random;

import java.util.Random;
import java.util.Scanner;

class Enhance{
	boolean[] arChance = {true,true,true,true,true,true,true,
							false,false,false};
	String weapon;
	int cnt;

	public Enhance(String weapon) {
		this.weapon = weapon;
	}
	
	void start() {
		Random r = new Random();
		int index = r.nextInt(10); // 0부터 9까지의 랜덤한 숫자가 나온다.
		
		if(arChance[index]) {
			cnt++;
			System.out.println("강화에 성공하였습니다.😍");
		}
		else {
			cnt=0;
			System.out.println("강화에 실패하였습니🤣");
		}
	}
	void printInfo() {
		System.out.println(weapon+"+"+cnt+"강");
	}
	
	
}

public class RandomTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Random r = new Random();
//		int num = r.nextInt(8);  // 0부터 n-1까지의 무작위 정수를 반환한다.
//		System.out.println(num);
		
		Enhance e = new Enhance("목검");
		String msg = "1. 강화시작\n"
				+"2.종료";
		int choice=0;
		
		boolean flag = true;
		String input = null;
		
		while(flag) {
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				e.start();
				e.printInfo();
				break;
			case 2:
				System.out.println("종료하려면\"종료\"라고 입력하세요");
				input = sc.next();
				if(input.equals("종료")) {
					flag=false;
				}
				else {
					System.out.println("잘못입력했습니다.");
				}
				break;
			default :
					System.out.println("잘못입력했습니다");
			}
		}
		
	}

}
