package day08;

import javax.print.DocFlavor.STRING;

class Student{
	int math;
	int kor;
	int java;
}

public class ArrayTest extends Object {
	public static void main(String[] args) {
//		int[] ar = new int[] {1,2,3,};
//	
//		int[] ar2 = ar;
//		
//		ar[1]=100;
//		System.out.println(ar2[1]);
		Student st1 = new Student();
		Student st2 = st1;
		st1.math = 100;
		st1.java = 50;
		st1.kor = 70;
		
		System.out.println(st2.java);
		
	}
}
