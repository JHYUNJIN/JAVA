//package game;
//
//import java.util.Scanner;
//
//public class Main3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String charMsg = "캐릭터선택\n"
//				+ "1.마법사\n"
//				+ "2.전사\n"
//				+ "3.로그\n"
//				+ "4.입력\n";
//		String menuMsg = "1.일반공격\n"
//			+"2.스킬공격\n"
//			+"3.특수공격\n"
//			+"4.종료\n\n"
//			+"1.입력 : ";
//		int choice =0;
//		
//		Character character = null;
//		
//		
//		System.out.println(charMsg);
//		choice=sc.nextInt();
//	
//		if(choice ==1) {
//            a.normalAttack();
//         }else if(choice ==2) {
//            a.skillAttack();
//         }else if(choice ==3) {
//            a.specialAttack();
//         }else if(choice ==4) {
//            break;
//         }else {
//            System.out.println("잘못된 입력입니다.");
//         }
//			
//			while(true) {
//				System.out.println(menuMsg);
//				choice=sc.nextInt();
//				
//				if(choice==1) {
//					character.normalAttack();
//				}
//				else if(choice==2) {
//					character.skillAttack();
//				}
//				else if(choice==3) {
//				}
//				else if(choice==4) {
//					break;
//				}
//				else {
//					System.out.println("잘못된 입력입니다.");
//				}
//					
//				}
//			}
//		if(choice==3) {
//			Rogue a = new Rogue();
//			
//			while(true) {
//				System.out.println(menuMsg);
//				choice=sc.nextInt();
//				
//				if(choice==1) {
//					a.normalAttack();
//				}
//				else if(choice==2) {
//					a.skillAttack();
//				}
//				else if(choice==3) {
//					a.specialAttack();
//				}
//				else if(choice==4) {
//					break;
//				}
//				else {
//					System.out.println("잘못된 입력입니다.");
//				}
//				
//			}
//		}
//		
//		if(choice==4) {
//			System.out.println("종료되었습니다.");
//		}
//		
//		else {
//			System.out.println("잘못된입력입니다.");
//			}
//	
//	
//
//	}}
