package day05;
class Car{}
public class HashCodeTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
	}
}
