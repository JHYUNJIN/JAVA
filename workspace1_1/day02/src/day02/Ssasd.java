package day02;

public class Ssasd {
	public static void main(String[] args) {
		String pw = "123abc";
		String pw_en = "";
		String pw_de = "";
		
		for(int i=0; i<pw.length();i++) {
			pw_en +=(char)(pw.charAt(i)*3);
		}
		for(int i=0; i<pw.length();i++) {
			pw_de +=(char)(pw_en.charAt(i)/3);
	}
		System.out.printf("원래 pw : %s\n",pw);
		System.out.printf("암호화된 pw : %s\n",pw_en);
		System.out.printf("복호화된 pw : %s",pw_de);
	}
}
