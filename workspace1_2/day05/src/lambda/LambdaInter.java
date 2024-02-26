package lambda;

@FunctionalInterface // 함수형 인터페이스로 사용할거야라는 의미이다.  추상메소드 하나만 가질 수 있게 한다.
public interface LambdaInter {

	boolean checkMultipleOf10(int number);
}
