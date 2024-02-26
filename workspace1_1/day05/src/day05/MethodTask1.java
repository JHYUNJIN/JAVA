package day05;

public class MethodTask1 {
	//1~100 까지의 합을 반환하는 메소드
	
//	int addTen(int num) {
//		int result = 0;
//		return result;
//}
//	public static void main(String[] args) {
//		int a = 0;
//		for(int i=0;i<100;i++) {
//			System.out.println(i+1+a);
//			
//		}
//		int sum = a; 

	int totalFrom1to100() {
		int total=0;
		for(int i=0;i<100;i++) {
			total += i+1;
		}
		return total;
	}
	public static void main(String[] args) {
		MethodTask1 mt1 = new MethodTask1();
		mt1.totalFrom1to100();
		System.out.println(mt1.totalFrom1to100());
	}	
		
	
		
	}	

