package day02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇명의 학생을 입력할까요 :");
		int num1 = 0;
		String name1 = null;
		int kor=0,java=0,math=0;
		
		int cnt = sc.nextInt();
		Student[] student = new Student[cnt];
		for(int i=0;i<cnt;i++) {
			student[i] = new Student();
			System.out.println(i+1+"번째 학생의 번호를 입력하세요");
			num1 = sc.nextInt();
			student[i].setNum(num1);
			System.out.println(i+1+"번째 학생의 이름을 입력하세요");
			name1 = sc.next();
			student[i].setName(name1);
			System.out.println(i+1+"번째 학생의 국어점수를 입력하세요");
			kor = sc.nextInt();
			student[i].setKor(kor);
			System.out.println(i+1+"번째 학생의 자바점수를 입력하세요");
			java = sc.nextInt();
			student[i].setJava(java);
			System.out.println(i+1+"번째 학생의 수학점수를 입력하세요");
			math = sc.nextInt();
			student[i].setMath(math);
			student[i].setTotal(student[i].getKor()+student[i].getJava()+student[i].getMath());
			student[i].setAvg(student[i].getTotal()/3.0);
			
			
		}
		
		System.out.println("학생리스트");
		  for(int i=0;i<cnt;i++) {
		         System.out.println(student[i]);

	}

}
}