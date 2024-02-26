package day02;

import java.util.Scanner;

public class InputTask5 {
public static void main(String[] args) {
	/*
	 * 성적 프로그램
	 * 1. 이름을 입력받음
	 * 2. 3과목 점수를 입력받음
	 * 3. 위 점수를 변수에 저장하고 총점과 평균
	 * 
	 * 입력 예시
	 * 이름을 입력하세요 : 
	 * 국어점수를 입력하세요 : 
	 * 영어점수를 입력하세요 :
	 * 자바점수를 입력하세요 : 
	 * 
	 * 출력 예시
	 * 이름 : 정현진
	 * 총점 : 270
	 * 평균 : 90
	 * 
	 */
	
	
	Scanner sc = new Scanner(System.in);
	
	int kor=0, eng=0, java=0, sum=0;
	double avg = 0.0;
    String name = "", 
    		msg1="이름을 입력하세요 : ",
   			msg2="국어점수를 입력하세요 : ",
   			msg3="영어점수를 입력하세요 :",
   			msg4="자바점수를 입력하세요 :";
  
 
	
	System.out.print(msg1);
	name = sc.next();
	System.out.print(msg2);
	kor = sc.nextInt();
	System.out.print(msg3);
	eng = sc.nextInt();
	System.out.print(msg4);
	java = sc.nextInt();

	sum =  kor + eng + java;
	avg = sum/3;
	
	System.out.println("이름 : "+name);
	System.out.println("총점 : "+sum+"점");
	System.out.println("평균 : "+avg+"점");
	}
}
	
	
	/*
	System.out.print("이름을 입력하세요 : ");
	String name = sc.next();
	System.out.print("국어점수를 입력하세요 : ");
	int korean = sc.nextInt();
	System.out.print("영어점수를 입력하세요 : ");
	int english = sc.nextInt();	
	System.out.print("자바점수를 입력하세요 : ");
	int java = sc.nextInt();
	int total = korean + english + java;

	System.out.printf("\n이름 :%s\n ",name);
	System.out.printf("총점 :%d\n ", total);
	System.out.printf("평균 :%f\n ",total/3);
	*/
	
	
	
	
	/*
	 * import java.util.Scanner;

public class InputTask5 {
   public static void main(String[] args) {
      /*
       * 성적 프로그램
       * 1. 이름을 입력받음
       * 2. 3과목 점수를 입력받음
       * 3. 위점수를 변수에 저장하고 총점과 평균
       * 
       * 입력예시
       * 이름을 입력하세요 :
       * 국어점수를 입력하세요 :
       * 영어점수를 입력하세요 :
       * 자바점수를 입력하세요 :
       * 
       * 출력예시
       * 이름 : 이영현
       * 총점 : 180점
       * 평균 : 60.0점
    
      Scanner sc = new Scanner(System.in);
      int kor =0 , eng =0 , java=0, sum=0;
      double avg = 0.0;
      String name = null, msg1 = "이름을 입력하세요.", 
            msg2 = "국어점수를 입력하세요",
            msg3 = "영어점수를 입력하세요",
            msg4 = "자바점수를 입력하세요";
      
      System.out.println(msg1);
      name = sc.next();
      System.out.println(msg2);
      kor = sc.nextInt();
      System.out.println(msg3);
      eng = sc.nextInt();
      System.out.println(msg4);
      java = sc.nextInt();
      
      sum = kor+eng+java;
      avg = sum/3;
      
      System.out.println("이름 : "+name);
      System.out.println("총점 : "+sum+"점");
      System.out.println("평균 : "+avg+"점");
   }
}

	 */
	
	
	
