package day06;

import java.util.Scanner;

public class Kiosk3 {
   void printMainMenu() {
      System.out.println("##########################");
      System.out.println("##JAVA커피에 오신걸 환영합니다##");
      System.out.println("##########################");
      System.out.println();
      System.out.println("1. 전체메뉴보기  \n"
            + "2. 관리자 로그인\n"
            + "3. 종료\n"
            + "입력 >> ");
   }
   void printMenu(String[] menus, int[] price) {
      System.out.println();
      for(int i=0; i<menus.length; i++) {
         if(menus[i] == null) {
            System.out.println(i+1+". 메뉴를 준비중입니다!");
            System.out.println("----------------------");
         }else {
            System.out.println(i+1+". "+menus[i]);
            System.out.println("가격 : "+price[i]);
            System.out.println("----------------------");
         }
      }
   }
   void selectMenu(String[] menus, int[] price) {
      int choice =0;
      System.out.println();
      System.out.println("메뉴 번호를 입력하세요 >> ");
      choice = sc.nextInt();
      
      if(menus[choice-1] == null) {
         System.out.println("해당 메뉴는 준비중입니다.");
         System.out.println();
         return;
      }
      System.out.println("*********************");
      System.out.println(menus[choice-1]+"을(를) 선택하셨습니다.");
      System.out.println("가격은 "+price[choice-1]+"원입니다.");
      System.out.println("*********************");   
   }
   
   void adminLogin(String[] menus, int[] price) {
      int choice =0;
      String id  = null;
      int pw = 0;
      
      System.out.println();
      System.out.print("아이디 >> ");
      id = sc.next();
      System.out.print("패스워드 >> ");
      pw = sc.nextInt();
      
      if(id.equals("admin") && pw == 1234) {
         System.out.println();
         System.out.println("로그인 성공!!!!");
         System.out.println("1. 메뉴등록\n"
               + "2. 메뉴삭제\n"
               + "3. 메뉴수정\n"
               + "4. 나가기\n"
               + "입력 >> ");
         choice = sc.nextInt();
         sc.nextLine();
         switch(choice) {
         case 1:
            System.out.println();
            System.out.println("메뉴등록");
            System.out.println("===================");
            
            for(int i=0; i<menus.length;i++) {
               System.out.print(i+1+". 메뉴이름 >> ");
               menus[i] = sc.nextLine();
               System.out.print(menus[i]+" 가격 >> ");
               price[i] = sc.nextInt();
               sc.nextLine();
            }
            break;
         case 2:
            System.out.println();
            System.out.println("메뉴삭제");
            System.out.println("===================");
            
            System.out.println();
            printMenu(menus,price);
            
            System.out.print("삭제할 메뉴를 선택하세요 >> ");
            choice = sc.nextInt();
            sc.nextLine();
            
            menus[choice-1] = null;
            price[choice-1] = 0;
            System.out.println("삭제 되었습니다.");
            break;
         case 3:
            System.out.println();
            System.out.println("메뉴수정");
            System.out.println("===================");
            
            System.out.println();
            for(int i=0; i<menus.length; i++) {
               if(menus[i] == null) {
                  System.out.println(i+1+". 메뉴를 준비중입니다!");
                  System.out.println("----------------------");
               }else {
                  System.out.println(i+1+". "+menus[i]);
                  System.out.println("가격 : "+price[i]);
                  System.out.println("----------------------");
               }
            }
            
            System.out.print("수정할 메뉴를 선택하세요 >> ");
            choice = sc.nextInt();
            sc.nextLine();
            
            System.out.print(choice +". 메뉴이름 >> ");
            menus[choice-1] = sc.nextLine();
            System.out.print(menus[choice-1]+" 가격 >> ");
            price[choice-1] = sc.nextInt();
            sc.nextLine();
            break;
         case 4:
            System.out.println("메인메뉴로 돌아갑니다");
            System.out.println();
            break;
         default :
            System.out.println("잘못입력했습니다.");   
         }
         
      }else {
         System.out.println("비밀번호를 잘못입력하였습니다.");
      }
   }
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   String[] menus = new String[3];
	   int[] price = new int[3];
	   int choice = 0;
	   Kiosk2 k2 = new Kiosk2();
	   boolean isRun = true;
	   
	   while(isRun) {
	      k2.printMenu(menus,price);
	      choice = sc.nextInt();
	      
	      switch(choice) {
	      case 1:
	         k2.printMenu(menus,price);
	         k2.selectMenu(menus,price);
	         break;
	      case 2:
	         k2.adminLogIn(menus,price);
	         break;
	      case 3:
	         System.out.println("프로그램이 종료됩니다.");
	         isRun = false;
	         break;
	      default :
	         System.out.println("잘못 입력하였습니다.");
	      }
	   }
	}
}

      