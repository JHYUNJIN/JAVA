package static_inner_class;

public class Atest {
public static void main(String[] args) {
//	A a = new A();
//	A.B b = a.new B();
	A.B b = new A.B();
	System.out.println(b.field1);
	b.method1();
	System.out.println(A.B.field2);
	b.method2();
	
	
	
}
}
