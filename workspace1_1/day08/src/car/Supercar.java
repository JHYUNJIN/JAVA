package car;

public class Supercar extends Car {
	boolean booster;

	public Supercar(String brand, String color, int price, boolean booster) {
		super(brand, color, price);
		this.booster = booster;
	}
	
	void boosterOn() {
		System.out.println("부스터 온");
	}
	void boosterOff() {
		System.out.println("부스터 오프");
	}

	@Override // @ 도 주석이다. 컴퓨터를 위한 주석으로 코드에 영향을 준다.
	void enginstart() {
		System.out.println("qndkdkdkdkdkdkdkd부아아아아앙!!!");
	}
}
