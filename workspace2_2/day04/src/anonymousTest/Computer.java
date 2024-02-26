package anonymousTest;

public class Computer {
	public static void main(String[] args) {
		
		Electronics elec = new Electronics() { // 이 부분이 클래스
		
//			익명클래스는 구현하지 않은 필드를 구현하기 위해서 열린다.
//			구현은 한번만 하고 갖다쓰면 되기에 이름이 필요없다.
			@Override
			public void on() {
				System.out.println("컴퓨터를 켠다");
			}
			
			@Override
			public void off() {
				System.out.println("컴퓨터를 켠다");
			}
		};
		elec.on();
	}
}
