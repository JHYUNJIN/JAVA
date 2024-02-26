package generic;

class Car{}
class Tv{}

//public<T> Box<T> boxing(T t){}

public class ProductMain {
	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<>();
		//product1이라는 객체를 생성한다.
		//product1의 주소는 new product이다.
		
		product1.setKind(new Tv()); // Tv 주소를 할당하고 초기화 시켜라
		product1.setModel("IPTV");
		
		
		Tv tv = product1.getKind();
		
		String tvModel1 = product1.getModel();
		
		System.out.println(tv);
		System.out.println(tvModel1);
		
		
//		====================================================

		Product<Car,String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUV");
		
		Car car = product2.getKind();
		String carModel1 = product2.getModel();
		
		System.out.println(car);
		System.out.println(carModel1);
		
		
		
		
//		Box<Integer> box1 = boxing(100);
		
		
		
		
		
		
		
		
	}
}
