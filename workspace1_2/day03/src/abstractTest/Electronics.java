package abstractTest;

public abstract class Electronics {
	public abstract void on();
	public abstract void off();
	
	public void printData() {
		System.out.println("부모 클래스!");
	}
	
}
