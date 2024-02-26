package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {	Thread.sleep(300);	} catch (InterruptedException e) {e.printStackTrace();}
			}
		};
		
		Thread t1 = new Thread(runnable, "현진");
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {	Thread.sleep(300);	} catch (InterruptedException e) {e.printStackTrace();}
			}
		}, "길동");
		
//		t1.start();
//		t2.start();
		
//		join() : 사용한 객체의 쓰레드가 모두 종료되어야지만 다른 쓰레드가 실행된다.
//					이미 실행 중인 쓰레드는 영향을 받지 않는다.	
//					만약 나중에 실행하고자 하는 쓰레드가 있다면, join() 다음에 start()를 실행하면된다.
		
		t1.start();
		try {	t1.join();} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
		
		
		
		
	}
}
