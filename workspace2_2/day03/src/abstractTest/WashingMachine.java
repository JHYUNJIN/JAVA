package abstractTest;

public class WashingMachine extends Electronics{

	@Override
	public void on() {
		System.out.println("on버튼 누르고 문을 열자~!");
	}

	@Override
	public void off() {
		System.out.println("문을 닫고 off!~버튼 누르자");
	}

}
