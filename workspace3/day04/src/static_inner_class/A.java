package static_inner_class;


public class A {



	static class B{}
	// 내부 클래스
	
	//인스턴스 필드
	B field = new B();
	
	// 생성자
	A(){
		B b = new B();
	}
	
	// 인스턴스 메소드
	void method() {
		B b = new B();
	}

}