package abstract_class;

abstract class Car {
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println(speed);
	}
	
	abstract void downSpeed(int speed);
}

abstract class Sedan extends Car{
	}

class Suv extends Car{
	void downSpeed(int speed) {
		this.speed-=speed;
		System.out.println(speed);
	}
}

class SuperCar extends Car{
	void downSpeed(int speed) {	}
}
	


public class Main{
	public static void main(String[] args) {
//		Sedan sonata = new Sedan();
//		sonata.upSpeed(100);
//		sonata.downSpeed(50);
//		System.out.println(sonata);
		
		Suv santafe = new Suv();
		santafe.upSpeed(100);
		santafe.downSpeed(40);
		System.out.println(santafe.speed);
	}
}
