package synchronizedTest;

//import java.util.Iterator;

public class Bank implements Runnable {

	public int money=50000;
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			buyItem(5000);
			try {	Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	
	public /*synchronized*/ void buyItem(int money) {
		//mutex는 동기화를 걸어줄 객체라고 보면 된다. thread 객체
		synchronized (this) {
			this.money-=money;
			System.out.println(Thread.currentThread().getName()+"의 출금");
			System.out.println("잔액 : "+this.money+"원");
		}
	}
	
	
	
}
