package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked {
	public static void main(String[] args) {
		List<String> A_list = new ArrayList<>();
		List<String> L_list = new LinkedList<String>();
	
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();for (int i = 0; i < 100000; i++) {
			A_list.add(String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.printf("ArrayList 걸린시간 : %d\n",(endTime-startTime));
		
		startTime = System.nanoTime();for (int i = 0; i < 100000; i++) {
			L_list.add(String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.printf("LinkedList 걸린시간 : %d\n",(endTime-startTime));
		
	
	}
}
