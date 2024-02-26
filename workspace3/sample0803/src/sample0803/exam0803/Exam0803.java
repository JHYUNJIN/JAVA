package sample0803.exam0803;

class Car{
	private String color;
	private int speed;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String color) { 
		this.color = color;
	}


	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed; 
	}


	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
	
}


public class Exam0803 {
	public static void main(String[] args) {
		
		Car car4 = new Car();
		Car car3 = new Car("blue");
		Car car1 = new Car("red",80);
		Car car2 = new Car("yellow",120);
		
		System.out.println("car1의 색상은 "+car1.getColor()+"이며, 현재 속도는 "
				+ car1.getSpeed()+"km 입니다.");
		System.out.println("car2의 색상은 "+car2.getColor()+"이며, 현재 속도는 "
				+ car2.getSpeed()+"km 입니다.");
	}
}
