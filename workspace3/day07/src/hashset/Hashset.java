package hashset;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("JAVA1");
		set.add("JAVA2");
		set.add("C");
		set.add("C");
		set.add("C++");
		set.add("C#");
		set.add("python");
		
		System.out.printf("총 데이터 개수 : ",set.size());
	}
}
