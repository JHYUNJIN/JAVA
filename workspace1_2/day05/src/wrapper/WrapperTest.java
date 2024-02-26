package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		
//		boxing
		Integer numInt = new Integer("3");
		Integer numInt2 = Integer.valueOf("3");
		Double numDouble = new Double("1.1");
		Double numDouble2 = Double.valueOf("1.1");
		
//		unboxing
		int num = numInt.intValue();
		
//		auto-boxing
		int a=3;
		Integer num2 = Integer.valueOf(a);
		Integer num3 = a;
		Integer numInt3 = 3;
//		num3.
//		auto-unboxing
//		int num4 = numInt3;
		
	}
}
