package test;

public class Test implements InterA, InterB, InterC{

	@Override
	public void printText() {
		// 어차피 부모에 정의된 default 메소드를 사용할 것이기 때문에
		// 어떤 부모의 메소드를 사용할 것인지 정해서 코드를 작성한다.
		InterB.super.printText();
		// 추가 하거나 새로 정의해도 된다.
		
		System.out.println("Test --> printText");
		
		
	}
	

}
