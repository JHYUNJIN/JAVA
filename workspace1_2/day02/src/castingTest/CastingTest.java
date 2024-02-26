package castingTest;

class Car{
	void engineStart() {
		System.out.println("열쇠로 시동 켬");
	}
}

class SuperCar extends Car{

	@Override
	void engineStart() {
		System.out.println("음성으로 시동 켬");
	}
	void openRoof() {
		System.out.println("지붕 열기");
	}
}



public class CastingTest {
	public static void main(String[] args) {

		Car avante = new Car();
		SuperCar Ferrari = new SuperCar();
		
		// up casting
		Car avanteN = new SuperCar();
		avanteN.engineStart(); // 재정의 된 것은 사용할 수 있다.
		// avanteN.openRoof(); // 플러스 알파는 사용할 수 없다.
		
		// down casting
		
		// 살려줄 플러스 알파가 없어서 안된다.
//		SuperCar avanteNup = (SuperCar)avante;
//		avanteNup.engineStart();
		
		SuperCar avanteNup = (SuperCar)avanteN;
		avanteNup.openRoof();
		
//		morning instanceof Car --> true
		System.out.println(avante instanceof Car);
//		morning instanceof SuperCar --> false
		System.out.println(avante instanceof SuperCar);
//		Ferrari instanceof Car --> true
		System.out.println(Ferrari instanceof Car);
//		Ferrari instanceof SuperCar --> true
		System.out.println(Ferrari instanceof SuperCar);
//		avanteN intanceof Car --> true
		System.out.println(avanteN instanceof Car);
//		avanteN intanceof SuperCar --> true
		System.out.println(avanteN instanceof SuperCar);
//		up casting 된 객체는 둘 다 정답 값으로 봐야한다.
		System.out.println(avanteN instanceof SuperCar);
//		avanteNup intanceof Car --> true
		System.out.println(avanteNup instanceof Car);
//		avanteNup intanceof SuperCar --> true
		System.out.println(avanteNup instanceof SuperCar);
		
		
		
		
		
	}
}
