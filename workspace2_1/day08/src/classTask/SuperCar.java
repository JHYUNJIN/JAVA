package classTask;

public class SuperCar {
	// 브랜드 색상 가격

	String brand;
	String color;
	int price;
	
	// 엔진 상태
	boolean check; // boolean의 초기값은 false이다.

	///////////////////////////////////////////////
	
	public SuperCar() {;}
	
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
//		check=false; // 초기화를 해주지 않아도, new가 초기값을 넣어주기 때문에 굳이 적지 않아도 된다.
	}
	
	// 시동 켜기
	// 시동의 상태확인
	// 시동이 꺼져있다면 "시동 켜기" 출력
	// 이미 시동이 켜져있다면, "시동이 이미 켜져있습니다." 출력
	void engineStart() {
		if(!check) { // if문은 true일 때 실행된다.
			System.out.println("시동이 켜졌습니다.");
			System.out.println("부아아아아앙!!~~~");
			check=true;
		}
		else{
			System.out.println("시동이 이미 켜져있습니다.");
		}
	}
	
	// 시동 끄기
	// 시동의 상태확인
	// 시동이 켜져있다면 "시동 끄기" 출력
	// 이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다." 출력
	void engineStop() {
		if(check) { // if문은 true일 때 실행된다.
			System.out.println("시동이 꺼졌습니다.");
			System.out.println("프르르르~~~");
			check=false;
		}
		else{
			System.out.println("시동이 이미 꺼져있습니다.");
		}
	}
	
	
	
	
}
