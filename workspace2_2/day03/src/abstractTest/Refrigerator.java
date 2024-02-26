package abstractTest;

public class Refrigerator extends Electronics{

	@Override
	public void on() {
		System.out.println("문을 열면 on~!");
	}

	@Override
	public void off() {
		System.out.println("문을 닫으면 off!~");
		
	}
	
	

}
