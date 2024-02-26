package day06;

public class StudentTest {
	public static void main(String[] args) {
		Student2 st1 = new Student2();
		Student2 st2 = new Student2();
		Student2 st3 = new Student2();
		
		st1.math=20; st1.eng=30; st1.java=100; st1.kor=90;
		st2.math=30;
		st3.math=40;
		
		System.out.println(st1.math);
		System.out.println(st2.math);
		System.out.println(st3.math);
		System.out.println("총점 : "+st1.getTotal());
		System.out.println("평균 : "+st1.avg());

		System.out.println(st3);
		System.out.println(st3);
		System.out.println(st3);
	}

}
