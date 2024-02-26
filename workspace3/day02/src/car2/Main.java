package car2;

class Car{
	Car(){
		System.out.println("부모클래스 생성자");
	}
	
	Car(String str){
		System.out.println("부모클래스 생성사"+str);
	}
}

class Sedan extends Car{
	Sedan(String str){
//		super(); 기본적으로 부모클래스의 기본생성자가 생략되어있다. 작성하지 않아도 super()가 적용됨
		super(str);
		System.out.println("자식클래스 생성자"+str);
		
	}
}


public class Main {
	public static void main(String[] args) {
		
		Sedan sonata = new Sedan("이것은 초기화");
	
	}
}
