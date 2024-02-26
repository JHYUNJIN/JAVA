package car;

public class Coupe implements Car, SuperCar{
	
	String brand;
	String name;
	int current_speed;
	int max_speed;
	
	public Coupe(String brand, String name, int current_speed, int max_speed) {
		super();
		this.brand = brand;
		this.name = name;
		this.current_speed = current_speed;
		this.max_speed = max_speed;
	}
	
	
	

	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getCurrent_speed() {
		return current_speed;
	}




	public void setCurrent_speed(int current_speed) {
		this.current_speed = current_speed;
	}




	public int getMax_speed() {
		return max_speed;
	}




	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}




	@Override
	public void on_roof() {
		System.out.println("챠량의 roof가 열립니다.");
		
	}

	@Override
	public void off_roof() {
		System.out.println("챠량의 roof가 닫힙니다.");
		
	}

	@Override
	public void on_engine() {
		System.out.println(name+" 차량의 시동이 켜졌습니다.");		
	}

	@Override
	public void off_engine() {
		System.out.println(name+" 차량의 시동이 켜졌습니다.");		
		
	}

	@Override
	public void up_speed(int speed) {
		current_speed+=speed;
		System.out.println("Sedan 차량이 "+current_speed+"km 의 속도로 주행합니다.");		
	}

	@Override
	public void down_speed(int speed) {
		current_speed-=speed;
		System.out.println("Sedan 차량이 "+current_speed+"km 의 속도로 주행합니다.");		
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" 차량이"+current_speed+"km의 속도로 주행중입니다.";
	}
	
	
	
}
