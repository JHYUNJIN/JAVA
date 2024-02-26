package variable;

public class FormatTest {
	public static void main(String[] args) {
		
		String name = "정현진";
		int age=30;
		double weight=60.5;
		
		System.out.printf("저는 오늘 %d시에 밥 먹으러 갈거에요\n",12);
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %02d살\n몸무게 : %.1fkg",age,weight);
	}
}
