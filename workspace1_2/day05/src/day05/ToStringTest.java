package day05;

public class ToStringTest {
	public ToStringTest() {
		super();
	}
	public static void main(String[] args) {
		ToStringTest t = new ToStringTest();
		String str = "aa";
		System.out.println(t);
		
		try {
			throw new NumberFormatException("메세지");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
