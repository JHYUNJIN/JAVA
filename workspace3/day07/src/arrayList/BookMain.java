package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMain {
	public static void main(String[] args) {
		// ArrayList collection 생성
		List<Book> list = new ArrayList<>();
		
//		list.add("java","ArrayList","hyunjin");
		
		list.add(new Book("java","ArrayList","hyunjin"));
		list.add(new Book("java","overloading","hyunjin"));
		list.add(new Book("java","overriding","hyunjin"));
		list.add(new Book("java","extends","hyunjin"));
		list.add(new Book("java","instance","hyunjin"));
//		list.add("java","instance","hyunjin");
		
		List<String> list2 = new ArrayList<>();
		list2.add("hyunjin");
		list2.add("asd");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2);
		}
		
//		list.add("java","instance","hyunjin");

		
		
		
		
//		int size = list.size();
		System.out.println("생성된 객체의 개수 : "+list.size());
		System.out.println();
		
		
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			System.out.println(book.getSubject()+" "+
								book.getContent()+" "+
								book.getWriter()+"\n");
		}
		
		
		System.out.println("===============================");
		list.remove(2);
		
		list2.add("hyunjin");
		
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			System.out.println(book.getSubject()+" "+
					book.getContent()+" "+
					book.getWriter()+"\n");
			System.out.println(list);
		}
		
		
	}
}
