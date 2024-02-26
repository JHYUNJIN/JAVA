package method;

public class MethodTest {

//	두 정수의 곱셈 메소드 선언
	static int multiple(int num1,int num2){
		return num1*num2;
	}
	
//	두 정수의 덧셈 결과를 출력해주는 메소드 선언
	void add(int num1,int num2) {
		System.out.println("두 정수의 합은 : "+(num1+num2));
	}
	
//	1~10까지 println()으로 출력하는 메소드
	void print1to10() {
		
			for(int i=0;i<10;i++) {
				System.out.print((i+1)+" ");
			}
	}
	void add1to10() {
		
		for(int i=0;i<10;i++) {
			int sum=0;
			for(i=0;i<10;i++) {
				sum=sum+i;
			}
			System.out.println(sum);
		}
	}
	
	
	
//	static
//	컴파일러가 가장 먼저 메모리에 할당해준다.
//	일반 메소드를 static 메소드에서 사용하기 위해서는 
//	1. static을 붙여서 같이 메모리에 올려준다.
//	2 일반 메소드의 소속을 알려준다.
//		- static 메소드에서 사용된 일반 메소드는 Heap 영역에서 찾는다.
//		- 클래스 타입의 변수를 선언할 때 Heap 영역에 할당되므로
//			일반 메소드도 해당 변수를 통해 접근하여 사용 할 수 있다.
	
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest(); 
		// static을 사용하지 않았을 경우 새로운 주소를 할당해주고 사용하면 된다.
		int newMt = mt.multiple(5, 5);
		System.out.println(newMt);
		
		
		
		int result = multiple(5,5)+9; //return이 있는 경우에 한해서 값으로 활용가능
		System.out.println(result);
	
		mt.add(5, 5);
		mt.print1to10();
		mt.add1to10();
		
	
}

}