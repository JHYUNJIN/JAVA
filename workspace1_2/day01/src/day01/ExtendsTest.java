package day01;
class Parent{
//	public Parent{
//	System.out.println("부모생성자 실행");
//}
}
class Child extends Parent{
//	public Child{
//	System.out.println("자식생성자 실행");
}
//}

public class ExtendsTest {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();

		Parent p2 = new Child(); // 자동 타입변환 업캐스팅
		Parent p3 = c1;
		if(p3==c1) {
			
		}
	}

}
