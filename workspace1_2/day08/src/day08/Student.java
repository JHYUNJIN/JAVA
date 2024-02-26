package day08;

import java.util.ArrayList;

public class Student {

//	메뉴
//	1. 학생입력 --> 학번, 이름, 나이, 연락처, 학과
//	2. 학생리스트 --> 학번으로 오름차순이 되게 ArrayList.sort
//	3. 학생검색 contains
//	4. 학생정보수정 set()
//	5. 학생삭제 ArrayList.remove
//	6. 종료 break
//	CRUD (Create, Road, Update, Delete)
	
	private String studentNumber;
	private String name;
	private int age;
	private String phoneNumber;
	private String major;
	
	// 기본생성자
	public Student() {}
	

	// 생성자 만들어주기 컨트롤 쉬프트 s o
	public Student(String studentNumber, String name, int age, String phoneNumber, String major) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.major = major;
	}

	


	// 게터세터 알트 쉬프트 s r 전체선택 (추상메소드로 만들었기때문에 게터세터로 값을 불러와서 사용해야한다.)
	public String getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}



	// 오버라이딩
	// 학번 : 00000, 학과 : 00000, 이름:000,나이:000,연락처000-0000-0000
	@Override
	public String toString() {
		return "학번 : "+studentNumber+", 학과 : "+major+", 이름 : "+name+", 나이 : "+age+", 연락처 : "+phoneNumber;
	}

	
	
			
			
			
			
			
			
	
	
	
	
	
	
	
	
	
}
