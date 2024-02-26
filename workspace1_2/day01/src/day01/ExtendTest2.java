package day01;
class Car{}
class Bus extends Car{}
class SchoolBus extends Bus{}

class OpenCar extends Car{}
class SuperCar extends OpenCar{}



public class ExtendTest2 {
	public static void main(String[] args) {
		Car c1 = new SchoolBus();
		
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = (Bus)new Car();
		
	}
}
