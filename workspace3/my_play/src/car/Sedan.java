package car;

public class Sedan implements Car {

	String brand;
	String name;
	int current_speed;
	int max_speed;



	public Sedan(String brand, String name, int current_speed, int max_speed) {
		super();
		this.brand = brand;
		this.name = name;
		this.current_speed = current_speed;
		this.max_speed = max_speed;
	}

	public int getCurrent_speed() {
		return current_speed;
	}

	public void setCurrent_speed(int current_speed) {
		this.current_speed = current_speed;
	}

	public int getmax_speed() {
		return max_speed;
	}

	public void setmax_speed(int max_speed) {
		this.max_speed = max_speed;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void on_engine() {
		// TODO Auto-generated method stub
		System.out.println(name+" 차량의 시동이 켜졌습니다.");
	}

	@Override
	public void off_engine() {
		// TODO Auto-generated method stub
		System.out.println(name+" 차량의 시동이 꺼졌습니다.");
		
	}

	@Override
	public void up_speed(int speed) {
		// TODO Auto-generated method stub
		current_speed+=speed;
		System.out.println(getName()+" 차량이 현재 "+current_speed+"km 의 속도로 주행합니다.");
	}

	


	@Override
	public void down_speed(int speed) {
		// TODO Auto-generated method stub
		current_speed-=speed;
		System.out.println(getName()+" 차량이 현재 "+current_speed+"km 의 속도로 주행합니다.");
		
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+" 차량이"+current_speed+"km 의 속도로 주행 중입니다.";
	}
	
	
	
}
