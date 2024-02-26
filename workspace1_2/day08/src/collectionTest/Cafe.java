package collectionTest;

import java.util.ArrayList;

public class Cafe {

	// 커피메뉴들을 저장할 DB 선언하기
	public static ArrayList<Coffee> coffees = new ArrayList<>();
	
	// 커피메뉴 추가
	public void add(Coffee coffee) {
		coffees.add(coffee);
	}
	
	// 커피메뉴 삭제
	// 메뉴의 이름을 외부에서 받아오기
	public void remove(String name) {
//		for (Coffee coffee : coffees) {
//			if(coffee.getName().equals(name)) {
//				coffees.remove(coffee);
//			}
//		}
		
		for(int i=0;i<coffees.size();i++) {
			if(coffees.get(i).getName().equals(name)) {
				coffees.remove(coffees.get(i));
			}
		}
		
		
	}
	
	
}
