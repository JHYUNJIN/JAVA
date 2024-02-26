package day01;

public class BubbleAr {
	public static void main(String[] args) {
		
		int[] ar = {3,2,5,1,4}; // => 1,2,3,4,5
		for (int j = 0; j < ar.length; j++) {
			boolean flag = true;
			for (int i = 0; i < ar.length-1; i++) {
				int temp = 0;
				if(ar[i]>ar[i+1]) {
					temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
					flag = false;
				}
			}
			
			if(flag) break;
			
			
			for (int p = 0; p < ar.length; p++) {
				System.out.print(ar[p]+" ");
			}
			System.out.println();
		}

		
	}
}
