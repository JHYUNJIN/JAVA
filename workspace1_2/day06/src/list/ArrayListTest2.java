package list;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(100);
		list.add(50);
		list.add(100);
		list.add(100);
		int[] ar = {10,30,50,70,90};
		
		int idx = list.indexOf(30);
		System.out.println(idx);

		System.out.println(list);
		System.out.println(ar);
		
//		값 가져오기: index 번호로 특정 값 가져오기
		System.out.println(list.get(0));
		
//		값 삭제: index번호로 삭제(int 타입으로 넘겨줘야 함)
//		list.remove(1);
		System.out.println(list.remove(1)+"을 삭제");
		System.out.println(list);
		
//		값으로 검색하여 삭제(Object타입으로 넘겨줘야 함)
		list.remove(Integer.valueOf(100)); // 만약 값이 중복으로 있다면 가장 앞의 하나의 값만 삭제된다.
		System.out.println(list);
		
//		전체 삭제
//		list.clear();
//		System.out.println(list);
		
//		포함 여부 검사 : list에 존재하면 true 없으면 false
		System.out.println(list.contains(90));
		
//		수정 : 수정할 인덱스와 값을 넘겨주어 수정한다. 수정됙 전의 값을 반환한다.
		try {
			System.out.println(list.set(100, 100));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스범위 확인해요");
		}
		System.out.println(list);
	
	}
}
