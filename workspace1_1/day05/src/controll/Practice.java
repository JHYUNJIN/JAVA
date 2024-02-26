package controll;

public class Practice {
	public static void main(String[] args) {
		
		int score=77;
		char result='A';
		
		if (score >= 60) {
			result='D';
		}
		else if (score >= 70) {
			result='C';
		}
		else if (score >= 80) {
			result='B';
		}
		else if (score >= 90) {
			result='A';
		}
		else {
		}
		System.out.println(score+"점의 학점은 "+result+"입니다.");
	}
}
