package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
//		Map 선언
		Map<String,String> map = new HashMap<>();
		
//		데이터 삽입
//		put(key,value);
		map.put("Spring", "봄");
		map.put("Summer", "여름");
		map.put("Fall", "가을");
		map.put("Winter", "겨울");
		System.out.println(map);

//		key가 중복될 경우 value가 변경
		map.put("Spring", "사쿠라");
		map.put("Spring1", "사쿠라");
		System.out.println(map);
		
//		삭제
		map.remove("Spring1");
		System.out.println(map);
		
//		특정 키가 존재하는지 확인
		System.out.println("이런 키 존재해 ?"+map.containsKey("Winter"));
//		특정 값이 존재하는지 확인
		System.out.println("이런 값 존재해 ?"+map.containsValue("겨울"));
//		key에 해당하는 값을 가져오기
		System.out.println(map.get("Spring"));
	}
}
