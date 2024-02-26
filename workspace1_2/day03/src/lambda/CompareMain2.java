package lambda;


public class CompareMain2 {
	public static void main(String[] args) {
		
		CompareNumber cp = (num1,num2) -> num1>num2?1:num1<num2?-1:0;
		
		int num1 = 100;
		int num2 = 20;
		
		int result = cp.compareTo(num1, num2);
		
		if(result==1) {
			System.out.println("num1이 num2보다 크다");
		}
		else if(result==-1) {
			System.out.println("num2가 num1보다 크다");
		}
		else {
			System.out.println("같다.");
		}
	}
}

