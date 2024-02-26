package inheritance;

class Human{
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("잠자기");
	}
	void walk() {
		System.out.println("직립보행");
	}
}

class Monkey extends Human{
	void rideTree() {
		System.out.println("나무타기");
	}
	@Override
	void walk() {
		super.walk(); // 부모의 코드를 그대로 사용하고자 할 때 작성하는 코드
		System.out.println("사족보행");
	}
	
}

public class InheritanceTest2{
	public static void main(String[] args) {
//		Human human = new Human();
//		human.walk();

		Monkey monkey = new Monkey();
		
		monkey.eat();
		monkey.walk();
	
	}
		
}
