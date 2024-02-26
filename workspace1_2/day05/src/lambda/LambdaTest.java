package lambda;

public class LambdaTest {

	public static void main(String[] args) {
		
		LambdaInter lambdaInter1 = (number)->number%10==0;
//													 매개변수				리턴 값
		boolean result1 = lambdaInter1.checkMultipleOf10(50);
		boolean result2 = lambdaInter1.checkMultipleOf10(51);
		System.out.println(result1);
		System.out.println(result2);
		
		LambdaInter lambdaInter2 = (n) -> {
			System.out.println("10의 배수 검사");
			return n % 10 ==0;
		};
		
		boolean result3 = lambdaInter2.checkMultipleOf10(70);
		System.out.println(result3);
		
		
//		람다식은 리턴값이 있을 때 사용한다.
		
//				new LambdaInter() { // 익명 클래스 {} 중괄호 앞에 클래스 이름이 없는 것.
//			
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				
//				return false;
//			}
//		};
	}
}
