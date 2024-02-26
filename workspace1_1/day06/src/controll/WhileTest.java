package controll;

public class WhileTest {

	public static void main(String[] args) {
		int count=0;
		while(count!=10) { // 계속 true가 전달되면 무한루프에 빠질 수 있다.
			count++;
			System.out.println(count+". 정현진");
		}
		
	}
}
