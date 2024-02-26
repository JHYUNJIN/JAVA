package lambda;

public class Main {
	public static void main(String[] args) {
		FunctionalInter fi = new FunctionalInter() {
			
			@Override
			public void method() {
				System.out.println("익명객체의 메소드");
			}
		};
		fi.method();
		
		
		FunctionalInter fi2 = () -> System.out.println("람다식");
		//() -> System.out.println("람다식") // 함수형 인터페이스와 Stream 을 이용하여 사용해야한다.
		fi2.method();
	}
}
