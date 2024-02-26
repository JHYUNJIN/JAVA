package objectTest;

class Student{
	int number;
	String name;
	
	public Student() {
	}

	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// == 은 주소값 비교
		if(this==obj) {
			return true;
		}
		// 타입비교
		if(obj instanceof Student) {
			// 다운 캐스팅
			Student std1 = (Student)obj;
			if(this.number==std1.number) {
				return true;
			}
		}
		return false;
	}
	
}

public class EqualsTest {
	public static void main(String[] args) {
		
//		String data1 = "ABC";
//		String data2 = "ABC";
//		String data3 = new String("ABC");
//		String data4 = new String("ABC");
//		
//		System.out.println(data1==data2);
//		System.out.println(data1.equals(data2));
//		System.out.println(data3==data4);
//		System.out.println(data3.equals(data4));
		
		Student s1 = new Student(1,"정현진");
		Student s2 = new Student(1,"홍길동");
		
		System.out.println(s1.equals(s2));
		
	}
}
