package list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add(3);
//		al.add(3.4);
//		al.add('a');
//		al.add("안녕");
//		al.add(true);
//		for(int i=0; i<al.size();i++) {
//		System.out.println(al.get(i));
//	}
		
//		<Element> : 제네릭
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add((i+1)*10);
		}
		
		list.add(143333);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(int data:list) {
			System.out.println(data);
		}
		
//		향상(빠른) for문, forEach문
		for(int data:new int[] {1,2,3,4,5}) {
			System.out.println(data);
		}
		
	}
}
