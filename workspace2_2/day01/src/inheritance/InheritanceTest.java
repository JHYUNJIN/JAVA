package inheritance;

class A{
	String name = "A";
	int data = 10;
	
	public A() {
		System.out.println("부모");
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	
	public B() {
		super(); // 부모생성자 생략가능, 반드시 부모가 먼저 올라가야한다. 그래서 이 친구를 아래로 내리면 에러가 발생한다.
		System.out.println("자식");
		name="B";
	}
	
	void printData() {
		System.out.println(name);
		System.out.println(data);
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		b.printData();
		b.printName();
	}
}
