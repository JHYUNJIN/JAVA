package day08;

class Car{
	String brand;
	String color;
	int price;
	public Car() {
		
	}
	
	
	public Car(String brand, String color) // 매개 변수 , parameter
	{
		this(brand,color,1000);		
		
		System.out.println("생성자 실행");
	}


	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}

public class ThisTest {
	public static void main(String[] args) {
		Car car = new Car("bmw", "white", 6500);
		Car car1 = new Car();
		Car car2 = new Car("kia","black"); // 인수 , 인자 , argument
		
		System.out.println(car1.brand);
		System.out.println(car2.brand);
		System.out.println(car.price);
		System.out.println(car1.price);
		System.out.println(car2.price);
		
	}
}
