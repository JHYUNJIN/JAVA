package objectTest;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		
	String data1 = "ABC";
	String data2 = "ABC";
	String data3 = new String("ABC");
	String data4 = new String("ABC");
	
	System.out.println(data1.hashCode());
	System.out.println(data2.hashCode());
	
	//new를 썼기에 필드 우선순위가 높아야 하지만
	//String 클래스에서는 필드의 해시코드값이 아닌 필드 안에 있는 문자열 상수값의 해시코드값을 
	//리턴하도록 재정의 되어있다.
	System.out.println(data3.hashCode()); // 해쉬코드는 스트링 클래스에서 재정의 되어 있기 때문에 데이터 값이 같다면
	System.out.println(data4.hashCode()); // 주소값이 똑같이 나온다.
	
	Random r1 = new Random();
	Random r2 = new Random();
	System.out.println(r1.hashCode());
	System.out.println(r2.hashCode());
	
	}
}
