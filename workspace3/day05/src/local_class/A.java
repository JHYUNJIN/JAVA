package local_class;

public class A {
	A(){
		class B{} // 로컬 클래스 선언 
		B b = new B(); // 로컬 객체 생성
	}
	
	void method() {
		class B{}
		B b = new B();
	}
	
	void useB() {	// A클래스의 메소드
		class B{ // 로컬 클래스
			int field1=1;
			static int field2=2;
			
			B(){
				System.out.println("B 생성자");
			}
			
			void method1() {
				System.out.println("B 메소드1");
			}
			static void method2() {
				System.out.println("B 메소드2");
			}
		}
	
		B b = new B(); // 로컬 객체 생성
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
	}
	
	
}
