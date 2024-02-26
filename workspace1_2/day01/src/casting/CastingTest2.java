package casting;
class Animal{
	int age;
	String name;
	
	void crying() {
		System.out.println("crrrrrr");
	}
}
class Dog extends Animal{
	public Dog() {}
	public Dog(String name) {
		this.name = name;
	}
	

	@Override
	void crying() {
		System.out.println("멍멍");
	}
	void walk() {
		System.out.println("산책가기");
	}
	
}
class Cat extends Animal{
	public Cat() {}
	public Cat(String name) {
		this.name = name;
		
	}
	@Override
	void crying() {
		System.out.println("냐옹~");
	}
	
}
public class CastingTest2 {
	public static void main(String[] args) {
		Animal animal = new Dog();
		//1. 같은 메소드가 부모에도 있고 자식에도 있는 경우 (오버라이딩)
		animal.crying();
		// 업캐스팅을 해도 오버라이딩 된 메소드가 실행된다.
		
		//2. 메소드가 부모에는 없고 자식에서 추가 된 경우 (부모에 존재하지 않는 멤버에 접근하려는 경우)
		//animal.walk();
		//자식클래스에서 추가한 멤버는 부모타입의 참조변수로는 접근할 수 없다.
		//이 경우에는 다운 캐스팅을 해야한다.
		((Dog)animal).walk();
		
		Dog dog = new Dog("바둑이");
		Cat cat = new Cat("나비");
		printText(dog);
		printText(cat);
		tryWalk(dog);
		tryWalk(cat);
	}
	// 1. 메소드의 매개변수로 여러 타입의 값을 전달받는 경우
	// 일반적으로 각각의 타입을 처리하는 메소드를 별도로 만들어야 한다.
//	static void printText(Dog dog) {
//		System.out.println(dog.name+"가 운다");
//		dog.crying();
//	}
//	static void printText(Cat cat) {
//		System.out.println(cat.name+"가 운다");
//		cat.crying();
//	}
	//2.그런데 만약 같은 부모클래스가 존재한다면 매개변수를 부모클래스 타입으로 받는다(업캐스팅)
	// 하나의 메소드에서 매개변수를 부모타입으로 만들면 여러 자식타입을 받아서 사용 가능하다 (다형성-오버로딩)
	
	static void printText(Animal animal) {
		System.out.println(animal.name + "가 운다");
		animal.crying();
	}
	
	//3. 부모클래스에 존재하지 않는 멤버에 접근하기 위해서는 다운캐스팅을 해줘야한다.
	static void tryWalk(Animal animal) {
		//매개변수로 받아온 객체의 주소가 cat 타입인지 dog 타입인지 확인을 해야한다.
		if(animal instanceof Dog) {
			//dog 타입이 맞다면 dog로 다운캐스팅을한다.
			((Dog) animal).walk();
		}
		else {
			System.out.println("산책가기싫어 냐옹");
		}
	}
	
}
















