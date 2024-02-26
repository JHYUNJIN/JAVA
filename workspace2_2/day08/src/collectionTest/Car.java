package collectionTest;

public class Car {

	// 이름 가격 브랜드(기아 현대 르노)
	private String name;
	private int price;
	private String brand;
	
	
	// 기본생성자
	public Car() {
		// TODO Auto-generated constructor stub
	}


	// 초기화생성자
	public Car(String name, int price, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
	}


	// 게터 세터
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	// 투스트링
	@Override
	public String toString() {
		return "자동차 이름 : "+name+" 가격 : "+price+" 자동차 브랜드 "+brand+"\n";
	}
	
	
	
	
}
