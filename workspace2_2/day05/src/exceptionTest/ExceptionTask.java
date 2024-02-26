package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 5개의 정수는 배열에 담기
//		- if문은 딱 한번만 사용하기 (q를 입력 시 나갈 때만 사용!)
//		- 단, 입력받을 때는 무조건 next()만 사용하기
		
		Scanner sc = new Scanner(System.in);

		int[] number = new int[5];
		String msg = "번째 숫자 : ",temp=null;
		int i=0;
		
		while(true) {
			System.out.println(++i+msg); // ++i 해줘야 1씩 늘어난다. i+1로 하면 계속해서 1번째 숫자를 입력해달라고 한다.
			temp=sc.next();
			
			if(temp.equals("q")){
				for(int j=0;j<number.length;j++) {
					System.out.println(number[j]+" ");
				}
				break;
			}
		try {
			number[i-1]=Integer.parseInt(temp);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력해주세요 ^ ^");
			i--;
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("이미 5개의 정수를 입력받으셨네요.\n 프로그램을 종료하겠습니다.");
			for(int j=0;j<number.length;j++) {
				System.out.println(number[j]+" ");
			}
			break;
		} catch (Exception e) {
			System.out.println("어떤 오류인지 특정이 안됩니다.");
			System.out.println(e);
		}
		
		}
		
	}
}
