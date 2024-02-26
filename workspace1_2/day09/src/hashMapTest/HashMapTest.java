package hashMapTest;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 1);
		map.put("D", 4); // 키가 중복되면 수정됨
		map.put("E", 2);
		System.out.println(map.put("E", 5)); // 출력은 이전값이 출력되고 5로 수정되어 다음 출력부터는 5로 나옴
																// 키 값이 존재한다면, put 메소드는 수정되기 전의 value를 리턴
		
		System.out.println(map.get("E"));
		System.out.println(map);
		System.out.println(map.keySet()); // map은 순서가 없기 때문에, key값을 Set으로 출력가능하다.
		System.out.println(map.values());
		System.out.println(map.containsKey("A")); // 키 값 "A" 가 있니? true
		
		
	}
}
