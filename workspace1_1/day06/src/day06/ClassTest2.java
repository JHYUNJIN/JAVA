package day06;
class B{
	int num;
	void printNum() {
		System.out.println("num : "+this.num);
		System.out.println("참조값 : "+this);

	}
}

public class ClassTest2 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		
		b1.num=10;
		b2.num=20;
		b1.printNum();
		b2.printNum();
	}
}
