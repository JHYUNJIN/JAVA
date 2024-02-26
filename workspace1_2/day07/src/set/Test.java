package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(50);
		list.add(50);
		list.add(50);
		list.add(50);
		list.add(50);
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set); // 회원의 구매내역 리스트 조회할 때 활요가능 3명이 회원이 10개씩 사갔을 때 구매내역으로 조회하고자할때 회원은 몇명인가 ?
		ArrayList<Integer> result = new ArrayList<>(set);
		System.out.println(set);
		
	}
}
