package day05;
class Person{
	String name;
	int age;	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Person) {
			String other = ((Person)obj).name;
			if(this.name.length()==other.length()) {
				for(int i=0;i<this.name.length();i++) {
					if(name.charAt(i) != other.charAt(i)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
}

public class EqualsTest {
	public static void main(String[] args) {
//		String str = "ISTJ";
//		String str2 = "ISTJ";
//		String str3 = new String("ISTJ");
//		
//		System.out.println(str == str2);
//		System.out.println(str == str3);
		
		Person a = new Person("철수", 22); 
		Person b = new Person("영희", 20); 
		Person c = new Person("철수", 22); 
		Person d = a;
//		d.name = "현진";
		
		System.out.println(a.name);
		System.out.println(a==b);
		System.out.println(a==c);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));
	}
}
