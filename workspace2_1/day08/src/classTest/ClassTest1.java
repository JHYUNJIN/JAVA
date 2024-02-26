package classTest;

class Car{
	String name;
	int number;
	
	// 기본 생성자, 생략이 되어있다.
	public Car() {;}

	public Car(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
}



public class ClassTest1 {
	public static void main(String[] args) {
		
		Car c1 = new Car(); // Car클래스를 메모리에 확보시키는 코드
		System.out.println(c1.name);
		c1.name="Porche";
		System.out.println(c1.name);
		Car c2 = new Car("Benz",2023); // Car클래스를 메모리에 확보시키는 코드
		System.out.println(c2.name);
		Car c3 = new Car("Audi",2022); // Car클래스를 메모리에 확보시키는 코드
		System.out.println(c3.name);
		Car c4 = new Car("BMW",6740); // Car클래스를 메모리에 확보시키는 코드
		System.out.println(c4.name);

	}
}
