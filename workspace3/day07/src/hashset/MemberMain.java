package hashset;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("손오공",35));
		set.add(new Member("손오공",35));

		System.out.println("객체 수 : "+set.size());
	}
}
