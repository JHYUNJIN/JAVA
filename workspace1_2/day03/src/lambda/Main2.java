package lambda;

import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		FunctionalInter fi = new FunctionalInter() {
			
			@Override
			public void method() {
				System.out.println("익명객체의 메소드");
			}
		};
		fi.method();
		
//		FunctionalInter2 fi2 = (number) -> {return number+10;};
		FunctionalInter2 fi2 = number -> number+10;
		fi2.add10(10);
		System.out.println(fi2.add10(10));
		
		
		int[] arData = {1,2,3,4,5};
		
		
		
		Arrays.stream(arData).boxed().map(i->10).forEach(System.out::println);
		
		FunctionalInter3 fi3 = (num1,num2) -> {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			return num1+num2;
		};
		int a = fi3.method(3, 8);
		System.out.println(a);
		
	}
	
}










