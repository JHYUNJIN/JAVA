package casting;

public class CastingTest {
	public static void main(String[] args) {
		
//		자동 형변환
		System.out.println(11/9);
		System.out.println(11.0/9);
		
//		강제 형변환
		System.out.println(11/(double)9);
//		byte가 잘리면서 올림이 되지 않는다.
		System.out.println((int)8.63+2.59);
//		최우선 연산자 ()소괄호 연산자
		System.out.println((int)(8.43+2.59));
		
//		실습
//		8.43+2.58 = 10 (강제 형변환만 사용)
		System.out.println((int)8.43+(int)2.58);
	}
}
