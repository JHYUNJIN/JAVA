package inheritance;

class Car{
//	브랜드, 색상, 가격
	String brand="BMW";
	String color="White";
	int price=10000;
	
//	기본 생성자
	public Car() {
		// TODO Auto-generated constructor stub
	}
//	초기화 생성자

public Car(String brand, String color, int price) {
	this.brand = brand;
	this.color = color;
	this.price = price;
}
	
//	시동 켬
	void engineOn() {
		System.out.println("시동 켬");
	}
//	시동 끔
	void engineOff() {
		System.out.println("시동 끔");
	}
}

class SuperCar extends Car{
	
	String brand="Porche";
	String color="Red";
	int price=99999;

	
//	모드
	void mode(){
		System.out.println("슈퍼카 모드");
	}
	
//	기본생성자
	public SuperCar() {
		// TODO Auto-generated constructor stub
	}
//	초기화 생성자

	public SuperCar(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

//	음성으로 시동 켬
	@Override
	void engineOn() {
		System.out.println("음성으로 시동 켬");
	}



	//	음성으로 시동 끔
	@Override
	void engineOff() {
		System.out.println("음성으로 시동 끔");
	}
	
	

//	지붕 열기
	void openRoof() {
		System.out.println("지붕 염");
	}
//	지붕 닫기
	void closeRoof() {
		System.out.println("지붕 닫음");
	}

}

public class InheritanceTask {
	public static void main(String[] args) {
		
		Car car = new Car();
		SuperCar superCar = new SuperCar();
		System.out.println("Car에 대한 정보");
		System.out.println(car.brand+"\t\t"+car.color+"\t"+car.price);
		car.engineOn();
		car.engineOff();
		System.out.println();
		System.out.println("SuperCar에 대한 정보");
		System.out.println(superCar.brand+"\t"+superCar.color+"\t"+superCar.price);
		superCar.engineOn();
		superCar.engineOff();
		superCar.openRoof();
		superCar.closeRoof();
	}

}


/*
package inheritance;

class Car {
//   브랜드, 색상, 가격
   String brand;
   String color;
   int price;

//   기본 생성자
   public Car() {;}

//   초기화 생성자
   public Car(String brand, String color, int price) {
      this.brand = brand;
      this.color = color;
      this.price = price;
   }

//   열쇠로 시동 킴
   void engineStart() {
      System.out.println("열쇠로 시동 킴");
   }

//   열쇠로 시동 끔
   void engineStop() {
      System.out.println("열쇠로 시동 끔");
   }

}

class SuperCar extends Car {
//   모드
   String mode;

//   기본 생성자
//   자식 기본 생성자는 부모의 기본 생성자를 호출한다.
//   부모에 기본 생성자가 없으면 자식의 기본 생성자는 오류가 발생한다.
   public SuperCar() {;}

//   초기화 생성자
   public SuperCar(String brand, String color, int price, String mode) {
//      부모의 생성자 중 3개의 값을 전달받는 생성자 호출
      super(brand, color, price);
      this.mode = mode;
   }

//   음성으로 시동 킴
   @Override
   void engineStart() {
      System.out.println("음성으로 시동 킴");
      super.engineStart(); // 생성자가 아니라 메소드라서 옮겨도 된다.
   }

//   음성으로 시동 끔
   @Override
   void engineStop() {
      System.out.println("음성으로 시동 끔");
   }

//   지붕 열기
   void openRoof() {
      System.out.println("지붕 열기");
   }
//   지붕 닫기
   void closeRoof() {
      System.out.println("지붕 닫기");
   }
}

public class InheritanceTask {
   public static void main(String[] args) {
      
//      SuperCar rollsroyce = new SuperCar();
//
//      rollsroyce.brand = "롤스로이스";
//      System.out.println(rollsroyce.brand);
      
      SuperCar ferrari = new SuperCar("페라리", "빨간색", 5000, "Sports");
      System.out.println(ferrari.brand);
      ferrari.engineStart();
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}
*/