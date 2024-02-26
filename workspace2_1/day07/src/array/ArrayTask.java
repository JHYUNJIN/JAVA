package array;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		
//		10~1까지 중 짝수만 배열에 담고 출력
		int[] arData1 = new int[10];
		for(int i=0;i<arData1.length;i++) {
			arData1[i]=i+1;
			if (arData1[i]%2==0) {
				System.out.print(arData1[i]);
			}
		}
		System.out.println();
		System.out.println();

		//		1~100까지 배열에 담은 후 홀수만 출력
		int[] arData2 = new int[100];
		for(int i=0;i<arData2.length;i++) {
			arData2[i]=i+1;
			if(arData2[i]%2==1) {
				System.out.print(arData2[i]);
			}
		}
		System.out.println();
		System.out.println();
		
//		1~100까지 배열에 담은 후 짝수의 합 출력
		int sum=0;
		int[] arData3=new int[100];
		for(int i=0;i<arData3.length;i++) {
			arData3[i]=i+1;
			if(arData3[i]%2==0) {
				sum+=arData3[i]+i;
			}
		}
		System.out.println(sum);
		System.out.println();
		
//		A~F까지 배열에 담고 출력
		char[] arData4 =new char[6];
		for(int i=0;i<arData4.length;i++) {
			arData4[i]=(char)(i+65);
			System.out.print(arData4[i]);
		}
		System.out.println();
		System.out.println();
	
		
//		A~F까지 중 C 제외하고 배열에 담은 후 출력
		char[] arData5 =new char[5];
		for(int i=0;i<arData5.length;i++) {
			arData5[i]=(char)(i+65);
			 if(i<1) {
				 arData5[i]=(char)(i+65);
			 }
			else if(i>1) {
				arData5[i]=(char)(i+66);
			}
			 System.out.print(arData5[i]);
		}
		System.out.println();
		System.out.println();
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		
		System.out.println("5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력하기");
		
		Scanner sc = new Scanner(System.in);
		int arData6[] = new int[5];
		int max=0, min=0;
		System.out.println("숫자 하나를 입력하고 엔터 누르기를 5번 반복하세요 :");
		for(int i=0;i<arData6.length;i++) {
			arData6[i]=sc.nextInt();
		}
		System.out.print("배열에 담긴 숫자는 : ");
		for(int i=0;i<arData6.length;i++) {
			System.out.print(arData6[i]+", ");
		}
		System.out.print("입니다.");
		
//		for(int i=0;i<arData6.length;i++) {
//			if(arData6[i]>arData6[i+1]) { //arData6[i+1] 가 i가 4번째 인덱스일 때 arData6[5]번 인덱스를 찾아야 하는데 arData6[4]번 인덱스까지 존재한다. 그렇기 때문에 배열범위 에러가 뜨게된다.
//				max = arData6[i];
//			}
//			else {
//				min=arData6[i+1];
//			}
//		}
		max=arData6[0];
		min=arData6[0];
		for(int i=0;i<arData6.length;i++) {
			
		if(max<arData6[i]) {max=arData6[i];}
		if(min>arData6[i]) {min=arData6[i];}
		}
		System.out.println();
		System.out.println("최대값은 : "+max);
		System.out.println("최소값은 : "+min);
		
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		System.out.println();
		int arData7[]=null;  // 몇칸만들지 몇번인덱스에 무슨 값을 넣을지 모를때 선언먼저해준다.
		int num=0,total=0;
		double avg=0.0;
		System.out.println("배열을 총 몇개 만들까요 ? : ");
		num=sc.nextInt();
		arData7=new int[num];
		for(int i=0;i<arData7.length;i++) {
			System.out.println(i+1+"번째 숫자를 입력해주세요 :");
			arData7[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<arData7.length;i++) {
			total+=arData7[i];
		}
		System.out.println("배열에 입력된 숫자의 총합은 : "+total+"입니다.");
		avg=(double)total/num; // 정수와 정수의 연산은 정수가 나오므로 총합이 실수타입이 될수있게 강제 형변환을 해줌
		System.out.println("배열에 입력된 숫자의 평균은 : "+String.format("%.2f", avg)+"입니다.");
	}
}
