package classTest;

class Vehicle{
	String brand;
	String color;
	int price;

//	기본생성자가 생략이 되었기때문에
//	기본생성자로 객체를 만들 수 없다.
	
	// 단축키 알트 쉬프트 s o 
	public Vehicle(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Vehicle(String color) {
		brand="BMW";
		this.color=color;
		price=10000;
	}
	
	void enginOn() {
		System.out.println(this.brand+"시동 켜기");
		System.out.println("부아아아앙~~~");
	}
	
	void enginOff() {
		System.out.println(this.brand+"시동 끄기");
		System.out.println("푸르르르");
	}
	
}





public class Road {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("White");
		Vehicle v2 = new Vehicle("Benz","Black",8000);
		
		v1.enginOn();
		v2.enginOn();
				
		
		
	}
}
