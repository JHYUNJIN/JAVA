package day01;

import acessModifier.B;

public class AcessTest2 {
	public static void main(String[] args) {
		B b = new B();
		b.setVar4(10);
		int num=b.getVar4();
		System.out.println(num);
	}
}
