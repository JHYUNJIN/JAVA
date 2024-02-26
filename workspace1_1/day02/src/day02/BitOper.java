package day02;

public class BitOper {
public static void main(String[] args) {
	System.out.println(10&11);
	System.out.println(10|11);
	System.out.println(10^11);
	System.out.println(~10); // ~a = -a-1
	System.out.println(10>>1);
	System.out.println(10>>2);
	System.out.println(10>>3);
	System.out.println(10<<1);
	System.out.println(10<<2);
	System.out.println(10<<3);
	System.out.println(10<<30); // int로 표현할 수 있는 4bite가 넘어가서 음수로 전환됨
}
}
