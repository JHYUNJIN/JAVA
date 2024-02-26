package inter;

public class Main {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		Inter inter = new ClassA();
		
		a.method1();
		a.method2();
		inter.method1();
		inter.method2();
		
		System.out.println(inter.VAR1);
		System.out.println(inter.VAR2);
	}
}
