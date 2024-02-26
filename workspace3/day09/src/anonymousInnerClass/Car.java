package anonymousInnerClass;

public class Car {
	private Tire tire1 = new Tire();

	private Tire tire2 = new Tire(){
		public void roll() {
			System.out.println("Tire객체의 2번째 tire가 굴러갑니다.");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	
	public void run2() {
		Tire tire3 = new Tire() { // tire는 run2에서 멤버필드이다. 변수
			public void roll() { // roll에 대한 재정의
				System.out.println("Tire객체의 3번째 tire가 굴러갑니다.");
			}
		};
		tire3.roll(); 
	}
	public void run3(Tire tire) {
		tire.roll(); // run3 메소드가 실행될 때 roll()의 재선언 실행
	}
	
	// Car입장에서는 tire2는 멤버필드이고 Tire입장에서는 tire2가 객체이다.
	// roll이 시랭되면 Car입장에서는 익명 객체가 실행된것이다.



}

