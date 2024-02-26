package wrapperTest;

import java.util.Iterator;

public class WrapperTask {
	public static void main(String[] args) {
//		1,3.14,45.1F,'H',"정현진 최고",true
//		위 6개의 값을 6칸 배열에 담기
		
		int num1 = 1;
		double num2 = 3.14;
		float num3 = 45.1F;
		char ch = 'H';
		String st = "정현진 최고";
		boolean bool = true;
		
//		Object[] list = new String[6];
//		list[0]=num1;
//		list[1]=num2;
//		list[2]=num3;
//		list[3]=ch;
//		list[4]=st;
//		list[5]=bool;
		
		
		
		Object[] arlist = {1,3.14,45.1F,'H',"정현진 최고",true};
		
		arlist.toString(); // 오브젝트 클래스 안의 메소드만 가능
		Integer integer = (Integer)arlist[0]; // 다운캐스팅
		integer.byteValue(); // 다운캐스팅을 해줬기 때문에 인티져 클래스 안의 메소드 사용 가능!
		
		
		for (int i = 0; i < arlist.length; i++) {
			System.out.println(arlist[i]);
		}
		
		
	}
}
