package test;

public interface InterA {
	default void method1() {
		System.out.println("InterA --> method1");
	}
	
	static void method2() {
		System.out.println("InterA --> method2");
	}
	default void printText() {
		System.out.println("InterA --> printTxt");
	}
	
}
