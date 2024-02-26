package storageClass;

public class VariableTest2 {
	public static void main(String[] args) {
		
		VariableTest mom = new VariableTest();
		VariableTest son = new VariableTest();
		
//		System.out.println(mom.money);
//		System.out.println(son.money);
//		mom.increaseMoney();
//		
//		System.out.println("엄마돈 : "+mom.money);
//		System.out.println("아들돈 : "+son.money);
//
//		System.out.println();
//		
//		System.out.println(mom.money_s);
//		System.out.println(son.money_s);
////		mom.increaseMoney_s();
//		VariableTest.increaseMoney_s();
//		System.out.println(mom.money_s);
//		System.out.println(son.money_s);
		
		
//		mom.increaseMoney();
//		mom.increaseMoney();
//		mom.increaseMoney();
//		mom.increaseMoney();
//		mom=new VariableTest(); // 초기화
//		mom.increaseMoney();
//		mom.increaseMoney();
//		mom.increaseMoney();
//		mom.increaseMoney();
		

		mom.increaseMoney_s();
		mom.increaseMoney_s();
		mom.increaseMoney_s();
		mom = new VariableTest();  // new로는 static 쓴거 초기화 못한다.
		mom.increaseMoney_s();
		mom.increaseMoney_s();
		mom.increaseMoney_s();
		
		mom.money_s = 20000; // 그냥 변수 값 수정해주면 된다.
		System.out.println(mom.money_s);
		
	}
}
