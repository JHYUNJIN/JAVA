package casting;

public class CastingTest4 {
	public static void main(String[] args) {
		
//		앞에 바로 붙여주는 강제 형변환은 일반자료형 끼리만 사용가능하다.
//		String은 클래스 타입이므로
//		클래스 타입은 클래스를 이용해서 형변환 해야 한다.
//		int의 클래스 타입은 Integer 이다.
//		"문자열"을 정수로 바꾸는 기능는 Integer클래스에 안에 있는 parseInt 메소드에 만들어져 있다.
		
		System.out.println(Integer.parseInt("10")+1);
		
//		"3.9"+9의 결과를 12.9로 출력해보기
		System.out.println(Double.parseDouble("3.9")+9);
		System.out.println(Float.parseFloat("3.9")+9);
		
		double weight = 60.5;
		System.out.println(weight);
		
		float height = 177.4F;
		System.out.println(height);
		
		int age = 22;
		System.out.println(age);
		
		long size = 105L;
		System.out.println(size);
		
	}
}
