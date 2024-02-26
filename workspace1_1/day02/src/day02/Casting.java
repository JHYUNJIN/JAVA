package day02;

public class Casting {
public static void main(String[] args) {
	System.out.println((char)('A'+1));
	System.out.println(10/3);
	System.out.println(10/3.0);
	
	int num1 = 10;
	int num2 = 3;
	System.out.println(num1/(double)num2);
	
	double num3 = 3;
	System.out.println(num1/num3);
	
	System.out.println((int)(3.7));
	System.out.println((double)(1));
	System.out.println((char)(97));
	
	int num4=20;
	int num5=30;
	System.out.println(num4+num5);
	
	String num6 = "20";
	String num7 = "30";
	System.out.println(num6+num7);
	System.out.println(num4+num7); // 하나라도 문자가 껴있으면 문자가 된다.
	System.out.println("제 나이는 "+num5+"입니다");
	System.out.println(Integer.parseInt(num6)+30);
	System.out.println(num6+20);
	
	
}
}
