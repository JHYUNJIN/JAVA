package day06;
class A{
	void method() {
		System.out.println(this);
	}
}
	
public class ClassTest {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
	
		a1.method();
		System.out.println(a1);
	}

}
