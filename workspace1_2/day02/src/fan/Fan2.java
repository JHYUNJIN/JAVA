package fan;

public class Fan2 implements Fan {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("리모콘으로 전원켜기");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("리모콘으로 전원끄기");
	}

	@Override
	public void turbo() {
		// TODO Auto-generated method stub
		System.out.println("터보");
	}

}
