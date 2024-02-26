package anonymousInnerInterface;

public class HomeMain {
	public static void main(String[] args) {
		Home home = new Home(); // home 객체 생성
		
		home.use1();
		home.use2();
		
		home.use3(new RemoteControl() {
			public void turnOn() {
				System.out.println("전등을 켭니다.");
			}
			public void turnOff() {
				System.out.println("전등을 끕니다.");
			}
		});
	}
}
