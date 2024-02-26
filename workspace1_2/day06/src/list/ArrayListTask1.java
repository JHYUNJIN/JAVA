package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class ArrayListTask1 {
	public static void main(String[] args) {
	/*
	 * 1~20까지의 난수를 만들어서 ArrayList에 5개 저장
	 * Random 클래스
	 * 1. 중복되는 수는 없도록 한다.  contains를 사용하자
	 * 2. 정렬한다.(오름차순)		
	 */
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Random r = new Random();
		
		for(int i=0;i<5;i++) {
			int tmp = r.nextInt(20)+1;
			if (!list.contains(tmp)) {
				list.add(tmp);
				continue;
			}
			i--;
		}
			
		Collections.sort(list);
		System.out.println(list);
		
	}
}