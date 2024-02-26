package day05;

public class ArrayTest {
public static void main(String[] args) {
//	int[] ar = new int[5];
//	System.out.println(ar);
	
	//배열 선언 후 1~10까지 값 넣기
	int[] arData = new int[10];
	for(int i=0; i<arData.length;i++) {
		arData[i] = i+1;
	}
	for(int i=0; i<arData.length;i++) {
		System.out.println(arData[i]);
	}
	
  }
}
