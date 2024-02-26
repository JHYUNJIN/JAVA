package day08;

public class SwapTest {
	public static void main(String[] args) {
		int a =10;
		int b=20;
		int temp=0;
		int[] ar = {10,20};
		
//		temp = a;
//		a=b;
//		b=temp;
//		swap(a,b);
//		System.out.println(a);
//		System.out.println();
		
		swap(ar);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
	}
	
	static	void swap(int a , int b) {
		int temp=0;
			temp = a;
			a=b;
			b=temp;
	}
	static	void swap(int[] ar) {
		int temp=0;
		temp = ar[0];
		ar[0]=ar[1];
		ar[1]=temp;
	}
	
}
