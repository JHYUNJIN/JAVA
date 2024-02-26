package day01;

import java.util.Scanner;

public class MainUserGame {
	public static void main(String[] args) {

		
		String charMsg = "캐릭터 선택\n"
				+"1. 전사\t"
				+"2. 마법사\n"
				+"3. 종료";

		String attackMsg = "1. 일반공격\n"
				+"2.스킬공격\n"
				+"3.필살기\n"
				+"4.종료";
		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.println(charMsg);
		choice = sc.nextInt();

		
		if(choice==1) {
			System.out.println("전사를 선택하였습니다.");
			SwordMaster sm = new SwordMaster();  
			
			while(true) {
				System.out.println(attackMsg);
				choice = sc.nextInt();
				
				if(choice==1) {
					sm.normalAttack();
				}
				if(choice==2) {
					sm.skillAttack();
				}
				if(choice==3) {
					sm.specialAttack();
				}
				if(choice==4) {
					break;
				}
			}
		}
		
		
		if(choice==2) {
			System.out.println("마법사를 선택하였습니다.");
			Magician mgc = new Magician();  
			
			while(true) {
				System.out.println(attackMsg);
				sc.nextInt();
				
				if(choice==1) {
					mgc.normalAttack();
				}
				if(choice==2) {
					mgc.skillAttack();
				}
				if(choice==3) {
					mgc.specialAttack();
				}
				if(choice==4) {
					break;
				}
			}
		}
		
		
//		else {
//			System.out.println("캐릭터를 다시 선택해주세요");
//			return;
//		}
		
		
		
		
		
	
	}
}
