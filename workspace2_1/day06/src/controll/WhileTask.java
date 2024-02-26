package controll;

import java.util.Scanner;

public class WhileTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String resultMsg = null;
		int choice=0;

		String msg = "Q. 당신이 좋아하는 색을 선택하세요.";
		String choiceMsg = "1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색\n5.나가기";
		String redMsg = "불같고 열정적이고 적극적이다.";
		String yelloMsg = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMsg = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMsg = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMsg = "다시 입력해주세요";
		String exitMsg = "프로그램을 종료합니다.";
		
		
		
//		while(choice!=5) {
//			System.out.println(msg+"\n"+choiceMsg);
//			choice = sc.nextInt();
//			
//			switch (choice) {
//			case 1:
//				resultMsg=redMsg;
//				break; // switch문 탈출, 가장 가까운 {}중괄호를 탈출한다.
//			case 2:
//				resultMsg=yelloMsg;
//				break;
//			case 3:
//				resultMsg=blackMsg;
//				break;
//			case 4:
//				resultMsg=whiteMsg;
//				break;
//			case 5:
//				resultMsg=exitMsg;
//				break;
//			default:
//				resultMsg=errorMsg;
//				break;
//			}
//			
//			System.out.println(resultMsg);
//		}


		while(true) {
			System.out.println(msg+"\n"+choiceMsg);
			choice = sc.nextInt();
			
			if(choice==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (choice) {
			case 1:
				resultMsg=redMsg;
				break; // switch문 탈출, 가장 가까운 {}중괄호를 탈출한다.
			case 2:
				resultMsg=yelloMsg;
				break;
			case 3:
				resultMsg=blackMsg;
				break;
			case 4:
				resultMsg=whiteMsg;
				break;
			case 5:
				resultMsg=exitMsg;
				break;
			default:
				resultMsg=errorMsg;
				break;
			}
			
			System.out.println(resultMsg);
		}

	}			
}
