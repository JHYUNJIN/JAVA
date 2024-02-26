package day07;
class A{
	int num1=5;
	static int num2=4;
	public A() {
	}
}

public class StaticTest {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
	
		a1.num2=100;
		System.out.println(a1.num1);
		System.out.println(a1.num2);
		System.out.println("------------------");
		System.out.println(a1.num1);
		System.out.println(a1.num2);
	}
}
