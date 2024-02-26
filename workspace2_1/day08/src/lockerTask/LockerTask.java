package lockerTask;

import java.util.Scanner;

public class LockerTask {
	int[] setLockerPw(int length, Scanner sc) {
		int[] arPw = new int[length];
		String msg = "번 사물함의 비밀번호 설정 >>";
		
		for(int i=0;i<arPw.length;i++) {
			System.out.print(i+1+msg);
			arPw[i]=sc.nextInt();
		}
		return arPw;
	}
	
	void checkLockerPw(int lockerPw, int inputPw) {
		if(lockerPw==inputPw) {
			System.out.println("비밀번호가 일치합니다.");
		}
		else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}



	public static void main(String[] args) {

		//		1. 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다. --> 메소드
//		2. 사용자에게 이용할 사물함 번호를 묻는다. --> 메인
//		3. 비밀번호를 입력받아 확인한다. --> 메소드
//		4. 일치/불일치를 출력한다.
		Scanner sc = new Scanner(System.in);
		LockerTask lt = new LockerTask();
		String choiceMsg = "이용할 사물함 번호 입력 >>";
		String inputPwMsg = "비밀번호 입력 >>";
		int choice=0, inputPw=0;
		
		//몇개의 사물함을 만들지 만들어보자
		
		int[] arPw = lt.setLockerPw(3, sc);
		lt.checkLockerPw(choice, inputPw);
		lt.setLockerPw(inputPw, sc);
		
		for(int i=0;i<arPw.length;i++) {
			System.out.print(arPw[i]+" ");
		}
		
		System.out.println(choiceMsg);
		choice=sc.nextInt();
		
		System.out.println(inputPwMsg);
		inputPw=sc.nextInt();
		
		lt.checkLockerPw(arPw[choice-1], inputPw); 
		
		
		
	}
}


/*
 * 답안지
 * 
 * package lockerTask;

import java.util.Scanner;

public class LockerTask {
   int[] setLockerPw(int length, Scanner sc) {
      int[] arPw = new int[length];
      String msg = "번 사물함의 비밀번호 설정 >> ";
      
      for (int i = 0; i < arPw.length; i++) {
         System.out.print(i + 1 + msg);
         arPw[i] = sc.nextInt();
      }
      return arPw;
   }
   
   void checkLockerPw(int lockerPw, int inputPw) {
      if(lockerPw == inputPw) {
         System.out.println("비밀번호가 일치합니다!");
      }else {
         System.out.println("비밀번호가 일치하지 않습니다!");
      }
   }
   
   public static void main(String[] args) {
//      1. 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다.
//      2. 사용자에게 이용할 사물함 번호를 묻는다.
//      3. 비밀번호를 입력받아 확인한다.
//      4. 일치/불일치를 출력한다.
      Scanner sc = new Scanner(System.in);
      LockerTask lt = new LockerTask();
      String countMsg = "몇 개의 사물함의 비밀번호를 설정해줄래요?";
      String choiceMsg = "이용할 사물함 번호 입력 >>";
      String inputMsg = "비밀번호 입력 >>";
      int choice = 0, inputPw = 0, count = 0;
      
      System.out.println(countMsg);
      count = sc.nextInt();
      
      int[] arPw =  lt.setLockerPw(count, sc);
      
//      for (int i = 0; i < arPw.length; i++) {
//         System.out.print(arPw[i] + "  ");
//      }
      
      System.out.println(choiceMsg);
      choice = sc.nextInt();
      
      System.out.println(inputMsg);
      inputPw = sc.nextInt();
      
      lt.checkLockerPw(arPw[choice - 1], inputPw);
      
      
      
      
      
      
      
      
      
      
      
   }
   
   
}
 */
