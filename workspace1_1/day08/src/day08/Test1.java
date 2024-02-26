package day08;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		String str ="안녕";
		String str2 ="안녕";
		String str3 = new String("안녕");
		
		System.out.println(str==str2);
		System.out.println(str==str3);
		
		System.out.println(str.equals(str3));
		
		double result = Math.sqrt(25);
		System.out.println(result);
		
		System.out.println(str.length());
		String str4 = "안 녕하 세요";
		System.out.println(str4.length());
		String[] str5 = str4.split(" ");
		System.out.println(str5);
		System.out.println(Arrays.toString(str5));
		for(int i=0; i<str5.length;i++) {
			System.out.println(str5[i]);
		
		}
	}
	

	}
	

