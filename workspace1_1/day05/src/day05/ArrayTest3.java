package day05;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		for(int i=0;i<arr.length;i++) {
			System.out.println("현재 i의 index : "+i);
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("현재 j의 index : "+j);
				arr[i][j] = i+j;
				}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]+" ");
			}
		System.out.println();
		}
}
}
