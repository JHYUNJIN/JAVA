package day04;

public class ForTask2 {
public static void main(String[] args) {
	//aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력해보기
	//'a'=97 , 'A'=65
	//알파벳 갯수는 26개
	//짝수일 떄 대문자 홀수일 때 소문자
	//i%2==0
	//syso(i+97)
	//else syso(i+65)
	
/*
 	for (int i=0;i<26;i++) {
		if(i%2==0) {
			System.out.print((char)(i+97));
		}
		else
			System.out.print((char)(i+65));
	}
*/
	for(int i=0;i<26;i++) {
		char letter = (i%2==0)? (char)(i+97):(char)(i+65);
		System.out.print(letter);
	}

	
}
}






