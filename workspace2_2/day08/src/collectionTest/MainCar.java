package collectionTest;

import java.util.ArrayList;

public class MainCar {
	public static void main(String[] args) {
		
	Store st1 = new Store();
	Car car1 = new Car("소나타",4000,"현대");
	Car car2 = new Car("아반테",3000,"현대");
	Car car3 = new Car("산타페",5000,"현대");
	Car car4 = new Car("스포티지",2800,"기아");
	Car car5 = new Car("쏘렌토",4500,"기아");
	Car car6 = new Car("g90",4000,"제네시스");
	Car car7 = new Car("xm3",2500,"르노");
	Car car8 = new Car("xm6",3500,"르노");
	
	st1.add(car1);
	st1.add(car2);
	st1.add(car3);
	st1.add(car4);
	st1.add(car5);
	st1.add(car6);
	st1.add(car7);
	st1.add(car8);
	
	System.out.println(Store.cars);
	System.out.println();
	System.out.println(st1.brandName("소나타"));
	System.out.println();
	// 브랜드 입력했을 때 그 브래드에 해당하는 자동차 정보 리턴시키기
	ArrayList<Car> result = new ArrayList<>();
	result = st1.getCars("기아");
	System.out.println(result.size());
	System.out.println(result);
	System.out.println();
	
	// 자동차 이름을 입력했을 때, 가격 수정
//	if(st1.reprice("스포티지")) {
//		System.out.println(Store.cars);
//	}
//	else {
//		System.out.println("자동차 이름을 다시 입력해주세요.");
//	}
	}
}
