package car;

public class Suv implements Car{

	int suv_speed;
	@Override
	public void on_engine() {
		// TODO Auto-generated method stub
		System.out.println("SUV 시동이 켜졌습니다.");
	}

	@Override
	public void off_engine() {
		// TODO Auto-generated method stub
		System.out.println("SUV 시동이 꺼졌습니다.");
		
	}

	@Override
	public void up_speed(int speed) {
		// TODO Auto-generated method stub
		suv_speed+=speed;
		System.out.println("Suv 차량이 "+suv_speed+"km 의 속도로 주행합니다.");
	}

	@Override
	public void down_speed(int speed) {
		// TODO Auto-generated method stub
		suv_speed-=speed;
		System.out.println("Suv 차량이 "+suv_speed+"km 의 속도로 주행합니다.");
		
	}
	
}
