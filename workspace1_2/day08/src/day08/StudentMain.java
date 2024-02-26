package day08;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
//		메뉴
//		1. 학생입력 --> 학번, 이름, 나이, 연락처, 학과
//		2. 학생리스트 --> 학번으로 오름차순이 되게 ArrayList.sort
//		3. 학생검색 contains
//		4. 학생정보수정 set()
//		5. 학생삭제 ArrayList.remove
//		6. 종료 break
//		CRUD (Create, Road, Update, Delete)
		
		String menu = "=================="
				+ "학생관리 프로그램\n" 
				+ "1. 학생이름 입력\\n"
				+ "2. 학생 리스트\\n"
				+ "3.학생 검색\\n"
				+ "4.학생정보수정\\n"
				+ "5.학생 삭제\\n"
				+ "6.종료\\n"
				+ "==================";

		System.out.println(menu);
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		ArrayList<Student> studentList = new ArrayList<>();
		while(isTrue) {
			System.out.println("메뉴 번호를 선택하세요.");
			int menuNumber = sc.nextInt();
			
			switch(menuNumber){
			case 1:
				String studentNum;
				String major;
				String name;
				int age;
				String phoneNum;
				try {
					System.out.println("학번을 입력하세요.");
					studentNum = sc.next();
					
//					학번이 중복될 경우 다시 입력받기
//					while() {
//						
//					boolean isFind = false;
//					for(Student student : studentList /*향상된for문*/) {
//						if(student.getStudentNumber().equals(studentNum)) {
//							isFind = true;
//							break;
//						}
//					}
//					if(isFind) {System.out.println("이미 존재하는 학번입니다.");}
//					}
					
					System.out.println("전공을 입력하세요.");
					major = sc.next();
					System.out.println("이름을 입력하세요.");
					name = sc.next();
					System.out.println("나이를 입력하세요.");
					age = sc.nextInt();
					System.out.println("연락처를 입력하세요.");
					phoneNum = sc.next();
					Student st = new Student(studentNum,name,age,phoneNum,major);
					studentList.add(st);
				} catch (InputMismatchException e) {
					System.out.println("나이를 숫자로 입력해주세요.");
				}
				
				
				break;
			case 2:
				System.out.println("2. 학생 리스트\n");
				for(int i=0;i<studentList.size()-1;i++) { 
					for(int j=i+1;j<studentList.size();j++) { // i번째 반복문 속에서 i와 j를 비교해주는 코드
//						학번순서로 나열하는법
//						if(Integer.parseInt(studentList.get(i).getStudentNumber())>Integer.parseInt(studentList.get(j).getStudentNumber())) {
//						나이순서로 나열하는법
						if(studentList.get(i).getAge()>studentList.get(j).getAge()) {
							Student tmp = studentList.get(j);
							studentList.set(j,studentList.get(i));
							studentList.set(i, tmp);
						}
					}
				}
				for(int i=0;i<studentList.size();i++) {
					System.out.println(studentList.get(i));
				}
				break;
			case 3:
				System.out.println("검색할 학생의 학번을 입력하세요.");
				String find = sc.next();
				boolean isFind=false;
				for(int i=0;i<studentList.size();i++) {
					if(studentList.get(i).getStudentNumber().equals(find)) {
						System.out.println("학생을 찾았습니다.");
						System.out.println(studentList.get(i));
						isFind=true;
					}
				}
				if(!isFind)System.out.println("찾는 학생이 없습니다.");
				break;
			case 4:
				System.out.println("수정할 학생의 학번을 입력하세요.");
				String update = sc.next();
				boolean isUpdate=false;
				int idx=0;
				for(int i=0;i<studentList.size();i++) {
					if(studentList.get(i).getStudentNumber().equals(update)) {
						System.out.println("학생을 찾았습니다.");
						System.out.println(studentList.get(i));
						idx = studentList.indexOf(studentList.get(i));
						isFind=true;
						System.out.println("학생의 연락처를 수정해주세요.");
						String updatePhoneNumber = sc.next();
						studentList.get(idx).setPhoneNumber(updatePhoneNumber);
						System.out.println("학생의 학과를 수정해주세요.");
						String updateMajor = sc.next();
						studentList.get(idx).setMajor(updateMajor);
						isUpdate=true;
					}
				}
				if(!isUpdate)System.out.println("찾는 학생이 없습니다.");
				break;
			case 5:
				System.out.println("삭제할 학번을 입력하세요.");
				String remove = sc.next();
				boolean isRemove=false;
				for(int i=0;i<studentList.size();i++) {
					if(studentList.get(i).getPhoneNumber().equals(remove)) {
						System.out.println("해당 학생의 정보를 삭제합니다.");
						studentList.remove(studentList.get(i));
						isRemove=true;
					}
				}
				if(!isRemove) {
					if(!isRemove)System.out.println("찾는 학생이 없습니다.");
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				isTrue=false; // 프로그램을 종료해주는 코드
				break;
			default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			
			}
		}
		
//		
//		
		
	}
}
