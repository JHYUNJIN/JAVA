package game;

import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String charMsg = "캐릭터 선택\n"
            + "1.마법사\n"
            + "2.전사\n"
            + "3.로그\n"
            + "입력 >> ";
      String menuMsg = "1.일반공격\n"
            + "2.스킬공격\n"
            + "3.특수공격\n"
            + "4.종료\n"
            + "입력 >> ";
      int choice =0;
      
      Character character = null;
      
      System.out.println(charMsg);
      choice = sc.nextInt();
      if(choice == 1) {
         character = new Wizard();
      }else if(choice == 2) {
         character = new Warrior();

      }else if(choice == 3) {
         character = new Rogue();
      }else {
         System.out.println("잘못된 입력입니다.");
      }
      while(true) {
         System.out.println(menuMsg);
         choice = sc.nextInt();
         
         if(choice ==1) {
            character.normalAttack();
         }else if(choice ==2) {
            character.skillAttack();
         }else if(choice ==3) {
            character.specialAttack();
         }else if(choice ==4) {
        	 if(character instanceof Warrior)//warrior 타입이 업캐스팅 되어있다면
        		 {
        		 // 전사가 갖고있는 메소드를 사용하기 위해서는 다운캐스팅을 사용해야한다.
        		 ((Warrior) character).onlyWarrior();
        		 
        	 }
            break;
         }else {
            System.out.println("잘못된 입력입니다.");
         }
      }
   }
}



















