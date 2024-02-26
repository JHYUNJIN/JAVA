package words;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		
		long startTime = System.nanoTime();
		for(int i=0;i<1000000;i++) {
			al.add(i);
		}
		long endTime = System.nanoTime(); // System.nanoTime은 long타입이다. int 안됨 
		long dur = endTime-startTime;
		System.out.println("ArrayList 걸린 시간 : "+dur);

		long startTime1 = System.nanoTime();
		for(int i=0;i<1000000;i++) {
			ll.add(i);
		}
		long endTime1 = System.nanoTime();
		long dur1 = endTime1-startTime1;
		System.out.println("LinkedList 걸린 시간 : "+dur1);
	
	
	
	}
}
