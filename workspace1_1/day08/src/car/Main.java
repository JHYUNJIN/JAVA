package car;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("bmw","white",6500);
		Supercar sc = new Supercar("포르쉐", "yello", 3000, false);
		car.enginstart();
		sc.enginstart();
	}

}
