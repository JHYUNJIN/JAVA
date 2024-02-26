package objectTest;

import java.util.Random;

class Animal{
	String name;
	String kind;
	int age;

	public Animal() {
	}
	
	public Animal(String name, String kind, int age) {
		this.name = name;
		this.kind = kind;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", kind=" + kind + ", age=" + age + "]";
	}

//	@Override
//	public String toString() {
//		return "이름은 : "
//				+ name
//				+ ", "
//				+ "종 : "
//				+ kind
//				+ ", "
//				+ "나이 : "
//				+ age;
//	}
	
}

public class ToStringTest {
	public static void main(String[] args) {
		
	Random r = new Random();
	
	System.out.println(r.toString());
	System.out.println(r); // 객체명을 출력할 때는 항상 toString()이 생략되어있었다.
	
	Animal animal = new Animal("백구","진돗개",20);
//	초기화가 잘 되었는지 확인할 때 사용할 수 있다.
	System.out.println(animal);
	
	
	}
}
