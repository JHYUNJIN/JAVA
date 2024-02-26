package day02;

abstract class A{
	abstract void method1();
	void method2() {
		System.out.println("메소드2실행");
	}
}

class B extends A{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("오버라이딩했다.");
	}
	
}

public class AbstractTest {
	public static void main(String[] args) {
		
//		A a = new A();
		A a = new B();
		B b = new B();
		a.method1();
		a.method2();
		b.method1();
		b.method2();
	
	}
}
	
	
	


