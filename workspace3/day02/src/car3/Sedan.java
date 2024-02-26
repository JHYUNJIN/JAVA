package car3;

public class Sedan extends Car {

	void setSpeed(int speed) {
		this.speed+=speed;
		if(this.speed>200) {
			this.speed=200;
		}
		System.out.println("현재 속도는(자식) : "+this.speed);
	}
	

	void setColor(String color) {
		this.color=color;
	}
	

}

