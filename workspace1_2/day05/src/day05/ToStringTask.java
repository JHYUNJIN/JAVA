package day05;

class Student{
	String name;
	int age;
	int stNo;
	
	int kor;
	int eng;
	int java;
	public Student(String name, int age, int stNo, int kor, int eng, int java) {
		super();
		this.name = name;
		this.age = age;
		this.stNo = stNo;
		this.kor = kor;
		this.eng = eng;
		this.java = java;
	}
	@Override
	public String toString() {
		return "Student [name : "+name+", age : "+age+", stNo : "+stNo+" ]";
	}
	
}
	

public class ToStringTask {
//	Student 클래스를 만드는데 이름 나이 학번 점수 3개 변수 만들고
//	객체를 만들 때 이 정보를 모두 입력할 수 있게 (생성자(name,age,num,point)
//	객체를 프린트할 때 이 정보들이 모두 출력 될 수 있게 해보기 ( toString 재정의)
	public static void main(String[] args) {
		Student s1 = new Student("정현진", 30, 1111, 70, 80, 90);
		
		System.out.println(s1);
	}
	
	
}

