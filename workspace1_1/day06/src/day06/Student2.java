package day06;

public class Student2 {
		int math;
		int kor;
		int eng;
		int java;
		double avg;
		String grade;

		int getTotal() {
			return math+kor+eng+java;
		}
		double avg() {
			int sum=math+eng+java+kor;
			return sum/4;
		}
		public Student2() {
			System.out.println("생성자");
		}
	}