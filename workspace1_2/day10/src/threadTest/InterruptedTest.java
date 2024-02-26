package threadTest;

class A implements Runnable{
	@Override
	public void run() {
//		interrupted() 메소드는 한번 사용하면 false로 바뀐다.
//		System.out.println(Thread.interrupted());
//		System.out.println(Thread.interrupted());
		for (int i = 0; i<10; i++) {	
			if(Thread.interrupted()) {
				System.out.println("인터럽트 발생 프로그램 종료");
				break;
			}
			System.out.println(i);
			try {	Thread.sleep(300);} catch (InterruptedException e) {	e.printStackTrace();}				
		}
	}
}

public class InterruptedTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new A());
		
		t1.start();
		t1.interrupt();
	}
}
