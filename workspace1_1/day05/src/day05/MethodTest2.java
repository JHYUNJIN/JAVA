package day05;

public class MethodTest2 {
		
	int addTen(int num) {
		int result = num+10;
		return result;
	}
	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		int a = mt.addTen(3);
		System.out.println(a);
		
		MethodTest mt1 = new MethodTest();
		for(int i=0;i<5;i++) {
			System.out.print(i+1);
			mt1.printText();
		}
	
	}
}
