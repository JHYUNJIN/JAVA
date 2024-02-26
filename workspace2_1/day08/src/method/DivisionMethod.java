package method;

import java.lang.reflect.Type;

public class DivisionMethod {

	//두 정수의 나눗셈을 해주는 메소드 (몫과 나머지 둘 다 리턴)
	static void divide(int num1,int num2) {
		
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		else {
			
		int portion=num1/num2;
		int rest=num1%num2;
		
		System.out.println("몫은 : "+portion+"\n"+"나머지는 : "+rest);
		}
	}
	
	//두 정수의 나눗셈을 해주는 메소드 (몫과 나머지 둘 다 리턴) 배열로 출력하자
	static int[] ardivide(int num1,int num2) {
		int[] result=null;
		result=new int[2];
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		else {
		result[0]=num1/num2;
		result[1]=num1%num2;
		System.out.println("몫은 : "+result[0]+"\n나머지는 : "+result[1]);
		}
		return result;
	}

	//-------------------------------------------------------------------
	
	public static void main(String[] args) {
	
		divide(10, 3);
		System.out.println();
		
		int result[] = ardivide(10,2);
		System.out.println("몫에 1을 더한 값은 : "+(result[0]+1)); // 몫을 값으로 사용
		
	
	
	
	}
	
}
