package car;

public interface Car {
	static final int CAR_COUNT = 0;
	
	
	void on_engine();
	void off_engine();
	void up_speed(int speed);
	void down_speed(int speed);
	
}
