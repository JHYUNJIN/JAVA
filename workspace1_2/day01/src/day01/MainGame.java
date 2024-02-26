package day01;

import java.util.Scanner;

public class MainGame {
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
		
		if(choice==1) {
			Wizard a = new Wizard();
			
			while(true) {
				System.out.println(menuMsg);
				choice = sc.nextInt();
				
				if(choice==1) {
					a.normalAttack();
				}
				else if(choice==2) {
					a.skillAttack();
				}
				else if(choice==3) {
					a.specialAttack();
				}
				else if(choice==4) {
					break;
				}
			}
		}
		
		else if(choice==2) {
			Warrior a = new Warrior();
			
			while(true) {
				System.out.println(menuMsg);
				choice = sc.nextInt();
				
				if(choice==1) {
					a.normalAttack();
				}
				else if(choice==2) {
					a.skillAttack();
				}
				else if(choice==3) {
					a.specialAttack();
				}
				else if(choice==4) {
					break;
				}
			}
		}
		
		else if(choice==3) {
			Rogue a = new Rogue();
			
			while(true) {
				System.out.println(menuMsg);
				choice = sc.nextInt();
				
				if(choice==1) {
					a.normalAttack();
				}
				else if(choice==2) {
					a.skillAttack();
				}
				else if(choice==3) {
					a.specialAttack();
				}
				else if(choice==4) {
					break;
				}
			}
		}
	}

}
