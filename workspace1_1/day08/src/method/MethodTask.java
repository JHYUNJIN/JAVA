package method;

import java.util.Scanner;

public class MethodTask {

//	"정현진"을 n번 print()로 출력하는 메소드
	void print(int n) {
		for(int i=0;i<n;i++) {
		System.out.println("정현진");
		}
	}
	
//	매개변수로 넘어온 이름을 n번 print()로 출력하는 메소드
	void printname1(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 몇번 반복할 지 숫자를 입력해주세요 : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(i+1+"번째 "+name);
		}
	}
	void printname2(String name,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(i+1+"번째 "+name);
		}
	}
	
//	세 정수의 뺼셈을 해주는 메소드
	
	int subtract(int num1,int num2,int num3) {
		return num1-num2-num3;
	}
	
	
	
	
//	두 정수의 나눗셈을 해주는 메소드 (몫과 나머지 둘 다 리턴)
	
		int[] divide(int num1, int num2) {
			int[] result = null; //
			
			if(num2!=0) {
				
			result = new int[2];
				
			result[0] = num1/num2;
			result[1] = num1%num2;
			}
			return result;
		}
		
//		1~n까지의 합을 구해주는 메소드 (리턴사용)
		
		int addsum(int num1) {
			int sum=0;
			for(int i=0;i<num1;i++) {
				sum=sum+i+1;
			}
			return sum;
		}
		
//		문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
		int getCount(String string,char c) {
			int count=0;
			
			for (int i = 0; i < string.length(); i++) {
				if(string.charAt(i)==c) {
					count++;
				}
			}
			return count;
		}
	
	
	
	

//----------------------------------------------------------------
	
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		
		mt.print(5);
		mt.printname2("정현진",2);
//		mt.printname1("정현진");
		System.out.println(mt.subtract(2, 2, 3));
		
		int[] result = mt.divide(11, 2);
		if(result==null) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		else {
		System.out.println("몫 : "+result[0]);
		System.out.println("나머지 : "+result[1]);
		}
		
		System.out.println(mt.addsum(10));
		
		System.out.println();
		String str="정현진";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
//		mt.getCount(apple, a);
		
	}
}

