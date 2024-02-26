package controll;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		int[] arData1= {1,2,3,4,5};
		int[] arData2 = new int[5];
		int[] arData3=null;
		arData3 = new int[5];
		
		arData2[2]=5;
		System.out.println(arData2[2]);
		System.out.println(arData1[0]+3);
		System.out.println(arData1[1]);
		for(int i=0;i<arData2.length;i++) {
			System.out.print(arData2[i]);
			
		}
		
		System.out.println();
		String msg = "1.통신요금 조회\n"+
							"2. 번호이동\n"+
							"3. 분실신고\n"+
							"0.상담원 연결";
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		 do{
			System.out.println(msg);
			choice=sc.nextInt();
		}
		 while(choice!=0);
		
		 
		 
	}
}
