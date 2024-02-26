package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		
		int number = 10;
		
//		박싱 하는 법
		
//		디프리케이티드 이제 더 이상 이렇게 쓰지말자라고 알려준다
//		valueOf를 사용하자
//		Integer number_W = new Integer(number);
//		Integer number_W = Integer.valueOf(number);
		
		Integer number_W = number;	// 오토 박싱
		System.out.println(number_W);
		
//		언박싱 하는 법
//		number = number_W.intValue();
		number = number_W;
		System.out.println(number_W);
		
	}
}
