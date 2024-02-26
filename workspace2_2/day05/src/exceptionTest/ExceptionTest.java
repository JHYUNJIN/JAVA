package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		
		try {System.out.println(10/0);} 
//		catch (ArithmeticException e) {
//		System.out.println("0으로 나눌 수 없습니다.");}
		catch (Exception e) { // 모든 예외처리의 부모클래스는 Exception이다. 업캐스팅되어 들어온다.
		System.out.println("알 수 없는 오류가 발생하였습니다.");
		System.out.println(e); // 어떤 오류인지 찾아주는 코드
		}
		
	}
}
