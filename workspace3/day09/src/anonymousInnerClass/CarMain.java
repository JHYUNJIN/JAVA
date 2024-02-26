package anonymousInnerClass;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1();
		car.run2();
		car.run3(new Tire() { // new Tire는 매개변수이다.
			public void roll() { // 메소드 run3이 실행될 때 roll의 재정의 
				System.out.println("타이어 객체3이 굴러갑니다.");
			}
		});
		
	}
}
