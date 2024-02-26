package collectionTest;

import java.util.ArrayList;

public class Store {

	// 자동차 정보를 담을 DB 선언
	public static ArrayList<Car> cars = new ArrayList<Car>();
	// 자동차 추가
	public void add(Car car) {
		cars.add(car);
	}

	// 자동차의 브랜드를 리턴해주는 메소드 만들기
	// 매개변수로 스포티지 입력 시 --> "기아" 리턴
//	public void Brand(String name) {
//		for(int i=0;i<cars.size();i++) {
//			if(cars.get(i).getName().equals(name)) {
//				return cars.get(i).getBrand();
//			}
//		}
//		return "조회하지 못했습니다.";
//	}
	public String brandName(String name){
		for (Car car : cars) {
			if(car.getName().equals(name)) {
				return car.getBrand();
			}
		}
		return "조회하지 못했습니다.";
	}
	
	// 사용자가 원하는 브랜드의 자동차 목록 조회하기
	// 기아 입력 시 브랜드가 기아인 자동차들만 조회
	
	   public ArrayList<Car> getCars(String brand) {
		      ArrayList<Car> result = new ArrayList<Car>();
		      for (Car car : cars) {
		         if(car.getBrand().equals(brand)) {
		            result.add(car);
		         }
		      }
		      return result;
		   }

	
//	public ArrayList<Car> getCars(String brand){
//		ArrayList<Car> result = new ArrayList<>();
//		for(int i=0;i<cars.size();i++) {
//			if(cars.get(i).getBrand().equals(brand)) {
//				result.add(cars);
//			}
//		}
//		return result;
//	}
		
	
	
//		// 리턴타입이 void가 아닌 boolean으로 바꿈으로써 실행결과에 따라 우리가 화면에서 조금더 코드를 제어할 수 있게 되었다.
//		// 자동차의 가격 수정 (20%인상)
//		// 매개변수로 자동차의 이름을 전달했을 때, 해당자동차의 가격이 수정되게
//		public boolean reprice(String name) {
//			for (Car car : cars) {
//				if(car.getName().equals(name)) {
//					car.setPrice((int)(car.getPrice()*1.2));;
//					return true;
//				}
//			}
//			return false;

	// 자동차의 가격 수정 (20%인상)
	// 매개변수로 자동차의 이름을 전달했을 때, 해당자동차의 가격이 수정되게
	public void reprice(String name) {
		for (Car car : cars) {
			if(car.getName().equals(name)) {
				car.setPrice((int)(car.getPrice()*1.2));;
				break;
			}
		}
	}
}
