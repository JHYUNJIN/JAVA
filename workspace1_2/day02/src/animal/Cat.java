package animal;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	@Override
	void crying() {
		System.out.println("냐옹");
	}
	
	void walk() {
		System.out.println("살금살");
	}
	
	
}
