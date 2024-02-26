package input;

import java.util.Scanner;

public class NextLineTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg1 = "좋아하는 숫자 : ", msg2 = "좋아하는 동물 : ", animal ="";
		String resultMsg = "\n내가 좋아하는 숫자는 %d이다. \n내가 좋아하는 동물은 %s이다.";
		int number = 0;
		
		System.out.println(msg1);
		number = sc.nextInt();
		
//		sc.nextLine();
		
		System.out.println(msg2);
		animal = sc.next();
		
//		System.out.println("내가 좋아하는 숫자는 "+number+"\n내가 좋아하는 동물은 "+animal+"이다.");
		System.out.printf(resultMsg,number,animal);
		
	}
}
