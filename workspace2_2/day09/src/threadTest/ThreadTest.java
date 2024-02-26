package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("*");
		MyThread t2 = new MyThread("#");
		
//		t1.run();
//		t2.run();
		t1.start();
		t2.start();
		
//		우선순위(1~10)
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	}
}
