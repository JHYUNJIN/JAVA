package day03;

public class Outer {
	int var1;
	String var2;
	void method1() {}
		class Inner{
			void method2() {
				var1=10;
				method1();
				
			}
	}
}
