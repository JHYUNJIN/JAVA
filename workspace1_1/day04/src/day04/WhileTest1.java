package day04;

public class WhileTest1 {
	public static void main(String[] args) {
//		int i=0;
//		while(i != 10) {
//			i++;
//			System.out.println((i)+"번째 정현진");
//		}
//	int i=10;
//		do {
//		System.out.println(i+"번째 정현진");
//	}while(i != 10);
//	}
		int i=10;
		boolean isTrue = true;
		while(isTrue) {
			i++;
			System.out.println(i+"번째 정현진");
			if(i==300) {
				isTrue = false;
			}
		}
		
	}

}
