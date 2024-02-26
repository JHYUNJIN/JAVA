package marine_creature;

public class Whale implements Fish,Mammal {
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		System.out.println("고래는 바닷속을 헤엄칩니다.");
	}

	@Override
	public void give_birth() {
		System.out.println("고래는 새끼를 낳습니다.");
	}
	
}
