package hashSetTest;

import java.util.HashSet;
import java.util.Iterator;

public class HaskSetTest {
	public static void main(String[] args) {
		
		HashSet<String> animalSet = new HashSet<>();
		
		animalSet.add("강아지");
		animalSet.add("고양이");
		animalSet.add("토끼");
		animalSet.add("까치");
		animalSet.add("독수리");
		animalSet.add("송아지");
		System.out.println(animalSet.add("강아지")); // 중복저장 안됨
		System.out.println(animalSet.add("호랑이")); // 저장 됨
		// 내가 저장한 순서대로 값이 저장되지 않으며
		// 내가 저장한 set에서 특정값을 가져올 수 없다.
		System.out.println(animalSet);
		// 그런데 어떻게 toString()으로는 값을 가져 올 수 있는가 ?
		// 다른 자료구조로 변환하여 값을 가져와야 한다.
		
		Iterator<String> animalIter = animalSet.iterator();
		
//		System.out.println(animalIter); // --> 주소값
		System.out.println(animalIter.hasNext());	// --> true		
		System.out.println(animalIter.next()); // --> 데이터
		System.out.println(animalIter.next()); // --> 데이터
		System.out.println();
		while (animalIter.hasNext()) {
 		System.out.println(animalIter.next()); // --> 데이터
			
		}
		
		
	}
}
