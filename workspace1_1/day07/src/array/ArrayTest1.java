package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		int[] arData = {2,4,6,8,10};
		System.out.println(arData);
		System.out.println(arData.length);
		
//		배열의 길이만큼 반복 출력
		for(int i=0;i<arData.length;i++) {
			System.out.println(arData[i]);
		}
		
//		5, 4, 3, 2, 1을 넣고 출력
		
		for(int i=0;i<arData.length;i++) {
			arData[i]=5-i;
		}
		for(int i=0;i<arData.length;i++) {
			System.out.println(arData[i]);
		}
		System.out.println(arData[0]+9);
		
		
	}
}
