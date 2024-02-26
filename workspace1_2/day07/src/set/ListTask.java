package set;
import java.util.ArrayList;
import java.util.Collections;

public class ListTask {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		for(int i=0;i<10;i++) {
			int temp = (int)(Math.random()*100)+1;
			list.add(temp);
			Collections.sort(list);
		}
		
		System.out.println(list);
	
		System.out.println(" 짝수 : ");
		for(int i : list) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int i=0;i<list.size();i++) {
			int value=list.get(i);
			if(value%2==0) {
				System.out.print(value+" ");
			}
		}
		System.out.println();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				System.out.print(list.get(i)+" ");
			}
		}
	
	
	}
	}


	
	
	
	
	
	
	
	
