package collectionTest;

import java.util.Iterator;

public class ForEachTest {
	public static void main(String[] args) {
		
		int[][] numberList = {{50,70,100},{1,8,6}};
		
		System.out.println(numberList[0]);
		System.out.println(numberList[0][1]);
		
		
		for (int i = 0; i < numberList.length; i++) {
			for (int j = 0; j < numberList[i].length; j++) {
				System.out.print(numberList[i][j]+" ");
			}
		}
		
		System.out.println();
		for(int[] is : numberList) {
			for(int number:is) {
				System.out.print(number+" ");
			}
		}
		

		
		
		
		
	}
}
