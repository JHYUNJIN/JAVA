package day05;

public class ArrayTest2 {
public static void main(String[] args) {
	//2행 3열
	int[][] arrData = {{3,4,5},{1,2,3,}};
	int[][] arrData1 = new int[2][3];
	
	for(int i=0; i<arrData.length;i++) {
		for(int j=0; j<arrData[i].length;j++) {
			System.out.println(arrData[i][j]);
		}
	}
}
}
