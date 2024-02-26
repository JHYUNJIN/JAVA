package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add((10-i)*10);
		}
		System.out.println(list);
		
//		collections 클래스 : 컬렉션 프레임워크와 관련된 여러 메소드를 가지고 있다. 일부 알고리즘도 구현해놓았다.
//		static메소드로 구현했기때문에 객체를 만들 필요가 없다.
		Collections.sort(list); // 정렬
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder()); // 뒤집기
		System.out.println(list);
		
		Collections.shuffle(list); // 섞기
		System.out.println(list);
		Collections.reverse(list); // 뒤집기(정렬아님)
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

		
	}
}
