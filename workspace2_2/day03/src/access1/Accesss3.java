package access1;

public class Accesss3 {

	public static void main(String[] args) {
		
//		private 접근자를 가진 변수에는 접근할 수 없다.
		Access1 a1 = new Access1();
		System.out.println(a1.data1); // 10
		a1.data1=100;
		System.out.println(a1.data1); // 100
		
		System.out.println(a1.getData4()); // 40
		a1.setData4(400);
		System.out.println(a1.getData4()); //400
		
	}
}
