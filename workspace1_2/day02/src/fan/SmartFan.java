package fan;

public class SmartFan implements Fan {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("음성인식으로 전원켜기");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("음성인식으로 전원끄기");
	}

	@Override
	public void turbo() {
		// TODO Auto-generated method stub
		System.out.println("터보");
	}

}
