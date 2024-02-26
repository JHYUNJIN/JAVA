package lambda;

public class LamdaTest {
	void printHello() {
		System.out.println("안녕");
	}
	
	// void printHello() {System.out.println("안녕");}
	// void() -> {System.out.println("안녕");}	// 이름을 없애고 화살표를 추가한다.
	// () -> {System.out.println("안녕");}	// 반환타입은 추론이 가능하므로 생략한다.
	// () -> System.out.println("안녕")	// 명령문이 1줄이면 중괄호와 세미콜론을 생략가능하다(선택)
	
	int add10(int number) {
		return number+10;
	}
	
	//int add10(int number) {return number+10;}
	//int (int number) -> {return number+10;} // 이름을 없애고 화살표를 추가
	// (int number) -> {return number+10;} // 이름을 없애고 화살표를 추가

	// (number) -> {return number+10;} // 매개변수 타입은 추론이 가능하므로 생략가능(선택)
	// number -> number+10 // 중괄호와 세미콘론을 생략가능(선택)
							// 중괄호와 세미콜론을 생략하려면 return도 생략해야한다.
							// 바디의 결과가 값이라면 자동으로 return된다.
							// 단 바디에 명령문이 1개 일때만 가능한다.

}
