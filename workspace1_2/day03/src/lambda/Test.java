package lambda;

public class Test {
	// 식(expression)과 문(statement)의 차이
	
	// 식은 결과가 값이다.
	// 식은 값이기 때문에 변수에 저장할 수 있고 매개변수로 넘겨줄 수 있다.
	
	// 문은 ; 으로 끝난다.(명령문)
	// 문은 값이 아니기 때문에 변수에 저장할 수 없고 매개변수로 넘겨줄수 없다.
	// 문은 식을 포함할 수 가 있다.

	
	public static void main(String[] args) {
		
		int a=3;
//		int num = add10(a=4);
		
		int b = a= 4;
		System.out.println(b);
	}

}



