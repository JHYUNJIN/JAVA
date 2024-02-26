package lambda;


public class Main3 {
	// 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드 (람다식)
	// functionalInter3 활용
	public static void main(String[] args) {
		FunctionalInter3 fi3 = (num1,num2) -> num1*num2;
			System.out.println(fi3.method(3,4));
	
	// 2개의 문자열을 매개변수로 받아서 결과를 출력하는 메소드(람다식)
	// FunctionalInter4
		FunctionalInter4 fi4 = (str1,str2) -> System.out.println(str1 + str2);
		fi4.method("안녕","반가워");

	}
}
