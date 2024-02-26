package hashMapTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
	public static void main(String[] args) {
		
		/*
		 * 카페 메뉴
		 * 아메리카노 2500
		 * 라떼 3500
		 * 모카 4500
		 *	바닐라라떼 4500
		 *
		 *출력과 입력_
		 *1.아메리카노
		 *2.라떼
		 *3.모카
		 *4.바닐라라떼
		 *입력>>2
		 *
		 *출력)
		 *라떼는 3500원입니다.
		 *
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("아메리카노", 2500);
		map.put("카페 라떼", 3500);
		map.put("카페 모카", 4500);
		map.put("바닐라 라떼", 4500);
		
		System.out.println(map);
		
		int choice=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요.\n"
				+ "1. 아메리카노\n"
				+ "2. 카페 라떼\n"
				+ "3. 카페 모카\n"
				+ "4. 바닐라 라떼\n"
				+ "입력 : ");
		choice=sc.nextInt();
		switch (choice) {
		case 1:map.get("아메리카노");
			System.out.println("3500원입니다.");
			break;
		case 2:map.get("카페 라떼");
		System.out.println("4500원입니다.");
		
		break;
		case 3:map.get("카페 모카");
		System.out.println("4500원입니다.");
		
		break;
		case 4:map.get("바닐라 라떼");
		System.out.println("4500원입니다.");
		
		break;

		default:
			System.out.println("잘못 입력하였습니다.");
			break;
		}
		
		
	}
}






/*

package hashMapTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
   public static void main(String[] args) {

      /*
       * 카페 메뉴 아메리카노 2500 라떼 3500 모카 4500 바닐라 라떼 4500
       * 
       * HashMap 에 저장하기
       * 
       * 출력과 입력) 1. 아메리카노 2. 라떼 3. 모카 4. 바닐라 라떼 입력 >> 2
       * 
       * 출력) 라떼는 3500원 입니다.
       */
/*
      HashMap<String, Integer> menu = new HashMap<String, Integer>();
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      String msg = "1. 아메리카노\n2. 라떼\n3. 모카\n4. 바닐라 라떼\n입력 >> ", result = null;

      menu.put("아메리카노", 2500);
      menu.put("라떼", 3500);
      menu.put("모카", 4500);
      menu.put("바닐라 라떼", 4500);

      System.out.print(msg);

      choice = sc.nextInt();

      switch (choice) {
      case 1:
         result = "아메리카노는 " + menu.get("아메리카노") + "원 입니다.";
         break;
      case 2:
         result = "라떼는 " + menu.get("라떼") + "원 입니다.";
         break;
      case 3:
         result = "모카는 " + menu.get("모카") + "원 입니다.";
         break;
      case 4:
         result = "바닐라 라떼는 " + menu.get("바닐라 라떼") + "원 입니다.";
         break;
      default:
         result = "커피 먹기 싫나보네요?";
         break;
      }
      System.out.println(result);

   }
}
*/