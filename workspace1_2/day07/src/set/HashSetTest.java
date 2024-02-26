package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> character = new HashSet<>();
		character.add("피카츄");
		character.add("라이츄");
		character.add("파이리");
		character.add("꼬부기");
		character.add("꼬부기");
		character.add("꼬부기");
		character.add("꼬부기");
		character.add("꼬부기");

		System.out.println(character);
		
		System.out.println("======================");
	
		Iterator<String> charIter = character.iterator();
		
		System.out.println(charIter.hasNext());
		System.out.println(charIter.next());
		System.out.println(charIter.next());
//		System.out.println(charIter.next());
//		System.out.println(charIter.next());
		System.out.println("---------------------");
		
		
		while(charIter.hasNext()) {
			System.out.println(charIter.next());
		}
		System.out.println(character);
	}
}
