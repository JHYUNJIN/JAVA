package game;

class A {
	public A() {
		System.out.println("부모생성자");
	}
}

class B extends A{
	public B() {
		System.out.println("자식생성자");
	}
}

public class Test1 {
	public static void main(String[] args) {
		
		B b = new B();
	}
}
