package static_inner_class;

public class A {

	static class B{
		int field1=1;
		static int field2 =2;
		B(){
			System.out.println("B생성자");
		}
		void method1() {
			System.out.println("B메소드1");
		}
		void method2() {
			System.out.println("B메소드2");
		}
	}
}
