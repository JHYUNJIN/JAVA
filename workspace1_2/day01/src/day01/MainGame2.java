package day01;

import java.util.Scanner;

public class MainGame2 {
	public static void main(String[] args) {
		String charMsg = "캐릭터 선택\n"
				+ "1.마법사\n"
				+ "1.전사\n"
				+ "1.도적\n"
				+ "입력 : ";
		String menuMsg = "1.일반공격\n"
				+ "2.스킬공격\n"
				+ "3.특수공격\n"
				+ "4.종료\n"
				+ "입력 : ";
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(charMsg);
		choice = sc.nextInt();
		
		Character character = null;
		
		if(choice==1) {
			character = new Wizard();
		}
		else if(choice==2) {
			character = new Warrior();
		}
		else if(choice==3) {
			character = new Rogue();
		}
		
	}
}
