package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayListTask2 {
/*
 * list에 값을 5개 저장하고 정렬한다. (1~20까지 정수만 사용)
 * 사용자가 list에 저장된 값을 맞추는 프로그램을 짠다. while, if, set, scanner
 * 
 * 
 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			int tmp = r.nextInt(20)+1;
			
			if(!list.contains(tmp)) {
				list.add(tmp);
				continue;
			}
			i--;
		}
		Collections.sort(list);
//		System.out.println(list);
		
		ArrayList<String> viewList = new ArrayList<>();
		String msg = "숫자를 입력해주세요(1~20) : ";
		String result = null;
		int tmp=0, flag=0, count=0, idx=0;
		
//		for(int i=0;i<list.size();i++) {
//			viewList.add("?");
//		}
		
		for(int data: list) {
			viewList.add("?");
		}
//		System.out.println(viewList);

		while(true) {
			System.out.println("===숫자 맞추기 게임===");
			System.out.println(viewList);
			System.out.println(msg);
			tmp=sc.nextInt();
			count++;
			if(list.contains(tmp)) {
				result = "맞췄습니다!!! 축하해요!";
				idx = list.indexOf(tmp);
				viewList.set(idx, tmp+""); // int+str = str
				flag++;
				
				list.set(idx, Integer.MIN_VALUE); // 맞춘값 다시 못쓰게 하는 코드로 
				System.out.println(list.get(0)); // list의 idx방에 정수 중 가장 작은 min_value 값을 넣어준다.
			}
			else {
				result = "틀렸습니다. 다음 기회에..";
			}
			System.out.println(result);
			if(flag==5) {
				break;
			}
		}
		System.out.println("==============");
		System.out.println("축하합니다");
		System.out.println(count+"번 시도만에 성공하였습니다. great!!");

	
	}
	
}
