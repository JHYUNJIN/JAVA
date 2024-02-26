package day04;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("실행되는 코드1");

		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안되요");
		}
		finally {
			System.out.println("실행되는 코드2");
		}
	
	}
}
