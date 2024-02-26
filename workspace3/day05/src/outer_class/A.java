package outer_class;

/*
public class A {
	int field1;
	void method1() {}
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1=10; // A의 인스턴스 필드
			method1();
			
			field2 = 20;
			method2();
		}
	}
	
	static class C{
		void method() {
			
//			field1=10; // A클래스의 인스턴스 필드메소드 사용 안됨
//			method1();
			
			field2=20; // 정적 필드와 메소드는 사용가능
			method2();
		}
	}
}
*/


public class A{
	String field = "A-필드";
	
	void method() {
		System.out.println("A-메소드");
	}

	class B{
		public B() {
			System.out.println("B 기본생성자 생성됨");
		}
		String field = "B-필드";
		
		void method() {
			System.out.println("B-메소드");
		}
		void print() {
			// 클래스의 객체를 가리킴(this)
			System.out.println(this.field);
			this.method();
			
			// outer클래스의 객체를 가리킴 (A.this)
			System.out.println(A.this.field);
			A.this.method();
		}
	}

	void userB() {
		B b = new B();
		b.print();
	}


}



















