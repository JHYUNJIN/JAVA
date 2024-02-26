package set;

import java.util.HashSet;
import java.util.Iterator;

public class StudentMain {

	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<>();
		
		Student st1 = new Student(1, "현진");
		Student st2 = new Student(1, "현진");
		
		boolean result = st1.equals(st2);
		System.out.println(result);
		set.add(new Student(1, "유진"));
		set.add(new Student(1, "유진"));
		System.out.println(set.size());
		Iterator<Student> stuIter = set.iterator();
		while(stuIter.hasNext()) {
			System.out.println(stuIter.next());
			
		}
		
	}
}
